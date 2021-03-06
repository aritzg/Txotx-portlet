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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Oharra service. Represents a row in the &quot;Txotx_Oharra&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link net.sareweb.txotx.model.impl.OharraModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link net.sareweb.txotx.model.impl.OharraImpl}.
 * </p>
 *
 * @author A.Galdos
 * @see Oharra
 * @see net.sareweb.txotx.model.impl.OharraImpl
 * @see net.sareweb.txotx.model.impl.OharraModelImpl
 * @generated
 */
public interface OharraModel extends BaseModel<Oharra> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a oharra model instance should use the {@link Oharra} interface instead.
	 */

	/**
	 * Returns the primary key of this oharra.
	 *
	 * @return the primary key of this oharra
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this oharra.
	 *
	 * @param primaryKey the primary key of this oharra
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the oharra ID of this oharra.
	 *
	 * @return the oharra ID of this oharra
	 */
	public long getOharraId();

	/**
	 * Sets the oharra ID of this oharra.
	 *
	 * @param oharraId the oharra ID of this oharra
	 */
	public void setOharraId(long oharraId);

	/**
	 * Returns the ohar mota of this oharra.
	 *
	 * @return the ohar mota of this oharra
	 */
	@AutoEscape
	public String getOharMota();

	/**
	 * Sets the ohar mota of this oharra.
	 *
	 * @param oharMota the ohar mota of this oharra
	 */
	public void setOharMota(String oharMota);

	/**
	 * Returns the irudi karpeta ID of this oharra.
	 *
	 * @return the irudi karpeta ID of this oharra
	 */
	public long getIrudiKarpetaId();

	/**
	 * Sets the irudi karpeta ID of this oharra.
	 *
	 * @param irudiKarpetaId the irudi karpeta ID of this oharra
	 */
	public void setIrudiKarpetaId(long irudiKarpetaId);

	/**
	 * Returns the irudia of this oharra.
	 *
	 * @return the irudia of this oharra
	 */
	@AutoEscape
	public String getIrudia();

	/**
	 * Sets the irudia of this oharra.
	 *
	 * @param irudia the irudia of this oharra
	 */
	public void setIrudia(String irudia);

	/**
	 * Returns the izenburua of this oharra.
	 *
	 * @return the izenburua of this oharra
	 */
	@AutoEscape
	public String getIzenburua();

	/**
	 * Sets the izenburua of this oharra.
	 *
	 * @param izenburua the izenburua of this oharra
	 */
	public void setIzenburua(String izenburua);

	/**
	 * Returns the testua of this oharra.
	 *
	 * @return the testua of this oharra
	 */
	@AutoEscape
	public String getTestua();

	/**
	 * Sets the testua of this oharra.
	 *
	 * @param testua the testua of this oharra
	 */
	public void setTestua(String testua);

	/**
	 * Returns the esteka of this oharra.
	 *
	 * @return the esteka of this oharra
	 */
	@AutoEscape
	public String getEsteka();

	/**
	 * Sets the esteka of this oharra.
	 *
	 * @param esteka the esteka of this oharra
	 */
	public void setEsteka(String esteka);

	/**
	 * Returns the esteka testua of this oharra.
	 *
	 * @return the esteka testua of this oharra
	 */
	@AutoEscape
	public String getEstekaTestua();

	/**
	 * Sets the esteka testua of this oharra.
	 *
	 * @param estekaTestua the esteka testua of this oharra
	 */
	public void setEstekaTestua(String estekaTestua);

	/**
	 * Returns the create date of this oharra.
	 *
	 * @return the create date of this oharra
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this oharra.
	 *
	 * @param createDate the create date of this oharra
	 */
	public void setCreateDate(Date createDate);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Oharra oharra);

	public int hashCode();

	public CacheModel<Oharra> toCacheModel();

	public Oharra toEscapedModel();

	public String toString();

	public String toXmlString();
}