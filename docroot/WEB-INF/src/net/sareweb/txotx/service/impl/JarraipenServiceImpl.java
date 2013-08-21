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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sareweb.txotx.model.Jarraipen;
import net.sareweb.txotx.service.JarraipenLocalServiceUtil;
import net.sareweb.txotx.service.base.JarraipenServiceBaseImpl;

import com.liferay.compat.portal.util.PortalUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * The implementation of the jarraipen remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.sareweb.txotx.service.JarraipenService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author A.Galdos
 * @see net.sareweb.txotx.service.base.JarraipenServiceBaseImpl
 * @see net.sareweb.txotx.service.JarraipenServiceUtil
 */
public class JarraipenServiceImpl extends JarraipenServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link net.sareweb.txotx.service.JarraipenServiceUtil} to access the jarraipen remote service.
	 */
	
	public Jarraipen gehituJarraipenaByEmail(String emailAddress, long jarraituaId, String jarraipenMota) throws SystemException{
		User user;
		try {
			user = UserLocalServiceUtil.getUserByEmailAddress(PortalUtil.getDefaultCompanyId(), emailAddress);
			if(jarraipenMota==null) return null;
			Jarraipen jarraipen = JarraipenLocalServiceUtil.createJarraipen(CounterLocalServiceUtil.increment());
			jarraipen.setJarraipenMota(jarraipenMota);
			jarraipen.setJarraitzaileUserId(user.getUserId());
			jarraipen.setJarraituaId(jarraituaId);
			jarraipen.setCreateDate(new Date());
			
			return JarraipenLocalServiceUtil.addJarraipen(jarraipen);
		} catch (PortalException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public Jarraipen gehituJarraipena(long jarraitzaileUserId, long jarraituaId, String jarraipenMota) throws SystemException{
		if(jarraipenMota==null) return null;
		Jarraipen jarraipen = JarraipenLocalServiceUtil.createJarraipen(CounterLocalServiceUtil.increment());
		jarraipen.setJarraipenMota(jarraipenMota);
		jarraipen.setJarraitzaileUserId(jarraitzaileUserId);
		jarraipen.setJarraituaId(jarraituaId);
		jarraipen.setCreateDate(new Date());
		
		
		return JarraipenLocalServiceUtil.addJarraipen(jarraipen);
	}
	
	public List<Jarraipen> getJarraipenakByEmail(String emailAddress) throws SystemException{
		User user;
		try {
			user = UserLocalServiceUtil.getUserByEmailAddress(PortalUtil.getDefaultCompanyId(), emailAddress);
			return getJarraipenak(user.getUserId());
		} catch (PortalException e) {
			e.printStackTrace();
			return new ArrayList<Jarraipen>();
		}
	}
	
	public List<Jarraipen> getJarraipenak(long jarraitzaileUserId) throws SystemException{
		return jarraipenPersistence.findByJarraitzaileUserId(jarraitzaileUserId);
	}
	
	public List<Jarraipen> getErabiltzailearenJarraitzaileak(long jarraituaUserId) throws SystemException{
		return jarraipenPersistence.findByJarraituaId(jarraituaUserId);
	}
	
	public List<Jarraipen> getSagardotegiarenJarraitzaileak(long sagardotegiId) throws SystemException{
		return jarraipenPersistence.findByJarraituaId(sagardotegiId);
	}
	
	public List<Jarraipen> getSagardoEgunarenJarraitzaileak(long sagardoEgunId) throws SystemException{
		return jarraipenPersistence.findByJarraituaId(sagardoEgunId);
	}
	
	public boolean deleteJarraipena(String emailAddress, long jarraituaId) throws SystemException{
		User user;
		try {
			user = UserLocalServiceUtil.getUserByEmailAddress(PortalUtil.getDefaultCompanyId(), emailAddress);
			
			DynamicQuery dq = DynamicQueryFactoryUtil.forClass(Jarraipen.class);
			Criterion jarraitzaileUserIdCr = PropertyFactoryUtil.forName("jarraitzaileUserId").eq(user.getUserId());
			dq.add(jarraitzaileUserIdCr);
			Criterion jarraigaiIdCr = PropertyFactoryUtil.forName("jarraituaId").eq(jarraituaId);
			dq.add(jarraigaiIdCr);
			List<Jarraipen> jarraipenak = jarraipenPersistence.findWithDynamicQuery(dq);
			if(jarraipenak==null || jarraipenak.size()<1) return false;
			Jarraipen jarraipen = jarraipenak.get(0);
			JarraipenLocalServiceUtil.deleteJarraipen(jarraipen);
			return true;
			
		} catch (PortalException e) {
			e.printStackTrace();
			return false;
		}
		
	}
}