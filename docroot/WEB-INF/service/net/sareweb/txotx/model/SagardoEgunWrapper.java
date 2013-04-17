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
 * This class is a wrapper for {@link SagardoEgun}.
 * </p>
 *
 * @author    A.Galdos
 * @see       SagardoEgun
 * @generated
 */
public class SagardoEgunWrapper implements SagardoEgun,
	ModelWrapper<SagardoEgun> {
	public SagardoEgunWrapper(SagardoEgun sagardoEgun) {
		_sagardoEgun = sagardoEgun;
	}

	public Class<?> getModelClass() {
		return SagardoEgun.class;
	}

	public String getModelClassName() {
		return SagardoEgun.class.getName();
	}

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

	/**
	* Returns the primary key of this sagardo egun.
	*
	* @return the primary key of this sagardo egun
	*/
	public long getPrimaryKey() {
		return _sagardoEgun.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sagardo egun.
	*
	* @param primaryKey the primary key of this sagardo egun
	*/
	public void setPrimaryKey(long primaryKey) {
		_sagardoEgun.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the sagardo egun ID of this sagardo egun.
	*
	* @return the sagardo egun ID of this sagardo egun
	*/
	public long getSagardoEgunId() {
		return _sagardoEgun.getSagardoEgunId();
	}

	/**
	* Sets the sagardo egun ID of this sagardo egun.
	*
	* @param sagardoEgunId the sagardo egun ID of this sagardo egun
	*/
	public void setSagardoEgunId(long sagardoEgunId) {
		_sagardoEgun.setSagardoEgunId(sagardoEgunId);
	}

	/**
	* Returns the izena of this sagardo egun.
	*
	* @return the izena of this sagardo egun
	*/
	public java.lang.String getIzena() {
		return _sagardoEgun.getIzena();
	}

	/**
	* Sets the izena of this sagardo egun.
	*
	* @param izena the izena of this sagardo egun
	*/
	public void setIzena(java.lang.String izena) {
		_sagardoEgun.setIzena(izena);
	}

	/**
	* Returns the edizioa of this sagardo egun.
	*
	* @return the edizioa of this sagardo egun
	*/
	public long getEdizioa() {
		return _sagardoEgun.getEdizioa();
	}

	/**
	* Sets the edizioa of this sagardo egun.
	*
	* @param edizioa the edizioa of this sagardo egun
	*/
	public void setEdizioa(long edizioa) {
		_sagardoEgun.setEdizioa(edizioa);
	}

	/**
	* Returns the herria of this sagardo egun.
	*
	* @return the herria of this sagardo egun
	*/
	public java.lang.String getHerria() {
		return _sagardoEgun.getHerria();
	}

	/**
	* Sets the herria of this sagardo egun.
	*
	* @param herria the herria of this sagardo egun
	*/
	public void setHerria(java.lang.String herria) {
		_sagardoEgun.setHerria(herria);
	}

	/**
	* Returns the lekua of this sagardo egun.
	*
	* @return the lekua of this sagardo egun
	*/
	public java.lang.String getLekua() {
		return _sagardoEgun.getLekua();
	}

	/**
	* Sets the lekua of this sagardo egun.
	*
	* @param lekua the lekua of this sagardo egun
	*/
	public void setLekua(java.lang.String lekua) {
		_sagardoEgun.setLekua(lekua);
	}

	/**
	* Returns the emaila of this sagardo egun.
	*
	* @return the emaila of this sagardo egun
	*/
	public java.lang.String getEmaila() {
		return _sagardoEgun.getEmaila();
	}

	/**
	* Sets the emaila of this sagardo egun.
	*
	* @param emaila the emaila of this sagardo egun
	*/
	public void setEmaila(java.lang.String emaila) {
		_sagardoEgun.setEmaila(emaila);
	}

	/**
	* Returns the twitter of this sagardo egun.
	*
	* @return the twitter of this sagardo egun
	*/
	public java.lang.String getTwitter() {
		return _sagardoEgun.getTwitter();
	}

	/**
	* Sets the twitter of this sagardo egun.
	*
	* @param twitter the twitter of this sagardo egun
	*/
	public void setTwitter(java.lang.String twitter) {
		_sagardoEgun.setTwitter(twitter);
	}

	/**
	* Returns the weborria of this sagardo egun.
	*
	* @return the weborria of this sagardo egun
	*/
	public java.lang.String getWeborria() {
		return _sagardoEgun.getWeborria();
	}

	/**
	* Sets the weborria of this sagardo egun.
	*
	* @param weborria the weborria of this sagardo egun
	*/
	public void setWeborria(java.lang.String weborria) {
		_sagardoEgun.setWeborria(weborria);
	}

	/**
	* Returns the hasiera date of this sagardo egun.
	*
	* @return the hasiera date of this sagardo egun
	*/
	public java.util.Date getHasieraDate() {
		return _sagardoEgun.getHasieraDate();
	}

	/**
	* Sets the hasiera date of this sagardo egun.
	*
	* @param hasieraDate the hasiera date of this sagardo egun
	*/
	public void setHasieraDate(java.util.Date hasieraDate) {
		_sagardoEgun.setHasieraDate(hasieraDate);
	}

	/**
	* Returns the lat of this sagardo egun.
	*
	* @return the lat of this sagardo egun
	*/
	public double getLat() {
		return _sagardoEgun.getLat();
	}

	/**
	* Sets the lat of this sagardo egun.
	*
	* @param lat the lat of this sagardo egun
	*/
	public void setLat(double lat) {
		_sagardoEgun.setLat(lat);
	}

	/**
	* Returns the lng of this sagardo egun.
	*
	* @return the lng of this sagardo egun
	*/
	public double getLng() {
		return _sagardoEgun.getLng();
	}

	/**
	* Sets the lng of this sagardo egun.
	*
	* @param lng the lng of this sagardo egun
	*/
	public void setLng(double lng) {
		_sagardoEgun.setLng(lng);
	}

	/**
	* Returns the irudi karpeta ID of this sagardo egun.
	*
	* @return the irudi karpeta ID of this sagardo egun
	*/
	public long getIrudiKarpetaId() {
		return _sagardoEgun.getIrudiKarpetaId();
	}

	/**
	* Sets the irudi karpeta ID of this sagardo egun.
	*
	* @param irudiKarpetaId the irudi karpeta ID of this sagardo egun
	*/
	public void setIrudiKarpetaId(long irudiKarpetaId) {
		_sagardoEgun.setIrudiKarpetaId(irudiKarpetaId);
	}

	/**
	* Returns the irudia of this sagardo egun.
	*
	* @return the irudia of this sagardo egun
	*/
	public java.lang.String getIrudia() {
		return _sagardoEgun.getIrudia();
	}

	/**
	* Sets the irudia of this sagardo egun.
	*
	* @param irudia the irudia of this sagardo egun
	*/
	public void setIrudia(java.lang.String irudia) {
		_sagardoEgun.setIrudia(irudia);
	}

	/**
	* Returns the irudi kopurua of this sagardo egun.
	*
	* @return the irudi kopurua of this sagardo egun
	*/
	public long getIrudiKopurua() {
		return _sagardoEgun.getIrudiKopurua();
	}

	/**
	* Sets the irudi kopurua of this sagardo egun.
	*
	* @param irudiKopurua the irudi kopurua of this sagardo egun
	*/
	public void setIrudiKopurua(long irudiKopurua) {
		_sagardoEgun.setIrudiKopurua(irudiKopurua);
	}

	/**
	* Returns the iruzkin kopurua of this sagardo egun.
	*
	* @return the iruzkin kopurua of this sagardo egun
	*/
	public long getIruzkinKopurua() {
		return _sagardoEgun.getIruzkinKopurua();
	}

	/**
	* Sets the iruzkin kopurua of this sagardo egun.
	*
	* @param iruzkinKopurua the iruzkin kopurua of this sagardo egun
	*/
	public void setIruzkinKopurua(long iruzkinKopurua) {
		_sagardoEgun.setIruzkinKopurua(iruzkinKopurua);
	}

	/**
	* Returns the balorazio kopurua of this sagardo egun.
	*
	* @return the balorazio kopurua of this sagardo egun
	*/
	public long getBalorazioKopurua() {
		return _sagardoEgun.getBalorazioKopurua();
	}

	/**
	* Sets the balorazio kopurua of this sagardo egun.
	*
	* @param balorazioKopurua the balorazio kopurua of this sagardo egun
	*/
	public void setBalorazioKopurua(long balorazioKopurua) {
		_sagardoEgun.setBalorazioKopurua(balorazioKopurua);
	}

	/**
	* Returns the balorazioen b b of this sagardo egun.
	*
	* @return the balorazioen b b of this sagardo egun
	*/
	public double getBalorazioenBB() {
		return _sagardoEgun.getBalorazioenBB();
	}

	/**
	* Sets the balorazioen b b of this sagardo egun.
	*
	* @param balorazioenBB the balorazioen b b of this sagardo egun
	*/
	public void setBalorazioenBB(double balorazioenBB) {
		_sagardoEgun.setBalorazioenBB(balorazioenBB);
	}

	/**
	* Returns the create date of this sagardo egun.
	*
	* @return the create date of this sagardo egun
	*/
	public java.util.Date getCreateDate() {
		return _sagardoEgun.getCreateDate();
	}

	/**
	* Sets the create date of this sagardo egun.
	*
	* @param createDate the create date of this sagardo egun
	*/
	public void setCreateDate(java.util.Date createDate) {
		_sagardoEgun.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this sagardo egun.
	*
	* @return the modified date of this sagardo egun
	*/
	public java.util.Date getModifiedDate() {
		return _sagardoEgun.getModifiedDate();
	}

	/**
	* Sets the modified date of this sagardo egun.
	*
	* @param modifiedDate the modified date of this sagardo egun
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_sagardoEgun.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the user ID of this sagardo egun.
	*
	* @return the user ID of this sagardo egun
	*/
	public long getUserId() {
		return _sagardoEgun.getUserId();
	}

	/**
	* Sets the user ID of this sagardo egun.
	*
	* @param userId the user ID of this sagardo egun
	*/
	public void setUserId(long userId) {
		_sagardoEgun.setUserId(userId);
	}

	/**
	* Returns the user uuid of this sagardo egun.
	*
	* @return the user uuid of this sagardo egun
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sagardoEgun.getUserUuid();
	}

	/**
	* Sets the user uuid of this sagardo egun.
	*
	* @param userUuid the user uuid of this sagardo egun
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_sagardoEgun.setUserUuid(userUuid);
	}

	public boolean isNew() {
		return _sagardoEgun.isNew();
	}

	public void setNew(boolean n) {
		_sagardoEgun.setNew(n);
	}

	public boolean isCachedModel() {
		return _sagardoEgun.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_sagardoEgun.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _sagardoEgun.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _sagardoEgun.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sagardoEgun.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sagardoEgun.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sagardoEgun.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SagardoEgunWrapper((SagardoEgun)_sagardoEgun.clone());
	}

	public int compareTo(net.sareweb.txotx.model.SagardoEgun sagardoEgun) {
		return _sagardoEgun.compareTo(sagardoEgun);
	}

	@Override
	public int hashCode() {
		return _sagardoEgun.hashCode();
	}

	public com.liferay.portal.model.CacheModel<net.sareweb.txotx.model.SagardoEgun> toCacheModel() {
		return _sagardoEgun.toCacheModel();
	}

	public net.sareweb.txotx.model.SagardoEgun toEscapedModel() {
		return new SagardoEgunWrapper(_sagardoEgun.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sagardoEgun.toString();
	}

	public java.lang.String toXmlString() {
		return _sagardoEgun.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sagardoEgun.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SagardoEgun getWrappedSagardoEgun() {
		return _sagardoEgun;
	}

	public SagardoEgun getWrappedModel() {
		return _sagardoEgun;
	}

	public void resetOriginalValues() {
		_sagardoEgun.resetOriginalValues();
	}

	private SagardoEgun _sagardoEgun;
}