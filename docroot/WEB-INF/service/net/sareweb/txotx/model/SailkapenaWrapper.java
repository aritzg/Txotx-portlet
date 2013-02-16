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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Sailkapena}.
 * </p>
 *
 * @author    A.Galdos
 * @see       Sailkapena
 * @generated
 */
public class SailkapenaWrapper implements Sailkapena, ModelWrapper<Sailkapena> {
	public SailkapenaWrapper(Sailkapena sailkapena) {
		_sailkapena = sailkapena;
	}

	public Class<?> getModelClass() {
		return Sailkapena.class;
	}

	public String getModelClassName() {
		return Sailkapena.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sailkapenaId", getSailkapenaId());
		attributes.put("userId", getUserId());
		attributes.put("screenName", getScreenName());
		attributes.put("iruzkinKopurua", getIruzkinKopurua());
		attributes.put("balorazioKopurua", getBalorazioKopurua());
		attributes.put("argazkiKopurua", getArgazkiKopurua());
		attributes.put("gertaeraKopurua", getGertaeraKopurua());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long sailkapenaId = (Long)attributes.get("sailkapenaId");

		if (sailkapenaId != null) {
			setSailkapenaId(sailkapenaId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String screenName = (String)attributes.get("screenName");

		if (screenName != null) {
			setScreenName(screenName);
		}

		Long iruzkinKopurua = (Long)attributes.get("iruzkinKopurua");

		if (iruzkinKopurua != null) {
			setIruzkinKopurua(iruzkinKopurua);
		}

		Long balorazioKopurua = (Long)attributes.get("balorazioKopurua");

		if (balorazioKopurua != null) {
			setBalorazioKopurua(balorazioKopurua);
		}

		Long argazkiKopurua = (Long)attributes.get("argazkiKopurua");

		if (argazkiKopurua != null) {
			setArgazkiKopurua(argazkiKopurua);
		}

		Long gertaeraKopurua = (Long)attributes.get("gertaeraKopurua");

		if (gertaeraKopurua != null) {
			setGertaeraKopurua(gertaeraKopurua);
		}
	}

	/**
	* Returns the primary key of this sailkapena.
	*
	* @return the primary key of this sailkapena
	*/
	public long getPrimaryKey() {
		return _sailkapena.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sailkapena.
	*
	* @param primaryKey the primary key of this sailkapena
	*/
	public void setPrimaryKey(long primaryKey) {
		_sailkapena.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the sailkapena ID of this sailkapena.
	*
	* @return the sailkapena ID of this sailkapena
	*/
	public long getSailkapenaId() {
		return _sailkapena.getSailkapenaId();
	}

	/**
	* Sets the sailkapena ID of this sailkapena.
	*
	* @param sailkapenaId the sailkapena ID of this sailkapena
	*/
	public void setSailkapenaId(long sailkapenaId) {
		_sailkapena.setSailkapenaId(sailkapenaId);
	}

	/**
	* Returns the user ID of this sailkapena.
	*
	* @return the user ID of this sailkapena
	*/
	public long getUserId() {
		return _sailkapena.getUserId();
	}

	/**
	* Sets the user ID of this sailkapena.
	*
	* @param userId the user ID of this sailkapena
	*/
	public void setUserId(long userId) {
		_sailkapena.setUserId(userId);
	}

	/**
	* Returns the user uuid of this sailkapena.
	*
	* @return the user uuid of this sailkapena
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sailkapena.getUserUuid();
	}

	/**
	* Sets the user uuid of this sailkapena.
	*
	* @param userUuid the user uuid of this sailkapena
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_sailkapena.setUserUuid(userUuid);
	}

	/**
	* Returns the screen name of this sailkapena.
	*
	* @return the screen name of this sailkapena
	*/
	public java.lang.String getScreenName() {
		return _sailkapena.getScreenName();
	}

	/**
	* Sets the screen name of this sailkapena.
	*
	* @param screenName the screen name of this sailkapena
	*/
	public void setScreenName(java.lang.String screenName) {
		_sailkapena.setScreenName(screenName);
	}

	/**
	* Returns the iruzkin kopurua of this sailkapena.
	*
	* @return the iruzkin kopurua of this sailkapena
	*/
	public long getIruzkinKopurua() {
		return _sailkapena.getIruzkinKopurua();
	}

	/**
	* Sets the iruzkin kopurua of this sailkapena.
	*
	* @param iruzkinKopurua the iruzkin kopurua of this sailkapena
	*/
	public void setIruzkinKopurua(long iruzkinKopurua) {
		_sailkapena.setIruzkinKopurua(iruzkinKopurua);
	}

	/**
	* Returns the balorazio kopurua of this sailkapena.
	*
	* @return the balorazio kopurua of this sailkapena
	*/
	public long getBalorazioKopurua() {
		return _sailkapena.getBalorazioKopurua();
	}

	/**
	* Sets the balorazio kopurua of this sailkapena.
	*
	* @param balorazioKopurua the balorazio kopurua of this sailkapena
	*/
	public void setBalorazioKopurua(long balorazioKopurua) {
		_sailkapena.setBalorazioKopurua(balorazioKopurua);
	}

	/**
	* Returns the argazki kopurua of this sailkapena.
	*
	* @return the argazki kopurua of this sailkapena
	*/
	public long getArgazkiKopurua() {
		return _sailkapena.getArgazkiKopurua();
	}

	/**
	* Sets the argazki kopurua of this sailkapena.
	*
	* @param argazkiKopurua the argazki kopurua of this sailkapena
	*/
	public void setArgazkiKopurua(long argazkiKopurua) {
		_sailkapena.setArgazkiKopurua(argazkiKopurua);
	}

	/**
	* Returns the gertaera kopurua of this sailkapena.
	*
	* @return the gertaera kopurua of this sailkapena
	*/
	public long getGertaeraKopurua() {
		return _sailkapena.getGertaeraKopurua();
	}

	/**
	* Sets the gertaera kopurua of this sailkapena.
	*
	* @param gertaeraKopurua the gertaera kopurua of this sailkapena
	*/
	public void setGertaeraKopurua(long gertaeraKopurua) {
		_sailkapena.setGertaeraKopurua(gertaeraKopurua);
	}

	public boolean isNew() {
		return _sailkapena.isNew();
	}

	public void setNew(boolean n) {
		_sailkapena.setNew(n);
	}

	public boolean isCachedModel() {
		return _sailkapena.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_sailkapena.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _sailkapena.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _sailkapena.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sailkapena.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sailkapena.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sailkapena.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SailkapenaWrapper((Sailkapena)_sailkapena.clone());
	}

	public int compareTo(net.sareweb.txotx.model.Sailkapena sailkapena) {
		return _sailkapena.compareTo(sailkapena);
	}

	@Override
	public int hashCode() {
		return _sailkapena.hashCode();
	}

	public com.liferay.portal.model.CacheModel<net.sareweb.txotx.model.Sailkapena> toCacheModel() {
		return _sailkapena.toCacheModel();
	}

	public net.sareweb.txotx.model.Sailkapena toEscapedModel() {
		return new SailkapenaWrapper(_sailkapena.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sailkapena.toString();
	}

	public java.lang.String toXmlString() {
		return _sailkapena.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sailkapena.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Sailkapena getWrappedSailkapena() {
		return _sailkapena;
	}

	public Sailkapena getWrappedModel() {
		return _sailkapena;
	}

	public void resetOriginalValues() {
		_sailkapena.resetOriginalValues();
	}

	private Sailkapena _sailkapena;
}