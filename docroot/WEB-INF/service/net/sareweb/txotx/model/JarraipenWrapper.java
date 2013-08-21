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
 * This class is a wrapper for {@link Jarraipen}.
 * </p>
 *
 * @author    A.Galdos
 * @see       Jarraipen
 * @generated
 */
public class JarraipenWrapper implements Jarraipen, ModelWrapper<Jarraipen> {
	public JarraipenWrapper(Jarraipen jarraipen) {
		_jarraipen = jarraipen;
	}

	public Class<?> getModelClass() {
		return Jarraipen.class;
	}

	public String getModelClassName() {
		return Jarraipen.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jarraipenId", getJarraipenId());
		attributes.put("jarraitzaileUserId", getJarraitzaileUserId());
		attributes.put("jarraituaId", getJarraituaId());
		attributes.put("jarraipenMota", getJarraipenMota());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

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

	/**
	* Returns the primary key of this jarraipen.
	*
	* @return the primary key of this jarraipen
	*/
	public long getPrimaryKey() {
		return _jarraipen.getPrimaryKey();
	}

	/**
	* Sets the primary key of this jarraipen.
	*
	* @param primaryKey the primary key of this jarraipen
	*/
	public void setPrimaryKey(long primaryKey) {
		_jarraipen.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the jarraipen ID of this jarraipen.
	*
	* @return the jarraipen ID of this jarraipen
	*/
	public long getJarraipenId() {
		return _jarraipen.getJarraipenId();
	}

	/**
	* Sets the jarraipen ID of this jarraipen.
	*
	* @param jarraipenId the jarraipen ID of this jarraipen
	*/
	public void setJarraipenId(long jarraipenId) {
		_jarraipen.setJarraipenId(jarraipenId);
	}

	/**
	* Returns the jarraitzaile user ID of this jarraipen.
	*
	* @return the jarraitzaile user ID of this jarraipen
	*/
	public long getJarraitzaileUserId() {
		return _jarraipen.getJarraitzaileUserId();
	}

	/**
	* Sets the jarraitzaile user ID of this jarraipen.
	*
	* @param jarraitzaileUserId the jarraitzaile user ID of this jarraipen
	*/
	public void setJarraitzaileUserId(long jarraitzaileUserId) {
		_jarraipen.setJarraitzaileUserId(jarraitzaileUserId);
	}

	/**
	* Returns the jarraitzaile user uuid of this jarraipen.
	*
	* @return the jarraitzaile user uuid of this jarraipen
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getJarraitzaileUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jarraipen.getJarraitzaileUserUuid();
	}

	/**
	* Sets the jarraitzaile user uuid of this jarraipen.
	*
	* @param jarraitzaileUserUuid the jarraitzaile user uuid of this jarraipen
	*/
	public void setJarraitzaileUserUuid(java.lang.String jarraitzaileUserUuid) {
		_jarraipen.setJarraitzaileUserUuid(jarraitzaileUserUuid);
	}

	/**
	* Returns the jarraitua ID of this jarraipen.
	*
	* @return the jarraitua ID of this jarraipen
	*/
	public long getJarraituaId() {
		return _jarraipen.getJarraituaId();
	}

	/**
	* Sets the jarraitua ID of this jarraipen.
	*
	* @param jarraituaId the jarraitua ID of this jarraipen
	*/
	public void setJarraituaId(long jarraituaId) {
		_jarraipen.setJarraituaId(jarraituaId);
	}

	/**
	* Returns the jarraipen mota of this jarraipen.
	*
	* @return the jarraipen mota of this jarraipen
	*/
	public java.lang.String getJarraipenMota() {
		return _jarraipen.getJarraipenMota();
	}

	/**
	* Sets the jarraipen mota of this jarraipen.
	*
	* @param jarraipenMota the jarraipen mota of this jarraipen
	*/
	public void setJarraipenMota(java.lang.String jarraipenMota) {
		_jarraipen.setJarraipenMota(jarraipenMota);
	}

	/**
	* Returns the create date of this jarraipen.
	*
	* @return the create date of this jarraipen
	*/
	public java.util.Date getCreateDate() {
		return _jarraipen.getCreateDate();
	}

	/**
	* Sets the create date of this jarraipen.
	*
	* @param createDate the create date of this jarraipen
	*/
	public void setCreateDate(java.util.Date createDate) {
		_jarraipen.setCreateDate(createDate);
	}

	public boolean isNew() {
		return _jarraipen.isNew();
	}

	public void setNew(boolean n) {
		_jarraipen.setNew(n);
	}

	public boolean isCachedModel() {
		return _jarraipen.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_jarraipen.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _jarraipen.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _jarraipen.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_jarraipen.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _jarraipen.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_jarraipen.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new JarraipenWrapper((Jarraipen)_jarraipen.clone());
	}

	public int compareTo(net.sareweb.txotx.model.Jarraipen jarraipen) {
		return _jarraipen.compareTo(jarraipen);
	}

	@Override
	public int hashCode() {
		return _jarraipen.hashCode();
	}

	public com.liferay.portal.model.CacheModel<net.sareweb.txotx.model.Jarraipen> toCacheModel() {
		return _jarraipen.toCacheModel();
	}

	public net.sareweb.txotx.model.Jarraipen toEscapedModel() {
		return new JarraipenWrapper(_jarraipen.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _jarraipen.toString();
	}

	public java.lang.String toXmlString() {
		return _jarraipen.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_jarraipen.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Jarraipen getWrappedJarraipen() {
		return _jarraipen;
	}

	public Jarraipen getWrappedModel() {
		return _jarraipen;
	}

	public void resetOriginalValues() {
		_jarraipen.resetOriginalValues();
	}

	private Jarraipen _jarraipen;
}