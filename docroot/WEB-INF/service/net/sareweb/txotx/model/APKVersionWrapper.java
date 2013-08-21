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
 * This class is a wrapper for {@link APKVersion}.
 * </p>
 *
 * @author    A.Galdos
 * @see       APKVersion
 * @generated
 */
public class APKVersionWrapper implements APKVersion, ModelWrapper<APKVersion> {
	public APKVersionWrapper(APKVersion apkVersion) {
		_apkVersion = apkVersion;
	}

	public Class<?> getModelClass() {
		return APKVersion.class;
	}

	public String getModelClassName() {
		return APKVersion.class.getName();
	}

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

	/**
	* Returns the primary key of this a p k version.
	*
	* @return the primary key of this a p k version
	*/
	public long getPrimaryKey() {
		return _apkVersion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this a p k version.
	*
	* @param primaryKey the primary key of this a p k version
	*/
	public void setPrimaryKey(long primaryKey) {
		_apkVersion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the apk version ID of this a p k version.
	*
	* @return the apk version ID of this a p k version
	*/
	public long getApkVersionId() {
		return _apkVersion.getApkVersionId();
	}

	/**
	* Sets the apk version ID of this a p k version.
	*
	* @param apkVersionId the apk version ID of this a p k version
	*/
	public void setApkVersionId(long apkVersionId) {
		_apkVersion.setApkVersionId(apkVersionId);
	}

	/**
	* Returns the supported min version of this a p k version.
	*
	* @return the supported min version of this a p k version
	*/
	public int getSupportedMinVersion() {
		return _apkVersion.getSupportedMinVersion();
	}

	/**
	* Sets the supported min version of this a p k version.
	*
	* @param supportedMinVersion the supported min version of this a p k version
	*/
	public void setSupportedMinVersion(int supportedMinVersion) {
		_apkVersion.setSupportedMinVersion(supportedMinVersion);
	}

	/**
	* Returns the supported min version name of this a p k version.
	*
	* @return the supported min version name of this a p k version
	*/
	public java.lang.String getSupportedMinVersionName() {
		return _apkVersion.getSupportedMinVersionName();
	}

	/**
	* Sets the supported min version name of this a p k version.
	*
	* @param supportedMinVersionName the supported min version name of this a p k version
	*/
	public void setSupportedMinVersionName(
		java.lang.String supportedMinVersionName) {
		_apkVersion.setSupportedMinVersionName(supportedMinVersionName);
	}

	/**
	* Returns the current version of this a p k version.
	*
	* @return the current version of this a p k version
	*/
	public int getCurrentVersion() {
		return _apkVersion.getCurrentVersion();
	}

	/**
	* Sets the current version of this a p k version.
	*
	* @param currentVersion the current version of this a p k version
	*/
	public void setCurrentVersion(int currentVersion) {
		_apkVersion.setCurrentVersion(currentVersion);
	}

	/**
	* Returns the current version name of this a p k version.
	*
	* @return the current version name of this a p k version
	*/
	public java.lang.String getCurrentVersionName() {
		return _apkVersion.getCurrentVersionName();
	}

	/**
	* Sets the current version name of this a p k version.
	*
	* @param currentVersionName the current version name of this a p k version
	*/
	public void setCurrentVersionName(java.lang.String currentVersionName) {
		_apkVersion.setCurrentVersionName(currentVersionName);
	}

	/**
	* Returns the create date of this a p k version.
	*
	* @return the create date of this a p k version
	*/
	public java.util.Date getCreateDate() {
		return _apkVersion.getCreateDate();
	}

	/**
	* Sets the create date of this a p k version.
	*
	* @param createDate the create date of this a p k version
	*/
	public void setCreateDate(java.util.Date createDate) {
		_apkVersion.setCreateDate(createDate);
	}

	public boolean isNew() {
		return _apkVersion.isNew();
	}

	public void setNew(boolean n) {
		_apkVersion.setNew(n);
	}

	public boolean isCachedModel() {
		return _apkVersion.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_apkVersion.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _apkVersion.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _apkVersion.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_apkVersion.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _apkVersion.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_apkVersion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new APKVersionWrapper((APKVersion)_apkVersion.clone());
	}

	public int compareTo(net.sareweb.txotx.model.APKVersion apkVersion) {
		return _apkVersion.compareTo(apkVersion);
	}

	@Override
	public int hashCode() {
		return _apkVersion.hashCode();
	}

	public com.liferay.portal.model.CacheModel<net.sareweb.txotx.model.APKVersion> toCacheModel() {
		return _apkVersion.toCacheModel();
	}

	public net.sareweb.txotx.model.APKVersion toEscapedModel() {
		return new APKVersionWrapper(_apkVersion.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _apkVersion.toString();
	}

	public java.lang.String toXmlString() {
		return _apkVersion.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_apkVersion.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public APKVersion getWrappedAPKVersion() {
		return _apkVersion;
	}

	public APKVersion getWrappedModel() {
		return _apkVersion;
	}

	public void resetOriginalValues() {
		_apkVersion.resetOriginalValues();
	}

	private APKVersion _apkVersion;
}