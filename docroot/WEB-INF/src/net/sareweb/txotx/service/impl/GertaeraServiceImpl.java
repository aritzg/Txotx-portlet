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

import java.net.URLDecoder;
import java.util.Date;
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.UserLocalServiceUtil;

import net.sareweb.txotx.model.Gertaera;
import net.sareweb.txotx.model.Sagardotegi;
import net.sareweb.txotx.service.GertaeraLocalServiceUtil;
import net.sareweb.txotx.service.SagardotegiLocalServiceUtil;
import net.sareweb.txotx.service.SagardotegiServiceUtil;
import net.sareweb.txotx.service.base.GertaeraServiceBaseImpl;
import net.sareweb.txotx.util.Constants;

/**
 * The implementation of the gertaera remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.sareweb.txotx.service.GertaeraService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author A.Galdos
 * @see net.sareweb.txotx.service.base.GertaeraServiceBaseImpl
 * @see net.sareweb.txotx.service.GertaeraServiceUtil
 */
public class GertaeraServiceImpl extends GertaeraServiceBaseImpl {

	public Gertaera gehituTestuGertaera(long sagardotegiId, String testua) throws SystemException, PrincipalException{
		Gertaera gertaera = GertaeraLocalServiceUtil.createGertaera(CounterLocalServiceUtil.increment());
		gertaera.setUserId(getGuestOrUserId());
		
		try {
			gertaera.setScreenName(UserLocalServiceUtil.getUser(getGuestOrUserId()).getScreenName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		gertaera.setSagardotegiId(sagardotegiId);
		gertaera.setGertaeraMota(Constants.GERTAERA_MOTA_TESTUA);
		gertaera.setCreateDate(new Date());
		gertaera.setTestua(decode(testua));
		gertaera = GertaeraLocalServiceUtil.addGertaera(gertaera);
		
		try {
			Sagardotegi sagardotegi = SagardotegiServiceUtil.getSagardotegia(sagardotegiId);
			sagardotegi.setIruzkinKopurua(sagardotegi.getIruzkinKopurua()+1);
			SagardotegiLocalServiceUtil.updateSagardotegi(sagardotegi);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return gertaera;
	}
	
	public Gertaera gehituArgazkiGertaera(long sagardotegiId, String testua, long irudiKarpetaId, String irudia) throws SystemException, PrincipalException{
		Gertaera gertaera = GertaeraLocalServiceUtil.createGertaera(CounterLocalServiceUtil.increment());
		gertaera.setUserId(getGuestOrUserId());
		
		try {
			gertaera.setScreenName(UserLocalServiceUtil.getUser(getGuestOrUserId()).getScreenName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		gertaera.setSagardotegiId(sagardotegiId);
		gertaera.setGertaeraMota(Constants.GERTAERA_MOTA_ARGAZKIA);
		gertaera.setCreateDate(new Date());
		gertaera.setTestua(decode(testua));
		gertaera.setIrudiKarpetaId(irudiKarpetaId);
		gertaera.setIrudia(irudia);
		gertaera = GertaeraLocalServiceUtil.addGertaera(gertaera);
		try {
			Sagardotegi sagardotegi = SagardotegiServiceUtil.getSagardotegia(sagardotegiId);
			sagardotegi.setIrudiKopurua(sagardotegi.getIrudiKopurua()+1);
			SagardotegiLocalServiceUtil.updateSagardotegi(sagardotegi);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gertaera;
	}
	
	public Gertaera gehituBalorazioGertaera(long sagardotegiId, String testua, long balorazioa) throws SystemException, PrincipalException{
		Gertaera gertaera = GertaeraLocalServiceUtil.createGertaera(CounterLocalServiceUtil.increment());
		gertaera.setUserId(getGuestOrUserId());
		
		try {
			gertaera.setScreenName(UserLocalServiceUtil.getUser(getGuestOrUserId()).getScreenName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		gertaera.setSagardotegiId(sagardotegiId);
		gertaera.setGertaeraMota(Constants.GERTAERA_MOTA_BALORAZIOA);
		gertaera.setCreateDate(new Date());
		gertaera.setTestua(decode(testua));
		gertaera.setBalorazioa(balorazioa);
		gertaera = GertaeraLocalServiceUtil.addGertaera(gertaera);
		
		try {
			Sagardotegi sagardotegi = SagardotegiServiceUtil.getSagardotegia(sagardotegiId);
			double bbb = GertaeraLocalServiceUtil.getSagardotegiarenBalorazioBB(sagardotegiId);
			sagardotegi.setBalorazioKopurua(sagardotegi.getBalorazioKopurua()+1);
			sagardotegi.setBalorazioenBB(bbb);
			SagardotegiLocalServiceUtil.updateSagardotegi(sagardotegi);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return gertaera;
				
	}
	
	public List<Gertaera> getGertaerakOlderThanDate(long sagardotegiId, long date, int blockSize) throws SystemException{
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(Gertaera.class);
		if(sagardotegiId!=0){
			Criterion sagardotegiCr = PropertyFactoryUtil.forName("sagardotegiId").eq(sagardotegiId);
			dq.add(sagardotegiCr);
		}
		if(date==0){
			Criterion dateCr = PropertyFactoryUtil.forName("createDate").le(new Date());
			dq.add(dateCr);
		}else{
			Criterion dateCr = PropertyFactoryUtil.forName("createDate").le(new Date(date));
			dq.add(dateCr);
		}
		dq.addOrder(OrderFactoryUtil.desc("createDate"));
		return gertaeraPersistence.findWithDynamicQuery(dq, 0, blockSize);
	}
	
	public List<Gertaera> getGertaerakNewerThanDate(long sagardotegiId, long date, int blockSize) throws SystemException{
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(Gertaera.class);
		if(sagardotegiId!=0){
			Criterion sagardotegiCr = PropertyFactoryUtil.forName("sagardotegiId").eq(sagardotegiId);
			dq.add(sagardotegiCr);
		}
		if(date==0){
			Criterion dateCr = PropertyFactoryUtil.forName("createDate").gt(new Date());
			dq.add(dateCr);
		}else{
			Criterion dateCr = PropertyFactoryUtil.forName("createDate").gt(new Date(date + 1000));
			dq.add(dateCr);
		}
		dq.addOrder(OrderFactoryUtil.desc("createDate"));
		return gertaeraPersistence.findWithDynamicQuery(dq, 0, blockSize);
	}
	
	private String decode(String codedString){
		try {
			return URLDecoder.decode(codedString, "UTF-8");
		} catch (Exception e) {
			return "ERROR";
		}
	}
}