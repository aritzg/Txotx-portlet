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

package net.sareweb.txotx.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link SailkapenaService}.
 * </p>
 *
 * @author    A.Galdos
 * @see       SailkapenaService
 * @generated
 */
public class SailkapenaServiceWrapper implements SailkapenaService,
	ServiceWrapper<SailkapenaService> {
	public SailkapenaServiceWrapper(SailkapenaService sailkapenaService) {
		_sailkapenaService = sailkapenaService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sailkapenaService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sailkapenaService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sailkapenaService.invokeMethod(name, parameterTypes, arguments);
	}

	public java.util.List<net.sareweb.txotx.model.Sailkapena> getSailkapenak()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaService.getSailkapenak();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SailkapenaService getWrappedSailkapenaService() {
		return _sailkapenaService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSailkapenaService(SailkapenaService sailkapenaService) {
		_sailkapenaService = sailkapenaService;
	}

	public SailkapenaService getWrappedService() {
		return _sailkapenaService;
	}

	public void setWrappedService(SailkapenaService sailkapenaService) {
		_sailkapenaService = sailkapenaService;
	}

	private SailkapenaService _sailkapenaService;
}