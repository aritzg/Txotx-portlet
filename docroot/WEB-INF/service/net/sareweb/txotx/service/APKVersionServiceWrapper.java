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
 * This class is a wrapper for {@link APKVersionService}.
 * </p>
 *
 * @author    A.Galdos
 * @see       APKVersionService
 * @generated
 */
public class APKVersionServiceWrapper implements APKVersionService,
	ServiceWrapper<APKVersionService> {
	public APKVersionServiceWrapper(APKVersionService apkVersionService) {
		_apkVersionService = apkVersionService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _apkVersionService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_apkVersionService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _apkVersionService.invokeMethod(name, parameterTypes, arguments);
	}

	public net.sareweb.txotx.model.APKVersion getLastAPKVersion()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apkVersionService.getLastAPKVersion();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public APKVersionService getWrappedAPKVersionService() {
		return _apkVersionService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedAPKVersionService(APKVersionService apkVersionService) {
		_apkVersionService = apkVersionService;
	}

	public APKVersionService getWrappedService() {
		return _apkVersionService;
	}

	public void setWrappedService(APKVersionService apkVersionService) {
		_apkVersionService = apkVersionService;
	}

	private APKVersionService _apkVersionService;
}