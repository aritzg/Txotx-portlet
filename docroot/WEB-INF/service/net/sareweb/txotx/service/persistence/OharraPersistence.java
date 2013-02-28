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

import net.sareweb.txotx.model.Oharra;

/**
 * The persistence interface for the oharra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see OharraPersistenceImpl
 * @see OharraUtil
 * @generated
 */
public interface OharraPersistence extends BasePersistence<Oharra> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OharraUtil} to access the oharra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the oharra in the entity cache if it is enabled.
	*
	* @param oharra the oharra
	*/
	public void cacheResult(net.sareweb.txotx.model.Oharra oharra);

	/**
	* Caches the oharras in the entity cache if it is enabled.
	*
	* @param oharras the oharras
	*/
	public void cacheResult(
		java.util.List<net.sareweb.txotx.model.Oharra> oharras);

	/**
	* Creates a new oharra with the primary key. Does not add the oharra to the database.
	*
	* @param oharraId the primary key for the new oharra
	* @return the new oharra
	*/
	public net.sareweb.txotx.model.Oharra create(long oharraId);

	/**
	* Removes the oharra with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oharraId the primary key of the oharra
	* @return the oharra that was removed
	* @throws net.sareweb.txotx.NoSuchOharraException if a oharra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Oharra remove(long oharraId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchOharraException;

	public net.sareweb.txotx.model.Oharra updateImpl(
		net.sareweb.txotx.model.Oharra oharra, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the oharra with the primary key or throws a {@link net.sareweb.txotx.NoSuchOharraException} if it could not be found.
	*
	* @param oharraId the primary key of the oharra
	* @return the oharra
	* @throws net.sareweb.txotx.NoSuchOharraException if a oharra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Oharra findByPrimaryKey(long oharraId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchOharraException;

	/**
	* Returns the oharra with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param oharraId the primary key of the oharra
	* @return the oharra, or <code>null</code> if a oharra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Oharra fetchByPrimaryKey(long oharraId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the oharras.
	*
	* @return the oharras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.txotx.model.Oharra> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<net.sareweb.txotx.model.Oharra> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<net.sareweb.txotx.model.Oharra> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the oharras from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of oharras.
	*
	* @return the number of oharras
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}