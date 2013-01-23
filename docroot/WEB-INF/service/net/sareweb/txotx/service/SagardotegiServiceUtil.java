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
 * The utility for the sagardotegi remote service. This utility wraps {@link net.sareweb.txotx.service.impl.SagardotegiServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author A.Galdos
 * @see SagardotegiService
 * @see net.sareweb.txotx.service.base.SagardotegiServiceBaseImpl
 * @see net.sareweb.txotx.service.impl.SagardotegiServiceImpl
 * @generated
 */
public class SagardotegiServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link net.sareweb.txotx.service.impl.SagardotegiServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static net.sareweb.txotx.model.Sagardotegi getSagardotegia(
		long sagardotegiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSagardotegia(sagardotegiId);
	}

	public static java.util.List<net.sareweb.txotx.model.Sagardotegi> getSagardotegiak()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSagardotegiak();
	}

	public static void clearService() {
		_service = null;
	}

	public static SagardotegiService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SagardotegiService.class.getName());

			if (invokableService instanceof SagardotegiService) {
				_service = (SagardotegiService)invokableService;
			}
			else {
				_service = new SagardotegiServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(SagardotegiServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(SagardotegiService service) {
	}

	private static SagardotegiService _service;
}