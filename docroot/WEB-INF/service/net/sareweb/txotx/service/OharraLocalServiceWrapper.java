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
 * This class is a wrapper for {@link OharraLocalService}.
 * </p>
 *
 * @author    A.Galdos
 * @see       OharraLocalService
 * @generated
 */
public class OharraLocalServiceWrapper implements OharraLocalService,
	ServiceWrapper<OharraLocalService> {
	public OharraLocalServiceWrapper(OharraLocalService oharraLocalService) {
		_oharraLocalService = oharraLocalService;
	}

	/**
	* Adds the oharra to the database. Also notifies the appropriate model listeners.
	*
	* @param oharra the oharra
	* @return the oharra that was added
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Oharra addOharra(
		net.sareweb.txotx.model.Oharra oharra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oharraLocalService.addOharra(oharra);
	}

	/**
	* Creates a new oharra with the primary key. Does not add the oharra to the database.
	*
	* @param oharraId the primary key for the new oharra
	* @return the new oharra
	*/
	public net.sareweb.txotx.model.Oharra createOharra(long oharraId) {
		return _oharraLocalService.createOharra(oharraId);
	}

	/**
	* Deletes the oharra with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oharraId the primary key of the oharra
	* @return the oharra that was removed
	* @throws PortalException if a oharra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Oharra deleteOharra(long oharraId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oharraLocalService.deleteOharra(oharraId);
	}

	/**
	* Deletes the oharra from the database. Also notifies the appropriate model listeners.
	*
	* @param oharra the oharra
	* @return the oharra that was removed
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Oharra deleteOharra(
		net.sareweb.txotx.model.Oharra oharra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oharraLocalService.deleteOharra(oharra);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _oharraLocalService.dynamicQuery();
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
		return _oharraLocalService.dynamicQuery(dynamicQuery);
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
		return _oharraLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _oharraLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _oharraLocalService.dynamicQueryCount(dynamicQuery);
	}

	public net.sareweb.txotx.model.Oharra fetchOharra(long oharraId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oharraLocalService.fetchOharra(oharraId);
	}

	/**
	* Returns the oharra with the primary key.
	*
	* @param oharraId the primary key of the oharra
	* @return the oharra
	* @throws PortalException if a oharra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Oharra getOharra(long oharraId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oharraLocalService.getOharra(oharraId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oharraLocalService.getPersistedModel(primaryKeyObj);
	}

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
	public java.util.List<net.sareweb.txotx.model.Oharra> getOharras(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oharraLocalService.getOharras(start, end);
	}

	/**
	* Returns the number of oharras.
	*
	* @return the number of oharras
	* @throws SystemException if a system exception occurred
	*/
	public int getOharrasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oharraLocalService.getOharrasCount();
	}

	/**
	* Updates the oharra in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oharra the oharra
	* @return the oharra that was updated
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Oharra updateOharra(
		net.sareweb.txotx.model.Oharra oharra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oharraLocalService.updateOharra(oharra);
	}

	/**
	* Updates the oharra in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oharra the oharra
	* @param merge whether to merge the oharra with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the oharra that was updated
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Oharra updateOharra(
		net.sareweb.txotx.model.Oharra oharra, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oharraLocalService.updateOharra(oharra, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _oharraLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_oharraLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _oharraLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public OharraLocalService getWrappedOharraLocalService() {
		return _oharraLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedOharraLocalService(
		OharraLocalService oharraLocalService) {
		_oharraLocalService = oharraLocalService;
	}

	public OharraLocalService getWrappedService() {
		return _oharraLocalService;
	}

	public void setWrappedService(OharraLocalService oharraLocalService) {
		_oharraLocalService = oharraLocalService;
	}

	private OharraLocalService _oharraLocalService;
}