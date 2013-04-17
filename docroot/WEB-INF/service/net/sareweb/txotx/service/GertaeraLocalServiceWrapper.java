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
 * This class is a wrapper for {@link GertaeraLocalService}.
 * </p>
 *
 * @author    A.Galdos
 * @see       GertaeraLocalService
 * @generated
 */
public class GertaeraLocalServiceWrapper implements GertaeraLocalService,
	ServiceWrapper<GertaeraLocalService> {
	public GertaeraLocalServiceWrapper(
		GertaeraLocalService gertaeraLocalService) {
		_gertaeraLocalService = gertaeraLocalService;
	}

	/**
	* Adds the gertaera to the database. Also notifies the appropriate model listeners.
	*
	* @param gertaera the gertaera
	* @return the gertaera that was added
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Gertaera addGertaera(
		net.sareweb.txotx.model.Gertaera gertaera)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraLocalService.addGertaera(gertaera);
	}

	/**
	* Creates a new gertaera with the primary key. Does not add the gertaera to the database.
	*
	* @param gertaeraId the primary key for the new gertaera
	* @return the new gertaera
	*/
	public net.sareweb.txotx.model.Gertaera createGertaera(long gertaeraId) {
		return _gertaeraLocalService.createGertaera(gertaeraId);
	}

	/**
	* Deletes the gertaera with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param gertaeraId the primary key of the gertaera
	* @return the gertaera that was removed
	* @throws PortalException if a gertaera with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Gertaera deleteGertaera(long gertaeraId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraLocalService.deleteGertaera(gertaeraId);
	}

	/**
	* Deletes the gertaera from the database. Also notifies the appropriate model listeners.
	*
	* @param gertaera the gertaera
	* @return the gertaera that was removed
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Gertaera deleteGertaera(
		net.sareweb.txotx.model.Gertaera gertaera)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraLocalService.deleteGertaera(gertaera);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _gertaeraLocalService.dynamicQuery();
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
		return _gertaeraLocalService.dynamicQuery(dynamicQuery);
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
		return _gertaeraLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _gertaeraLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _gertaeraLocalService.dynamicQueryCount(dynamicQuery);
	}

	public net.sareweb.txotx.model.Gertaera fetchGertaera(long gertaeraId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraLocalService.fetchGertaera(gertaeraId);
	}

	/**
	* Returns the gertaera with the primary key.
	*
	* @param gertaeraId the primary key of the gertaera
	* @return the gertaera
	* @throws PortalException if a gertaera with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Gertaera getGertaera(long gertaeraId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraLocalService.getGertaera(gertaeraId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraLocalService.getPersistedModel(primaryKeyObj);
	}

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
	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaeras(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraLocalService.getGertaeras(start, end);
	}

	/**
	* Returns the number of gertaeras.
	*
	* @return the number of gertaeras
	* @throws SystemException if a system exception occurred
	*/
	public int getGertaerasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraLocalService.getGertaerasCount();
	}

	/**
	* Updates the gertaera in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param gertaera the gertaera
	* @return the gertaera that was updated
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Gertaera updateGertaera(
		net.sareweb.txotx.model.Gertaera gertaera)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraLocalService.updateGertaera(gertaera);
	}

	/**
	* Updates the gertaera in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param gertaera the gertaera
	* @param merge whether to merge the gertaera with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the gertaera that was updated
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.txotx.model.Gertaera updateGertaera(
		net.sareweb.txotx.model.Gertaera gertaera, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraLocalService.updateGertaera(gertaera, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _gertaeraLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_gertaeraLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _gertaeraLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public double getSagardotegiarenBalorazioBB(long sagardotegiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraLocalService.getSagardotegiarenBalorazioBB(sagardotegiId);
	}

	public double getSagardoEgunarenBalorazioBB(long sagardoEgunId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaeraLocalService.getSagardoEgunarenBalorazioBB(sagardoEgunId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public GertaeraLocalService getWrappedGertaeraLocalService() {
		return _gertaeraLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedGertaeraLocalService(
		GertaeraLocalService gertaeraLocalService) {
		_gertaeraLocalService = gertaeraLocalService;
	}

	public GertaeraLocalService getWrappedService() {
		return _gertaeraLocalService;
	}

	public void setWrappedService(GertaeraLocalService gertaeraLocalService) {
		_gertaeraLocalService = gertaeraLocalService;
	}

	private GertaeraLocalService _gertaeraLocalService;
}