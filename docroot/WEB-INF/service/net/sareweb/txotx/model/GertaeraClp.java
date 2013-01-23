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

import net.sareweb.txotx.service.GertaeraLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author A.Galdos
 */
public class GertaeraClp extends BaseModelImpl<Gertaera> implements Gertaera {
	public GertaeraClp() {
	}

	public Class<?> getModelClass() {
		return Gertaera.class;
	}

	public String getModelClassName() {
		return Gertaera.class.getName();
	}

	public long getPrimaryKey() {
		return _gertaeraId;
	}

	public void setPrimaryKey(long primaryKey) {
		setGertaeraId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_gertaeraId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("gertaeraId", getGertaeraId());
		attributes.put("sagardotegiId", getSagardotegiId());
		attributes.put("userId", getUserId());
		attributes.put("screenName", getScreenName());
		attributes.put("gertaeraMota", getGertaeraMota());
		attributes.put("testua", getTestua());
		attributes.put("irudiKarpetaId", getIrudiKarpetaId());
		attributes.put("irudia", getIrudia());
		attributes.put("balorazioa", getBalorazioa());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long gertaeraId = (Long)attributes.get("gertaeraId");

		if (gertaeraId != null) {
			setGertaeraId(gertaeraId);
		}

		Long sagardotegiId = (Long)attributes.get("sagardotegiId");

		if (sagardotegiId != null) {
			setSagardotegiId(sagardotegiId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String screenName = (String)attributes.get("screenName");

		if (screenName != null) {
			setScreenName(screenName);
		}

		String gertaeraMota = (String)attributes.get("gertaeraMota");

		if (gertaeraMota != null) {
			setGertaeraMota(gertaeraMota);
		}

		String testua = (String)attributes.get("testua");

		if (testua != null) {
			setTestua(testua);
		}

		Long irudiKarpetaId = (Long)attributes.get("irudiKarpetaId");

		if (irudiKarpetaId != null) {
			setIrudiKarpetaId(irudiKarpetaId);
		}

		String irudia = (String)attributes.get("irudia");

		if (irudia != null) {
			setIrudia(irudia);
		}

		Long balorazioa = (Long)attributes.get("balorazioa");

		if (balorazioa != null) {
			setBalorazioa(balorazioa);
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

	public long getGertaeraId() {
		return _gertaeraId;
	}

	public void setGertaeraId(long gertaeraId) {
		_gertaeraId = gertaeraId;
	}

	public long getSagardotegiId() {
		return _sagardotegiId;
	}

	public void setSagardotegiId(long sagardotegiId) {
		_sagardotegiId = sagardotegiId;
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

	public String getScreenName() {
		return _screenName;
	}

	public void setScreenName(String screenName) {
		_screenName = screenName;
	}

	public String getGertaeraMota() {
		return _gertaeraMota;
	}

	public void setGertaeraMota(String gertaeraMota) {
		_gertaeraMota = gertaeraMota;
	}

	public String getTestua() {
		return _testua;
	}

	public void setTestua(String testua) {
		_testua = testua;
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

	public long getBalorazioa() {
		return _balorazioa;
	}

	public void setBalorazioa(long balorazioa) {
		_balorazioa = balorazioa;
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

	public BaseModel<?> getGertaeraRemoteModel() {
		return _gertaeraRemoteModel;
	}

	public void setGertaeraRemoteModel(BaseModel<?> gertaeraRemoteModel) {
		_gertaeraRemoteModel = gertaeraRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			GertaeraLocalServiceUtil.addGertaera(this);
		}
		else {
			GertaeraLocalServiceUtil.updateGertaera(this);
		}
	}

	@Override
	public Gertaera toEscapedModel() {
		return (Gertaera)Proxy.newProxyInstance(Gertaera.class.getClassLoader(),
			new Class[] { Gertaera.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		GertaeraClp clone = new GertaeraClp();

		clone.setGertaeraId(getGertaeraId());
		clone.setSagardotegiId(getSagardotegiId());
		clone.setUserId(getUserId());
		clone.setScreenName(getScreenName());
		clone.setGertaeraMota(getGertaeraMota());
		clone.setTestua(getTestua());
		clone.setIrudiKarpetaId(getIrudiKarpetaId());
		clone.setIrudia(getIrudia());
		clone.setBalorazioa(getBalorazioa());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	public int compareTo(Gertaera gertaera) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), gertaera.getCreateDate());

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

		GertaeraClp gertaera = null;

		try {
			gertaera = (GertaeraClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = gertaera.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{gertaeraId=");
		sb.append(getGertaeraId());
		sb.append(", sagardotegiId=");
		sb.append(getSagardotegiId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", screenName=");
		sb.append(getScreenName());
		sb.append(", gertaeraMota=");
		sb.append(getGertaeraMota());
		sb.append(", testua=");
		sb.append(getTestua());
		sb.append(", irudiKarpetaId=");
		sb.append(getIrudiKarpetaId());
		sb.append(", irudia=");
		sb.append(getIrudia());
		sb.append(", balorazioa=");
		sb.append(getBalorazioa());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("net.sareweb.txotx.model.Gertaera");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>gertaeraId</column-name><column-value><![CDATA[");
		sb.append(getGertaeraId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sagardotegiId</column-name><column-value><![CDATA[");
		sb.append(getSagardotegiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>screenName</column-name><column-value><![CDATA[");
		sb.append(getScreenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gertaeraMota</column-name><column-value><![CDATA[");
		sb.append(getGertaeraMota());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>testua</column-name><column-value><![CDATA[");
		sb.append(getTestua());
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
			"<column><column-name>balorazioa</column-name><column-value><![CDATA[");
		sb.append(getBalorazioa());
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

	private long _gertaeraId;
	private long _sagardotegiId;
	private long _userId;
	private String _userUuid;
	private String _screenName;
	private String _gertaeraMota;
	private String _testua;
	private long _irudiKarpetaId;
	private String _irudia;
	private long _balorazioa;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _gertaeraRemoteModel;
}