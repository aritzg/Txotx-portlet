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

import net.sareweb.txotx.model.Gertaera;

import java.util.List;

/**
 * The persistence utility for the gertaera service. This utility wraps {@link GertaeraPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see GertaeraPersistence
 * @see GertaeraPersistenceImpl
 * @generated
 */
public class GertaeraUtil {
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
	public static void clearCache(Gertaera gertaera) {
		getPersistence().clearCache(gertaera);
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
	public static List<Gertaera> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Gertaera> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Gertaera> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Gertaera update(Gertaera gertaera, boolean merge)
		throws SystemException {
		return getPersistence().update(gertaera, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Gertaera update(Gertaera gertaera, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(gertaera, merge, serviceContext);
	}

	/**
	* Caches the gertaera in the entity cache if it is enabled.
	*
	* @param gertaera the gertaera
	*/
	public static void cacheResult(net.sareweb.txotx.model.Gertaera gertaera) {
		getPersistence().cacheResult(gertaera);
	}

	/**
	* Caches the gertaeras in the entity cache if it is enabled.
	*
	* @param gertaeras the gertaeras
	*/
	public static void cacheResult(
		java.util.List<net.sareweb.txotx.model.Gertaera> gertaeras) {
		getPersistence().cacheResult(gertaeras);
	}

	/**
	* Creates a new gertaera with the primary key. Does not add the gertaera to the database.
	*
	* @param gertaeraId the primary key for the new gertaera
	* @return the new gertaera
	*/
	public static net.sareweb.txotx.model.Gertaera create(long gertaeraId) {
		return getPersistence().create(gertaeraId);
	}

	/**
	* Removes the gertaera with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param gertaeraId the primary key of the gertaera
	* @return the gertaera that was removed
	* @throws net.sareweb.txotx.NoSuchGertaeraException if a gertaera with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Gertaera remove(long gertaeraId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchGertaeraException {
		return getPersistence().remove(gertaeraId);
	}

	public static net.sareweb.txotx.model.Gertaera updateImpl(
		net.sareweb.txotx.model.Gertaera gertaera, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(gertaera, merge);
	}

	/**
	* Returns the gertaera with the primary key or throws a {@link net.sareweb.txotx.NoSuchGertaeraException} if it could not be found.
	*
	* @param gertaeraId the primary key of the gertaera
	* @return the gertaera
	* @throws net.sareweb.txotx.NoSuchGertaeraException if a gertaera with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Gertaera findByPrimaryKey(
		long gertaeraId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchGertaeraException {
		return getPersistence().findByPrimaryKey(gertaeraId);
	}

	/**
	* Returns the gertaera with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param gertaeraId the primary key of the gertaera
	* @return the gertaera, or <code>null</code> if a gertaera with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Gertaera fetchByPrimaryKey(
		long gertaeraId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(gertaeraId);
	}

	/**
	* Returns all the gertaeras.
	*
	* @return the gertaeras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Gertaera> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the gertaeras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of gertaeras
	* @param end the upper bound of the range of gertaeras (not inclusive)
	* @return the range of gertaeras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Gertaera> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the gertaeras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of gertaeras
	* @param end the upper bound of the range of gertaeras (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of gertaeras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Gertaera> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the gertaeras from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of gertaeras.
	*
	* @return the number of gertaeras
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static GertaeraPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (GertaeraPersistence)PortletBeanLocatorUtil.locate(net.sareweb.txotx.service.ClpSerializer.getServletContextName(),
					GertaeraPersistence.class.getName());

			ReferenceRegistry.registerReference(GertaeraUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(GertaeraPersistence persistence) {
	}

	private static GertaeraPersistence _persistence;
}