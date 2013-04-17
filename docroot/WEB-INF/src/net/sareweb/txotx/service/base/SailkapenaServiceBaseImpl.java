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

import net.sareweb.txotx.model.Sailkapena;
import net.sareweb.txotx.service.GertaeraLocalService;
import net.sareweb.txotx.service.GertaeraService;
import net.sareweb.txotx.service.GoogleDeviceLocalService;
import net.sareweb.txotx.service.GoogleDeviceService;
import net.sareweb.txotx.service.JarraipenLocalService;
import net.sareweb.txotx.service.JarraipenService;
import net.sareweb.txotx.service.OharraLocalService;
import net.sareweb.txotx.service.OharraService;
import net.sareweb.txotx.service.SagardoEgunLocalService;
import net.sareweb.txotx.service.SagardoEgunService;
import net.sareweb.txotx.service.SagardotegiLocalService;
import net.sareweb.txotx.service.SagardotegiService;
import net.sareweb.txotx.service.SailkapenaLocalService;
import net.sareweb.txotx.service.SailkapenaService;
import net.sareweb.txotx.service.persistence.GertaeraPersistence;
import net.sareweb.txotx.service.persistence.GoogleDevicePersistence;
import net.sareweb.txotx.service.persistence.JarraipenPersistence;
import net.sareweb.txotx.service.persistence.OharraPersistence;
import net.sareweb.txotx.service.persistence.SagardoEgunPersistence;
import net.sareweb.txotx.service.persistence.SagardotegiPersistence;
import net.sareweb.txotx.service.persistence.SailkapenaPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the sailkapena remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link net.sareweb.txotx.service.impl.SailkapenaServiceImpl}.
 * </p>
 *
 * @author A.Galdos
 * @see net.sareweb.txotx.service.impl.SailkapenaServiceImpl
 * @see net.sareweb.txotx.service.SailkapenaServiceUtil
 * @generated
 */
