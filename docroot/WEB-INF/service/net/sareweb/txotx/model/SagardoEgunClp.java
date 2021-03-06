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

import net.sareweb.txotx.service.SagardoEgunLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author A.Galdos
 */
public class SagardoEgunClp extends BaseModelImpl<SagardoEgun>
	implements SagardoEgun {
	public SagardoEgunClp() {
	}

	public Class<?> getModelClass() {
		return SagardoEgun.class;
	}

	public String getModelClassName() {
		return SagardoEgun.class.getName();
	}

	public long getPrimaryKey() {
		return _sagardoEgunId;
	}

	public void setPrimaryKey(long primaryKey) {
		setSagardoEgunId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_sagardoEgunId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sagardoEgunId", getSagardoEgunId());
		attributes.put("izena", getIzena());
		attributes.put("edizioa", getEdizioa());
		attributes.put("herria", getHerria());
		attributes.put("lekua", getLekua());
		attributes.put("emaila", getEmaila());
		attributes.put("twitter", getTwitter());
		attributes.put("weborria", getWeborria());
		attributes.put("hasieraDate", getHasieraDate());
		attributes.put("lat", getLat());
		attributes.put("lng", getLng());
		attributes.put("irudiKarpetaId", getIrudiKarpetaId());
		attributes.put("irudia", getIrudia());
		attributes.put("irudiKopurua", getIrudiKopurua());
		attributes.put("iruzkinKopurua", getIruzkinKopurua());
		attributes.put("balorazioKopurua", getBalorazioKopurua());
		attributes.put("balorazioenBB", getBalorazioenBB());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sagardoEgunId = (Long)attributes.get("sagardoEgunId");

		if (sagardoEgunId != null) {
			setSagardoEgunId(sagardoEgunId);
		}

		String izena = (String)attributes.get("izena");

		if (izena != null) {
			setIzena(izena);
		}

		Long edizioa = (Long)attributes.get("edizioa");

		if (edizioa != null) {
			setEdizioa(edizioa);
		}

		String herria = (String)attributes.get("herria");

		if (herria != null) {
			setHerria(herria);
		}

		String lekua = (String)attributes.get("lekua");

		if (lekua != null) {
			setLekua(lekua);
		}

		String emaila = (String)attributes.get("emaila");

		if (emaila != null) {
			setEmaila(emaila);
		}

		String twitter = (String)attributes.get("twitter");

		if (twitter != null) {
			setTwitter(twitter);
		}

		String weborria = (String)attributes.get("weborria");

		if (weborria != null) {
			setWeborria(weborria);
		}

		Date hasieraDate = (Date)attributes.get("hasieraDate");

		if (hasieraDate != null) {
			setHasieraDate(hasieraDate);
		}

		Double lat = (Double)attributes.get("lat");

		if (lat != null) {
			setLat(lat);
		}

		Double lng = (Double)attributes.get("lng");

		if (lng != null) {
			setLng(lng);
		}

		Long irudiKarpetaId = (Long)attributes.get("irudiKarpetaId");

		if (irudiKarpetaId != null) {
			setIrudiKarpetaId(irudiKarpetaId);
		}

		String irudia = (String)attributes.get("irudia");

		if (irudia != null) {
			setIrudia(irudia);
		}

		Long irudiKopurua = (Long)attributes.get("irudiKopurua");

		if (irudiKopurua != null) {
			setIrudiKopurua(irudiKopurua);
		}

		Long iruzkinKopurua = (Long)attributes.get("iruzkinKopurua");

		if (iruzkinKopurua != null) {
			setIruzkinKopurua(iruzkinKopurua);
		}

		Long balorazioKopurua = (Long)attributes.get("balorazioKopurua");

		if (balorazioKopurua != null) {
			setBalorazioKopurua(balorazioKopurua);
		}

		Double balorazioenBB = (Double)attributes.get("balorazioenBB");

		if (balorazioenBB != null) {
			setBalorazioenBB(balorazioenBB);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	public long getSagardoEgunId() {
		return _sagardoEgunId;
	}

	public void setSagardoEgunId(long sagardoEgunId) {
		_sagardoEgunId = sagardoEgunId;
	}

	public String getIzena() {
		return _izena;
	}

	public void setIzena(String izena) {
		_izena = izena;
	}

	public long getEdizioa() {
		return _edizioa;
	}

	public void setEdizioa(long edizioa) {
		_edizioa = edizioa;
	}

	public String getHerria() {
		return _herria;
	}

	public void setHerria(String herria) {
		_herria = herria;
	}

	public String getLekua() {
		return _lekua;
	}

	public void setLekua(String lekua) {
		_lekua = lekua;
	}

	public String getEmaila() {
		return _emaila;
	}

	public void setEmaila(String emaila) {
		_emaila = emaila;
	}

	public String getTwitter() {
		return _twitter;
	}

	public void setTwitter(String twitter) {
		_twitter = twitter;
	}

	public String getWeborria() {
		return _weborria;
	}

	public void setWeborria(String weborria) {
		_weborria = weborria;
	}

	public Date getHasieraDate() {
		return _hasieraDate;
	}

	public void setHasieraDate(Date hasieraDate) {
		_hasieraDate = hasieraDate;
	}

	public double getLat() {
		return _lat;
	}

	public void setLat(double lat) {
		_lat = lat;
	}

	public double getLng() {
		return _lng;
	}

	public void setLng(double lng) {
		_lng = lng;
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

	public long getIrudiKopurua() {
		return _irudiKopurua;
	}

	public void setIrudiKopurua(long irudiKopurua) {
		_irudiKopurua = irudiKopurua;
	}

	public long getIruzkinKopurua() {
		return _iruzkinKopurua;
	}

	public void setIruzkinKopurua(long iruzkinKopurua) {
		_iruzkinKopurua = iruzkinKopurua;
	}

	public long getBalorazioKopurua() {
		return _balorazioKopurua;
	}

	public void setBalorazioKopurua(long balorazioKopurua) {
		_balorazioKopurua = balorazioKopurua;
	}

	public double getBalorazioenBB() {
		return _balorazioenBB;
	}

	public void setBalorazioenBB(double balorazioenBB) {
		_balorazioenBB = balorazioenBB;
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

	public BaseModel<?> getSagardoEgunRemoteModel() {
		return _sagardoEgunRemoteModel;
	}

	public void setSagardoEgunRemoteModel(BaseModel<?> sagardoEgunRemoteModel) {
		_sagardoEgunRemoteModel = sagardoEgunRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SagardoEgunLocalServiceUtil.addSagardoEgun(this);
		}
		else {
			SagardoEgunLocalServiceUtil.updateSagardoEgun(this);
		}
	}

	@Override
	public SagardoEgun toEscapedModel() {
		return (SagardoEgun)Proxy.newProxyInstance(SagardoEgun.class.getClassLoader(),
			new Class[] { SagardoEgun.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SagardoEgunClp clone = new SagardoEgunClp();

		clone.setSagardoEgunId(getSagardoEgunId());
		clone.setIzena(getIzena());
		clone.setEdizioa(getEdizioa());
		clone.setHerria(getHerria());
		clone.setLekua(getLekua());
		clone.setEmaila(getEmaila());
		clone.setTwitter(getTwitter());
		clone.setWeborria(getWeborria());
		clone.setHasieraDate(getHasieraDate());
		clone.setLat(getLat());
		clone.setLng(getLng());
		clone.setIrudiKarpetaId(getIrudiKarpetaId());
		clone.setIrudia(getIrudia());
		clone.setIrudiKopurua(getIrudiKopurua());
		clone.setIruzkinKopurua(getIruzkinKopurua());
		clone.setBalorazioKopurua(getBalorazioKopurua());
		clone.setBalorazioenBB(getBalorazioenBB());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setUserId(getUserId());

		return clone;
	}

	public int compareTo(SagardoEgun sagardoEgun) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), sagardoEgun.getCreateDate());

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

		SagardoEgunClp sagardoEgun = null;

		try {
			sagardoEgun = (SagardoEgunClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = sagardoEgun.getPrimaryKey();

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
		StringBundler sb = new StringBundler(41);

		sb.append("{sagardoEgunId=");
		sb.append(getSagardoEgunId());
		sb.append(", izena=");
		sb.append(getIzena());
		sb.append(", edizioa=");
		sb.append(getEdizioa());
		sb.append(", herria=");
		sb.append(getHerria());
		sb.append(", lekua=");
		sb.append(getLekua());
		sb.append(", emaila=");
		sb.append(getEmaila());
		sb.append(", twitter=");
		sb.append(getTwitter());
		sb.append(", weborria=");
		sb.append(getWeborria());
		sb.append(", hasieraDate=");
		sb.append(getHasieraDate());
		sb.append(", lat=");
		sb.append(getLat());
		sb.append(", lng=");
		sb.append(getLng());
		sb.append(", irudiKarpetaId=");
		sb.append(getIrudiKarpetaId());
		sb.append(", irudia=");
		sb.append(getIrudia());
		sb.append(", irudiKopurua=");
		sb.append(getIrudiKopurua());
		sb.append(", iruzkinKopurua=");
		sb.append(getIruzkinKopurua());
		sb.append(", balorazioKopurua=");
		sb.append(getBalorazioKopurua());
		sb.append(", balorazioenBB=");
		sb.append(getBalorazioenBB());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append("net.sareweb.txotx.model.SagardoEgun");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sagardoEgunId</column-name><column-value><![CDATA[");
		sb.append(getSagardoEgunId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>izena</column-name><column-value><![CDATA[");
		sb.append(getIzena());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>edizioa</column-name><column-value><![CDATA[");
		sb.append(getEdizioa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>herria</column-name><column-value><![CDATA[");
		sb.append(getHerria());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lekua</column-name><column-value><![CDATA[");
		sb.append(getLekua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emaila</column-name><column-value><![CDATA[");
		sb.append(getEmaila());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>twitter</column-name><column-value><![CDATA[");
		sb.append(getTwitter());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>weborria</column-name><column-value><![CDATA[");
		sb.append(getWeborria());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasieraDate</column-name><column-value><![CDATA[");
		sb.append(getHasieraDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lat</column-name><column-value><![CDATA[");
		sb.append(getLat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lng</column-name><column-value><![CDATA[");
		sb.append(getLng());
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
			"<column><column-name>irudiKopurua</column-name><column-value><![CDATA[");
		sb.append(getIrudiKopurua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>iruzkinKopurua</column-name><column-value><![CDATA[");
		sb.append(getIruzkinKopurua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>balorazioKopurua</column-name><column-value><![CDATA[");
		sb.append(getBalorazioKopurua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>balorazioenBB</column-name><column-value><![CDATA[");
		sb.append(getBalorazioenBB());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _sagardoEgunId;
	private String _izena;
	private long _edizioa;
	private String _herria;
	private String _lekua;
	private String _emaila;
	private String _twitter;
	private String _weborria;
	private Date _hasieraDate;
	private double _lat;
	private double _lng;
	private long _irudiKarpetaId;
	private String _irudia;
	private long _irudiKopurua;
	private long _iruzkinKopurua;
	private long _balorazioKopurua;
	private double _balorazioenBB;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
	private BaseModel<?> _sagardoEgunRemoteModel;
}