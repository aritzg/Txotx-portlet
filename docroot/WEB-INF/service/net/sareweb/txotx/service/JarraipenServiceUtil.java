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
 * The utility for the jarraipen remote service. This utility wraps {@link net.sareweb.txotx.service.impl.JarraipenServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author A.Galdos
 * @see JarraipenService
 * @see net.sareweb.txotx.service.base.JarraipenServiceBaseImpl
 * @see net.sareweb.txotx.service.impl.JarraipenServiceImpl
 * @generated
 */
public class JarraipenServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link net.sareweb.txotx.service.impl.JarraipenServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static net.sareweb.txotx.model.Jarraipen gehituJarraipenaByEmail(
		java.lang.String emailAddress, long jarraituaId,
		java.lang.String jarraipenMota)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .gehituJarraipenaByEmail(emailAddress, jarraituaId,
			jarraipenMota);
	}

	public static net.sareweb.txotx.model.Jarraipen gehituJarraipena(
		long jarraitzaileUserId, long jarraituaId,
		java.lang.String jarraipenMota)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .gehituJarraipena(jarraitzaileUserId, jarraituaId,
			jarraipenMota);
	}

	public static java.util.List<net.sareweb.txotx.model.Jarraipen> getJarraipenakByEmail(
		java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJarraipenakByEmail(emailAddress);
	}

	public static java.util.List<net.sareweb.txotx.model.Jarraipen> getJarraipenak(
		long jarraitzaileUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJarraipenak(jarraitzaileUserId);
	}

	public static java.util.List<net.sareweb.txotx.model.Jarraipen> getErabiltzailearenJarraitzaileak(
		long jarraituaUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getErabiltzailearenJarraitzaileak(jarraituaUserId);
	}

	public static java.util.List<net.sareweb.txotx.model.Jarraipen> getSagardotegiarenJarraitzaileak(
		long sagardotegiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSagardotegiarenJarraitzaileak(sagardotegiId);
	}

	public static java.util.List<net.sareweb.txotx.model.Jarraipen> getSagardoEgunarenJarraitzaileak(
		long sagardoEgunId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSagardoEgunarenJarraitzaileak(sagardoEgunId);
	}

	public static boolean deleteJarraipena(java.lang.String emailAddress,
		long jarraituaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteJarraipena(emailAddress, jarraituaId);
	}

	public static void clearService() {
		_service = null;
	}

	public static JarraipenService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					JarraipenService.class.getName());

			if (invokableService instanceof JarraipenService) {
				_service = (JarraipenService)invokableService;
			}
			else {
				_service = new JarraipenServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(JarraipenServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(JarraipenService service) {
	}

	private static JarraipenService _service;
}