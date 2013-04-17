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
 * This class is a wrapper for {@link Gertaera}.
 * </p>
 *
 * @author    A.Galdos
 * @see       Gertaera
 * @generated
 */
public class GertaeraWrapper implements Gertaera, ModelWrapper<Gertaera> {
	public GertaeraWrapper(Gertaera gertaera) {
		_gertaera = gertaera;
	}

	public Class<?> getModelClass() {
		return Gertaera.class;
	}

	public String getModelClassName() {
		return Gertaera.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("gertaeraId", getGertaeraId());
		attributes.put("sagardotegiId", getSagardotegiId());
		attributes.put("sagardoEgunId", getSagardoEgunId());
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

	public void setModelAttributes(Map<String, Object> attributes) {
		Long gertaeraId = (Long)attributes.get("gertaeraId");

		if (gertaeraId != null) {
			setGertaeraId(gertaeraId);
		}

		Long sagardotegiId = (Long)attributes.get("sagardotegiId");

		if (sagardotegiId != null) {
			setSagardotegiId(sagardotegiId);
		}

		Long sagardoEgunId = (Long)attributes.get("sagardoEgunId");

		if (sagardoEgunId != null) {
			setSagardoEgunId(sagardoEgunId);
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

	/**
	* Returns the primary key of this gertaera.
	*
	* @return the primary key of this gertaera
	*/
	public long getPrimaryKey() {
		return _gertaera.getPrimaryKey();
	}

	/**
	* Sets the primary key of this gertaera.
	*
	* @param primaryKey the primary key of this gertaera
	*/
	public void setPrimaryKey(long primaryKey) {
		_gertaera.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the gertaera ID of this gertaera.
	*
	* @return the gertaera ID of this gertaera
	*/
	public long getGertaeraId() {
		return _gertaera.getGertaeraId();
	}

	/**
	* Sets the gertaera ID of this gertaera.
	*
	* @param gertaeraId the gertaera ID of this gertaera
	*/
	public void setGertaeraId(long gertaeraId) {
		_gertaera.setGertaeraId(gertaeraId);
	}

	/**
	* Returns the sagardotegi ID of this gertaera.
	*
	* @return the sagardotegi ID of this gertaera
	*/
	public long getSagardotegiId() {
		return _gertaera.getSagardotegiId();
	}

	/**
	* Sets the sagardotegi ID of this gertaera.
	*
	* @param sagardotegiId the sagardotegi ID of this gertaera
	*/
	public void setSagardotegiId(long sagardotegiId) {
		_gertaera.setSagardotegiId(sagardotegiId);
	}

	/**
	* Returns the sagardo egun ID of this gertaera.
	*
	* @return the sagardo egun ID of this gertaera
	*/
	public long getSagardoEgunId() {
		return _gertaera.getSagardoEgunId();
	}

	/**
	* Sets the sagardo egun ID of this gertaera.
	*
	* @param sagardoEgunId the sagardo egun ID of this gertaera
	*/
	public void setSagardoEgunId(long sagardoEgunId) {
		_gertaera.setSagardoEgunId(sagardoEgunId);
	}

	/**
	* Returns the user ID of this gertaera.
	*
	* @return the user ID of this gertaera
	*/
	public long getUserId() {
		return _gertaera.getUserId();
	}

	/**
	* Sets the user ID of this gertaera.
	*
	* @param userId the user ID of this gertaera
	*/
	public void setUserId(long userId) {
		_gertaera.setUserId(userId);
	}

	/**
	* Returns the user uuid of this gertaera.
	*
	* @return the user uuid of this gertaera
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gertaera.getUserUuid();
	}

	/**
	* Sets the user uuid of this gertaera.
	*
	* @param userUuid the user uuid of this gertaera
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_gertaera.setUserUuid(userUuid);
	}

	/**
	* Returns the screen name of this gertaera.
	*
	* @return the screen name of this gertaera
	*/
	public java.lang.String getScreenName() {
		return _gertaera.getScreenName();
	}

	/**
	* Sets the screen name of this gertaera.
	*
	* @param screenName the screen name of this gertaera
	*/
	public void setScreenName(java.lang.String screenName) {
		_gertaera.setScreenName(screenName);
	}

	/**
	* Returns the gertaera mota of this gertaera.
	*
	* @return the gertaera mota of this gertaera
	*/
	public java.lang.String getGertaeraMota() {
		return _gertaera.getGertaeraMota();
	}

	/**
	* Sets the gertaera mota of this gertaera.
	*
	* @param gertaeraMota the gertaera mota of this gertaera
	*/
	public void setGertaeraMota(java.lang.String gertaeraMota) {
		_gertaera.setGertaeraMota(gertaeraMota);
	}

	/**
	* Returns the testua of this gertaera.
	*
	* @return the testua of this gertaera
	*/
	public java.lang.String getTestua() {
		return _gertaera.getTestua();
	}

	/**
	* Sets the testua of this gertaera.
	*
	* @param testua the testua of this gertaera
	*/
	public void setTestua(java.lang.String testua) {
		_gertaera.setTestua(testua);
	}

	/**
	* Returns the irudi karpeta ID of this gertaera.
	*
	* @return the irudi karpeta ID of this gertaera
	*/
	public long getIrudiKarpetaId() {
		return _gertaera.getIrudiKarpetaId();
	}

	/**
	* Sets the irudi karpeta ID of this gertaera.
	*
	* @param irudiKarpetaId the irudi karpeta ID of this gertaera
	*/
	public void setIrudiKarpetaId(long irudiKarpetaId) {
		_gertaera.setIrudiKarpetaId(irudiKarpetaId);
	}

	/**
	* Returns the irudia of this gertaera.
	*
	* @return the irudia of this gertaera
	*/
	public java.lang.String getIrudia() {
		return _gertaera.getIrudia();
	}

	/**
	* Sets the irudia of this gertaera.
	*
	* @param irudia the irudia of this gertaera
	*/
	public void setIrudia(java.lang.String irudia) {
		_gertaera.setIrudia(irudia);
	}

	/**
	* Returns the balorazioa of this gertaera.
	*
	* @return the balorazioa of this gertaera
	*/
	public long getBalorazioa() {
		return _gertaera.getBalorazioa();
	}

	/**
	* Sets the balorazioa of this gertaera.
	*
	* @param balorazioa the balorazioa of this gertaera
	*/
	public void setBalorazioa(long balorazioa) {
		_gertaera.setBalorazioa(balorazioa);
	}

	/**
	* Returns the create date of this gertaera.
	*
	* @return the create date of this gertaera
	*/
	public java.util.Date getCreateDate() {
		return _gertaera.getCreateDate();
	}

	/**
	* Sets the create date of this gertaera.
	*
	* @param createDate the create date of this gertaera
	*/
	public void setCreateDate(java.util.Date createDate) {
		_gertaera.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this gertaera.
	*
	* @return the modified date of this gertaera
	*/
	public java.util.Date getModifiedDate() {
		return _gertaera.getModifiedDate();
	}

	/**
	* Sets the modified date of this gertaera.
	*
	* @param modifiedDate the modified date of this gertaera
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_gertaera.setModifiedDate(modifiedDate);
	}

	public boolean isNew() {
		return _gertaera.isNew();
	}

	public void setNew(boolean n) {
		_gertaera.setNew(n);
	}

	public boolean isCachedModel() {
		return _gertaera.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_gertaera.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _gertaera.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _gertaera.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_gertaera.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _gertaera.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_gertaera.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new GertaeraWrapper((Gertaera)_gertaera.clone());
	}

	public int compareTo(net.sareweb.txotx.model.Gertaera gertaera) {
		return _gertaera.compareTo(gertaera);
	}

	@Override
	public int hashCode() {
		return _gertaera.hashCode();
	}

	public com.liferay.portal.model.CacheModel<net.sareweb.txotx.model.Gertaera> toCacheModel() {
		return _gertaera.toCacheModel();
	}

	public net.sareweb.txotx.model.Gertaera toEscapedModel() {
		return new GertaeraWrapper(_gertaera.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _gertaera.toString();
	}

	public java.lang.String toXmlString() {
		return _gertaera.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_gertaera.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Gertaera getWrappedGertaera() {
		return _gertaera;
	}

	public Gertaera getWrappedModel() {
		return _gertaera;
	}

	public void resetOriginalValues() {
		_gertaera.resetOriginalValues();
	}

	private Gertaera _gertaera;
}