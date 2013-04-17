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

import java.util.Date;
import java.util.List;

import net.sareweb.txotx.model.Jarraipen;
import net.sareweb.txotx.service.JarraipenLocalServiceUtil;
import net.sareweb.txotx.service.base.JarraipenServiceBaseImpl;
import net.sareweb.txotx.util.Constants;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

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
	
	public Jarraipen gehituJarraipena(long jarraitzaileUserId, long jarraigaiId, String jarraipenMota) throws SystemException{
		if(jarraipenMota==null) return null;
		Jarraipen jarraipen = JarraipenLocalServiceUtil.createJarraipen(CounterLocalServiceUtil.increment());
		jarraipen.setJarraipenMota(jarraipenMota);
		jarraipen.setJarraitzaileUserId(jarraitzaileUserId);
		jarraipen.setCreateDate(new Date());
		
		if(jarraipenMota.equals(Constants.JARRAIPEN_MOTA_PERTSONA)){
			jarraipen.setJarraituaUserId(jarraigaiId);
		}
		else if(jarraipenMota.equals(Constants.JARRAIPEN_MOTA_SAGARDOTEGIA)){
			jarraipen.setSagardotegiId(jarraigaiId);
		}
		else if(jarraipenMota.equals(Constants.JARRAIPEN_MOTA_SAGARDO_EGUNA)){
			jarraipen.setSagardoEgunId(jarraigaiId);
		}
		return JarraipenLocalServiceUtil.addJarraipen(jarraipen);
	}
	
	public List<Jarraipen> getJarraipenak(long jarraitzaileUserId) throws SystemException{
		return jarraipenPersistence.findByJarraitzaileUserId(jarraitzaileUserId);
	}
}