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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Jarraipen service. Represents a row in the &quot;Txotx_Jarraipen&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link net.sareweb.txotx.model.impl.JarraipenModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link net.sareweb.txotx.model.impl.JarraipenImpl}.
 * </p>
 *
 * @author A.Galdos
 * @see Jarraipen
 * @see net.sareweb.txotx.model.impl.JarraipenImpl
 * @see net.sareweb.txotx.model.impl.JarraipenModelImpl
 * @generated
 */
public interface JarraipenModel extends BaseModel<Jarraipen> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a jarraipen model instance should use the {@link Jarraipen} interface instead.
	 */

	/**
	 * Returns the primary key of this jarraipen.
	 *
	 * @return the primary key of this jarraipen
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this jarraipen.
	 *
	 * @param primaryKey the primary key of this jarraipen
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the jarraipen ID of this jarraipen.
	 *
	 * @return the jarraipen ID of this jarraipen
	 */
	public long getJarraipenId();

	/**
	 * Sets the jarraipen ID of this jarraipen.
	 *
	 * @param jarraipenId the jarraipen ID of this jarraipen
	 */
	public void setJarraipenId(long jarraipenId);

	/**
	 * Returns the jarraitzaile user ID of this jarraipen.
	 *
	 * @return the jarraitzaile user ID of this jarraipen
	 */
	public long getJarraitzaileUserId();

	/**
	 * Sets the jarraitzaile user ID of this jarraipen.
	 *
	 * @param jarraitzaileUserId the jarraitzaile user ID of this jarraipen
	 */
	public void setJarraitzaileUserId(long jarraitzaileUserId);

	/**
	 * Returns the jarraitzaile user uuid of this jarraipen.
	 *
	 * @return the jarraitzaile user uuid of this jarraipen
	 * @throws SystemException if a system exception occurred
	 */
	public String getJarraitzaileUserUuid() throws SystemException;

	/**
	 * Sets the jarraitzaile user uuid of this jarraipen.
	 *
	 * @param jarraitzaileUserUuid the jarraitzaile user uuid of this jarraipen
	 */
	public void setJarraitzaileUserUuid(String jarraitzaileUserUuid);

	/**
	 * Returns the jarraitua ID of this jarraipen.
	 *
	 * @return the jarraitua ID of this jarraipen
	 */
	public long getJarraituaId();

	/**
	 * Sets the jarraitua ID of this jarraipen.
	 *
	 * @param jarraituaId the jarraitua ID of this jarraipen
	 */
	public void setJarraituaId(long jarraituaId);

	/**
	 * Returns the jarraipen mota of this jarraipen.
	 *
	 * @return the jarraipen mota of this jarraipen
	 */
	@AutoEscape
	public String getJarraipenMota();

	/**
	 * Sets the jarraipen mota of this jarraipen.
	 *
	 * @param jarraipenMota the jarraipen mota of this jarraipen
	 */
	public void setJarraipenMota(String jarraipenMota);

	/**
	 * Returns the create date of this jarraipen.
	 *
	 * @return the create date of this jarraipen
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this jarraipen.
	 *
	 * @param createDate the create date of this jarraipen
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

	public int compareTo(Jarraipen jarraipen);

	public int hashCode();

	public CacheModel<Jarraipen> toCacheModel();

	public Jarraipen toEscapedModel();

	public String toString();

	public String toXmlString();
}