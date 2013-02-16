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

package net.sareweb.txotx.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link SailkapenaLocalService}.
 * </p>
 *
 * @author    A.Galdos
 * @see       SailkapenaLocalService
 * @generated
 */
public class SailkapenaLocalServiceWrapper implements SailkapenaLocalService,
	ServiceWrapper<SailkapenaLocalService> {
	public SailkapenaLocalServiceWrapper(
		SailkapenaLocalService sailkapenaLocalService) {
		_sailkapenaLocalService = sailkapenaLocalService;
	}

	/**
	* Adds the sailkapena to the database. Also notifies the appropriate model listeners.
	*
	* @param sailkapena the sailkapena
	* @return the sailkapena that was added
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sailkapena addSailkapena(
		net.sareweb.txotx.model.Sailkapena sailkapena)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaLocalService.addSailkapena(sailkapena);
	}

	/**
	* Creates a new sailkapena with the primary key. Does not add the sailkapena to the database.
	*
	* @param sailkapenaId the primary key for the new sailkapena
	* @return the new sailkapena
	*/
	public net.sareweb.txotx.model.Sailkapena createSailkapena(
		long sailkapenaId) {
		return _sailkapenaLocalService.createSailkapena(sailkapenaId);
	}

	/**
	* Deletes the sailkapena with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sailkapenaId the primary key of the sailkapena
	* @return the sailkapena that was removed
	* @throws PortalException if a sailkapena with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sailkapena deleteSailkapena(
		long sailkapenaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaLocalService.deleteSailkapena(sailkapenaId);
	}

	/**
	* Deletes the sailkapena from the database. Also notifies the appropriate model listeners.
	*
	* @param sailkapena the sailkapena
	* @return the sailkapena that was removed
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sailkapena deleteSailkapena(
		net.sareweb.txotx.model.Sailkapena sailkapena)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaLocalService.deleteSailkapena(sailkapena);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sailkapenaLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaLocalService.dynamicQueryCount(dynamicQuery);
	}

	public net.sareweb.txotx.model.Sailkapena fetchSailkapena(long sailkapenaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaLocalService.fetchSailkapena(sailkapenaId);
	}

	/**
	* Returns the sailkapena with the primary key.
	*
	* @param sailkapenaId the primary key of the sailkapena
	* @return the sailkapena
	* @throws PortalException if a sailkapena with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sailkapena getSailkapena(long sailkapenaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaLocalService.getSailkapena(sailkapenaId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaLocalService.getPersistedModel(primaryKeyObj);
	}

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
	public java.util.List<net.sareweb.txotx.model.Sailkapena> getSailkapenas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaLocalService.getSailkapenas(start, end);
	}

	/**
	* Returns the number of sailkapenas.
	*
	* @return the number of sailkapenas
	* @throws SystemException if a system exception occurred
	*/
	public int getSailkapenasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaLocalService.getSailkapenasCount();
	}

	/**
	* Updates the sailkapena in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sailkapena the sailkapena
	* @return the sailkapena that was updated
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sailkapena updateSailkapena(
		net.sareweb.txotx.model.Sailkapena sailkapena)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaLocalService.updateSailkapena(sailkapena);
	}

	/**
	* Updates the sailkapena in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sailkapena the sailkapena
	* @param merge whether to merge the sailkapena with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the sailkapena that was updated
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sailkapena updateSailkapena(
		net.sareweb.txotx.model.Sailkapena sailkapena, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sailkapenaLocalService.updateSailkapena(sailkapena, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sailkapenaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sailkapenaLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sailkapenaLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public void incGertaera(long userId, java.lang.String geraeraMota) {
		_sailkapenaLocalService.incGertaera(userId, geraeraMota);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SailkapenaLocalService getWrappedSailkapenaLocalService() {
		return _sailkapenaLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSailkapenaLocalService(
		SailkapenaLocalService sailkapenaLocalService) {
		_sailkapenaLocalService = sailkapenaLocalService;
	}

	public SailkapenaLocalService getWrappedService() {
		return _sailkapenaLocalService;
	}

	public void setWrappedService(SailkapenaLocalService sailkapenaLocalService) {
		_sailkapenaLocalService = sailkapenaLocalService;
	}

	private SailkapenaLocalService _sailkapenaLocalService;
}