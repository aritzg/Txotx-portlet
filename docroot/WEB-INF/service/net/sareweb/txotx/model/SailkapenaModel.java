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

/**
 * The base model interface for the Sailkapena service. Represents a row in the &quot;Txotx_Sailkapena&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link net.sareweb.txotx.model.impl.SailkapenaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link net.sareweb.txotx.model.impl.SailkapenaImpl}.
 * </p>
 *
 * @author A.Galdos
 * @see Sailkapena
 * @see net.sareweb.txotx.model.impl.SailkapenaImpl
 * @see net.sareweb.txotx.model.impl.SailkapenaModelImpl
 * @generated
 */
public interface SailkapenaModel extends BaseModel<Sailkapena> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sailkapena model instance should use the {@link Sailkapena} interface instead.
	 */

	/**
	 * Returns the primary key of this sailkapena.
	 *
	 * @return the primary key of this sailkapena
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sailkapena.
	 *
	 * @param primaryKey the primary key of this sailkapena
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sailkapena ID of this sailkapena.
	 *
	 * @return the sailkapena ID of this sailkapena
	 */
	public long getSailkapenaId();

	/**
	 * Sets the sailkapena ID of this sailkapena.
	 *
	 * @param sailkapenaId the sailkapena ID of this sailkapena
	 */
	public void setSailkapenaId(long sailkapenaId);

	/**
	 * Returns the user ID of this sailkapena.
	 *
	 * @return the user ID of this sailkapena
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this sailkapena.
	 *
	 * @param userId the user ID of this sailkapena
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sailkapena.
	 *
	 * @return the user uuid of this sailkapena
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this sailkapena.
	 *
	 * @param userUuid the user uuid of this sailkapena
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the screen name of this sailkapena.
	 *
	 * @return the screen name of this sailkapena
	 */
	@AutoEscape
	public String getScreenName();

	/**
	 * Sets the screen name of this sailkapena.
	 *
	 * @param screenName the screen name of this sailkapena
	 */
	public void setScreenName(String screenName);

	/**
	 * Returns the iruzkin kopurua of this sailkapena.
	 *
	 * @return the iruzkin kopurua of this sailkapena
	 */
	public long getIruzkinKopurua();

	/**
	 * Sets the iruzkin kopurua of this sailkapena.
	 *
	 * @param iruzkinKopurua the iruzkin kopurua of this sailkapena
	 */
	public void setIruzkinKopurua(long iruzkinKopurua);

	/**
	 * Returns the balorazio kopurua of this sailkapena.
	 *
	 * @return the balorazio kopurua of this sailkapena
	 */
	public long getBalorazioKopurua();

	/**
	 * Sets the balorazio kopurua of this sailkapena.
	 *
	 * @param balorazioKopurua the balorazio kopurua of this sailkapena
	 */
	public void setBalorazioKopurua(long balorazioKopurua);

	/**
	 * Returns the argazki kopurua of this sailkapena.
	 *
	 * @return the argazki kopurua of this sailkapena
	 */
	public long getArgazkiKopurua();

	/**
	 * Sets the argazki kopurua of this sailkapena.
	 *
	 * @param argazkiKopurua the argazki kopurua of this sailkapena
	 */
	public void setArgazkiKopurua(long argazkiKopurua);

	/**
	 * Returns the gertaera kopurua of this sailkapena.
	 *
	 * @return the gertaera kopurua of this sailkapena
	 */
	public long getGertaeraKopurua();

	/**
	 * Sets the gertaera kopurua of this sailkapena.
	 *
	 * @param gertaeraKopurua the gertaera kopurua of this sailkapena
	 */
	public void setGertaeraKopurua(long gertaeraKopurua);

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

	public int compareTo(Sailkapena sailkapena);

	public int hashCode();

	public CacheModel<Sailkapena> toCacheModel();

	public Sailkapena toEscapedModel();

	public String toString();

	public String toXmlString();
}