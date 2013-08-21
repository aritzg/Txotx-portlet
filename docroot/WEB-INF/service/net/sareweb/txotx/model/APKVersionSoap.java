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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.sareweb.txotx.service.http.APKVersionServiceSoap}.
 *
 * @author    A.Galdos
 * @see       net.sareweb.txotx.service.http.APKVersionServiceSoap
 * @generated
 */
public class APKVersionSoap implements Serializable {
	public static APKVersionSoap toSoapModel(APKVersion model) {
		APKVersionSoap soapModel = new APKVersionSoap();

		soapModel.setApkVersionId(model.getApkVersionId());
		soapModel.setSupportedMinVersion(model.getSupportedMinVersion());
		soapModel.setSupportedMinVersionName(model.getSupportedMinVersionName());
		soapModel.setCurrentVersion(model.getCurrentVersion());
		soapModel.setCurrentVersionName(model.getCurrentVersionName());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static APKVersionSoap[] toSoapModels(APKVersion[] models) {
		APKVersionSoap[] soapModels = new APKVersionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static APKVersionSoap[][] toSoapModels(APKVersion[][] models) {
		APKVersionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new APKVersionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new APKVersionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static APKVersionSoap[] toSoapModels(List<APKVersion> models) {
		List<APKVersionSoap> soapModels = new ArrayList<APKVersionSoap>(models.size());

		for (APKVersion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new APKVersionSoap[soapModels.size()]);
	}

	public APKVersionSoap() {
	}

	public long getPrimaryKey() {
		return _apkVersionId;
	}

	public void setPrimaryKey(long pk) {
		setApkVersionId(pk);
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

	private long _apkVersionId;
	private int _supportedMinVersion;
	private String _supportedMinVersionName;
	private int _currentVersion;
	private String _currentVersionName;
	private Date _createDate;
}