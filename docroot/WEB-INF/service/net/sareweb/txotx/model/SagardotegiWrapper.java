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
 * This class is a wrapper for {@link Sagardotegi}.
 * </p>
 *
 * @author    A.Galdos
 * @see       Sagardotegi
 * @generated
 */
public class SagardotegiWrapper implements Sagardotegi,
	ModelWrapper<Sagardotegi> {
	public SagardotegiWrapper(Sagardotegi sagardotegi) {
		_sagardotegi = sagardotegi;
	}

	public Class<?> getModelClass() {
		return Sagardotegi.class;
	}

	public String getModelClassName() {
		return Sagardotegi.class.getName();
	}

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

	/**
	* Returns the primary key of this sagardotegi.
	*
	* @return the primary key of this sagardotegi
	*/
	public long getPrimaryKey() {
		return _sagardotegi.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sagardotegi.
	*
	* @param primaryKey the primary key of this sagardotegi
	*/
	public void setPrimaryKey(long primaryKey) {
		_sagardotegi.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the sagardotegi ID of this sagardotegi.
	*
	* @return the sagardotegi ID of this sagardotegi
	*/
	public long getSagardotegiId() {
		return _sagardotegi.getSagardotegiId();
	}

	/**
	* Sets the sagardotegi ID of this sagardotegi.
	*
	* @param sagardotegiId the sagardotegi ID of this sagardotegi
	*/
	public void setSagardotegiId(long sagardotegiId) {
		_sagardotegi.setSagardotegiId(sagardotegiId);
	}

	/**
	* Returns the izena of this sagardotegi.
	*
	* @return the izena of this sagardotegi
	*/
	public java.lang.String getIzena() {
		return _sagardotegi.getIzena();
	}

	/**
	* Sets the izena of this sagardotegi.
	*
	* @param izena the izena of this sagardotegi
	*/
	public void setIzena(java.lang.String izena) {
		_sagardotegi.setIzena(izena);
	}

	/**
	* Returns the herria of this sagardotegi.
	*
	* @return the herria of this sagardotegi
	*/
	public java.lang.String getHerria() {
		return _sagardotegi.getHerria();
	}

	/**
	* Sets the herria of this sagardotegi.
	*
	* @param herria the herria of this sagardotegi
	*/
	public void setHerria(java.lang.String herria) {
		_sagardotegi.setHerria(herria);
	}

	/**
	* Returns the helbidea of this sagardotegi.
	*
	* @return the helbidea of this sagardotegi
	*/
	public java.lang.String getHelbidea() {
		return _sagardotegi.getHelbidea();
	}

	/**
	* Sets the helbidea of this sagardotegi.
	*
	* @param helbidea the helbidea of this sagardotegi
	*/
	public void setHelbidea(java.lang.String helbidea) {
		_sagardotegi.setHelbidea(helbidea);
	}

	/**
	* Returns the telefonoa of this sagardotegi.
	*
	* @return the telefonoa of this sagardotegi
	*/
	public java.lang.String getTelefonoa() {
		return _sagardotegi.getTelefonoa();
	}

	/**
	* Sets the telefonoa of this sagardotegi.
	*
	* @param telefonoa the telefonoa of this sagardotegi
	*/
	public void setTelefonoa(java.lang.String telefonoa) {
		_sagardotegi.setTelefonoa(telefonoa);
	}

	/**
	* Returns the emaila of this sagardotegi.
	*
	* @return the emaila of this sagardotegi
	*/
	public java.lang.String getEmaila() {
		return _sagardotegi.getEmaila();
	}

	/**
	* Sets the emaila of this sagardotegi.
	*
	* @param emaila the emaila of this sagardotegi
	*/
	public void setEmaila(java.lang.String emaila) {
		_sagardotegi.setEmaila(emaila);
	}

	/**
	* Returns the twitter of this sagardotegi.
	*
	* @return the twitter of this sagardotegi
	*/
	public java.lang.String getTwitter() {
		return _sagardotegi.getTwitter();
	}

	/**
	* Sets the twitter of this sagardotegi.
	*
	* @param twitter the twitter of this sagardotegi
	*/
	public void setTwitter(java.lang.String twitter) {
		_sagardotegi.setTwitter(twitter);
	}

	/**
	* Returns the weborria of this sagardotegi.
	*
	* @return the weborria of this sagardotegi
	*/
	public java.lang.String getWeborria() {
		return _sagardotegi.getWeborria();
	}

	/**
	* Sets the weborria of this sagardotegi.
	*
	* @param weborria the weborria of this sagardotegi
	*/
	public void setWeborria(java.lang.String weborria) {
		_sagardotegi.setWeborria(weborria);
	}

	/**
	* Returns the lat of this sagardotegi.
	*
	* @return the lat of this sagardotegi
	*/
	public double getLat() {
		return _sagardotegi.getLat();
	}

	/**
	* Sets the lat of this sagardotegi.
	*
	* @param lat the lat of this sagardotegi
	*/
	public void setLat(double lat) {
		_sagardotegi.setLat(lat);
	}

	/**
	* Returns the lng of this sagardotegi.
	*
	* @return the lng of this sagardotegi
	*/
	public double getLng() {
		return _sagardotegi.getLng();
	}

	/**
	* Sets the lng of this sagardotegi.
	*
	* @param lng the lng of this sagardotegi
	*/
	public void setLng(double lng) {
		_sagardotegi.setLng(lng);
	}

	/**
	* Returns the edukiera of this sagardotegi.
	*
	* @return the edukiera of this sagardotegi
	*/
	public long getEdukiera() {
		return _sagardotegi.getEdukiera();
	}

	/**
	* Sets the edukiera of this sagardotegi.
	*
	* @param edukiera the edukiera of this sagardotegi
	*/
	public void setEdukiera(long edukiera) {
		_sagardotegi.setEdukiera(edukiera);
	}

	/**
	* Returns the irudi karpeta ID of this sagardotegi.
	*
	* @return the irudi karpeta ID of this sagardotegi
	*/
	public long getIrudiKarpetaId() {
		return _sagardotegi.getIrudiKarpetaId();
	}

	/**
	* Sets the irudi karpeta ID of this sagardotegi.
	*
	* @param irudiKarpetaId the irudi karpeta ID of this sagardotegi
	*/
	public void setIrudiKarpetaId(long irudiKarpetaId) {
		_sagardotegi.setIrudiKarpetaId(irudiKarpetaId);
	}

	/**
	* Returns the irudia of this sagardotegi.
	*
	* @return the irudia of this sagardotegi
	*/
	public java.lang.String getIrudia() {
		return _sagardotegi.getIrudia();
	}

	/**
	* Sets the irudia of this sagardotegi.
	*
	* @param irudia the irudia of this sagardotegi
	*/
	public void setIrudia(java.lang.String irudia) {
		_sagardotegi.setIrudia(irudia);
	}

	/**
	* Returns the irudi kopurua of this sagardotegi.
	*
	* @return the irudi kopurua of this sagardotegi
	*/
	public long getIrudiKopurua() {
		return _sagardotegi.getIrudiKopurua();
	}

	/**
	* Sets the irudi kopurua of this sagardotegi.
	*
	* @param irudiKopurua the irudi kopurua of this sagardotegi
	*/
	public void setIrudiKopurua(long irudiKopurua) {
		_sagardotegi.setIrudiKopurua(irudiKopurua);
	}

	/**
	* Returns the iruzkin kopurua of this sagardotegi.
	*
	* @return the iruzkin kopurua of this sagardotegi
	*/
	public long getIruzkinKopurua() {
		return _sagardotegi.getIruzkinKopurua();
	}

	/**
	* Sets the iruzkin kopurua of this sagardotegi.
	*
	* @param iruzkinKopurua the iruzkin kopurua of this sagardotegi
	*/
	public void setIruzkinKopurua(long iruzkinKopurua) {
		_sagardotegi.setIruzkinKopurua(iruzkinKopurua);
	}

	/**
	* Returns the balorazio kopurua of this sagardotegi.
	*
	* @return the balorazio kopurua of this sagardotegi
	*/
	public long getBalorazioKopurua() {
		return _sagardotegi.getBalorazioKopurua();
	}

	/**
	* Sets the balorazio kopurua of this sagardotegi.
	*
	* @param balorazioKopurua the balorazio kopurua of this sagardotegi
	*/
	public void setBalorazioKopurua(long balorazioKopurua) {
		_sagardotegi.setBalorazioKopurua(balorazioKopurua);
	}

	/**
	* Returns the balorazioen b b of this sagardotegi.
	*
	* @return the balorazioen b b of this sagardotegi
	*/
	public double getBalorazioenBB() {
		return _sagardotegi.getBalorazioenBB();
	}

	/**
	* Sets the balorazioen b b of this sagardotegi.
	*
	* @param balorazioenBB the balorazioen b b of this sagardotegi
	*/
	public void setBalorazioenBB(double balorazioenBB) {
		_sagardotegi.setBalorazioenBB(balorazioenBB);
	}

	/**
	* Returns the create date of this sagardotegi.
	*
	* @return the create date of this sagardotegi
	*/
	public java.util.Date getCreateDate() {
		return _sagardotegi.getCreateDate();
	}

	/**
	* Sets the create date of this sagardotegi.
	*
	* @param createDate the create date of this sagardotegi
	*/
	public void setCreateDate(java.util.Date createDate) {
		_sagardotegi.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this sagardotegi.
	*
	* @return the modified date of this sagardotegi
	*/
	public java.util.Date getModifiedDate() {
		return _sagardotegi.getModifiedDate();
	}

	/**
	* Sets the modified date of this sagardotegi.
	*
	* @param modifiedDate the modified date of this sagardotegi
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_sagardotegi.setModifiedDate(modifiedDate);
	}

	public boolean isNew() {
		return _sagardotegi.isNew();
	}

	public void setNew(boolean n) {
		_sagardotegi.setNew(n);
	}

	public boolean isCachedModel() {
		return _sagardotegi.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_sagardotegi.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _sagardotegi.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _sagardotegi.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sagardotegi.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sagardotegi.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sagardotegi.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SagardotegiWrapper((Sagardotegi)_sagardotegi.clone());
	}

	public int compareTo(net.sareweb.txotx.model.Sagardotegi sagardotegi) {
		return _sagardotegi.compareTo(sagardotegi);
	}

	@Override
	public int hashCode() {
		return _sagardotegi.hashCode();
	}

	public com.liferay.portal.model.CacheModel<net.sareweb.txotx.model.Sagardotegi> toCacheModel() {
		return _sagardotegi.toCacheModel();
	}

	public net.sareweb.txotx.model.Sagardotegi toEscapedModel() {
		return new SagardotegiWrapper(_sagardotegi.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sagardotegi.toString();
	}

	public java.lang.String toXmlString() {
		return _sagardotegi.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sagardotegi.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Sagardotegi getWrappedSagardotegi() {
		return _sagardotegi;
	}

	public Sagardotegi getWrappedModel() {
		return _sagardotegi;
	}

	public void resetOriginalValues() {
		_sagardotegi.resetOriginalValues();
	}

	private Sagardotegi _sagardotegi;
}