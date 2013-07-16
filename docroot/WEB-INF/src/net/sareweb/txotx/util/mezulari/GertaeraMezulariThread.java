package net.sareweb.txotx.util.mezulari;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sareweb.txotx.model.Gertaera;
import net.sareweb.txotx.model.GoogleDevice;
import net.sareweb.txotx.model.Jarraipen;
import net.sareweb.txotx.model.SagardoEgun;
import net.sareweb.txotx.model.Sagardotegi;
import net.sareweb.txotx.service.GoogleDeviceServiceUtil;
import net.sareweb.txotx.service.JarraipenServiceUtil;
import net.sareweb.txotx.service.SagardoEgunLocalServiceUtil;
import net.sareweb.txotx.service.SagardotegiLocalServiceUtil;
import net.sareweb.txotx.util.Constants;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Sender;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.User;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;

public class GertaeraMezulariThread extends Thread {

	private Gertaera gertaera;
	
	public GertaeraMezulariThread(Gertaera gertaera){
		this.gertaera=gertaera;
	}
	
	@Override
	public void run() {
		if(gertaera==null)return;
		Sender sender = new Sender(Constants.API_KEY);
		bidaliMezuaAipatutakoErabiltzaileei( sender,  gertaera);
		bidaliMezuaJarraitzaileei( sender,  gertaera);
	}
	
	private void bidaliMezuaAipatutakoErabiltzaileei(Sender sender, Gertaera gertaera){
		try {
			if(gertaera.getTestua()==null) return;
			
			User senderUser = UserLocalServiceUtil.getUser(gertaera.getUserId());
			
			HashMap<String, User> usersMap = new HashMap<String, User>();
			getMentionedUsers(gertaera.getTestua(), usersMap);
			
			Collection<User> users = usersMap.values();
			
			for(User user : users){
				try {
					List<GoogleDevice> googleDevices =  GoogleDeviceServiceUtil.getGoogleDevicesByUserId(user.getUserId());
					if(googleDevices!=null && googleDevices.size()>0){
						List<String> regIds = new ArrayList<String>();
						for(int i=0; i<googleDevices.size(); i++){
							regIds.add(googleDevices.get(i).getRegistrationId());
						}
						
						Sagardotegi sagardotegi = SagardotegiLocalServiceUtil.getSagardotegi(gertaera.getSagardotegiId()); 
						
						Message message = new Message.Builder()
							.delayWhileIdle(false)
							.collapseKey(String.valueOf(gertaera.getGertaeraId()))
							.addData("messageType", "mention")
							.addData("gertaeraId", String.valueOf(gertaera.getGertaeraId()))
							.addData("sagardotegiId", String.valueOf(sagardotegi.getSagardotegiId()))
							.addData("sagardotegiIzena", sagardotegi.getIzena())
							.addData("testua", gertaera.getTestua())
							.addData("nork", senderUser.getScreenName())
							.build();
						sender.send(message, regIds, 5);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	
	private void bidaliMezuaJarraitzaileei(Sender sender, Gertaera gertaera){
		try {
			if(gertaera.getTestua()==null) return;
			
			User senderUser = UserLocalServiceUtil.getUser(gertaera.getUserId());
			
			HashMap<String, Long> userIdsMap = new HashMap<String, Long>();
			addToMapUsersFollowing(gertaera, userIdsMap, Constants.JARRAIPEN_MOTA_PERTSONA);
			addToMapUsersFollowing(gertaera, userIdsMap, Constants.JARRAIPEN_MOTA_SAGARDOTEGIA);
			addToMapUsersFollowing(gertaera, userIdsMap, Constants.JARRAIPEN_MOTA_SAGARDO_EGUNA);
			
			Collection<Long> userIds = userIdsMap.values();
			List<String> regIds = new ArrayList<String>();
			
			for(Long userId : userIds){
				try {
					List<GoogleDevice> googleDevices =  GoogleDeviceServiceUtil.getGoogleDevicesByUserId(userId.longValue());
					if(googleDevices!=null && googleDevices.size()>0){
						for(int i=0; i<googleDevices.size(); i++){
							regIds.add(googleDevices.get(i).getRegistrationId());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
			Sagardotegi sagardotegi = null;
			if(gertaera.getSagardotegiId()!=0){
				SagardotegiLocalServiceUtil.getSagardotegi(gertaera.getSagardotegiId()); 
			}
			SagardoEgun sagardoEgun = null;
			if(gertaera.getSagardoEgunId()!=0){
				SagardoEgunLocalServiceUtil.getSagardoEgun(gertaera.getSagardoEgunId()); 
			}
			
			Message message = new Message.Builder()
				.delayWhileIdle(false)
				.collapseKey(String.valueOf(gertaera.getGertaeraId()))
				.addData("messageType", "followed")
				.addData("gertaeraId", String.valueOf(gertaera.getGertaeraId()))
				.addData("sagardotegiId", String.valueOf(sagardotegi!=null?sagardotegi.getSagardotegiId():"0"))
				.addData("sagardotegiIzena", sagardotegi!=null?sagardotegi.getIzena():"")
				.addData("sagardoEgunId", String.valueOf(sagardoEgun!=null?sagardoEgun.getSagardoEgunId():"0"))
				.addData("sagardoEgunIzena", sagardoEgun!=null?sagardoEgun.getIzena():"")
				.addData("testua", gertaera.getTestua())
				.addData("nork", senderUser.getScreenName())
				.build();
			sender.send(message, regIds, 5);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	
	private void getMentionedUsers(String testua, HashMap<String, User> usersMap) throws SystemException{
		System.out.println("testua " + testua);
		List<User> users = new ArrayList<User>();
		Company company = CompanyLocalServiceUtil.getCompanies().get(0);
		Pattern MENTION_PATTERN = Pattern.compile("@(\\w+)");
		Matcher m = MENTION_PATTERN.matcher(testua);
		while (m.find()) {
			try {
				User user = UserLocalServiceUtil.fetchUserByScreenName(company.getCompanyId(), m.group().substring(1));
				if(!usersMap.containsKey(user.getScreenName())){
					usersMap.put(user.getScreenName(), user);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private void addToMapUsersFollowing(Gertaera gertaera, HashMap<String, Long> usersMap, String jarraipenMota){
		if(jarraipenMota==null) return;
		try {
			List<Jarraipen> jarraipenak = null;
			if(jarraipenMota.equals(Constants.JARRAIPEN_MOTA_PERTSONA)){
				jarraipenak = JarraipenServiceUtil.getSagardoEgunarenJarraitzaileak(gertaera.getSagardoEgunId());
			}
			else if(jarraipenMota.equals(Constants.JARRAIPEN_MOTA_SAGARDOTEGIA)){
				jarraipenak = JarraipenServiceUtil.getSagardotegiarenJarraitzaileak(gertaera.getSagardotegiId());
			}
			else if(jarraipenMota.equals(Constants.JARRAIPEN_MOTA_SAGARDOTEGIA)){
				jarraipenak = JarraipenServiceUtil.getSagardoEgunarenJarraitzaileak(gertaera.getSagardoEgunId());
			}
			
			if(jarraipenak!=null && jarraipenak.size()>0){
				for(Jarraipen jarraipen : jarraipenak){
					if(!usersMap.containsKey(String.valueOf(jarraipen.getJarraitzaileUserId()))){
						usersMap.put(String.valueOf(jarraipen.getJarraitzaileUserId()), jarraipen.getJarraitzaileUserId());
					}
				}
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
	
}
