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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import net.sareweb.txotx.model.Jarraipen;
import net.sareweb.txotx.model.JarraipenModel;
import net.sareweb.txotx.model.JarraipenSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Jarraipen service. Represents a row in the &quot;Txotx_Jarraipen&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link net.sareweb.txotx.model.JarraipenModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JarraipenImpl}.
 * </p>
 *
 * @author A.Galdos
 * @see JarraipenImpl
 * @see net.sareweb.txotx.model.Jarraipen
 * @see net.sareweb.txotx.model.JarraipenModel
 * @generated
 */
@JSON(strict = true)
public class JarraipenModelImpl extends BaseModelImpl<Jarraipen>
	implements JarraipenModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a jarraipen model instance should use the {@link net.sareweb.txotx.model.Jarraipen} interface instead.
	 */
	public static final String TABLE_NAME = "Txotx_Jarraipen";
	public static final Object[][] TABLE_COLUMNS = {
			{ "jarraipenId", Types.BIGINT },
			{ "jarraitzaileUserId", Types.BIGINT },
			{ "sagardotegiId", Types.BIGINT },
			{ "sagardoEgunId", Types.BIGINT },
			{ "jarraituaUserId", Types.BIGINT },
			{ "jarraipenMota", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Txotx_Jarraipen (jarraipenId LONG not null primary key,jarraitzaileUserId LONG,sagardotegiId LONG,sagardoEgunId LONG,jarraituaUserId LONG,jarraipenMota VARCHAR(75) null,createDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Txotx_Jarraipen";
	public static final String ORDER_BY_JPQL = " ORDER BY jarraipen.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY Txotx_Jarraipen.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.net.sareweb.txotx.model.Jarraipen"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.net.sareweb.txotx.model.Jarraipen"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.net.sareweb.txotx.model.Jarraipen"),
			true);
	public static long JARRAITUAUSERID_COLUMN_BITMASK = 1L;
	public static long JARRAITZAILEUSERID_COLUMN_BITMASK = 2L;
	public static long SAGARDOEGUNID_COLUMN_BITMASK = 4L;
	public static long SAGARDOTEGIID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Jarraipen toModel(JarraipenSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Jarraipen model = new JarraipenImpl();

		model.setJarraipenId(soapModel.getJarraipenId());
		model.setJarraitzaileUserId(soapModel.getJarraitzaileUserId());
		model.setSagardotegiId(soapModel.getSagardotegiId());
		model.setSagardoEgunId(soapModel.getSagardoEgunId());
		model.setJarraituaUserId(soapModel.getJarraituaUserId());
		model.setJarraipenMota(soapModel.getJarraipenMota());
		model.setCreateDate(soapModel.getCreateDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Jarraipen> toModels(JarraipenSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Jarraipen> models = new ArrayList<Jarraipen>(soapModels.length);

		for (JarraipenSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.net.sareweb.txotx.model.Jarraipen"));

	public JarraipenModelImpl() {
	}

	public long getPrimaryKey() {
		return _jarraipenId;
	}

	public void setPrimaryKey(long primaryKey) {
		setJarraipenId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_jarraipenId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return Jarraipen.class;
	}

	public String getModelClassName() {
		return Jarraipen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jarraipenId", getJarraipenId());
		attributes.put("jarraitzaileUserId", getJarraitzaileUserId());
		attributes.put("sagardotegiId", getSagardotegiId());
		attributes.put("sagardoEgunId", getSagardoEgunId());
		attributes.put("jarraituaUserId", getJarraituaUserId());
		attributes.put("jarraipenMota", getJarraipenMota());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jarraipenId = (Long)attributes.get("jarraipenId");

		if (jarraipenId != null) {
			setJarraipenId(jarraipenId);
		}

		Long jarraitzaileUserId = (Long)attributes.get("jarraitzaileUserId");

		if (jarraitzaileUserId != null) {
			setJarraitzaileUserId(jarraitzaileUserId);
		}

		Long sagardotegiId = (Long)attributes.get("sagardotegiId");

		if (sagardotegiId != null) {
			setSagardotegiId(sagardotegiId);
		}

		Long sagardoEgunId = (Long)attributes.get("sagardoEgunId");

		if (sagardoEgunId != null) {
			setSagardoEgunId(sagardoEgunId);
		}

		Long jarraituaUserId = (Long)attributes.get("jarraituaUserId");

		if (jarraituaUserId != null) {
			setJarraituaUserId(jarraituaUserId);
		}

		String jarraipenMota = (String)attributes.get("jarraipenMota");

		if (jarraipenMota != null) {
			setJarraipenMota(jarraipenMota);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	@JSON
	public long getJarraipenId() {
		return _jarraipenId;
	}

	public void setJarraipenId(long jarraipenId) {
		_jarraipenId = jarraipenId;
	}

	@JSON
	public long getJarraitzaileUserId() {
		return _jarraitzaileUserId;
	}

	public void setJarraitzaileUserId(long jarraitzaileUserId) {
		_columnBitmask |= JARRAITZAILEUSERID_COLUMN_BITMASK;

		if (!_setOriginalJarraitzaileUserId) {
			_setOriginalJarraitzaileUserId = true;

			_originalJarraitzaileUserId = _jarraitzaileUserId;
		}

		_jarraitzaileUserId = jarraitzaileUserId;
	}

	public String getJarraitzaileUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getJarraitzaileUserId(), "uuid",
			_jarraitzaileUserUuid);
	}

	public void setJarraitzaileUserUuid(String jarraitzaileUserUuid) {
		_jarraitzaileUserUuid = jarraitzaileUserUuid;
	}

	public long getOriginalJarraitzaileUserId() {
		return _originalJarraitzaileUserId;
	}

	@JSON
	public long getSagardotegiId() {
		return _sagardotegiId;
	}

	public void setSagardotegiId(long sagardotegiId) {
		_columnBitmask |= SAGARDOTEGIID_COLUMN_BITMASK;

		if (!_setOriginalSagardotegiId) {
			_setOriginalSagardotegiId = true;

			_originalSagardotegiId = _sagardotegiId;
		}

		_sagardotegiId = sagardotegiId;
	}

	public long getOriginalSagardotegiId() {
		return _originalSagardotegiId;
	}

	@JSON
	public long getSagardoEgunId() {
		return _sagardoEgunId;
	}

	public void setSagardoEgunId(long sagardoEgunId) {
		_columnBitmask |= SAGARDOEGUNID_COLUMN_BITMASK;

		if (!_setOriginalSagardoEgunId) {
			_setOriginalSagardoEgunId = true;

			_originalSagardoEgunId = _sagardoEgunId;
		}

		_sagardoEgunId = sagardoEgunId;
	}

	public long getOriginalSagardoEgunId() {
		return _originalSagardoEgunId;
	}

	@JSON
	public long getJarraituaUserId() {
		return _jarraituaUserId;
	}

	public void setJarraituaUserId(long jarraituaUserId) {
		_columnBitmask |= JARRAITUAUSERID_COLUMN_BITMASK;

		if (!_setOriginalJarraituaUserId) {
			_setOriginalJarraituaUserId = true;

			_originalJarraituaUserId = _jarraituaUserId;
		}

		_jarraituaUserId = jarraituaUserId;
	}

	public String getJarraituaUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getJarraituaUserId(), "uuid",
			_jarraituaUserUuid);
	}

	public void setJarraituaUserUuid(String jarraituaUserUuid) {
		_jarraituaUserUuid = jarraituaUserUuid;
	}

	public long getOriginalJarraituaUserId() {
		return _originalJarraituaUserId;
	}

	@JSON
	public String getJarraipenMota() {
		if (_jarraipenMota == null) {
			return StringPool.BLANK;
		}
		else {
			return _jarraipenMota;
		}
	}

	public void setJarraipenMota(String jarraipenMota) {
		_jarraipenMota = jarraipenMota;
	}

	@JSON
	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		_createDate = createDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Jarraipen.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Jarraipen toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Jarraipen)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		JarraipenImpl jarraipenImpl = new JarraipenImpl();

		jarraipenImpl.setJarraipenId(getJarraipenId());
		jarraipenImpl.setJarraitzaileUserId(getJarraitzaileUserId());
		jarraipenImpl.setSagardotegiId(getSagardotegiId());
		jarraipenImpl.setSagardoEgunId(getSagardoEgunId());
		jarraipenImpl.setJarraituaUserId(getJarraituaUserId());
		jarraipenImpl.setJarraipenMota(getJarraipenMota());
		jarraipenImpl.setCreateDate(getCreateDate());

		jarraipenImpl.resetOriginalValues();

		return jarraipenImpl;
	}

	public int compareTo(Jarraipen jarraipen) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), jarraipen.getCreateDate());

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

		Jarraipen jarraipen = null;

		try {
			jarraipen = (Jarraipen)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = jarraipen.getPrimaryKey();

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
		JarraipenModelImpl jarraipenModelImpl = this;

		jarraipenModelImpl._originalJarraitzaileUserId = jarraipenModelImpl._jarraitzaileUserId;

		jarraipenModelImpl._setOriginalJarraitzaileUserId = false;

		jarraipenModelImpl._originalSagardotegiId = jarraipenModelImpl._sagardotegiId;

		jarraipenModelImpl._setOriginalSagardotegiId = false;

		jarraipenModelImpl._originalSagardoEgunId = jarraipenModelImpl._sagardoEgunId;

		jarraipenModelImpl._setOriginalSagardoEgunId = false;

		jarraipenModelImpl._originalJarraituaUserId = jarraipenModelImpl._jarraituaUserId;

		jarraipenModelImpl._setOriginalJarraituaUserId = false;

		jarraipenModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Jarraipen> toCacheModel() {
		JarraipenCacheModel jarraipenCacheModel = new JarraipenCacheModel();

		jarraipenCacheModel.jarraipenId = getJarraipenId();

		jarraipenCacheModel.jarraitzaileUserId = getJarraitzaileUserId();

		jarraipenCacheModel.sagardotegiId = getSagardotegiId();

		jarraipenCacheModel.sagardoEgunId = getSagardoEgunId();

		jarraipenCacheModel.jarraituaUserId = getJarraituaUserId();

		jarraipenCacheModel.jarraipenMota = getJarraipenMota();

		String jarraipenMota = jarraipenCacheModel.jarraipenMota;

		if ((jarraipenMota != null) && (jarraipenMota.length() == 0)) {
			jarraipenCacheModel.jarraipenMota = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			jarraipenCacheModel.createDate = createDate.getTime();
		}
		else {
			jarraipenCacheModel.createDate = Long.MIN_VALUE;
		}

		return jarraipenCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{jarraipenId=");
		sb.append(getJarraipenId());
		sb.append(", jarraitzaileUserId=");
		sb.append(getJarraitzaileUserId());
		sb.append(", sagardotegiId=");
		sb.append(getSagardotegiId());
		sb.append(", sagardoEgunId=");
		sb.append(getSagardoEgunId());
		sb.append(", jarraituaUserId=");
		sb.append(getJarraituaUserId());
		sb.append(", jarraipenMota=");
		sb.append(getJarraipenMota());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("net.sareweb.txotx.model.Jarraipen");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>jarraipenId</column-name><column-value><![CDATA[");
		sb.append(getJarraipenId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jarraitzaileUserId</column-name><column-value><![CDATA[");
		sb.append(getJarraitzaileUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sagardotegiId</column-name><column-value><![CDATA[");
		sb.append(getSagardotegiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sagardoEgunId</column-name><column-value><![CDATA[");
		sb.append(getSagardoEgunId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jarraituaUserId</column-name><column-value><![CDATA[");
		sb.append(getJarraituaUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jarraipenMota</column-name><column-value><![CDATA[");
		sb.append(getJarraipenMota());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Jarraipen.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Jarraipen.class
		};
	private long _jarraipenId;
	private long _jarraitzaileUserId;
	private String _jarraitzaileUserUuid;
	private long _originalJarraitzaileUserId;
	private boolean _setOriginalJarraitzaileUserId;
	private long _sagardotegiId;
	private long _originalSagardotegiId;
	private boolean _setOriginalSagardotegiId;
	private long _sagardoEgunId;
	private long _originalSagardoEgunId;
	private boolean _setOriginalSagardoEgunId;
	private long _jarraituaUserId;
	private String _jarraituaUserUuid;
	private long _originalJarraituaUserId;
	private boolean _setOriginalJarraituaUserId;
	private String _jarraipenMota;
	private Date _createDate;
	private long _columnBitmask;
	private Jarraipen _escapedModelProxy;
}