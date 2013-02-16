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

package net.sareweb.txotx.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import net.sareweb.txotx.model.Gertaera;
import net.sareweb.txotx.service.GertaeraLocalService;
import net.sareweb.txotx.service.GertaeraService;
import net.sareweb.txotx.service.SagardotegiLocalService;
import net.sareweb.txotx.service.SagardotegiService;
import net.sareweb.txotx.service.SailkapenaLocalService;
import net.sareweb.txotx.service.SailkapenaService;
import net.sareweb.txotx.service.persistence.GertaeraPersistence;
import net.sareweb.txotx.service.persistence.SagardotegiPersistence;
import net.sareweb.txotx.service.persistence.SailkapenaPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the gertaera remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link net.sareweb.txotx.service.impl.GertaeraServiceImpl}.
 * </p>
 *
 * @author A.Galdos
 * @see net.sareweb.txotx.service.impl.GertaeraServiceImpl
 * @see net.sareweb.txotx.service.GertaeraServiceUtil
 * @generated
 */
public abstract class GertaeraServiceBaseImpl extends BaseServiceImpl
	implements GertaeraService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link net.sareweb.txotx.service.GertaeraServiceUtil} to access the gertaera remote service.
	 */

	/**
	 * Returns the gertaera local service.
	 *
	 * @return the gertaera local service
	 */
	public GertaeraLocalService getGertaeraLocalService() {
		return gertaeraLocalService;
	}

	/**
	 * Sets the gertaera local service.
	 *
	 * @param gertaeraLocalService the gertaera local service
	 */
	public void setGertaeraLocalService(
		GertaeraLocalService gertaeraLocalService) {
		this.gertaeraLocalService = gertaeraLocalService;
	}

	/**
	 * Returns the gertaera remote service.
	 *
	 * @return the gertaera remote service
	 */
	public GertaeraService getGertaeraService() {
		return gertaeraService;
	}

	/**
	 * Sets the gertaera remote service.
	 *
	 * @param gertaeraService the gertaera remote service
	 */
	public void setGertaeraService(GertaeraService gertaeraService) {
		this.gertaeraService = gertaeraService;
	}

	/**
	 * Returns the gertaera persistence.
	 *
	 * @return the gertaera persistence
	 */
	public GertaeraPersistence getGertaeraPersistence() {
		return gertaeraPersistence;
	}

	/**
	 * Sets the gertaera persistence.
	 *
	 * @param gertaeraPersistence the gertaera persistence
	 */
	public void setGertaeraPersistence(GertaeraPersistence gertaeraPersistence) {
		this.gertaeraPersistence = gertaeraPersistence;
	}

	/**
	 * Returns the sagardotegi local service.
	 *
	 * @return the sagardotegi local service
	 */
	public SagardotegiLocalService getSagardotegiLocalService() {
		return sagardotegiLocalService;
	}

	/**
	 * Sets the sagardotegi local service.
	 *
	 * @param sagardotegiLocalService the sagardotegi local service
	 */
	public void setSagardotegiLocalService(
		SagardotegiLocalService sagardotegiLocalService) {
		this.sagardotegiLocalService = sagardotegiLocalService;
	}

	/**
	 * Returns the sagardotegi remote service.
	 *
	 * @return the sagardotegi remote service
	 */
	public SagardotegiService getSagardotegiService() {
		return sagardotegiService;
	}

	/**
	 * Sets the sagardotegi remote service.
	 *
	 * @param sagardotegiService the sagardotegi remote service
	 */
	public void setSagardotegiService(SagardotegiService sagardotegiService) {
		this.sagardotegiService = sagardotegiService;
	}

	/**
	 * Returns the sagardotegi persistence.
	 *
	 * @return the sagardotegi persistence
	 */
	public SagardotegiPersistence getSagardotegiPersistence() {
		return sagardotegiPersistence;
	}

	/**
	 * Sets the sagardotegi persistence.
	 *
	 * @param sagardotegiPersistence the sagardotegi persistence
	 */
	public void setSagardotegiPersistence(
		SagardotegiPersistence sagardotegiPersistence) {
		this.sagardotegiPersistence = sagardotegiPersistence;
	}

	/**
	 * Returns the sailkapena local service.
	 *
	 * @return the sailkapena local service
	 */
	public SailkapenaLocalService getSailkapenaLocalService() {
		return sailkapenaLocalService;
	}

	/**
	 * Sets the sailkapena local service.
	 *
	 * @param sailkapenaLocalService the sailkapena local service
	 */
	public void setSailkapenaLocalService(
		SailkapenaLocalService sailkapenaLocalService) {
		this.sailkapenaLocalService = sailkapenaLocalService;
	}

	/**
	 * Returns the sailkapena remote service.
	 *
	 * @return the sailkapena remote service
	 */
	public SailkapenaService getSailkapenaService() {
		return sailkapenaService;
	}

	/**
	 * Sets the sailkapena remote service.
	 *
	 * @param sailkapenaService the sailkapena remote service
	 */
	public void setSailkapenaService(SailkapenaService sailkapenaService) {
		this.sailkapenaService = sailkapenaService;
	}

	/**
	 * Returns the sailkapena persistence.
	 *
	 * @return the sailkapena persistence
	 */
	public SailkapenaPersistence getSailkapenaPersistence() {
		return sailkapenaPersistence;
	}

	/**
	 * Sets the sailkapena persistence.
	 *
	 * @param sailkapenaPersistence the sailkapena persistence
	 */
	public void setSailkapenaPersistence(
		SailkapenaPersistence sailkapenaPersistence) {
		this.sailkapenaPersistence = sailkapenaPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return Gertaera.class;
	}

	protected String getModelClassName() {
		return Gertaera.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = gertaeraPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = GertaeraLocalService.class)
	protected GertaeraLocalService gertaeraLocalService;
	@BeanReference(type = GertaeraService.class)
	protected GertaeraService gertaeraService;
	@BeanReference(type = GertaeraPersistence.class)
	protected GertaeraPersistence gertaeraPersistence;
	@BeanReference(type = SagardotegiLocalService.class)
	protected SagardotegiLocalService sagardotegiLocalService;
	@BeanReference(type = SagardotegiService.class)
	protected SagardotegiService sagardotegiService;
	@BeanReference(type = SagardotegiPersistence.class)
	protected SagardotegiPersistence sagardotegiPersistence;
	@BeanReference(type = SailkapenaLocalService.class)
	protected SailkapenaLocalService sailkapenaLocalService;
	@BeanReference(type = SailkapenaService.class)
	protected SailkapenaService sailkapenaService;
	@BeanReference(type = SailkapenaPersistence.class)
	protected SailkapenaPersistence sailkapenaPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private GertaeraServiceClpInvoker _clpInvoker = new GertaeraServiceClpInvoker();
}