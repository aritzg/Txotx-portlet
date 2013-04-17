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

import net.sareweb.txotx.model.SagardoEgun;
import net.sareweb.txotx.service.base.SagardoEgunServiceBaseImpl;
import net.sareweb.txotx.util.comparator.SagardoEgunBBComparator;

/**
 * The implementation of the sagardo egun remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.sareweb.txotx.service.SagardoEgunService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author A.Galdos
 * @see net.sareweb.txotx.service.base.SagardoEgunServiceBaseImpl
 * @see net.sareweb.txotx.service.SagardoEgunServiceUtil
 */
public class SagardoEgunServiceImpl extends SagardoEgunServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link net.sareweb.txotx.service.SagardoEgunServiceUtil} to access the sagardo egun remote service.
	 */
	public SagardoEgun getSagardoEgun(long sagardoEgunId) throws SystemException{
		return sagardoEgunPersistence.fetchByPrimaryKey(sagardoEgunId);
	}
	
	public List<SagardoEgun> getSagardoEgunak() throws SystemException{
		return sagardoEgunPersistence.findAll(-1, -1, new SagardoEgunBBComparator());
	}
}