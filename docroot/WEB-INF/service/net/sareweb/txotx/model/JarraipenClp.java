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
import com.liferay.portal.util.PortalUtil;

import net.sareweb.txotx.service.JarraipenLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author A.Galdos
 */
public class JarraipenClp extends BaseModelImpl<Jarraipen> implements Jarraipen {
	public JarraipenClp() {
	}

	public Class<?> getModelClass() {
		return Jarraipen.class;
	}

	public String getModelClassName() {
		return Jarraipen.class.getName();
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

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jarraipenId", getJarraipenId());
		attributes.put("jarraitzaileUserId", getJarraitzaileUserId());
		attributes.put("jarraituaId", getJarraituaId());
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

		Long jarraituaId = (Long)attributes.get("jarraituaId");

		if (jarraituaId != null) {
			setJarraituaId(jarraituaId);
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

	public long getJarraipenId() {
		return _jarraipenId;
	}

	public void setJarraipenId(long jarraipenId) {
		_jarraipenId = jarraipenId;
	}

	public long getJarraitzaileUserId() {
		return _jarraitzaileUserId;
	}

	public void setJarraitzaileUserId(long jarraitzaileUserId) {
		_jarraitzaileUserId = jarraitzaileUserId;
	}

	public String getJarraitzaileUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getJarraitzaileUserId(), "uuid",
			_jarraitzaileUserUuid);
	}

	public void setJarraitzaileUserUuid(String jarraitzaileUserUuid) {
		_jarraitzaileUserUuid = jarraitzaileUserUuid;
	}

	public long getJarraituaId() {
		return _jarraituaId;
	}

	public void setJarraituaId(long jarraituaId) {
		_jarraituaId = jarraituaId;
	}

	public String getJarraipenMota() {
		return _jarraipenMota;
	}

	public void setJarraipenMota(String jarraipenMota) {
		_jarraipenMota = jarraipenMota;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public BaseModel<?> getJarraipenRemoteModel() {
		return _jarraipenRemoteModel;
	}

	public void setJarraipenRemoteModel(BaseModel<?> jarraipenRemoteModel) {
		_jarraipenRemoteModel = jarraipenRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			JarraipenLocalServiceUtil.addJarraipen(this);
		}
		else {
			JarraipenLocalServiceUtil.updateJarraipen(this);
		}
	}

	@Override
	public Jarraipen toEscapedModel() {
		return (Jarraipen)Proxy.newProxyInstance(Jarraipen.class.getClassLoader(),
			new Class[] { Jarraipen.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		JarraipenClp clone = new JarraipenClp();

		clone.setJarraipenId(getJarraipenId());
		clone.setJarraitzaileUserId(getJarraitzaileUserId());
		clone.setJarraituaId(getJarraituaId());
		clone.setJarraipenMota(getJarraipenMota());
		clone.setCreateDate(getCreateDate());

		return clone;
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

		JarraipenClp jarraipen = null;

		try {
			jarraipen = (JarraipenClp)obj;
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
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{jarraipenId=");
		sb.append(getJarraipenId());
		sb.append(", jarraitzaileUserId=");
		sb.append(getJarraitzaileUserId());
		sb.append(", jarraituaId=");
		sb.append(getJarraituaId());
		sb.append(", jarraipenMota=");
		sb.append(getJarraipenMota());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

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
			"<column><column-name>jarraituaId</column-name><column-value><![CDATA[");
		sb.append(getJarraituaId());
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

	private long _jarraipenId;
	private long _jarraitzaileUserId;
	private String _jarraitzaileUserUuid;
	private long _jarraituaId;
	private String _jarraipenMota;
	private Date _createDate;
	private BaseModel<?> _jarraipenRemoteModel;
}