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

import java.util.List;

import net.sareweb.txotx.model.Oharra;
import net.sareweb.txotx.service.OharraLocalServiceUtil;
import net.sareweb.txotx.service.base.OharraServiceBaseImpl;
import net.sareweb.txotx.util.Constants;
import net.sareweb.txotx.util.mezulari.GertaeraMezulariThread;
import net.sareweb.txotx.util.mezulari.OharraMezulariThread;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the oharra remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.sareweb.txotx.service.OharraService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author A.Galdos
 * @see net.sareweb.txotx.service.base.OharraServiceBaseImpl
 * @see net.sareweb.txotx.service.OharraServiceUtil
 */
public class OharraServiceImpl extends OharraServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link net.sareweb.txotx.service.OharraServiceUtil} to access the oharra remote service.
	 */
	
	public Oharra getAzkenErronka() throws SystemException{
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(Oharra.class);
		Criterion sagardotegiCr = PropertyFactoryUtil.forName("oharMota").eq(Constants.OHAR_MOTA_ERRONKA);
		dq.add(sagardotegiCr);
		List<Oharra> oharrak = oharraPersistence.findWithDynamicQuery(dq);
		if(oharrak==null || oharrak.size()<1) return null;
		return oharrak.get(0);
	}
	
	public Oharra getAzkenOharra() throws SystemException{
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(Oharra.class);
		List<Oharra> oharrak = oharraPersistence.findWithDynamicQuery(dq);
		if(oharrak==null || oharrak.size()<1) return null;
		return oharrak.get(0);
	}
	
	public Oharra getOharra(long oharraId) throws PortalException, SystemException{
		return OharraLocalServiceUtil.getOharra(oharraId);
	}
	
	public void bidaliOharra(long oharraId) throws PortalException, SystemException{
		Oharra oharra = OharraLocalServiceUtil.getOharra(oharraId);
		OharraMezulariThread mezulari = new OharraMezulariThread(oharra);
		mezulari.start();
		return;
	}
	
	public void bidaliOharra(long oharraId, String toEmailAddress) throws PortalException, SystemException{
		Oharra oharra = OharraLocalServiceUtil.getOharra(oharraId);
		OharraMezulariThread mezulari = new OharraMezulariThread(oharra, toEmailAddress);
		mezulari.start();
		return;
	}
	
}