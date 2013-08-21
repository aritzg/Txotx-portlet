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

package net.sareweb.txotx.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import net.sareweb.txotx.model.APKVersion;
import net.sareweb.txotx.model.APKVersionModel;
import net.sareweb.txotx.model.APKVersionSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the APKVersion service. Represents a row in the &quot;Txotx_APKVersion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link net.sareweb.txotx.model.APKVersionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link APKVersionImpl}.
 * </p>
 *
 * @author A.Galdos
 * @see APKVersionImpl
 * @see net.sareweb.txotx.model.APKVersion
 * @see net.sareweb.txotx.model.APKVersionModel
 * @generated
 */
@JSON(strict = true)
public class APKVersionModelImpl extends BaseModelImpl<APKVersion>
	implements APKVersionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a a p k version model instance should use the {@link net.sareweb.txotx.model.APKVersion} interface instead.
	 */
	public static final String TABLE_NAME = "Txotx_APKVersion";
	public static final Object[][] TABLE_COLUMNS = {
			{ "apkVersionId", Types.BIGINT },
			{ "supportedMinVersion", Types.INTEGER },
			{ "supportedMinVersionName", Types.VARCHAR },
			{ "currentVersion", Types.INTEGER },
			{ "currentVersionName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Txotx_APKVersion (apkVersionId LONG not null primary key,supportedMinVersion INTEGER,supportedMinVersionName VARCHAR(75) null,currentVersion INTEGER,currentVersionName VARCHAR(75) null,createDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Txotx_APKVersion";
	public static final String ORDER_BY_JPQL = " ORDER BY apkVersion.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY Txotx_APKVersion.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.net.sareweb.txotx.model.APKVersion"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.net.sareweb.txotx.model.APKVersion"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static APKVersion toModel(APKVersionSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		APKVersion model = new APKVersionImpl();

		model.setApkVersionId(soapModel.getApkVersionId());
		model.setSupportedMinVersion(soapModel.getSupportedMinVersion());
		model.setSupportedMinVersionName(soapModel.getSupportedMinVersionName());
		model.setCurrentVersion(soapModel.getCurrentVersion());
		model.setCurrentVersionName(soapModel.getCurrentVersionName());
		model.setCreateDate(soapModel.getCreateDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<APKVersion> toModels(APKVersionSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<APKVersion> models = new ArrayList<APKVersion>(soapModels.length);

		for (APKVersionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.net.sareweb.txotx.model.APKVersion"));

	public APKVersionModelImpl() {
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

	public Class<?> getModelClass() {
		return APKVersion.class;
	}

	public String getModelClassName() {
		return APKVersion.class.getName();
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

	@JSON
	public long getApkVersionId() {
		return _apkVersionId;
	}

	public void setApkVersionId(long apkVersionId) {
		_apkVersionId = apkVersionId;
	}

	@JSON
	public int getSupportedMinVersion() {
		return _supportedMinVersion;
	}

	public void setSupportedMinVersion(int supportedMinVersion) {
		_supportedMinVersion = supportedMinVersion;
	}

	@JSON
	public String getSupportedMinVersionName() {
		if (_supportedMinVersionName == null) {
			return StringPool.BLANK;
		}
		else {
			return _supportedMinVersionName;
		}
	}

	public void setSupportedMinVersionName(String supportedMinVersionName) {
		_supportedMinVersionName = supportedMinVersionName;
	}

	@JSON
	public int getCurrentVersion() {
		return _currentVersion;
	}

	public void setCurrentVersion(int currentVersion) {
		_currentVersion = currentVersion;
	}

	@JSON
	public String getCurrentVersionName() {
		if (_currentVersionName == null) {
			return StringPool.BLANK;
		}
		else {
			return _currentVersionName;
		}
	}

	public void setCurrentVersionName(String currentVersionName) {
		_currentVersionName = currentVersionName;
	}

	@JSON
	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			APKVersion.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public APKVersion toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (APKVersion)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		APKVersionImpl apkVersionImpl = new APKVersionImpl();

		apkVersionImpl.setApkVersionId(getApkVersionId());
		apkVersionImpl.setSupportedMinVersion(getSupportedMinVersion());
		apkVersionImpl.setSupportedMinVersionName(getSupportedMinVersionName());
		apkVersionImpl.setCurrentVersion(getCurrentVersion());
		apkVersionImpl.setCurrentVersionName(getCurrentVersionName());
		apkVersionImpl.setCreateDate(getCreateDate());

		apkVersionImpl.resetOriginalValues();

		return apkVersionImpl;
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

		APKVersion apkVersion = null;

		try {
			apkVersion = (APKVersion)obj;
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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<APKVersion> toCacheModel() {
		APKVersionCacheModel apkVersionCacheModel = new APKVersionCacheModel();

		apkVersionCacheModel.apkVersionId = getApkVersionId();

		apkVersionCacheModel.supportedMinVersion = getSupportedMinVersion();

		apkVersionCacheModel.supportedMinVersionName = getSupportedMinVersionName();

		String supportedMinVersionName = apkVersionCacheModel.supportedMinVersionName;

		if ((supportedMinVersionName != null) &&
				(supportedMinVersionName.length() == 0)) {
			apkVersionCacheModel.supportedMinVersionName = null;
		}

		apkVersionCacheModel.currentVersion = getCurrentVersion();

		apkVersionCacheModel.currentVersionName = getCurrentVersionName();

		String currentVersionName = apkVersionCacheModel.currentVersionName;

		if ((currentVersionName != null) && (currentVersionName.length() == 0)) {
			apkVersionCacheModel.currentVersionName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			apkVersionCacheModel.createDate = createDate.getTime();
		}
		else {
			apkVersionCacheModel.createDate = Long.MIN_VALUE;
		}

		return apkVersionCacheModel;
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

	private static ClassLoader _classLoader = APKVersion.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			APKVersion.class
		};
	private long _apkVersionId;
	private int _supportedMinVersion;
	private String _supportedMinVersionName;
	private int _currentVersion;
	private String _currentVersionName;
	private Date _createDate;
	private APKVersion _escapedModelProxy;
}