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

import net.sareweb.txotx.model.Oharra;

import java.util.List;

/**
 * The persistence utility for the oharra service. This utility wraps {@link OharraPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see OharraPersistence
 * @see OharraPersistenceImpl
 * @generated
 */
public class OharraUtil {
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
	public static void clearCache(Oharra oharra) {
		getPersistence().clearCache(oharra);
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
	public static List<Oharra> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Oharra> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Oharra> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Oharra update(Oharra oharra, boolean merge)
		throws SystemException {
		return getPersistence().update(oharra, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Oharra update(Oharra oharra, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(oharra, merge, serviceContext);
	}

	/**
	* Caches the oharra in the entity cache if it is enabled.
	*
	* @param oharra the oharra
	*/
	public static void cacheResult(net.sareweb.txotx.model.Oharra oharra) {
		getPersistence().cacheResult(oharra);
	}

	/**
	* Caches the oharras in the entity cache if it is enabled.
	*
	* @param oharras the oharras
	*/
	public static void cacheResult(
		java.util.List<net.sareweb.txotx.model.Oharra> oharras) {
		getPersistence().cacheResult(oharras);
	}

	/**
	* Creates a new oharra with the primary key. Does not add the oharra to the database.
	*
	* @param oharraId the primary key for the new oharra
	* @return the new oharra
	*/
	public static net.sareweb.txotx.model.Oharra create(long oharraId) {
		return getPersistence().create(oharraId);
	}

	/**
	* Removes the oharra with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oharraId the primary key of the oharra
	* @return the oharra that was removed
	* @throws net.sareweb.txotx.NoSuchOharraException if a oharra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Oharra remove(long oharraId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchOharraException {
		return getPersistence().remove(oharraId);
	}

	public static net.sareweb.txotx.model.Oharra updateImpl(
		net.sareweb.txotx.model.Oharra oharra, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(oharra, merge);
	}

	/**
	* Returns the oharra with the primary key or throws a {@link net.sareweb.txotx.NoSuchOharraException} if it could not be found.
	*
	* @param oharraId the primary key of the oharra
	* @return the oharra
	* @throws net.sareweb.txotx.NoSuchOharraException if a oharra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Oharra findByPrimaryKey(long oharraId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchOharraException {
		return getPersistence().findByPrimaryKey(oharraId);
	}

	/**
	* Returns the oharra with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param oharraId the primary key of the oharra
	* @return the oharra, or <code>null</code> if a oharra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Oharra fetchByPrimaryKey(
		long oharraId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(oharraId);
	}

	/**
	* Returns all the oharras.
	*
	* @return the oharras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Oharra> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the oharras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of oharras
	* @param end the upper bound of the range of oharras (not inclusive)
	* @return the range of oharras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Oharra> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the oharras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of oharras
	* @param end the upper bound of the range of oharras (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of oharras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Oharra> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the oharras from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of oharras.
	*
	* @return the number of oharras
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OharraPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OharraPersistence)PortletBeanLocatorUtil.locate(net.sareweb.txotx.service.ClpSerializer.getServletContextName(),
					OharraPersistence.class.getName());

			ReferenceRegistry.registerReference(OharraUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(OharraPersistence persistence) {
	}

	private static OharraPersistence _persistence;
}