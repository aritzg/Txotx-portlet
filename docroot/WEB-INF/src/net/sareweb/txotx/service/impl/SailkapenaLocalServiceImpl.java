/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package net.sareweb.txotx.service.impl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

import net.sareweb.txotx.model.Sailkapena;
import net.sareweb.txotx.service.SailkapenaLocalServiceUtil;
import net.sareweb.txotx.service.base.SailkapenaLocalServiceBaseImpl;
import net.sareweb.txotx.util.Constants;

/**
 * The implementation of the sailkapena local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.sareweb.txotx.service.SailkapenaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author A.Galdos
 * @see net.sareweb.txotx.service.base.SailkapenaLocalServiceBaseImpl
 * @see net.sareweb.txotx.service.SailkapenaLocalServiceUtil
 */
public class SailkapenaLocalServiceImpl extends SailkapenaLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link net.sareweb.txotx.service.SailkapenaLocalServiceUtil} to access the sailkapena local service.
	 */
	public void incGertaera(long userId, String geraeraMota){
		if(geraeraMota==null || geraeraMota.equals("")) return;
		Sailkapena s = null;
		try {
			s=sailkapenaPersistence.findByUserId(userId);
		} catch (Exception e) {
			try {
				s = SailkapenaLocalServiceUtil.createSailkapena(CounterLocalServiceUtil.increment());
				User u = UserLocalServiceUtil.getUser(userId);
				s.setUserId(userId);
				s.setScreenName(u.getScreenName());
			} catch (Exception e1) {
				e1.printStackTrace();
				return;
			} 
		}
		if(geraeraMota.equals(Constants.GERTAERA_MOTA_ARGAZKIA)){
			s.setArgazkiKopurua(s.getArgazkiKopurua()+1);
		}
		else if(geraeraMota.equals(Constants.GERTAERA_MOTA_TESTUA)){
			s.setIruzkinKopurua(s.getIruzkinKopurua()+1);
		}
		else if(geraeraMota.equals(Constants.GERTAERA_MOTA_BALORAZIOA)){
			s.setBalorazioKopurua(s.getBalorazioKopurua()+1);
		}
		s.setGertaeraKopurua(s.getGertaeraKopurua()+1);
		
		try {
			SailkapenaLocalServiceUtil.updateSailkapena(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}