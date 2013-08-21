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

import net.sareweb.txotx.model.APKVersion;
import net.sareweb.txotx.service.base.APKVersionServiceBaseImpl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the a p k version remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.sareweb.txotx.service.APKVersionService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author A.Galdos
 * @see net.sareweb.txotx.service.base.APKVersionServiceBaseImpl
 * @see net.sareweb.txotx.service.APKVersionServiceUtil
 */
public class APKVersionServiceImpl extends APKVersionServiceBaseImpl {
	
	public APKVersion getLastAPKVersion() throws SystemException{
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(APKVersion.class);
		dq.addOrder(OrderFactoryUtil.desc("createDate"));
		List<APKVersion> versions = apkVersionPersistence.findWithDynamicQuery(dq);
		
		if(versions==null || versions.size()<1) return null;
		else return versions.get(0);
	}
	
}