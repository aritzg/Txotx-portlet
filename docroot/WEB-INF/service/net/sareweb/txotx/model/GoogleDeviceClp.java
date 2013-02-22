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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import net.sareweb.txotx.service.GoogleDeviceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author A.Galdos
 */
public class GoogleDeviceClp extends BaseModelImpl<GoogleDevice>
	implements GoogleDevice {
	public GoogleDeviceClp() {
	}

	public Class<?> getModelClass() {
		return GoogleDevice.class;
	}

	public String getModelClassName() {
		return GoogleDevice.class.getName();
	}

	public long getPrimaryKey() {
		return _googleDeviceId;
	}

	public void setPrimaryKey(long primaryKey) {
		setGoogleDeviceId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_googleDeviceId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
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

	@Override
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

	public long getGoogleDeviceId() {
		return _googleDeviceId;
	}

	public void setGoogleDeviceId(long googleDeviceId) {
		_googleDeviceId = googleDeviceId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getEmailAddress() {
		return _emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;
	}

	public String getRegistrationId() {
		return _registrationId;
	}

	public void setRegistrationId(String registrationId) {
		_registrationId = registrationId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public BaseModel<?> getGoogleDeviceRemoteModel() {
		return _googleDeviceRemoteModel;
	}

	public void setGoogleDeviceRemoteModel(BaseModel<?> googleDeviceRemoteModel) {
		_googleDeviceRemoteModel = googleDeviceRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			GoogleDeviceLocalServiceUtil.addGoogleDevice(this);
		}
		else {
			GoogleDeviceLocalServiceUtil.updateGoogleDevice(this);
		}
	}

	@Override
	public GoogleDevice toEscapedModel() {
		return (GoogleDevice)Proxy.newProxyInstance(GoogleDevice.class.getClassLoader(),
			new Class[] { GoogleDevice.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		GoogleDeviceClp clone = new GoogleDeviceClp();

		clone.setGoogleDeviceId(getGoogleDeviceId());
		clone.setUserId(getUserId());
		clone.setEmailAddress(getEmailAddress());
		clone.setRegistrationId(getRegistrationId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	public int compareTo(GoogleDevice googleDevice) {
		long primaryKey = googleDevice.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		GoogleDeviceClp googleDevice = null;

		try {
			googleDevice = (GoogleDeviceClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = googleDevice.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{googleDeviceId=");
		sb.append(getGoogleDeviceId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", emailAddress=");
		sb.append(getEmailAddress());
		sb.append(", registrationId=");
		sb.append(getRegistrationId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("net.sareweb.txotx.model.GoogleDevice");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>googleDeviceId</column-name><column-value><![CDATA[");
		sb.append(getGoogleDeviceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailAddress</column-name><column-value><![CDATA[");
		sb.append(getEmailAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registrationId</column-name><column-value><![CDATA[");
		sb.append(getRegistrationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _googleDeviceId;
	private long _userId;
	private String _userUuid;
	private String _emailAddress;
	private String _registrationId;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _googleDeviceRemoteModel;
}