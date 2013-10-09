package net.sareweb.txotx.util;

import net.sareweb.txotx.model.Sagardotegi;
import net.sareweb.txotx.service.GertaeraLocalServiceUtil;
import net.sareweb.txotx.service.SagardotegiLocalServiceUtil;
import net.sareweb.txotx.service.SagardotegiServiceUtil;

public class SagardotegiUtils {

	public static void gehituGertaeraKontagailua(long sagardotegiId,
			String gertaeraMora, String irudia) {
		if(gertaeraMora==null)return;
		try {
			Sagardotegi sagardotegi = SagardotegiServiceUtil
					.getSagardotegia(sagardotegiId);
			if(gertaeraMora.equals(Constants.GERTAERA_MOTA_TESTUA)){
				sagardotegi.setIruzkinKopurua(sagardotegi.getIruzkinKopurua() + 1);
			}
			else if(gertaeraMora.equals(Constants.GERTAERA_MOTA_ARGAZKIA)){
				sagardotegi.setIrudia(irudia);
				sagardotegi.setIrudiKopurua(sagardotegi.getIrudiKopurua() + 1);
			}
			else if(gertaeraMora.equals(Constants.GERTAERA_MOTA_BALORAZIOA)){
				sagardotegi.setBalorazioKopurua(sagardotegi.getBalorazioKopurua() + 1);
				double bbb = GertaeraLocalServiceUtil
						.getBalorazioBB(sagardotegiId);
				sagardotegi.setBalorazioenBB(bbb);
			}
			SagardotegiLocalServiceUtil.updateSagardotegi(sagardotegi);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
