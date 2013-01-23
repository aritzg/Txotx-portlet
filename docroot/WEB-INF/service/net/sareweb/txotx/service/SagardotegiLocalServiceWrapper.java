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
 * This class is a wrapper for {@link SagardotegiLocalService}.
 * </p>
 *
 * @author    A.Galdos
 * @see       SagardotegiLocalService
 * @generated
 */
public class SagardotegiLocalServiceWrapper implements SagardotegiLocalService,
	ServiceWrapper<SagardotegiLocalService> {
	public SagardotegiLocalServiceWrapper(
		SagardotegiLocalService sagardotegiLocalService) {
		_sagardotegiLocalService = sagardotegiLocalService;
	}

	/**
	* Adds the sagardotegi to the database. Also notifies the appropriate model listeners.
	*
	* @param sagardotegi the sagardotegi
	* @return the sagardotegi that was added
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sagardotegi addSagardotegi(
		net.sareweb.txotx.model.Sagardotegi sagardotegi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sagardotegiLocalService.addSagardotegi(sagardotegi);
	}

	/**
	* Creates a new sagardotegi with the primary key. Does not add the sagardotegi to the database.
	*
	* @param sagardotegiId the primary key for the new sagardotegi
	* @return the new sagardotegi
	*/
	public net.sareweb.txotx.model.Sagardotegi createSagardotegi(
		long sagardotegiId) {
		return _sagardotegiLocalService.createSagardotegi(sagardotegiId);
	}

	/**
	* Deletes the sagardotegi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sagardotegiId the primary key of the sagardotegi
	* @return the sagardotegi that was removed
	* @throws PortalException if a sagardotegi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sagardotegi deleteSagardotegi(
		long sagardotegiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sagardotegiLocalService.deleteSagardotegi(sagardotegiId);
	}

	/**
	* Deletes the sagardotegi from the database. Also notifies the appropriate model listeners.
	*
	* @param sagardotegi the sagardotegi
	* @return the sagardotegi that was removed
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sagardotegi deleteSagardotegi(
		net.sareweb.txotx.model.Sagardotegi sagardotegi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sagardotegiLocalService.deleteSagardotegi(sagardotegi);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sagardotegiLocalService.dynamicQuery();
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
		return _sagardotegiLocalService.dynamicQuery(dynamicQuery);
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
		return _sagardotegiLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _sagardotegiLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _sagardotegiLocalService.dynamicQueryCount(dynamicQuery);
	}

	public net.sareweb.txotx.model.Sagardotegi fetchSagardotegi(
		long sagardotegiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sagardotegiLocalService.fetchSagardotegi(sagardotegiId);
	}

	/**
	* Returns the sagardotegi with the primary key.
	*
	* @param sagardotegiId the primary key of the sagardotegi
	* @return the sagardotegi
	* @throws PortalException if a sagardotegi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sagardotegi getSagardotegi(
		long sagardotegiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sagardotegiLocalService.getSagardotegi(sagardotegiId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sagardotegiLocalService.getPersistedModel(primaryKeyObj);
	}

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
	public java.util.List<net.sareweb.txotx.model.Sagardotegi> getSagardotegis(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sagardotegiLocalService.getSagardotegis(start, end);
	}

	/**
	* Returns the number of sagardotegis.
	*
	* @return the number of sagardotegis
	* @throws SystemException if a system exception occurred
	*/
	public int getSagardotegisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sagardotegiLocalService.getSagardotegisCount();
	}

	/**
	* Updates the sagardotegi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sagardotegi the sagardotegi
	* @return the sagardotegi that was updated
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sagardotegi updateSagardotegi(
		net.sareweb.txotx.model.Sagardotegi sagardotegi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sagardotegiLocalService.updateSagardotegi(sagardotegi);
	}

	/**
	* Updates the sagardotegi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sagardotegi the sagardotegi
	* @param merge whether to merge the sagardotegi with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the sagardotegi that was updated
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Sagardotegi updateSagardotegi(
		net.sareweb.txotx.model.Sagardotegi sagardotegi, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sagardotegiLocalService.updateSagardotegi(sagardotegi, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sagardotegiLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sagardotegiLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sagardotegiLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SagardotegiLocalService getWrappedSagardotegiLocalService() {
		return _sagardotegiLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSagardotegiLocalService(
		SagardotegiLocalService sagardotegiLocalService) {
		_sagardotegiLocalService = sagardotegiLocalService;
	}

	public SagardotegiLocalService getWrappedService() {
		return _sagardotegiLocalService;
	}

	public void setWrappedService(
		SagardotegiLocalService sagardotegiLocalService) {
		_sagardotegiLocalService = sagardotegiLocalService;
	}

	private SagardotegiLocalService _sagardotegiLocalService;
}