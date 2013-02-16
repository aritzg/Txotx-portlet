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

import net.sareweb.txotx.service.SagardotegiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author A.Galdos
 */
public class SagardotegiClp extends BaseModelImpl<Sagardotegi>
	implements Sagardotegi {
	public SagardotegiClp() {
	}

	public Class<?> getModelClass() {
		return Sagardotegi.class;
	}

	public String getModelClassName() {
		return Sagardotegi.class.getName();
	}

	public long getPrimaryKey() {
		return _sagardotegiId;
	}

	public void setPrimaryKey(long primaryKey) {
		setSagardotegiId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_sagardotegiId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sagardotegiId", getSagardotegiId());
		attributes.put("izena", getIzena());
		attributes.put("herria", getHerria());
		attributes.put("helbidea", getHelbidea());
		attributes.put("telefonoa", getTelefonoa());
		attributes.put("emaila", getEmaila());
		attributes.put("twitter", getTwitter());
		attributes.put("weborria", getWeborria());
		attributes.put("lat", getLat());
		attributes.put("lng", getLng());
		attributes.put("edukiera", getEdukiera());
		attributes.put("irudiKarpetaId", getIrudiKarpetaId());
		attributes.put("irudia", getIrudia());
		attributes.put("irudiKopurua", getIrudiKopurua());
		attributes.put("iruzkinKopurua", getIruzkinKopurua());
		attributes.put("balorazioKopurua", getBalorazioKopurua());
		attributes.put("balorazioenBB", getBalorazioenBB());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sagardotegiId = (Long)attributes.get("sagardotegiId");

		if (sagardotegiId != null) {
			setSagardotegiId(sagardotegiId);
		}

		String izena = (String)attributes.get("izena");

		if (izena != null) {
			setIzena(izena);
		}

		String herria = (String)attributes.get("herria");

		if (herria != null) {
			setHerria(herria);
		}

		String helbidea = (String)attributes.get("helbidea");

		if (helbidea != null) {
			setHelbidea(helbidea);
		}

		String telefonoa = (String)attributes.get("telefonoa");

		if (telefonoa != null) {
			setTelefonoa(telefonoa);
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

		Double lat = (Double)attributes.get("lat");

		if (lat != null) {
			setLat(lat);
		}

		Double lng = (Double)attributes.get("lng");

		if (lng != null) {
			setLng(lng);
		}

		Long edukiera = (Long)attributes.get("edukiera");

		if (edukiera != null) {
			setEdukiera(edukiera);
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
	}

	public long getSagardotegiId() {
		return _sagardotegiId;
	}

	public void setSagardotegiId(long sagardotegiId) {
		_sagardotegiId = sagardotegiId;
	}

	public String getIzena() {
		return _izena;
	}

	public void setIzena(String izena) {
		_izena = izena;
	}

	public String getHerria() {
		return _herria;
	}

	public void setHerria(String herria) {
		_herria = herria;
	}

	public String getHelbidea() {
		return _helbidea;
	}

	public void setHelbidea(String helbidea) {
		_helbidea = helbidea;
	}

	public String getTelefonoa() {
		return _telefonoa;
	}

	public void setTelefonoa(String telefonoa) {
		_telefonoa = telefonoa;
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

	public long getEdukiera() {
		return _edukiera;
	}

	public void setEdukiera(long edukiera) {
		_edukiera = edukiera;
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

	public BaseModel<?> getSagardotegiRemoteModel() {
		return _sagardotegiRemoteModel;
	}

	public void setSagardotegiRemoteModel(BaseModel<?> sagardotegiRemoteModel) {
		_sagardotegiRemoteModel = sagardotegiRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SagardotegiLocalServiceUtil.addSagardotegi(this);
		}
		else {
			SagardotegiLocalServiceUtil.updateSagardotegi(this);
		}
	}

	@Override
	public Sagardotegi toEscapedModel() {
		return (Sagardotegi)Proxy.newProxyInstance(Sagardotegi.class.getClassLoader(),
			new Class[] { Sagardotegi.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SagardotegiClp clone = new SagardotegiClp();

		clone.setSagardotegiId(getSagardotegiId());
		clone.setIzena(getIzena());
		clone.setHerria(getHerria());
		clone.setHelbidea(getHelbidea());
		clone.setTelefonoa(getTelefonoa());
		clone.setEmaila(getEmaila());
		clone.setTwitter(getTwitter());
		clone.setWeborria(getWeborria());
		clone.setLat(getLat());
		clone.setLng(getLng());
		clone.setEdukiera(getEdukiera());
		clone.setIrudiKarpetaId(getIrudiKarpetaId());
		clone.setIrudia(getIrudia());
		clone.setIrudiKopurua(getIrudiKopurua());
		clone.setIruzkinKopurua(getIruzkinKopurua());
		clone.setBalorazioKopurua(getBalorazioKopurua());
		clone.setBalorazioenBB(getBalorazioenBB());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	public int compareTo(Sagardotegi sagardotegi) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), sagardotegi.getCreateDate());

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

		SagardotegiClp sagardotegi = null;

		try {
			sagardotegi = (SagardotegiClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = sagardotegi.getPrimaryKey();

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
		StringBundler sb = new StringBundler(39);

		sb.append("{sagardotegiId=");
		sb.append(getSagardotegiId());
		sb.append(", izena=");
		sb.append(getIzena());
		sb.append(", herria=");
		sb.append(getHerria());
		sb.append(", helbidea=");
		sb.append(getHelbidea());
		sb.append(", telefonoa=");
		sb.append(getTelefonoa());
		sb.append(", emaila=");
		sb.append(getEmaila());
		sb.append(", twitter=");
		sb.append(getTwitter());
		sb.append(", weborria=");
		sb.append(getWeborria());
		sb.append(", lat=");
		sb.append(getLat());
		sb.append(", lng=");
		sb.append(getLng());
		sb.append(", edukiera=");
		sb.append(getEdukiera());
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
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("net.sareweb.txotx.model.Sagardotegi");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sagardotegiId</column-name><column-value><![CDATA[");
		sb.append(getSagardotegiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>izena</column-name><column-value><![CDATA[");
		sb.append(getIzena());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>herria</column-name><column-value><![CDATA[");
		sb.append(getHerria());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>helbidea</column-name><column-value><![CDATA[");
		sb.append(getHelbidea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telefonoa</column-name><column-value><![CDATA[");
		sb.append(getTelefonoa());
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
			"<column><column-name>lat</column-name><column-value><![CDATA[");
		sb.append(getLat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lng</column-name><column-value><![CDATA[");
		sb.append(getLng());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>edukiera</column-name><column-value><![CDATA[");
		sb.append(getEdukiera());
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

		sb.append("</model>");

		return sb.toString();
	}

	private long _sagardotegiId;
	private String _izena;
	private String _herria;
	private String _helbidea;
	private String _telefonoa;
	private String _emaila;
	private String _twitter;
	private String _weborria;
	private double _lat;
	private double _lng;
	private long _edukiera;
	private long _irudiKarpetaId;
	private String _irudia;
	private long _irudiKopurua;
	private long _iruzkinKopurua;
	private long _balorazioKopurua;
	private double _balorazioenBB;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _sagardotegiRemoteModel;
}