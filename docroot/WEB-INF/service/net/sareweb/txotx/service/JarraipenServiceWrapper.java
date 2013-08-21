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
 * This class is a wrapper for {@link JarraipenService}.
 * </p>
 *
 * @author    A.Galdos
 * @see       JarraipenService
 * @generated
 */
public class JarraipenServiceWrapper implements JarraipenService,
	ServiceWrapper<JarraipenService> {
	public JarraipenServiceWrapper(JarraipenService jarraipenService) {
		_jarraipenService = jarraipenService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _jarraipenService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_jarraipenService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _jarraipenService.invokeMethod(name, parameterTypes, arguments);
	}

	public net.sareweb.txotx.model.Jarraipen gehituJarraipenaByEmail(
		java.lang.String emailAddress, long jarraituaId,
		java.lang.String jarraipenMota)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jarraipenService.gehituJarraipenaByEmail(emailAddress,
			jarraituaId, jarraipenMota);
	}

	public net.sareweb.txotx.model.Jarraipen gehituJarraipena(
		long jarraitzaileUserId, long jarraituaId,
		java.lang.String jarraipenMota)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jarraipenService.gehituJarraipena(jarraitzaileUserId,
			jarraituaId, jarraipenMota);
	}

	public java.util.List<net.sareweb.txotx.model.Jarraipen> getJarraipenakByEmail(
		java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jarraipenService.getJarraipenakByEmail(emailAddress);
	}

	public java.util.List<net.sareweb.txotx.model.Jarraipen> getJarraipenak(
		long jarraitzaileUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jarraipenService.getJarraipenak(jarraitzaileUserId);
	}

	public java.util.List<net.sareweb.txotx.model.Jarraipen> getErabiltzailearenJarraitzaileak(
		long jarraituaUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jarraipenService.getErabiltzailearenJarraitzaileak(jarraituaUserId);
	}

	public java.util.List<net.sareweb.txotx.model.Jarraipen> getSagardotegiarenJarraitzaileak(
		long sagardotegiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jarraipenService.getSagardotegiarenJarraitzaileak(sagardotegiId);
	}

	public java.util.List<net.sareweb.txotx.model.Jarraipen> getSagardoEgunarenJarraitzaileak(
		long sagardoEgunId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jarraipenService.getSagardoEgunarenJarraitzaileak(sagardoEgunId);
	}

	public boolean deleteJarraipena(java.lang.String emailAddress,
		long jarraituaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jarraipenService.deleteJarraipena(emailAddress, jarraituaId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public JarraipenService getWrappedJarraipenService() {
		return _jarraipenService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedJarraipenService(JarraipenService jarraipenService) {
		_jarraipenService = jarraipenService;
	}

	public JarraipenService getWrappedService() {
		return _jarraipenService;
	}

	public void setWrappedService(JarraipenService jarraipenService) {
		_jarraipenService = jarraipenService;
	}

	private JarraipenService _jarraipenService;
}