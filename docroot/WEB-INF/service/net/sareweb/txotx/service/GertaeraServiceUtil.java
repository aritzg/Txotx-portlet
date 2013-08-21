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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * The utility for the gertaera remote service. This utility wraps {@link net.sareweb.txotx.service.impl.GertaeraServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author A.Galdos
 * @see GertaeraService
 * @see net.sareweb.txotx.service.base.GertaeraServiceBaseImpl
 * @see net.sareweb.txotx.service.impl.GertaeraServiceImpl
 * @generated
 */
public class GertaeraServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link net.sareweb.txotx.service.impl.GertaeraServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static net.sareweb.txotx.model.Gertaera gehituTestuGertaera(
		long sagardotegiId, java.lang.String testua)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return getService().gehituTestuGertaera(sagardotegiId, testua);
	}

	public static net.sareweb.txotx.model.Gertaera gehituTestuGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return getService()
				   .gehituTestuGertaeraSagardotegian(sagardotegiId, testua);
	}

	public static net.sareweb.txotx.model.Gertaera gehituTestuGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return getService()
				   .gehituTestuGertaeraSagardoEgunean(sagardoEgunId, testua);
	}

	public static net.sareweb.txotx.model.Gertaera gehituArgazkiGertaera(
		long sagardotegiId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return getService()
				   .gehituArgazkiGertaera(sagardotegiId, testua,
			irudiKarpetaId, irudia);
	}

	public static net.sareweb.txotx.model.Gertaera gehituArgazkiGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return getService()
				   .gehituArgazkiGertaeraSagardotegian(sagardotegiId, testua,
			irudiKarpetaId, irudia);
	}

	public static net.sareweb.txotx.model.Gertaera gehituArgazkiGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return getService()
				   .gehituArgazkiGertaeraSagardoEgunean(sagardoEgunId, testua,
			irudiKarpetaId, irudia);
	}

	public static net.sareweb.txotx.model.Gertaera gehituBalorazioGertaera(
		long sagardotegiId, java.lang.String testua, long balorazioa)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return getService()
				   .gehituBalorazioGertaera(sagardotegiId, testua, balorazioa);
	}

	public static net.sareweb.txotx.model.Gertaera gehituBalorazioGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua, long balorazioa)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return getService()
				   .gehituBalorazioGertaeraSagardotegian(sagardotegiId, testua,
			balorazioa);
	}

	public static net.sareweb.txotx.model.Gertaera gehituBalorazioGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua, long balorazioa)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		return getService()
				   .gehituBalorazioGertaeraSagardoEgunean(sagardoEgunId,
			testua, balorazioa);
	}

	public static java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakOlderThanDate(
		long sagardotegiId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getGertaerakOlderThanDate(sagardotegiId, date, blockSize);
	}

	public static java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakSagardotegianOlderThanDate(
		long sagardotegiId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getGertaerakSagardotegianOlderThanDate(sagardotegiId, date,
			blockSize);
	}

	public static java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakSagardoEguneanOlderThanDate(
		long sagardoEgunId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getGertaerakSagardoEguneanOlderThanDate(sagardoEgunId,
			date, blockSize);
	}

	public static java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakNewerThanDate(
		long sagardotegiId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getGertaerakNewerThanDate(sagardotegiId, date, blockSize);
	}

	public static java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakSagardotegianNewerThanDate(
		long sagardotegiId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getGertaerakSagardotegianNewerThanDate(sagardotegiId, date,
			blockSize);
	}

	public static java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakSagardoEguneanNewerThanDate(
		long sagardoEgunId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getGertaerakSagardoEguneanNewerThanDate(sagardoEgunId,
			date, blockSize);
	}

	public static void fake()
		throws com.liferay.portal.security.auth.PrincipalException {
		getService().fake();
	}

	public static void clearService() {
		_service = null;
	}

	public static GertaeraService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					GertaeraService.class.getName());

			if (invokableService instanceof GertaeraService) {
				_service = (GertaeraService)invokableService;
			}
			else {
				_service = new GertaeraServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(GertaeraServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(GertaeraService service) {
	}

	private static GertaeraService _service;
}