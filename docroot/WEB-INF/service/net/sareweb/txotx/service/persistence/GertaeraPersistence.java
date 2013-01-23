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

import net.sareweb.txotx.model.Gertaera;

/**
 * The persistence interface for the gertaera service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see GertaeraPersistenceImpl
 * @see GertaeraUtil
 * @generated
 */
public interface GertaeraPersistence extends BasePersistence<Gertaera> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GertaeraUtil} to access the gertaera persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the gertaera in the entity cache if it is enabled.
	*
	* @param gertaera the gertaera
	*/
	public void cacheResult(net.sareweb.txotx.model.Gertaera gertaera);

	/**
	* Caches the gertaeras in the entity cache if it is enabled.
	*
	* @param gertaeras the gertaeras
	*/
	public void cacheResult(
		java.util.List<net.sareweb.txotx.model.Gertaera> gertaeras);

	/**
	* Creates a new gertaera with the primary key. Does not add the gertaera to the database.
	*
	* @param gertaeraId the primary key for the new gertaera
	* @return the new gertaera
	*/
	public net.sareweb.txotx.model.Gertaera create(long gertaeraId);

	/**
	* Removes the gertaera with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param gertaeraId the primary key of the gertaera
	* @return the gertaera that was removed
	* @throws net.sareweb.txotx.NoSuchGertaeraException if a gertaera with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Gertaera remove(long gertaeraId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchGertaeraException;

	public net.sareweb.txotx.model.Gertaera updateImpl(
		net.sareweb.txotx.model.Gertaera gertaera, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the gertaera with the primary key or throws a {@link net.sareweb.txotx.NoSuchGertaeraException} if it could not be found.
	*
	* @param gertaeraId the primary key of the gertaera
	* @return the gertaera
	* @throws net.sareweb.txotx.NoSuchGertaeraException if a gertaera with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Gertaera findByPrimaryKey(long gertaeraId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchGertaeraException;

	/**
	* Returns the gertaera with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param gertaeraId the primary key of the gertaera
	* @return the gertaera, or <code>null</code> if a gertaera with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Gertaera fetchByPrimaryKey(long gertaeraId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the gertaeras.
	*
	* @return the gertaeras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.txotx.model.Gertaera> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<net.sareweb.txotx.model.Gertaera> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<net.sareweb.txotx.model.Gertaera> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the gertaeras from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of gertaeras.
	*
	* @return the number of gertaeras
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}