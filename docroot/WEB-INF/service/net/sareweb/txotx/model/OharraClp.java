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

import net.sareweb.txotx.service.OharraLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author A.Galdos
 */
public class OharraClp extends BaseModelImpl<Oharra> implements Oharra {
	public OharraClp() {
	}

	public Class<?> getModelClass() {
		return Oharra.class;
	}

	public String getModelClassName() {
		return Oharra.class.getName();
	}

	public long getPrimaryKey() {
		return _oharraId;
	}

	public void setPrimaryKey(long primaryKey) {
		setOharraId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_oharraId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("oharraId", getOharraId());
		attributes.put("oharMota", getOharMota());
		attributes.put("irudiKarpetaId", getIrudiKarpetaId());
		attributes.put("irudia", getIrudia());
		attributes.put("izenburua", getIzenburua());
		attributes.put("testua", getTestua());
		attributes.put("esteka", getEsteka());
		attributes.put("estekaTestua", getEstekaTestua());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long oharraId = (Long)attributes.get("oharraId");

		if (oharraId != null) {
			setOharraId(oharraId);
		}

		String oharMota = (String)attributes.get("oharMota");

		if (oharMota != null) {
			setOharMota(oharMota);
		}

		Long irudiKarpetaId = (Long)attributes.get("irudiKarpetaId");

		if (irudiKarpetaId != null) {
			setIrudiKarpetaId(irudiKarpetaId);
		}

		String irudia = (String)attributes.get("irudia");

		if (irudia != null) {
			setIrudia(irudia);
		}

		String izenburua = (String)attributes.get("izenburua");

		if (izenburua != null) {
			setIzenburua(izenburua);
		}

		String testua = (String)attributes.get("testua");

		if (testua != null) {
			setTestua(testua);
		}

		String esteka = (String)attributes.get("esteka");

		if (esteka != null) {
			setEsteka(esteka);
		}

		String estekaTestua = (String)attributes.get("estekaTestua");

		if (estekaTestua != null) {
			setEstekaTestua(estekaTestua);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	public long getOharraId() {
		return _oharraId;
	}

	public void setOharraId(long oharraId) {
		_oharraId = oharraId;
	}

	public String getOharMota() {
		return _oharMota;
	}

	public void setOharMota(String oharMota) {
		_oharMota = oharMota;
	}

	public long getIrudiKarpetaId() {
		return _irudiKarpetaId;
	}

	public void setIrudiKarpetaId(long irudiKarpetaId) {
		_irudiKarpetaId = irudiKarpetaId;
	}

	public String getIrudia() {
		return _irudia;
	}

	public void setIrudia(String irudia) {
		_irudia = irudia;
	}

	public String getIzenburua() {
		return _izenburua;
	}

	public void setIzenburua(String izenburua) {
		_izenburua = izenburua;
	}

	public String getTestua() {
		return _testua;
	}

	public void setTestua(String testua) {
		_testua = testua;
	}

	public String getEsteka() {
		return _esteka;
	}

	public void setEsteka(String esteka) {
		_esteka = esteka;
	}

	public String getEstekaTestua() {
		return _estekaTestua;
	}

	public void setEstekaTestua(String estekaTestua) {
		_estekaTestua = estekaTestua;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public BaseModel<?> getOharraRemoteModel() {
		return _oharraRemoteModel;
	}

	public void setOharraRemoteModel(BaseModel<?> oharraRemoteModel) {
		_oharraRemoteModel = oharraRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			OharraLocalServiceUtil.addOharra(this);
		}
		else {
			OharraLocalServiceUtil.updateOharra(this);
		}
	}

	@Override
	public Oharra toEscapedModel() {
		return (Oharra)Proxy.newProxyInstance(Oharra.class.getClassLoader(),
			new Class[] { Oharra.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OharraClp clone = new OharraClp();

		clone.setOharraId(getOharraId());
		clone.setOharMota(getOharMota());
		clone.setIrudiKarpetaId(getIrudiKarpetaId());
		clone.setIrudia(getIrudia());
		clone.setIzenburua(getIzenburua());
		clone.setTestua(getTestua());
		clone.setEsteka(getEsteka());
		clone.setEstekaTestua(getEstekaTestua());
		clone.setCreateDate(getCreateDate());

		return clone;
	}

	public int compareTo(Oharra oharra) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), oharra.getCreateDate());

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

		OharraClp oharra = null;

		try {
			oharra = (OharraClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = oharra.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{oharraId=");
		sb.append(getOharraId());
		sb.append(", oharMota=");
		sb.append(getOharMota());
		sb.append(", irudiKarpetaId=");
		sb.append(getIrudiKarpetaId());
		sb.append(", irudia=");
		sb.append(getIrudia());
		sb.append(", izenburua=");
		sb.append(getIzenburua());
		sb.append(", testua=");
		sb.append(getTestua());
		sb.append(", esteka=");
		sb.append(getEsteka());
		sb.append(", estekaTestua=");
		sb.append(getEstekaTestua());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("net.sareweb.txotx.model.Oharra");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>oharraId</column-name><column-value><![CDATA[");
		sb.append(getOharraId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oharMota</column-name><column-value><![CDATA[");
		sb.append(getOharMota());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>irudiKarpetaId</column-name><column-value><![CDATA[");
		sb.append(getIrudiKarpetaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>irudia</column-name><column-value><![CDATA[");
		sb.append(getIrudia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>izenburua</column-name><column-value><![CDATA[");
		sb.append(getIzenburua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>testua</column-name><column-value><![CDATA[");
		sb.append(getTestua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>esteka</column-name><column-value><![CDATA[");
		sb.append(getEsteka());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estekaTestua</column-name><column-value><![CDATA[");
		sb.append(getEstekaTestua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _oharraId;
	private String _oharMota;
	private long _irudiKarpetaId;
	private String _irudia;
	private String _izenburua;
	private String _testua;
	private String _esteka;
	private String _estekaTestua;
	private Date _createDate;
	private BaseModel<?> _oharraRemoteModel;
}