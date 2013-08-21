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
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the a p k version local service. This utility wraps {@link net.sareweb.txotx.service.impl.APKVersionLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author A.Galdos
 * @see APKVersionLocalService
 * @see net.sareweb.txotx.service.base.APKVersionLocalServiceBaseImpl
 * @see net.sareweb.txotx.service.impl.APKVersionLocalServiceImpl
 * @generated
 */
public class APKVersionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link net.sareweb.txotx.service.impl.APKVersionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the a p k version to the database. Also notifies the appropriate model listeners.
	*
	* @param apkVersion the a p k version
	* @return the a p k version that was added
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.APKVersion addAPKVersion(
		net.sareweb.txotx.model.APKVersion apkVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAPKVersion(apkVersion);
	}

	/**
	* Creates a new a p k version with the primary key. Does not add the a p k version to the database.
	*
	* @param apkVersionId the primary key for the new a p k version
	* @return the new a p k version
	*/
	public static net.sareweb.txotx.model.APKVersion createAPKVersion(
		long apkVersionId) {
		return getService().createAPKVersion(apkVersionId);
	}

	/**
	* Deletes the a p k version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param apkVersionId the primary key of the a p k version
	* @return the a p k version that was removed
	* @throws PortalException if a a p k version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.APKVersion deleteAPKVersion(
		long apkVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAPKVersion(apkVersionId);
	}

	/**
	* Deletes the a p k version from the database. Also notifies the appropriate model listeners.
	*
	* @param apkVersion the a p k version
	* @return the a p k version that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.APKVersion deleteAPKVersion(
		net.sareweb.txotx.model.APKVersion apkVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAPKVersion(apkVersion);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static net.sareweb.txotx.model.APKVersion fetchAPKVersion(
		long apkVersionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAPKVersion(apkVersionId);
	}

	/**
	* Returns the a p k version with the primary key.
	*
	* @param apkVersionId the primary key of the a p k version
	* @return the a p k version
	* @throws PortalException if a a p k version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.APKVersion getAPKVersion(
		long apkVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAPKVersion(apkVersionId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the a p k versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of a p k versions
	* @param end the upper bound of the range of a p k versions (not inclusive)
	* @return the range of a p k versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.APKVersion> getAPKVersions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAPKVersions(start, end);
	}

	/**
	* Returns the number of a p k versions.
	*
	* @return the number of a p k versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getAPKVersionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAPKVersionsCount();
	}

	/**
	* Updates the a p k version in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param apkVersion the a p k version
	* @return the a p k version that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.APKVersion updateAPKVersion(
		net.sareweb.txotx.model.APKVersion apkVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAPKVersion(apkVersion);
	}

	/**
	* Updates the a p k version in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param apkVersion the a p k version
	* @param merge whether to merge the a p k version with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the a p k version that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.APKVersion updateAPKVersion(
		net.sareweb.txotx.model.APKVersion apkVersion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAPKVersion(apkVersion, merge);
	}

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

	public static void clearService() {
		_service = null;
	}

	public static APKVersionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					APKVersionLocalService.class.getName());

			if (invokableLocalService instanceof APKVersionLocalService) {
				_service = (APKVersionLocalService)invokableLocalService;
			}
			else {
				_service = new APKVersionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(APKVersionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(APKVersionLocalService service) {
	}

	private static APKVersionLocalService _service;
}