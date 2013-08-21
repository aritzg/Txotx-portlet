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

package net.sareweb.txotx.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import net.sareweb.txotx.model.APKVersion;

import java.util.List;

/**
 * The persistence utility for the a p k version service. This utility wraps {@link APKVersionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see APKVersionPersistence
 * @see APKVersionPersistenceImpl
 * @generated
 */
public class APKVersionUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(APKVersion apkVersion) {
		getPersistence().clearCache(apkVersion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<APKVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<APKVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<APKVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static APKVersion update(APKVersion apkVersion, boolean merge)
		throws SystemException {
		return getPersistence().update(apkVersion, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static APKVersion update(APKVersion apkVersion, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(apkVersion, merge, serviceContext);
	}

	/**
	* Caches the a p k version in the entity cache if it is enabled.
	*
	* @param apkVersion the a p k version
	*/
	public static void cacheResult(
		net.sareweb.txotx.model.APKVersion apkVersion) {
		getPersistence().cacheResult(apkVersion);
	}

	/**
	* Caches the a p k versions in the entity cache if it is enabled.
	*
	* @param apkVersions the a p k versions
	*/
	public static void cacheResult(
		java.util.List<net.sareweb.txotx.model.APKVersion> apkVersions) {
		getPersistence().cacheResult(apkVersions);
	}

	/**
	* Creates a new a p k version with the primary key. Does not add the a p k version to the database.
	*
	* @param apkVersionId the primary key for the new a p k version
	* @return the new a p k version
	*/
	public static net.sareweb.txotx.model.APKVersion create(long apkVersionId) {
		return getPersistence().create(apkVersionId);
	}

	/**
	* Removes the a p k version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param apkVersionId the primary key of the a p k version
	* @return the a p k version that was removed
	* @throws net.sareweb.txotx.NoSuchAPKVersionException if a a p k version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.APKVersion remove(long apkVersionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchAPKVersionException {
		return getPersistence().remove(apkVersionId);
	}

	public static net.sareweb.txotx.model.APKVersion updateImpl(
		net.sareweb.txotx.model.APKVersion apkVersion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(apkVersion, merge);
	}

	/**
	* Returns the a p k version with the primary key or throws a {@link net.sareweb.txotx.NoSuchAPKVersionException} if it could not be found.
	*
	* @param apkVersionId the primary key of the a p k version
	* @return the a p k version
	* @throws net.sareweb.txotx.NoSuchAPKVersionException if a a p k version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.APKVersion findByPrimaryKey(
		long apkVersionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchAPKVersionException {
		return getPersistence().findByPrimaryKey(apkVersionId);
	}

	/**
	* Returns the a p k version with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param apkVersionId the primary key of the a p k version
	* @return the a p k version, or <code>null</code> if a a p k version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.APKVersion fetchByPrimaryKey(
		long apkVersionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(apkVersionId);
	}

	/**
	* Returns all the a p k versions.
	*
	* @return the a p k versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.APKVersion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<net.sareweb.txotx.model.APKVersion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the a p k versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of a p k versions
	* @param end the upper bound of the range of a p k versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of a p k versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.APKVersion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the a p k versions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of a p k versions.
	*
	* @return the number of a p k versions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static APKVersionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (APKVersionPersistence)PortletBeanLocatorUtil.locate(net.sareweb.txotx.service.ClpSerializer.getServletContextName(),
					APKVersionPersistence.class.getName());

			ReferenceRegistry.registerReference(APKVersionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(APKVersionPersistence persistence) {
	}

	private static APKVersionPersistence _persistence;
}