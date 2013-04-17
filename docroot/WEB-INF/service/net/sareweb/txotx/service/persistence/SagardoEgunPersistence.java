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

import net.sareweb.txotx.model.SagardoEgun;

/**
 * The persistence interface for the sagardo egun service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see SagardoEgunPersistenceImpl
 * @see SagardoEgunUtil
 * @generated
 */
public interface SagardoEgunPersistence extends BasePersistence<SagardoEgun> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SagardoEgunUtil} to access the sagardo egun persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the sagardo egun in the entity cache if it is enabled.
	*
	* @param sagardoEgun the sagardo egun
	*/
	public void cacheResult(net.sareweb.txotx.model.SagardoEgun sagardoEgun);

	/**
	* Caches the sagardo eguns in the entity cache if it is enabled.
	*
	* @param sagardoEguns the sagardo eguns
	*/
	public void cacheResult(
		java.util.List<net.sareweb.txotx.model.SagardoEgun> sagardoEguns);

	/**
	* Creates a new sagardo egun with the primary key. Does not add the sagardo egun to the database.
	*
	* @param sagardoEgunId the primary key for the new sagardo egun
	* @return the new sagardo egun
	*/
	public net.sareweb.txotx.model.SagardoEgun create(long sagardoEgunId);

	/**
	* Removes the sagardo egun with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sagardoEgunId the primary key of the sagardo egun
	* @return the sagardo egun that was removed
	* @throws net.sareweb.txotx.NoSuchSagardoEgunException if a sagardo egun with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.SagardoEgun remove(long sagardoEgunId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchSagardoEgunException;

	public net.sareweb.txotx.model.SagardoEgun updateImpl(
		net.sareweb.txotx.model.SagardoEgun sagardoEgun, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sagardo egun with the primary key or throws a {@link net.sareweb.txotx.NoSuchSagardoEgunException} if it could not be found.
	*
	* @param sagardoEgunId the primary key of the sagardo egun
	* @return the sagardo egun
	* @throws net.sareweb.txotx.NoSuchSagardoEgunException if a sagardo egun with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.SagardoEgun findByPrimaryKey(
		long sagardoEgunId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchSagardoEgunException;

	/**
	* Returns the sagardo egun with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sagardoEgunId the primary key of the sagardo egun
	* @return the sagardo egun, or <code>null</code> if a sagardo egun with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.SagardoEgun fetchByPrimaryKey(
		long sagardoEgunId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sagardo eguns.
	*
	* @return the sagardo eguns
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.txotx.model.SagardoEgun> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<net.sareweb.txotx.model.SagardoEgun> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<net.sareweb.txotx.model.SagardoEgun> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the sagardo eguns from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sagardo eguns.
	*
	* @return the number of sagardo eguns
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}