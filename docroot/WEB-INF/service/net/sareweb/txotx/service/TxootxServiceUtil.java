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

public class TxootxServiceUtil {

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

	public static boolean updateScreenName(long userId, String screenName)
		throws com.liferay.portal.kernel.exception.SystemException {
		//Gertaera 
		//sailkapena
		//USer
		//TODO
		System.out.println("TODO updateScreenName");
		return true;
	}


	public static void clearService() {
		_service = null;
	}

	public static TxootxService getService() {
		if (_service == null) {
			Object o = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TxootxService.class.getName());
			InvokableService invokableService = (InvokableService)o;

			if (invokableService instanceof TxootxService) {
				_service = (TxootxService)invokableService;
			}
			else {
				_service = new TxootxServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(TxootxServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(TxootxService service) {
	}

	private static TxootxService _service;
}