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
 * This class is a wrapper for {@link GertaeraService}.
 * </p>
 *
 * @author    A.Galdos
 * @see       GertaeraService
 * @generated
 */
public class GertaeraServiceWrapper implements GertaeraService,
	ServiceWrapper<GertaeraService> {
	public GertaeraServiceWrapper(GertaeraService gertaeraService) {
		_gertaeraService = gertaeraService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _gertaeraService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_gertaeraService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _gertaeraService.invokeMethod(name, parameterTypes, arguments);
	}

	public net.sareweb.txotx.model.Gertaera gehituTestuGertaera(
		long sagardotegiId, java.lang.String testua)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _gertaeraService.gehituTestuGertaera(sagardotegiId, testua);
	}

	public net.sareweb.txotx.model.Gertaera gehituTestuGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _gertaeraService.gehituTestuGertaeraSagardotegian(sagardotegiId,
			testua);
	}

	public net.sareweb.txotx.model.Gertaera gehituTestuGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _gertaeraService.gehituTestuGertaeraSagardoEgunean(sagardoEgunId,
			testua);
	}

	public net.sareweb.txotx.model.Gertaera gehituArgazkiGertaera(
		long sagardotegiId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _gertaeraService.gehituArgazkiGertaera(sagardotegiId, testua,
			irudiKarpetaId, irudia);
	}

	public net.sareweb.txotx.model.Gertaera gehituArgazkiGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _gertaeraService.gehituArgazkiGertaeraSagardotegian(sagardotegiId,
			testua, irudiKarpetaId, irudia);
	}

	public net.sareweb.txotx.model.Gertaera gehituArgazkiGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _gertaeraService.gehituArgazkiGertaeraSagardoEgunean(sagardoEgunId,
			testua, irudiKarpetaId, irudia);
	}

	public net.sareweb.txotx.model.Gertaera gehituBalorazioGertaera(
		long sagardotegiId, java.lang.String testua, long balorazioa)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _gertaeraService.gehituBalorazioGertaera(sagardotegiId, testua,
			balorazioa);
	}

	public net.sareweb.txotx.model.Gertaera gehituBalorazioGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua, long balorazioa)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _gertaeraService.gehituBalorazioGertaeraSagardotegian(sagardotegiId,
			testua, balorazioa);
	}

	public net.sareweb.txotx.model.Gertaera gehituBalorazioGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua, long balorazioa)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return _gertaeraService.gehituBalorazioGertaeraSagardoEgunean(sagardoEgunId,
			testua, balorazioa);
	}

	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakOlderThanDate(
		long sagardotegiId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraService.getGertaerakOlderThanDate(sagardotegiId, date,
			blockSize);
	}

	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakSagardotegianOlderThanDate(
		long sagardotegiId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraService.getGertaerakSagardotegianOlderThanDate(sagardotegiId,
			date, blockSize);
	}

	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakSagardoEguneanOlderThanDate(
		long sagardoEgunId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraService.getGertaerakSagardoEguneanOlderThanDate(sagardoEgunId,
			date, blockSize);
	}

	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakNewerThanDate(
		long sagardotegiId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraService.getGertaerakNewerThanDate(sagardotegiId, date,
			blockSize);
	}

	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakSagardotegianNewerThanDate(
		long sagardotegiId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraService.getGertaerakSagardotegianNewerThanDate(sagardotegiId,
			date, blockSize);
	}

	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakSagardoEguneanNewerThanDate(
		long sagardoEgunId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraService.getGertaerakSagardoEguneanNewerThanDate(sagardoEgunId,
			date, blockSize);
	}

	public void fake()
		throws com.liferay.portal.security.auth.PrincipalException {
		_gertaeraService.fake();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public GertaeraService getWrappedGertaeraService() {
		return _gertaeraService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedGertaeraService(GertaeraService gertaeraService) {
		_gertaeraService = gertaeraService;
	}

	public GertaeraService getWrappedService() {
		return _gertaeraService;
	}

	public void setWrappedService(GertaeraService gertaeraService) {
		_gertaeraService = gertaeraService;
	}

	private GertaeraService _gertaeraService;
}