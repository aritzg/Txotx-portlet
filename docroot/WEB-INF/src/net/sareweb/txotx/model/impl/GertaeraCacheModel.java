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

package net.sareweb.txotx.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.sareweb.txotx.model.Gertaera;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Gertaera in entity cache.
 *
 * @author A.Galdos
 * @see Gertaera
 * @generated
 */
public class GertaeraCacheModel implements CacheModel<Gertaera>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{gertaeraId=");
		sb.append(gertaeraId);
		sb.append(", sagardotegiId=");
		sb.append(sagardotegiId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", screenName=");
		sb.append(screenName);
		sb.append(", gertaeraMota=");
		sb.append(gertaeraMota);
		sb.append(", testua=");
		sb.append(testua);
		sb.append(", irudiKarpetaId=");
		sb.append(irudiKarpetaId);
		sb.append(", irudia=");
		sb.append(irudia);
		sb.append(", balorazioa=");
		sb.append(balorazioa);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	public Gertaera toEntityModel() {
		GertaeraImpl gertaeraImpl = new GertaeraImpl();

		gertaeraImpl.setGertaeraId(gertaeraId);
		gertaeraImpl.setSagardotegiId(sagardotegiId);
		gertaeraImpl.setUserId(userId);

		if (screenName == null) {
			gertaeraImpl.setScreenName(StringPool.BLANK);
		}
		else {
			gertaeraImpl.setScreenName(screenName);
		}

		if (gertaeraMota == null) {
			gertaeraImpl.setGertaeraMota(StringPool.BLANK);
		}
		else {
			gertaeraImpl.setGertaeraMota(gertaeraMota);
		}

		if (testua == null) {
			gertaeraImpl.setTestua(StringPool.BLANK);
		}
		else {
			gertaeraImpl.setTestua(testua);
		}

		gertaeraImpl.setIrudiKarpetaId(irudiKarpetaId);

		if (irudia == null) {
			gertaeraImpl.setIrudia(StringPool.BLANK);
		}
		else {
			gertaeraImpl.setIrudia(irudia);
		}

		gertaeraImpl.setBalorazioa(balorazioa);

		if (createDate == Long.MIN_VALUE) {
			gertaeraImpl.setCreateDate(null);
		}
		else {
			gertaeraImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			gertaeraImpl.setModifiedDate(null);
		}
		else {
			gertaeraImpl.setModifiedDate(new Date(modifiedDate));
		}

		gertaeraImpl.resetOriginalValues();

		return gertaeraImpl;
	}

	public long gertaeraId;
	public long sagardotegiId;
	public long userId;
	public String screenName;
	public String gertaeraMota;
	public String testua;
	public long irudiKarpetaId;
	public String irudia;
	public long balorazioa;
	public long createDate;
	public long modifiedDate;
}