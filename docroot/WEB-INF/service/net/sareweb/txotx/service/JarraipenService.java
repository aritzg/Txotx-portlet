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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * The interface for the jarraipen remote service.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author A.Galdos
 * @see JarraipenServiceUtil
 * @see net.sareweb.txotx.service.base.JarraipenServiceBaseImpl
 * @see net.sareweb.txotx.service.impl.JarraipenServiceImpl
 * @generated
 */
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface JarraipenService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JarraipenServiceUtil} to access the jarraipen remote service. Add custom service methods to {@link net.sareweb.txotx.service.impl.JarraipenServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public net.sareweb.txotx.model.Jarraipen gehituJarraipenaByEmail(
		java.lang.String emailAddress, long jarraituaId,
		java.lang.String jarraipenMota)
		throws com.liferay.portal.kernel.exception.SystemException;

	public net.sareweb.txotx.model.Jarraipen gehituJarraipena(
		long jarraitzaileUserId, long jarraituaId,
		java.lang.String jarraipenMota)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<net.sareweb.txotx.model.Jarraipen> getJarraipenakByEmail(
		java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<net.sareweb.txotx.model.Jarraipen> getJarraipenak(
		long jarraitzaileUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<net.sareweb.txotx.model.Jarraipen> getErabiltzailearenJarraitzaileak(
		long jarraituaUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<net.sareweb.txotx.model.Jarraipen> getSagardotegiarenJarraitzaileak(
		long sagardotegiId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<net.sareweb.txotx.model.Jarraipen> getSagardoEgunarenJarraitzaileak(
		long sagardoEgunId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public boolean deleteJarraipena(java.lang.String emailAddress,
		long jarraituaId)
		throws com.liferay.portal.kernel.exception.SystemException;
}