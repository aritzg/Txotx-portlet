package net.sareweb.txotx.util;

import net.sareweb.txotx.model.SagardoEgun;
import net.sareweb.txotx.service.GertaeraLocalServiceUtil;
import net.sareweb.txotx.service.SagardoEgunLocalServiceUtil;
import net.sareweb.txotx.service.SagardoEgunServiceUtil;

public class SagardoEgunUtils {

	public static void gehituGertaeraKontagailua(long sagardoEgunId,
			String gertaeraMora, String irudia) {
		if(gertaeraMora==null)return;
		try {
			SagardoEgun sagardoEgun = SagardoEgunServiceUtil
					.getSagardoEgun(sagardoEgunId);
			if(gertaeraMora.equals(Constants.GERTAERA_MOTA_TESTUA)){
				sagardoEgun.setIruzkinKopurua(sagardoEgun.getIruzkinKopurua() + 1);
			}
			else if(gertaeraMora.equals(Constants.GERTAERA_MOTA_ARGAZKIA)){
				//sagardoEgun.setIrudia(irudia);
				sagardoEgun.setIrudiKopurua(sagardoEgun.getIrudiKopurua() + 1);
			}
			else if(gertaeraMora.equals(Constants.GERTAERA_MOTA_BALORAZIOA)){
				sagardoEgun.setBalorazioKopurua(sagardoEgun.getBalorazioKopurua() + 1);
				double bbb = GertaeraLocalServiceUtil
						.getSagardoEgunarenBalorazioBB(sagardoEgunId);
				sagardoEgun.setBalorazioenBB(bbb);
			}
			SagardoEgunLocalServiceUtil.updateSagardoEgun(sagardoEgun);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
