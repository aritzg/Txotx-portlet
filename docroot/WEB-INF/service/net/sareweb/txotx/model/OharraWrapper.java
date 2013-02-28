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
 * This class is a wrapper for {@link Oharra}.
 * </p>
 *
 * @author    A.Galdos
 * @see       Oharra
 * @generated
 */
public class OharraWrapper implements Oharra, ModelWrapper<Oharra> {
	public OharraWrapper(Oharra oharra) {
		_oharra = oharra;
	}

	public Class<?> getModelClass() {
		return Oharra.class;
	}

	public String getModelClassName() {
		return Oharra.class.getName();
	}

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

	/**
	* Returns the primary key of this oharra.
	*
	* @return the primary key of this oharra
	*/
	public long getPrimaryKey() {
		return _oharra.getPrimaryKey();
	}

	/**
	* Sets the primary key of this oharra.
	*
	* @param primaryKey the primary key of this oharra
	*/
	public void setPrimaryKey(long primaryKey) {
		_oharra.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the oharra ID of this oharra.
	*
	* @return the oharra ID of this oharra
	*/
	public long getOharraId() {
		return _oharra.getOharraId();
	}

	/**
	* Sets the oharra ID of this oharra.
	*
	* @param oharraId the oharra ID of this oharra
	*/
	public void setOharraId(long oharraId) {
		_oharra.setOharraId(oharraId);
	}

	/**
	* Returns the ohar mota of this oharra.
	*
	* @return the ohar mota of this oharra
	*/
	public java.lang.String getOharMota() {
		return _oharra.getOharMota();
	}

	/**
	* Sets the ohar mota of this oharra.
	*
	* @param oharMota the ohar mota of this oharra
	*/
	public void setOharMota(java.lang.String oharMota) {
		_oharra.setOharMota(oharMota);
	}

	/**
	* Returns the irudi karpeta ID of this oharra.
	*
	* @return the irudi karpeta ID of this oharra
	*/
	public long getIrudiKarpetaId() {
		return _oharra.getIrudiKarpetaId();
	}

	/**
	* Sets the irudi karpeta ID of this oharra.
	*
	* @param irudiKarpetaId the irudi karpeta ID of this oharra
	*/
	public void setIrudiKarpetaId(long irudiKarpetaId) {
		_oharra.setIrudiKarpetaId(irudiKarpetaId);
	}

	/**
	* Returns the irudia of this oharra.
	*
	* @return the irudia of this oharra
	*/
	public java.lang.String getIrudia() {
		return _oharra.getIrudia();
	}

	/**
	* Sets the irudia of this oharra.
	*
	* @param irudia the irudia of this oharra
	*/
	public void setIrudia(java.lang.String irudia) {
		_oharra.setIrudia(irudia);
	}

	/**
	* Returns the izenburua of this oharra.
	*
	* @return the izenburua of this oharra
	*/
	public java.lang.String getIzenburua() {
		return _oharra.getIzenburua();
	}

	/**
	* Sets the izenburua of this oharra.
	*
	* @param izenburua the izenburua of this oharra
	*/
	public void setIzenburua(java.lang.String izenburua) {
		_oharra.setIzenburua(izenburua);
	}

	/**
	* Returns the testua of this oharra.
	*
	* @return the testua of this oharra
	*/
	public java.lang.String getTestua() {
		return _oharra.getTestua();
	}

	/**
	* Sets the testua of this oharra.
	*
	* @param testua the testua of this oharra
	*/
	public void setTestua(java.lang.String testua) {
		_oharra.setTestua(testua);
	}

	/**
	* Returns the esteka of this oharra.
	*
	* @return the esteka of this oharra
	*/
	public java.lang.String getEsteka() {
		return _oharra.getEsteka();
	}

	/**
	* Sets the esteka of this oharra.
	*
	* @param esteka the esteka of this oharra
	*/
	public void setEsteka(java.lang.String esteka) {
		_oharra.setEsteka(esteka);
	}

	/**
	* Returns the esteka testua of this oharra.
	*
	* @return the esteka testua of this oharra
	*/
	public java.lang.String getEstekaTestua() {
		return _oharra.getEstekaTestua();
	}

	/**
	* Sets the esteka testua of this oharra.
	*
	* @param estekaTestua the esteka testua of this oharra
	*/
	public void setEstekaTestua(java.lang.String estekaTestua) {
		_oharra.setEstekaTestua(estekaTestua);
	}

	/**
	* Returns the create date of this oharra.
	*
	* @return the create date of this oharra
	*/
	public java.util.Date getCreateDate() {
		return _oharra.getCreateDate();
	}

	/**
	* Sets the create date of this oharra.
	*
	* @param createDate the create date of this oharra
	*/
	public void setCreateDate(java.util.Date createDate) {
		_oharra.setCreateDate(createDate);
	}

	public boolean isNew() {
		return _oharra.isNew();
	}

	public void setNew(boolean n) {
		_oharra.setNew(n);
	}

	public boolean isCachedModel() {
		return _oharra.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_oharra.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _oharra.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _oharra.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_oharra.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _oharra.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oharra.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OharraWrapper((Oharra)_oharra.clone());
	}

	public int compareTo(net.sareweb.txotx.model.Oharra oharra) {
		return _oharra.compareTo(oharra);
	}

	@Override
	public int hashCode() {
		return _oharra.hashCode();
	}

	public com.liferay.portal.model.CacheModel<net.sareweb.txotx.model.Oharra> toCacheModel() {
		return _oharra.toCacheModel();
	}

	public net.sareweb.txotx.model.Oharra toEscapedModel() {
		return new OharraWrapper(_oharra.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _oharra.toString();
	}

	public java.lang.String toXmlString() {
		return _oharra.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_oharra.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Oharra getWrappedOharra() {
		return _oharra;
	}

	public Oharra getWrappedModel() {
		return _oharra;
	}

	public void resetOriginalValues() {
		_oharra.resetOriginalValues();
	}

	private Oharra _oharra;
}