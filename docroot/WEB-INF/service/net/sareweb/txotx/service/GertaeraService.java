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
 * The interface for the gertaera remote service.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author A.Galdos
 * @see GertaeraServiceUtil
 * @see net.sareweb.txotx.service.base.GertaeraServiceBaseImpl
 * @see net.sareweb.txotx.service.impl.GertaeraServiceImpl
 * @generated
 */
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface GertaeraService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GertaeraServiceUtil} to access the gertaera remote service. Add custom service methods to {@link net.sareweb.txotx.service.impl.GertaeraServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	public net.sareweb.txotx.model.Gertaera gehituTestuGertaera(
		long sagardotegiId, java.lang.String testua)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException;

	public net.sareweb.txotx.model.Gertaera gehituTestuGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException;

	public net.sareweb.txotx.model.Gertaera gehituTestuGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException;

	public net.sareweb.txotx.model.Gertaera gehituArgazkiGertaera(
		long sagardotegiId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException;

	public net.sareweb.txotx.model.Gertaera gehituArgazkiGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException;

	public net.sareweb.txotx.model.Gertaera gehituArgazkiGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException;

	public net.sareweb.txotx.model.Gertaera gehituBalorazioGertaera(
		long sagardotegiId, java.lang.String testua, long balorazioa)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException;

	public net.sareweb.txotx.model.Gertaera gehituBalorazioGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua, long balorazioa)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException;

	public net.sareweb.txotx.model.Gertaera gehituBalorazioGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua, long balorazioa)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakOlderThanDate(
		long sagardotegiId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakSagardotegianOlderThanDate(
		long sagardotegiId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakSagardoEguneanOlderThanDate(
		long sagardoEgunId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakNewerThanDate(
		long sagardotegiId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakSagardotegianNewerThanDate(
		long sagardotegiId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakSagardoEguneanNewerThanDate(
		long sagardoEgunId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void fake()
		throws com.liferay.portal.security.auth.PrincipalException;
}