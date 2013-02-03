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

import com.liferay.portal.kernel.exception.SystemException;

import net.sareweb.txotx.model.Sagardotegi;
import net.sareweb.txotx.service.base.SagardotegiServiceBaseImpl;
import net.sareweb.txotx.util.comparator.SagardotegiBBComparator;

/**
 * The implementation of the sagardotegi remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.sareweb.txotx.service.SagardotegiService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author A.Galdos
 * @see net.sareweb.txotx.service.base.SagardotegiServiceBaseImpl
 * @see net.sareweb.txotx.service.SagardotegiServiceUtil
 */
public class SagardotegiServiceImpl extends SagardotegiServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link net.sareweb.txotx.service.SagardotegiServiceUtil} to access the sagardotegi remote service.
	 */

	public Sagardotegi getSagardotegia(long sagardotegiId) throws SystemException{
		return sagardotegiPersistence.fetchByPrimaryKey(sagardotegiId);
	}
	
	public List<Sagardotegi> getSagardotegiak() throws SystemException{
		return sagardotegiPersistence.findAll(-1, -1, new SagardotegiBBComparator());
	}
}