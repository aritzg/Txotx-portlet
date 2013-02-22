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

package net.sareweb.txotx.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link GoogleDevice}.
 * </p>
 *
 * @author    A.Galdos
 * @see       GoogleDevice
 * @generated
 */
public class GoogleDeviceWrapper implements GoogleDevice,
	ModelWrapper<GoogleDevice> {
	public GoogleDeviceWrapper(GoogleDevice googleDevice) {
		_googleDevice = googleDevice;
	}

	public Class<?> getModelClass() {
		return GoogleDevice.class;
	}

	public String getModelClassName() {
		return GoogleDevice.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("googleDeviceId", getGoogleDeviceId());
		attributes.put("userId", getUserId());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("registrationId", getRegistrationId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long googleDeviceId = (Long)attributes.get("googleDeviceId");

		if (googleDeviceId != null) {
			setGoogleDeviceId(googleDeviceId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String registrationId = (String)attributes.get("registrationId");

		if (registrationId != null) {
			setRegistrationId(registrationId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this google device.
	*
	* @return the primary key of this google device
	*/
	public long getPrimaryKey() {
		return _googleDevice.getPrimaryKey();
	}

	/**
	* Sets the primary key of this google device.
	*
	* @param primaryKey the primary key of this google device
	*/
	public void setPrimaryKey(long primaryKey) {
		_googleDevice.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the google device ID of this google device.
	*
	* @return the google device ID of this google device
	*/
	public long getGoogleDeviceId() {
		return _googleDevice.getGoogleDeviceId();
	}

	/**
	* Sets the google device ID of this google device.
	*
	* @param googleDeviceId the google device ID of this google device
	*/
	public void setGoogleDeviceId(long googleDeviceId) {
		_googleDevice.setGoogleDeviceId(googleDeviceId);
	}

	/**
	* Returns the user ID of this google device.
	*
	* @return the user ID of this google device
	*/
	public long getUserId() {
		return _googleDevice.getUserId();
	}

	/**
	* Sets the user ID of this google device.
	*
	* @param userId the user ID of this google device
	*/
	public void setUserId(long userId) {
		_googleDevice.setUserId(userId);
	}

	/**
	* Returns the user uuid of this google device.
	*
	* @return the user uuid of this google device
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _googleDevice.getUserUuid();
	}

	/**
	* Sets the user uuid of this google device.
	*
	* @param userUuid the user uuid of this google device
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_googleDevice.setUserUuid(userUuid);
	}

	/**
	* Returns the email address of this google device.
	*
	* @return the email address of this google device
	*/
	public java.lang.String getEmailAddress() {
		return _googleDevice.getEmailAddress();
	}

	/**
	* Sets the email address of this google device.
	*
	* @param emailAddress the email address of this google device
	*/
	public void setEmailAddress(java.lang.String emailAddress) {
		_googleDevice.setEmailAddress(emailAddress);
	}

	/**
	* Returns the registration ID of this google device.
	*
	* @return the registration ID of this google device
	*/
	public java.lang.String getRegistrationId() {
		return _googleDevice.getRegistrationId();
	}

	/**
	* Sets the registration ID of this google device.
	*
	* @param registrationId the registration ID of this google device
	*/
	public void setRegistrationId(java.lang.String registrationId) {
		_googleDevice.setRegistrationId(registrationId);
	}

	/**
	* Returns the create date of this google device.
	*
	* @return the create date of this google device
	*/
	public java.util.Date getCreateDate() {
		return _googleDevice.getCreateDate();
	}

	/**
	* Sets the create date of this google device.
	*
	* @param createDate the create date of this google device
	*/
	public void setCreateDate(java.util.Date createDate) {
		_googleDevice.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this google device.
	*
	* @return the modified date of this google device
	*/
	public java.util.Date getModifiedDate() {
		return _googleDevice.getModifiedDate();
	}

	/**
	* Sets the modified date of this google device.
	*
	* @param modifiedDate the modified date of this google device
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_googleDevice.setModifiedDate(modifiedDate);
	}

	public boolean isNew() {
		return _googleDevice.isNew();
	}

	public void setNew(boolean n) {
		_googleDevice.setNew(n);
	}

	public boolean isCachedModel() {
		return _googleDevice.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_googleDevice.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _googleDevice.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _googleDevice.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_googleDevice.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _googleDevice.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_googleDevice.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new GoogleDeviceWrapper((GoogleDevice)_googleDevice.clone());
	}

	public int compareTo(net.sareweb.txotx.model.GoogleDevice googleDevice) {
		return _googleDevice.compareTo(googleDevice);
	}

	@Override
	public int hashCode() {
		return _googleDevice.hashCode();
	}

	public com.liferay.portal.model.CacheModel<net.sareweb.txotx.model.GoogleDevice> toCacheModel() {
		return _googleDevice.toCacheModel();
	}

	public net.sareweb.txotx.model.GoogleDevice toEscapedModel() {
		return new GoogleDeviceWrapper(_googleDevice.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _googleDevice.toString();
	}

	public java.lang.String toXmlString() {
		return _googleDevice.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_googleDevice.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public GoogleDevice getWrappedGoogleDevice() {
		return _googleDevice;
	}

	public GoogleDevice getWrappedModel() {
		return _googleDevice;
	}

	public void resetOriginalValues() {
		_googleDevice.resetOriginalValues();
	}

	private GoogleDevice _googleDevice;
}