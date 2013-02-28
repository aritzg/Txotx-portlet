package net.sareweb.txotx.util.mezulari;

import java.util.ArrayList;
import java.util.List;

import net.sareweb.txotx.model.GoogleDevice;
import net.sareweb.txotx.model.Oharra;
import net.sareweb.txotx.service.GoogleDeviceLocalServiceUtil;
import net.sareweb.txotx.util.Constants;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Sender;

public class OharraMezulariThread extends Thread {

	private Oharra oharra;
	
	public OharraMezulariThread(Oharra oharra){
		this.oharra=oharra;
	}
	
	@Override
	public void run() {
		Sender sender = new Sender(Constants.API_KEY);
		try {
			if(oharra.getTestua()==null) return;
			
			try {
				List<GoogleDevice> googleDevices =  GoogleDeviceLocalServiceUtil.getGoogleDevices(-1, -1);
				if(googleDevices!=null && googleDevices.size()>0){
					List<String> regIds = new ArrayList<String>();
					for(int i=0; i<googleDevices.size(); i++){
						regIds.add(googleDevices.get(i).getRegistrationId());
					}
					
					Message message = new Message.Builder()
						.delayWhileIdle(false)
						.collapseKey(String.valueOf(oharra.getOharraId()))
						.addData("messageType", "oharra")
						.addData("oharraId", String.valueOf(oharra.getOharraId()))
						.addData("izenburua", oharra.getIzenburua())
						.build();
					sender.send(message, regIds, 5);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
