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

import net.sareweb.txotx.model.Sagardotegi;

/**
 * The persistence interface for the sagardotegi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see SagardotegiPersistenceImpl
 * @see SagardotegiUtil
 * @generated
 */
public interface SagardotegiPersistence extends BasePersistence<Sagardotegi> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SagardotegiUtil} to access the sagardotegi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the sagardotegi in the entity cache if it is enabled.
	*
	* @param sagardotegi the sagardotegi
	*/
	public void cacheResult(net.sareweb.txotx.model.Sagardotegi sagardotegi);

	/**
	* Caches the sagardotegis in the entity cache if it is enabled.
	*
	* @param sagardotegis the sagardotegis
	*/
	public void cacheResult(
		java.util.List<net.sareweb.txotx.model.Sagardotegi> sagardotegis);

	/**
	* Creates a new sagardotegi with the primary key. Does not add the sagardotegi to the database.
	*
	* @param sagardotegiId the primary key for the new sagardotegi
	* @return the new sagardotegi
	*/
	public net.sareweb.txotx.model.Sagardotegi create(long sagardotegiId);

	/**
	* Removes the sagardotegi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sagardotegiId the primary key of the sagardotegi
	* @return the sagardotegi that was removed
	* @throws net.sareweb.txotx.NoSuchSagardotegiException if a sagardotegi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sagardotegi remove(long sagardotegiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchSagardotegiException;

	public net.sareweb.txotx.model.Sagardotegi updateImpl(
		net.sareweb.txotx.model.Sagardotegi sagardotegi, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sagardotegi with the primary key or throws a {@link net.sareweb.txotx.NoSuchSagardotegiException} if it could not be found.
	*
	* @param sagardotegiId the primary key of the sagardotegi
	* @return the sagardotegi
	* @throws net.sareweb.txotx.NoSuchSagardotegiException if a sagardotegi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sagardotegi findByPrimaryKey(
		long sagardotegiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchSagardotegiException;

	/**
	* Returns the sagardotegi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sagardotegiId the primary key of the sagardotegi
	* @return the sagardotegi, or <code>null</code> if a sagardotegi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sagardotegi fetchByPrimaryKey(
		long sagardotegiId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sagardotegis.
	*
	* @return the sagardotegis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.txotx.model.Sagardotegi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<net.sareweb.txotx.model.Sagardotegi> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<net.sareweb.txotx.model.Sagardotegi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the sagardotegis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sagardotegis.
	*
	* @return the number of sagardotegis
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}