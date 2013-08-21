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

import net.sareweb.txotx.model.APKVersion;

/**
 * The persistence interface for the a p k version service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see APKVersionPersistenceImpl
 * @see APKVersionUtil
 * @generated
 */
public interface APKVersionPersistence extends BasePersistence<APKVersion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link APKVersionUtil} to access the a p k version persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the a p k version in the entity cache if it is enabled.
	*
	* @param apkVersion the a p k version
	*/
	public void cacheResult(net.sareweb.txotx.model.APKVersion apkVersion);

	/**
	* Caches the a p k versions in the entity cache if it is enabled.
	*
	* @param apkVersions the a p k versions
	*/
	public void cacheResult(
		java.util.List<net.sareweb.txotx.model.APKVersion> apkVersions);

	/**
	* Creates a new a p k version with the primary key. Does not add the a p k version to the database.
	*
	* @param apkVersionId the primary key for the new a p k version
	* @return the new a p k version
	*/
	public net.sareweb.txotx.model.APKVersion create(long apkVersionId);

	/**
	* Removes the a p k version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param apkVersionId the primary key of the a p k version
	* @return the a p k version that was removed
	* @throws net.sareweb.txotx.NoSuchAPKVersionException if a a p k version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.APKVersion remove(long apkVersionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchAPKVersionException;

	public net.sareweb.txotx.model.APKVersion updateImpl(
		net.sareweb.txotx.model.APKVersion apkVersion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the a p k version with the primary key or throws a {@link net.sareweb.txotx.NoSuchAPKVersionException} if it could not be found.
	*
	* @param apkVersionId the primary key of the a p k version
	* @return the a p k version
	* @throws net.sareweb.txotx.NoSuchAPKVersionException if a a p k version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.APKVersion findByPrimaryKey(
		long apkVersionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.txotx.NoSuchAPKVersionException;

	/**
	* Returns the a p k version with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param apkVersionId the primary key of the a p k version
	* @return the a p k version, or <code>null</code> if a a p k version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.APKVersion fetchByPrimaryKey(
		long apkVersionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the a p k versions.
	*
	* @return the a p k versions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.txotx.model.APKVersion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the a p k versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of a p k versions
	* @param end the upper bound of the range of a p k versions (not inclusive)
	* @return the range of a p k versions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.txotx.model.APKVersion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the a p k versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of a p k versions
	* @param end the upper bound of the range of a p k versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of a p k versions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.txotx.model.APKVersion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the a p k versions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of a p k versions.
	*
	* @return the number of a p k versions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}