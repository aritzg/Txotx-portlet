package net.sareweb.txotx.util.mezulari;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sareweb.txotx.model.Gertaera;
import net.sareweb.txotx.model.GoogleDevice;
import net.sareweb.txotx.model.Sagardotegi;
import net.sareweb.txotx.service.GoogleDeviceServiceUtil;
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
		Sender sender = new Sender(Constants.API_KEY);
		try {
			List<User> users = getMentionedUsers(gertaera.getTestua());
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
							.addData("sagardotegiIzena", String.valueOf(sagardotegi.getIzena()))
							.addData("testua", gertaera.getTestua())
							.addData("nork", user.getScreenName())
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
	
	
	private List<User> getMentionedUsers(String testua) throws SystemException{
		System.out.println("testua " + testua);
		List<User> users = new ArrayList<User>();
		Company company = CompanyLocalServiceUtil.getCompanies().get(0);
		Pattern MENTION_PATTERN = Pattern.compile("@(\\w+)");
		Matcher m = MENTION_PATTERN.matcher(testua);
		while (m.find()) {
			try {
				users.add(UserLocalServiceUtil.fetchUserByScreenName(company.getCompanyId(), m.group().substring(1)));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return users;
	}
	
}
