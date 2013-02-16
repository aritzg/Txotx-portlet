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

import net.sareweb.txotx.model.Sailkapena;
import net.sareweb.txotx.service.base.SailkapenaServiceBaseImpl;

/**
 * The implementation of the sailkapena remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.sareweb.txotx.service.SailkapenaService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author A.Galdos
 * @see net.sareweb.txotx.service.base.SailkapenaServiceBaseImpl
 * @see net.sareweb.txotx.service.SailkapenaServiceUtil
 */
public class SailkapenaServiceImpl extends SailkapenaServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link net.sareweb.txotx.service.SailkapenaServiceUtil} to access the sailkapena remote service.
	 */
	public List<Sailkapena> getSailkapenak() throws SystemException{
		return sailkapenaPersistence.findAll();
	}
}