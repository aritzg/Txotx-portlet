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
 * This class is a wrapper for {@link OharraService}.
 * </p>
 *
 * @author    A.Galdos
 * @see       OharraService
 * @generated
 */
public class OharraServiceWrapper implements OharraService,
	ServiceWrapper<OharraService> {
	public OharraServiceWrapper(OharraService oharraService) {
		_oharraService = oharraService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _oharraService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_oharraService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _oharraService.invokeMethod(name, parameterTypes, arguments);
	}

	public net.sareweb.txotx.model.Oharra getAzkenErronka()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oharraService.getAzkenErronka();
	}

	public net.sareweb.txotx.model.Oharra getAzkenOharra()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oharraService.getAzkenOharra();
	}

	public net.sareweb.txotx.model.Oharra getOharra(long oharraId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oharraService.getOharra(oharraId);
	}

	public void bidaliOharra(long oharraId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_oharraService.bidaliOharra(oharraId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public OharraService getWrappedOharraService() {
		return _oharraService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedOharraService(OharraService oharraService) {
		_oharraService = oharraService;
	}

	public OharraService getWrappedService() {
		return _oharraService;
	}

	public void setWrappedService(OharraService oharraService) {
		_oharraService = oharraService;
	}

	private OharraService _oharraService;
}