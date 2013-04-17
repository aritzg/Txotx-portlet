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

import net.sareweb.txotx.model.SagardoEgun;

import java.util.List;

/**
 * The persistence utility for the sagardo egun service. This utility wraps {@link SagardoEgunPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see SagardoEgunPersistence
 * @see SagardoEgunPersistenceImpl
 * @generated
 */
public class SagardoEgunUtil {
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
	public static void clearCache(SagardoEgun sagardoEgun) {
		getPersistence().clearCache(sagardoEgun);
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
	public static List<SagardoEgun> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SagardoEgun> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SagardoEgun> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static SagardoEgun update(SagardoEgun sagardoEgun, boolean merge)
		throws SystemException {
		return getPersistence().update(sagardoEgun, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static SagardoEgun update(SagardoEgun sagardoEgun, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(sagardoEgun, merge, serviceContext);
	}

	/**
	* Caches the sagardo egun in the entity cache if it is enabled.
	*
	* @param sagardoEgun the sagardo egun
	*/
	public static void cacheResult(
		net.sareweb.txotx.model.SagardoEgun sagardoEgun) {
		getPersistence().cacheResult(sagardoEgun);
	}

	/**
	* Caches the sagardo eguns in the entity cache if it is enabled.
	*
	* @param sagardoEguns the sagardo eguns
	*/
	public static void cacheResult(
		java.util.List<net.sareweb.txotx.model.SagardoEgun> sagardoEguns) {
		getPersistence().cacheResult(sagardoEguns);
	}

	/**
	* Creates a new sagardo egun with the primary key. Does not add the sagardo egun to the database.
	*
	* @param sagardoEgunId the primary key for the new sagardo egun
	* @return the new sagardo egun
	*/
	public static net.sareweb.txotx.model.SagardoEgun create(long sagardoEgunId) {
		return getPersistence().create(sagardoEgunId);
	}

	/**
	* Removes the sagardo egun with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sagardoEgunId the primary key of the sagardo egun
	* @return the sagardo egun that was removed
	* @throws net.sareweb.txotx.NoSuchSagardoEgunException if a sagardo egun with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.SagardoEgun remove(long sagardoEgunId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchSagardoEgunException {
		return getPersistence().remove(sagardoEgunId);
	}

	public static net.sareweb.txotx.model.SagardoEgun updateImpl(
		net.sareweb.txotx.model.SagardoEgun sagardoEgun, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(sagardoEgun, merge);
	}

	/**
	* Returns the sagardo egun with the primary key or throws a {@link net.sareweb.txotx.NoSuchSagardoEgunException} if it could not be found.
	*
	* @param sagardoEgunId the primary key of the sagardo egun
	* @return the sagardo egun
	* @throws net.sareweb.txotx.NoSuchSagardoEgunException if a sagardo egun with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.SagardoEgun findByPrimaryKey(
		long sagardoEgunId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchSagardoEgunException {
		return getPersistence().findByPrimaryKey(sagardoEgunId);
	}

	/**
	* Returns the sagardo egun with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sagardoEgunId the primary key of the sagardo egun
	* @return the sagardo egun, or <code>null</code> if a sagardo egun with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.SagardoEgun fetchByPrimaryKey(
		long sagardoEgunId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(sagardoEgunId);
	}

	/**
	* Returns all the sagardo eguns.
	*
	* @return the sagardo eguns
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.SagardoEgun> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the sagardo eguns.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of sagardo eguns
	* @param end the upper bound of the range of sagardo eguns (not inclusive)
	* @return the range of sagardo eguns
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.SagardoEgun> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the sagardo eguns.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of sagardo eguns
	* @param end the upper bound of the range of sagardo eguns (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sagardo eguns
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.SagardoEgun> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the sagardo eguns from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of sagardo eguns.
	*
	* @return the number of sagardo eguns
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SagardoEgunPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SagardoEgunPersistence)PortletBeanLocatorUtil.locate(net.sareweb.txotx.service.ClpSerializer.getServletContextName(),
					SagardoEgunPersistence.class.getName());

			ReferenceRegistry.registerReference(SagardoEgunUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(SagardoEgunPersistence persistence) {
	}

	private static SagardoEgunPersistence _persistence;
}