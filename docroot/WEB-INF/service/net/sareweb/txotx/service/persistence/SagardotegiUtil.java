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

import net.sareweb.txotx.model.Sagardotegi;

import java.util.List;

/**
 * The persistence utility for the sagardotegi service. This utility wraps {@link SagardotegiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see SagardotegiPersistence
 * @see SagardotegiPersistenceImpl
 * @generated
 */
public class SagardotegiUtil {
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
	public static void clearCache(Sagardotegi sagardotegi) {
		getPersistence().clearCache(sagardotegi);
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
	public static List<Sagardotegi> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Sagardotegi> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Sagardotegi> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Sagardotegi update(Sagardotegi sagardotegi, boolean merge)
		throws SystemException {
		return getPersistence().update(sagardotegi, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Sagardotegi update(Sagardotegi sagardotegi, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(sagardotegi, merge, serviceContext);
	}

	/**
	* Caches the sagardotegi in the entity cache if it is enabled.
	*
	* @param sagardotegi the sagardotegi
	*/
	public static void cacheResult(
		net.sareweb.txotx.model.Sagardotegi sagardotegi) {
		getPersistence().cacheResult(sagardotegi);
	}

	/**
	* Caches the sagardotegis in the entity cache if it is enabled.
	*
	* @param sagardotegis the sagardotegis
	*/
	public static void cacheResult(
		java.util.List<net.sareweb.txotx.model.Sagardotegi> sagardotegis) {
		getPersistence().cacheResult(sagardotegis);
	}

	/**
	* Creates a new sagardotegi with the primary key. Does not add the sagardotegi to the database.
	*
	* @param sagardotegiId the primary key for the new sagardotegi
	* @return the new sagardotegi
	*/
	public static net.sareweb.txotx.model.Sagardotegi create(long sagardotegiId) {
		return getPersistence().create(sagardotegiId);
	}

	/**
	* Removes the sagardotegi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sagardotegiId the primary key of the sagardotegi
	* @return the sagardotegi that was removed
	* @throws net.sareweb.txotx.NoSuchSagardotegiException if a sagardotegi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Sagardotegi remove(long sagardotegiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchSagardotegiException {
		return getPersistence().remove(sagardotegiId);
	}

	public static net.sareweb.txotx.model.Sagardotegi updateImpl(
		net.sareweb.txotx.model.Sagardotegi sagardotegi, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(sagardotegi, merge);
	}

	/**
	* Returns the sagardotegi with the primary key or throws a {@link net.sareweb.txotx.NoSuchSagardotegiException} if it could not be found.
	*
	* @param sagardotegiId the primary key of the sagardotegi
	* @return the sagardotegi
	* @throws net.sareweb.txotx.NoSuchSagardotegiException if a sagardotegi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Sagardotegi findByPrimaryKey(
		long sagardotegiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchSagardotegiException {
		return getPersistence().findByPrimaryKey(sagardotegiId);
	}

	/**
	* Returns the sagardotegi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sagardotegiId the primary key of the sagardotegi
	* @return the sagardotegi, or <code>null</code> if a sagardotegi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Sagardotegi fetchByPrimaryKey(
		long sagardotegiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(sagardotegiId);
	}

	/**
	* Returns all the sagardotegis.
	*
	* @return the sagardotegis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Sagardotegi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the sagardotegis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of sagardotegis
	* @param end the upper bound of the range of sagardotegis (not inclusive)
	* @return the range of sagardotegis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Sagardotegi> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the sagardotegis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of sagardotegis
	* @param end the upper bound of the range of sagardotegis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sagardotegis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Sagardotegi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the sagardotegis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of sagardotegis.
	*
	* @return the number of sagardotegis
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SagardotegiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SagardotegiPersistence)PortletBeanLocatorUtil.locate(net.sareweb.txotx.service.ClpSerializer.getServletContextName(),
					SagardotegiPersistence.class.getName());

			ReferenceRegistry.registerReference(SagardotegiUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(SagardotegiPersistence persistence) {
	}

	private static SagardotegiPersistence _persistence;
}