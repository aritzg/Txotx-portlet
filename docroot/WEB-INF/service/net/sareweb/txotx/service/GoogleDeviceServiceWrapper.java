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
 * This class is a wrapper for {@link GoogleDeviceService}.
 * </p>
 *
 * @author    A.Galdos
 * @see       GoogleDeviceService
 * @generated
 */
public class GoogleDeviceServiceWrapper implements GoogleDeviceService,
	ServiceWrapper<GoogleDeviceService> {
	public GoogleDeviceServiceWrapper(GoogleDeviceService googleDeviceService) {
		_googleDeviceService = googleDeviceService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _googleDeviceService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_googleDeviceService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _googleDeviceService.invokeMethod(name, parameterTypes, arguments);
	}

	public net.sareweb.txotx.model.GoogleDevice addGoogleDevice(
		java.lang.String emailAddress, java.lang.String registrationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceService.addGoogleDevice(emailAddress, registrationId);
	}

	public java.util.List<net.sareweb.txotx.model.GoogleDevice> getGoogleDevicesByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceService.getGoogleDevicesByUserId(userId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public GoogleDeviceService getWrappedGoogleDeviceService() {
		return _googleDeviceService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedGoogleDeviceService(
		GoogleDeviceService googleDeviceService) {
		_googleDeviceService = googleDeviceService;
	}

	public GoogleDeviceService getWrappedService() {
		return _googleDeviceService;
	}

	public void setWrappedService(GoogleDeviceService googleDeviceService) {
		_googleDeviceService = googleDeviceService;
	}

	private GoogleDeviceService _googleDeviceService;
}