public abstract class SailkapenaServiceBaseImpl extends BaseServiceImpl
	implements SailkapenaService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link net.sareweb.txotx.service.SailkapenaServiceUtil} to access the sailkapena remote service.
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
	 * Returns the google device local service.
	 *
	 * @return the google device local service
	 */
	public GoogleDeviceLocalService getGoogleDeviceLocalService() {
		return googleDeviceLocalService;
	}

	/**
	 * Sets the google device local service.
	 *
	 * @param googleDeviceLocalService the google device local service
	 */
	public void setGoogleDeviceLocalService(
		GoogleDeviceLocalService googleDeviceLocalService) {
		this.googleDeviceLocalService = googleDeviceLocalService;
	}

	/**
	 * Returns the google device remote service.
	 *
	 * @return the google device remote service
	 */
	public GoogleDeviceService getGoogleDeviceService() {
		return googleDeviceService;
	}

	/**
	 * Sets the google device remote service.
	 *
	 * @param googleDeviceService the google device remote service
	 */
	public void setGoogleDeviceService(GoogleDeviceService googleDeviceService) {
		this.googleDeviceService = googleDeviceService;
	}

	/**
	 * Returns the google device persistence.
	 *
	 * @return the google device persistence
	 */
	public GoogleDevicePersistence getGoogleDevicePersistence() {
		return googleDevicePersistence;
	}

	/**
	 * Sets the google device persistence.
	 *
	 * @param googleDevicePersistence the google device persistence
	 */
	public void setGoogleDevicePersistence(
		GoogleDevicePersistence googleDevicePersistence) {
		this.googleDevicePersistence = googleDevicePersistence;
	}

	/**
	 * Returns the jarraipen local service.
	 *
	 * @return the jarraipen local service
	 */
	public JarraipenLocalService getJarraipenLocalService() {
		return jarraipenLocalService;
	}

	/**
	 * Sets the jarraipen local service.
	 *
	 * @param jarraipenLocalService the jarraipen local service
	 */
	public void setJarraipenLocalService(
		JarraipenLocalService jarraipenLocalService) {
		this.jarraipenLocalService = jarraipenLocalService;
	}

	/**
	 * Returns the jarraipen remote service.
	 *
	 * @return the jarraipen remote service
	 */
	public JarraipenService getJarraipenService() {
		return jarraipenService;
	}

	/**
	 * Sets the jarraipen remote service.
	 *
	 * @param jarraipenService the jarraipen remote service
	 */
	public void setJarraipenService(JarraipenService jarraipenService) {
		this.jarraipenService = jarraipenService;
	}

	/**
	 * Returns the jarraipen persistence.
	 *
	 * @return the jarraipen persistence
	 */
	public JarraipenPersistence getJarraipenPersistence() {
		return jarraipenPersistence;
	}

	/**
	 * Sets the jarraipen persistence.
	 *
	 * @param jarraipenPersistence the jarraipen persistence
	 */
	public void setJarraipenPersistence(
		JarraipenPersistence jarraipenPersistence) {
		this.jarraipenPersistence = jarraipenPersistence;
	}

	/**
	 * Returns the oharra local service.
	 *
	 * @return the oharra local service
	 */
	public OharraLocalService getOharraLocalService() {
		return oharraLocalService;
	}

	/**
	 * Sets the oharra local service.
	 *
	 * @param oharraLocalService the oharra local service
	 */
	public void setOharraLocalService(OharraLocalService oharraLocalService) {
		this.oharraLocalService = oharraLocalService;
	}

	/**
	 * Returns the oharra remote service.
	 *
	 * @return the oharra remote service
	 */
	public OharraService getOharraService() {
		return oharraService;
	}

	/**
	 * Sets the oharra remote service.
	 *
	 * @param oharraService the oharra remote service
	 */
	public void setOharraService(OharraService oharraService) {
		this.oharraService = oharraService;
	}

	/**
	 * Returns the oharra persistence.
	 *
	 * @return the oharra persistence
	 */
	public OharraPersistence getOharraPersistence() {
		return oharraPersistence;
	}

	/**
	 * Sets the oharra persistence.
	 *
	 * @param oharraPersistence the oharra persistence
	 */
	public void setOharraPersistence(OharraPersistence oharraPersistence) {
		this.oharraPersistence = oharraPersistence;
	}

	/**
	 * Returns the sagardo egun local service.
	 *
	 * @return the sagardo egun local service
	 */
	public SagardoEgunLocalService getSagardoEgunLocalService() {
		return sagardoEgunLocalService;
	}

	/**
	 * Sets the sagardo egun local service.
	 *
	 * @param sagardoEgunLocalService the sagardo egun local service
	 */
	public void setSagardoEgunLocalService(
		SagardoEgunLocalService sagardoEgunLocalService) {
		this.sagardoEgunLocalService = sagardoEgunLocalService;
	}

	/**
	 * Returns the sagardo egun remote service.
	 *
	 * @return the sagardo egun remote service
	 */
	public SagardoEgunService getSagardoEgunService() {
		return sagardoEgunService;
	}

	/**
	 * Sets the sagardo egun remote service.
	 *
	 * @param sagardoEgunService the sagardo egun remote service
	 */
	public void setSagardoEgunService(SagardoEgunService sagardoEgunService) {
		this.sagardoEgunService = sagardoEgunService;
	}

	/**
	 * Returns the sagardo egun persistence.
	 *
	 * @return the sagardo egun persistence
	 */
	public SagardoEgunPersistence getSagardoEgunPersistence() {
		return sagardoEgunPersistence;
	}

	/**
	 * Sets the sagardo egun persistence.
	 *
	 * @param sagardoEgunPersistence the sagardo egun persistence
	 */
	public void setSagardoEgunPersistence(
		SagardoEgunPersistence sagardoEgunPersistence) {
		this.sagardoEgunPersistence = sagardoEgunPersistence;
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
		return Sailkapena.class;
	}

	protected String getModelClassName() {
		return Sailkapena.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = sailkapenaPersistence.getDataSource();

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
	@BeanReference(type = GoogleDeviceLocalService.class)
	protected GoogleDeviceLocalService googleDeviceLocalService;
	@BeanReference(type = GoogleDeviceService.class)
	protected GoogleDeviceService googleDeviceService;
	@BeanReference(type = GoogleDevicePersistence.class)
	protected GoogleDevicePersistence googleDevicePersistence;
	@BeanReference(type = JarraipenLocalService.class)
	protected JarraipenLocalService jarraipenLocalService;
	@BeanReference(type = JarraipenService.class)
	protected JarraipenService jarraipenService;
	@BeanReference(type = JarraipenPersistence.class)
	protected JarraipenPersistence jarraipenPersistence;
	@BeanReference(type = OharraLocalService.class)
	protected OharraLocalService oharraLocalService;
	@BeanReference(type = OharraService.class)
	protected OharraService oharraService;
	@BeanReference(type = OharraPersistence.class)
	protected OharraPersistence oharraPersistence;
	@BeanReference(type = SagardoEgunLocalService.class)
	protected SagardoEgunLocalService sagardoEgunLocalService;
	@BeanReference(type = SagardoEgunService.class)
	protected SagardoEgunService sagardoEgunService;
	@BeanReference(type = SagardoEgunPersistence.class)
	protected SagardoEgunPersistence sagardoEgunPersistence;
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
	private SailkapenaServiceClpInvoker _clpInvoker = new SailkapenaServiceClpInvoker();
}