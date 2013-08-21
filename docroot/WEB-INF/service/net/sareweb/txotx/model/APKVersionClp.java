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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import net.sareweb.txotx.service.APKVersionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author A.Galdos
 */
public class APKVersionClp extends BaseModelImpl<APKVersion>
	implements APKVersion {
	public APKVersionClp() {
	}

	public Class<?> getModelClass() {
		return APKVersion.class;
	}

	public String getModelClassName() {
		return APKVersion.class.getName();
	}

	public long getPrimaryKey() {
		return _apkVersionId;
	}

	public void setPrimaryKey(long primaryKey) {
		setApkVersionId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_apkVersionId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("apkVersionId", getApkVersionId());
		attributes.put("supportedMinVersion", getSupportedMinVersion());
		attributes.put("supportedMinVersionName", getSupportedMinVersionName());
		attributes.put("currentVersion", getCurrentVersion());
		attributes.put("currentVersionName", getCurrentVersionName());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long apkVersionId = (Long)attributes.get("apkVersionId");

		if (apkVersionId != null) {
			setApkVersionId(apkVersionId);
		}

		Integer supportedMinVersion = (Integer)attributes.get(
				"supportedMinVersion");

		if (supportedMinVersion != null) {
			setSupportedMinVersion(supportedMinVersion);
		}

		String supportedMinVersionName = (String)attributes.get(
				"supportedMinVersionName");

		if (supportedMinVersionName != null) {
			setSupportedMinVersionName(supportedMinVersionName);
		}

		Integer currentVersion = (Integer)attributes.get("currentVersion");

		if (currentVersion != null) {
			setCurrentVersion(currentVersion);
		}

		String currentVersionName = (String)attributes.get("currentVersionName");

		if (currentVersionName != null) {
			setCurrentVersionName(currentVersionName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	public long getApkVersionId() {
		return _apkVersionId;
	}

	public void setApkVersionId(long apkVersionId) {
		_apkVersionId = apkVersionId;
	}

	public int getSupportedMinVersion() {
		return _supportedMinVersion;
	}

	public void setSupportedMinVersion(int supportedMinVersion) {
		_supportedMinVersion = supportedMinVersion;
	}

	public String getSupportedMinVersionName() {
		return _supportedMinVersionName;
	}

	public void setSupportedMinVersionName(String supportedMinVersionName) {
		_supportedMinVersionName = supportedMinVersionName;
	}

	public int getCurrentVersion() {
		return _currentVersion;
	}

	public void setCurrentVersion(int currentVersion) {
		_currentVersion = currentVersion;
	}

	public String getCurrentVersionName() {
		return _currentVersionName;
	}

	public void setCurrentVersionName(String currentVersionName) {
		_currentVersionName = currentVersionName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public BaseModel<?> getAPKVersionRemoteModel() {
		return _apkVersionRemoteModel;
	}

	public void setAPKVersionRemoteModel(BaseModel<?> apkVersionRemoteModel) {
		_apkVersionRemoteModel = apkVersionRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			APKVersionLocalServiceUtil.addAPKVersion(this);
		}
		else {
			APKVersionLocalServiceUtil.updateAPKVersion(this);
		}
	}

	@Override
	public APKVersion toEscapedModel() {
		return (APKVersion)Proxy.newProxyInstance(APKVersion.class.getClassLoader(),
			new Class[] { APKVersion.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		APKVersionClp clone = new APKVersionClp();

		clone.setApkVersionId(getApkVersionId());
		clone.setSupportedMinVersion(getSupportedMinVersion());
		clone.setSupportedMinVersionName(getSupportedMinVersionName());
		clone.setCurrentVersion(getCurrentVersion());
		clone.setCurrentVersionName(getCurrentVersionName());
		clone.setCreateDate(getCreateDate());

		return clone;
	}

	public int compareTo(APKVersion apkVersion) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), apkVersion.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		APKVersionClp apkVersion = null;

		try {
			apkVersion = (APKVersionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = apkVersion.getPrimaryKey();

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

		sb.append("{apkVersionId=");
		sb.append(getApkVersionId());
		sb.append(", supportedMinVersion=");
		sb.append(getSupportedMinVersion());
		sb.append(", supportedMinVersionName=");
		sb.append(getSupportedMinVersionName());
		sb.append(", currentVersion=");
		sb.append(getCurrentVersion());
		sb.append(", currentVersionName=");
		sb.append(getCurrentVersionName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("net.sareweb.txotx.model.APKVersion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>apkVersionId</column-name><column-value><![CDATA[");
		sb.append(getApkVersionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>supportedMinVersion</column-name><column-value><![CDATA[");
		sb.append(getSupportedMinVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>supportedMinVersionName</column-name><column-value><![CDATA[");
		sb.append(getSupportedMinVersionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currentVersion</column-name><column-value><![CDATA[");
		sb.append(getCurrentVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currentVersionName</column-name><column-value><![CDATA[");
		sb.append(getCurrentVersionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _apkVersionId;
	private int _supportedMinVersion;
	private String _supportedMinVersionName;
	private int _currentVersion;
	private String _currentVersionName;
	private Date _createDate;
	private BaseModel<?> _apkVersionRemoteModel;
}