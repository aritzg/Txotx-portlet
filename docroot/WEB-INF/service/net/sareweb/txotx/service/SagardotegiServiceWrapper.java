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
 * This class is a wrapper for {@link SagardotegiService}.
 * </p>
 *
 * @author    A.Galdos
 * @see       SagardotegiService
 * @generated
 */
public class SagardotegiServiceWrapper implements SagardotegiService,
	ServiceWrapper<SagardotegiService> {
	public SagardotegiServiceWrapper(SagardotegiService sagardotegiService) {
		_sagardotegiService = sagardotegiService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sagardotegiService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sagardotegiService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sagardotegiService.invokeMethod(name, parameterTypes, arguments);
	}

	public net.sareweb.txotx.model.Sagardotegi getSagardotegia(
		long sagardotegiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sagardotegiService.getSagardotegia(sagardotegiId);
	}

	public java.util.List<net.sareweb.txotx.model.Sagardotegi> getSagardotegiak()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sagardotegiService.getSagardotegiak();
	}

	public void resetPassword(java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_sagardotegiService.resetPassword(emailAddress);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SagardotegiService getWrappedSagardotegiService() {
		return _sagardotegiService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSagardotegiService(
		SagardotegiService sagardotegiService) {
		_sagardotegiService = sagardotegiService;
	}

	public SagardotegiService getWrappedService() {
		return _sagardotegiService;
	}

	public void setWrappedService(SagardotegiService sagardotegiService) {
		_sagardotegiService = sagardotegiService;
	}

	private SagardotegiService _sagardotegiService;
}