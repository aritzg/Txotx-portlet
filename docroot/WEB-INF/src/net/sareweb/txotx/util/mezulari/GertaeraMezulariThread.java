package net.sareweb.txotx.util.mezulari;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sareweb.txotx.model.Gertaera;
import net.sareweb.txotx.model.GoogleDevice;
import net.sareweb.txotx.service.GoogleDeviceServiceUtil;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Sender;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.User;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;

public class GertaeraMezulariThread extends Thread {

	private static final String API_KEY = "AIzaSyDz2Hz6a375l793s6va-C45prKUSrG0qE8";
	private Gertaera gertaera;
	
	public GertaeraMezulariThread(Gertaera gertaera){
		this.gertaera=gertaera;
	}
	
	@Override
	public void run() {
		Sender sender = new Sender(API_KEY);
		try {
			List<User> users = getMentionedUsers(gertaera.getTestua());
			for(User user : users){
				try {
					List<GoogleDevice> googleDevices =  GoogleDeviceServiceUtil.getGoogleDevicesByUserId(user.getUserId());
					if(googleDevices!=null){
						for(GoogleDevice googleDevice : googleDevices){
							String registrationId = googleDevice.getRegistrationId();
							if(registrationId!=null){
								Message message = new Message.Builder()
									.delayWhileIdle(false)
									.collapseKey(String.valueOf(gertaera.getGertaeraId()))
									.addData("message", "Message from pushServer")
									.build();
							}
						}
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
