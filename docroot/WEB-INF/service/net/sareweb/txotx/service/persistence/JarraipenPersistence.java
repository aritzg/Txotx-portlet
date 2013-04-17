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

import com.liferay.portal.service.persistence.BasePersistence;

import net.sareweb.txotx.model.Jarraipen;

/**
 * The persistence interface for the jarraipen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see JarraipenPersistenceImpl
 * @see JarraipenUtil
 * @generated
 */
public interface JarraipenPersistence extends BasePersistence<Jarraipen> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JarraipenUtil} to access the jarraipen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the jarraipen in the entity cache if it is enabled.
	*
	* @param jarraipen the jarraipen
	*/
	public void cacheResult(net.sareweb.txotx.model.Jarraipen jarraipen);

	/**
	* Caches the jarraipens in the entity cache if it is enabled.
	*
	* @param jarraipens the jarraipens
	*/
	public void cacheResult(
		java.util.List<net.sareweb.txotx.model.Jarraipen> jarraipens);

	/**
	* Creates a new jarraipen with the primary key. Does not add the jarraipen to the database.
	*
	* @param jarraipenId the primary key for the new jarraipen
	* @return the new jarraipen
	*/
	public net.sareweb.txotx.model.Jarraipen create(long jarraipenId);

	/**
	* Removes the jarraipen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jarraipenId the primary key of the jarraipen
	* @return the jarraipen that was removed
	* @throws net.sareweb.txotx.NoSuchJarraipenException if a jarraipen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Jarraipen remove(long jarraipenId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchJarraipenException;

	public net.sareweb.txotx.model.Jarraipen updateImpl(
		net.sareweb.txotx.model.Jarraipen jarraipen, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the jarraipen with the primary key or throws a {@link net.sareweb.txotx.NoSuchJarraipenException} if it could not be found.
	*
	* @param jarraipenId the primary key of the jarraipen
	* @return the jarraipen
	* @throws net.sareweb.txotx.NoSuchJarraipenException if a jarraipen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Jarraipen findByPrimaryKey(long jarraipenId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchJarraipenException;

	/**
	* Returns the jarraipen with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jarraipenId the primary key of the jarraipen
	* @return the jarraipen, or <code>null</code> if a jarraipen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Jarraipen fetchByPrimaryKey(long jarraipenId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the jarraipens where jarraitzaileUserId = &#63;.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @return the matching jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.txotx.model.Jarraipen> findByJarraitzaileUserId(
		long jarraitzaileUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<net.sareweb.txotx.model.Jarraipen> findByJarraitzaileUserId(
		long jarraitzaileUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<net.sareweb.txotx.model.Jarraipen> findByJarraitzaileUserId(
		long jarraitzaileUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first jarraipen in the ordered set where jarraitzaileUserId = &#63;.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jarraipen
	* @throws net.sareweb.txotx.NoSuchJarraipenException if a matching jarraipen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Jarraipen findByJarraitzaileUserId_First(
		long jarraitzaileUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchJarraipenException;

	/**
	* Returns the first jarraipen in the ordered set where jarraitzaileUserId = &#63;.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jarraipen, or <code>null</code> if a matching jarraipen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Jarraipen fetchByJarraitzaileUserId_First(
		long jarraitzaileUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last jarraipen in the ordered set where jarraitzaileUserId = &#63;.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jarraipen
	* @throws net.sareweb.txotx.NoSuchJarraipenException if a matching jarraipen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Jarraipen findByJarraitzaileUserId_Last(
		long jarraitzaileUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchJarraipenException;

	/**
	* Returns the last jarraipen in the ordered set where jarraitzaileUserId = &#63;.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jarraipen, or <code>null</code> if a matching jarraipen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Jarraipen fetchByJarraitzaileUserId_Last(
		long jarraitzaileUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public net.sareweb.txotx.model.Jarraipen[] findByJarraitzaileUserId_PrevAndNext(
		long jarraipenId, long jarraitzaileUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchJarraipenException;

	/**
	* Returns all the jarraipens.
	*
	* @return the jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.txotx.model.Jarraipen> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<net.sareweb.txotx.model.Jarraipen> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<net.sareweb.txotx.model.Jarraipen> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the jarraipens where jarraitzaileUserId = &#63; from the database.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByJarraitzaileUserId(long jarraitzaileUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the jarraipens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of jarraipens where jarraitzaileUserId = &#63;.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID
	* @return the number of matching jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public int countByJarraitzaileUserId(long jarraitzaileUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of jarraipens.
	*
	* @return the number of jarraipens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}