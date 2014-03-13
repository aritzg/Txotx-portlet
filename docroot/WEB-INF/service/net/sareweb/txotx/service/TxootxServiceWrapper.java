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
 * This class is a wrapper for {@link TxootxService}.
 * </p>
 *
 * @author    A.Galdos
 * @see       TxootxService
 * @generated
 */
public class TxootxServiceWrapper implements TxootxService,
	ServiceWrapper<TxootxService> {
	public TxootxServiceWrapper(TxootxService txootxService) {
		_txootxService = txootxService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _txootxService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_txootxService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _txootxService.invokeMethod(name, parameterTypes, arguments);
	}

	public boolean updateScreenName(long userId, String screenName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _txootxService.updateScreenName(userId, screenName);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TxootxService getWrappedTxootxService() {
		return _txootxService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTxootxService(TxootxService txootxService) {
		_txootxService = txootxService;
	}

	public TxootxService getWrappedService() {
		return _txootxService;
	}

	public void setWrappedService(TxootxService txootxService) {
		_txootxService = txootxService;
	}

	private TxootxService _txootxService;
}