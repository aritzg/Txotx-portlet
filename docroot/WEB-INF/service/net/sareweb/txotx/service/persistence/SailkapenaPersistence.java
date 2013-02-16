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

import net.sareweb.txotx.model.Sailkapena;

/**
 * The persistence interface for the sailkapena service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see SailkapenaPersistenceImpl
 * @see SailkapenaUtil
 * @generated
 */
public interface SailkapenaPersistence extends BasePersistence<Sailkapena> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SailkapenaUtil} to access the sailkapena persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the sailkapena in the entity cache if it is enabled.
	*
	* @param sailkapena the sailkapena
	*/
	public void cacheResult(net.sareweb.txotx.model.Sailkapena sailkapena);

	/**
	* Caches the sailkapenas in the entity cache if it is enabled.
	*
	* @param sailkapenas the sailkapenas
	*/
	public void cacheResult(
		java.util.List<net.sareweb.txotx.model.Sailkapena> sailkapenas);

	/**
	* Creates a new sailkapena with the primary key. Does not add the sailkapena to the database.
	*
	* @param sailkapenaId the primary key for the new sailkapena
	* @return the new sailkapena
	*/
	public net.sareweb.txotx.model.Sailkapena create(long sailkapenaId);

	/**
	* Removes the sailkapena with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sailkapenaId the primary key of the sailkapena
	* @return the sailkapena that was removed
	* @throws net.sareweb.txotx.NoSuchSailkapenaException if a sailkapena with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sailkapena remove(long sailkapenaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchSailkapenaException;

	public net.sareweb.txotx.model.Sailkapena updateImpl(
		net.sareweb.txotx.model.Sailkapena sailkapena, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sailkapena with the primary key or throws a {@link net.sareweb.txotx.NoSuchSailkapenaException} if it could not be found.
	*
	* @param sailkapenaId the primary key of the sailkapena
	* @return the sailkapena
	* @throws net.sareweb.txotx.NoSuchSailkapenaException if a sailkapena with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sailkapena findByPrimaryKey(
		long sailkapenaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchSailkapenaException;

	/**
	* Returns the sailkapena with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sailkapenaId the primary key of the sailkapena
	* @return the sailkapena, or <code>null</code> if a sailkapena with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sailkapena fetchByPrimaryKey(
		long sailkapenaId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sailkapena where userId = &#63; or throws a {@link net.sareweb.txotx.NoSuchSailkapenaException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching sailkapena
	* @throws net.sareweb.txotx.NoSuchSailkapenaException if a matching sailkapena could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sailkapena findByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchSailkapenaException;

	/**
	* Returns the sailkapena where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching sailkapena, or <code>null</code> if a matching sailkapena could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sailkapena fetchByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sailkapena where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching sailkapena, or <code>null</code> if a matching sailkapena could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sailkapena fetchByUserId(long userId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sailkapenas.
	*
	* @return the sailkapenas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.txotx.model.Sailkapena> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the sailkapenas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of sailkapenas
	* @param end the upper bound of the range of sailkapenas (not inclusive)
	* @return the range of sailkapenas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.txotx.model.Sailkapena> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the sailkapenas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of sailkapenas
	* @param end the upper bound of the range of sailkapenas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sailkapenas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.txotx.model.Sailkapena> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the sailkapena where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @return the sailkapena that was removed
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sailkapena removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchSailkapenaException;

	/**
	* Removes all the sailkapenas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sailkapenas where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching sailkapenas
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sailkapenas.
	*
	* @return the number of sailkapenas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}