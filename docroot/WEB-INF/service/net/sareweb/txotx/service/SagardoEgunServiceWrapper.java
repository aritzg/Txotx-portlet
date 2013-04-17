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
 * This class is a wrapper for {@link SagardoEgunService}.
 * </p>
 *
 * @author    A.Galdos
 * @see       SagardoEgunService
 * @generated
 */
public class SagardoEgunServiceWrapper implements SagardoEgunService,
	ServiceWrapper<SagardoEgunService> {
	public SagardoEgunServiceWrapper(SagardoEgunService sagardoEgunService) {
		_sagardoEgunService = sagardoEgunService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sagardoEgunService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sagardoEgunService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sagardoEgunService.invokeMethod(name, parameterTypes, arguments);
	}

	public net.sareweb.txotx.model.SagardoEgun getSagardoEgun(
		long sagardoEgunId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sagardoEgunService.getSagardoEgun(sagardoEgunId);
	}

	public java.util.List<net.sareweb.txotx.model.SagardoEgun> getSagardoEgunak()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sagardoEgunService.getSagardoEgunak();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SagardoEgunService getWrappedSagardoEgunService() {
		return _sagardoEgunService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSagardoEgunService(
		SagardoEgunService sagardoEgunService) {
		_sagardoEgunService = sagardoEgunService;
	}

	public SagardoEgunService getWrappedService() {
		return _sagardoEgunService;
	}

	public void setWrappedService(SagardoEgunService sagardoEgunService) {
		_sagardoEgunService = sagardoEgunService;
	}

	private SagardoEgunService _sagardoEgunService;
}