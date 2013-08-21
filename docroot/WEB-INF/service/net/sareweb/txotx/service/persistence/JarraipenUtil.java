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

import net.sareweb.txotx.model.Jarraipen;

import java.util.List;

/**
 * The persistence utility for the jarraipen service. This utility wraps {@link JarraipenPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see JarraipenPersistence
 * @see JarraipenPersistenceImpl
 * @generated
 */
public class JarraipenUtil {
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
	public static void clearCache(Jarraipen jarraipen) {
		getPersistence().clearCache(jarraipen);
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
	public static List<Jarraipen> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Jarraipen> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Jarraipen> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Jarraipen update(Jarraipen jarraipen, boolean merge)
		throws SystemException {
		return getPersistence().update(jarraipen, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Jarraipen update(Jarraipen jarraipen, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(jarraipen, merge, serviceContext);
	}

	/**
	* Caches the jarraipen in the entity cache if it is enabled.
	*
	* @param jarraipen the jarraipen
	*/
	public static void cacheResult(net.sareweb.txotx.model.Jarraipen jarraipen) {
		getPersistence().cacheResult(jarraipen);
	}

	/**
	* Caches the jarraipens in the entity cache if it is enabled.
	*
	* @param jarraipens the jarraipens
	*/
	public static void cacheResult(
		java.util.List<net.sareweb.txotx.model.Jarraipen> jarraipens) {
		getPersistence().cacheResult(jarraipens);
	}

	/**
	* Creates a new jarraipen with the primary key. Does not add the jarraipen to the database.
	*
	* @param jarraipenId the primary key for the new jarraipen
	* @return the new jarraipen
	*/
	public static net.sareweb.txotx.model.Jarraipen create(long jarraipenId) {
		return getPersistence().create(jarraipenId);
	}

	/**
	* Removes the jarraipen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jarraipenId the primary key of the jarraipen
	* @return the jarraipen that was removed
	* @throws net.sareweb.txotx.NoSuchJarraipenException if a jarraipen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Jarraipen remove(long jarraipenId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchJarraipenException {
		return getPersistence().remove(jarraipenId);
	}

	public static net.sareweb.txotx.model.Jarraipen updateImpl(
		net.sareweb.txotx.model.Jarraipen jarraipen, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(jarraipen, merge);
	}

	/**
	* Returns the jarraipen with the primary key or throws a {@link net.sareweb.txotx.NoSuchJarraipenException} if it could not be found.
	*
	* @param jarraipenId the primary key of the jarraipen
	* @return the jarraipen
	* @throws net.sareweb.txotx.NoSuchJarraipenException if a jarraipen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Jarraipen findByPrimaryKey(
		long jarraipenId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchJarraipenException {
		return getPersistence().findByPrimaryKey(jarraipenId);
	}

	/**
	* Returns the jarraipen with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jarraipenId the primary key of the jarraipen
	* @return the jarraipen, or <code>null</code> if a jarraipen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Jarraipen fetchByPrimaryKey(
		long jarraipenId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(jarraipenId);
	}

	/**
	* Returns all the jarraipens where jarraitzaileUserId = &#63;.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @return the matching jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Jarraipen> findByJarraitzaileUserId(
		long jarraitzaileUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByJarraitzaileUserId(jarraitzaileUserId);
	}

	/**
	* Returns a range of all the jarraipens where jarraitzaileUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @param start the lower bound of the range of jarraipens
	* @param end the upper bound of the range of jarraipens (not inclusive)
	* @return the range of matching jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Jarraipen> findByJarraitzaileUserId(
		long jarraitzaileUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByJarraitzaileUserId(jarraitzaileUserId, start, end);
	}

	/**
	* Returns an ordered range of all the jarraipens where jarraitzaileUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @param start the lower bound of the range of jarraipens
	* @param end the upper bound of the range of jarraipens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Jarraipen> findByJarraitzaileUserId(
		long jarraitzaileUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByJarraitzaileUserId(jarraitzaileUserId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first jarraipen in the ordered set where jarraitzaileUserId = &#63;.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jarraipen
	* @throws net.sareweb.txotx.NoSuchJarraipenException if a matching jarraipen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Jarraipen findByJarraitzaileUserId_First(
		long jarraitzaileUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchJarraipenException {
		return getPersistence()
				   .findByJarraitzaileUserId_First(jarraitzaileUserId,
			orderByComparator);
	}

	/**
	* Returns the first jarraipen in the ordered set where jarraitzaileUserId = &#63;.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jarraipen, or <code>null</code> if a matching jarraipen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Jarraipen fetchByJarraitzaileUserId_First(
		long jarraitzaileUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByJarraitzaileUserId_First(jarraitzaileUserId,
			orderByComparator);
	}

	/**
	* Returns the last jarraipen in the ordered set where jarraitzaileUserId = &#63;.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jarraipen
	* @throws net.sareweb.txotx.NoSuchJarraipenException if a matching jarraipen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Jarraipen findByJarraitzaileUserId_Last(
		long jarraitzaileUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchJarraipenException {
		return getPersistence()
				   .findByJarraitzaileUserId_Last(jarraitzaileUserId,
			orderByComparator);
	}

	/**
	* Returns the last jarraipen in the ordered set where jarraitzaileUserId = &#63;.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jarraipen, or <code>null</code> if a matching jarraipen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Jarraipen fetchByJarraitzaileUserId_Last(
		long jarraitzaileUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByJarraitzaileUserId_Last(jarraitzaileUserId,
			orderByComparator);
	}

	/**
	* Returns the jarraipens before and after the current jarraipen in the ordered set where jarraitzaileUserId = &#63;.
	*
	* @param jarraipenId the primary key of the current jarraipen
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jarraipen
	* @throws net.sareweb.txotx.NoSuchJarraipenException if a jarraipen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Jarraipen[] findByJarraitzaileUserId_PrevAndNext(
		long jarraipenId, long jarraitzaileUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchJarraipenException {
		return getPersistence()
				   .findByJarraitzaileUserId_PrevAndNext(jarraipenId,
			jarraitzaileUserId, orderByComparator);
	}

	/**
	* Returns all the jarraipens where jarraituaId = &#63;.
	*
	* @param jarraituaId the jarraitua ID
	* @return the matching jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Jarraipen> findByJarraituaId(
		long jarraituaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByJarraituaId(jarraituaId);
	}

	/**
	* Returns a range of all the jarraipens where jarraituaId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param jarraituaId the jarraitua ID
	* @param start the lower bound of the range of jarraipens
	* @param end the upper bound of the range of jarraipens (not inclusive)
	* @return the range of matching jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Jarraipen> findByJarraituaId(
		long jarraituaId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByJarraituaId(jarraituaId, start, end);
	}

	/**
	* Returns an ordered range of all the jarraipens where jarraituaId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param jarraituaId the jarraitua ID
	* @param start the lower bound of the range of jarraipens
	* @param end the upper bound of the range of jarraipens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Jarraipen> findByJarraituaId(
		long jarraituaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByJarraituaId(jarraituaId, start, end, orderByComparator);
	}

	/**
	* Returns the first jarraipen in the ordered set where jarraituaId = &#63;.
	*
	* @param jarraituaId the jarraitua ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jarraipen
	* @throws net.sareweb.txotx.NoSuchJarraipenException if a matching jarraipen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Jarraipen findByJarraituaId_First(
		long jarraituaId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchJarraipenException {
		return getPersistence()
				   .findByJarraituaId_First(jarraituaId, orderByComparator);
	}

	/**
	* Returns the first jarraipen in the ordered set where jarraituaId = &#63;.
	*
	* @param jarraituaId the jarraitua ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jarraipen, or <code>null</code> if a matching jarraipen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Jarraipen fetchByJarraituaId_First(
		long jarraituaId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByJarraituaId_First(jarraituaId, orderByComparator);
	}

	/**
	* Returns the last jarraipen in the ordered set where jarraituaId = &#63;.
	*
	* @param jarraituaId the jarraitua ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jarraipen
	* @throws net.sareweb.txotx.NoSuchJarraipenException if a matching jarraipen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Jarraipen findByJarraituaId_Last(
		long jarraituaId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchJarraipenException {
		return getPersistence()
				   .findByJarraituaId_Last(jarraituaId, orderByComparator);
	}

	/**
	* Returns the last jarraipen in the ordered set where jarraituaId = &#63;.
	*
	* @param jarraituaId the jarraitua ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jarraipen, or <code>null</code> if a matching jarraipen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Jarraipen fetchByJarraituaId_Last(
		long jarraituaId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByJarraituaId_Last(jarraituaId, orderByComparator);
	}

	/**
	* Returns the jarraipens before and after the current jarraipen in the ordered set where jarraituaId = &#63;.
	*
	* @param jarraipenId the primary key of the current jarraipen
	* @param jarraituaId the jarraitua ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jarraipen
	* @throws net.sareweb.txotx.NoSuchJarraipenException if a jarraipen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.txotx.model.Jarraipen[] findByJarraituaId_PrevAndNext(
		long jarraipenId, long jarraituaId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchJarraipenException {
		return getPersistence()
				   .findByJarraituaId_PrevAndNext(jarraipenId, jarraituaId,
			orderByComparator);
	}

	/**
	* Returns all the jarraipens.
	*
	* @return the jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Jarraipen> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the jarraipens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of jarraipens
	* @param end the upper bound of the range of jarraipens (not inclusive)
	* @return the range of jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Jarraipen> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the jarraipens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of jarraipens
	* @param end the upper bound of the range of jarraipens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.txotx.model.Jarraipen> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the jarraipens where jarraitzaileUserId = &#63; from the database.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByJarraitzaileUserId(long jarraitzaileUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByJarraitzaileUserId(jarraitzaileUserId);
	}

	/**
	* Removes all the jarraipens where jarraituaId = &#63; from the database.
	*
	* @param jarraituaId the jarraitua ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByJarraituaId(long jarraituaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByJarraituaId(jarraituaId);
	}

	/**
	* Removes all the jarraipens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of jarraipens where jarraitzaileUserId = &#63;.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @return the number of matching jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByJarraitzaileUserId(long jarraitzaileUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByJarraitzaileUserId(jarraitzaileUserId);
	}

	/**
	* Returns the number of jarraipens where jarraituaId = &#63;.
	*
	* @param jarraituaId the jarraitua ID
	* @return the number of matching jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByJarraituaId(long jarraituaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByJarraituaId(jarraituaId);
	}

	/**
	* Returns the number of jarraipens.
	*
	* @return the number of jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static JarraipenPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (JarraipenPersistence)PortletBeanLocatorUtil.locate(net.sareweb.txotx.service.ClpSerializer.getServletContextName(),
					JarraipenPersistence.class.getName());

			ReferenceRegistry.registerReference(JarraipenUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(JarraipenPersistence persistence) {
	}

	private static JarraipenPersistence _persistence;
}