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

import net.sareweb.txotx.model.Sagardotegi;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Sagardotegi in entity cache.
 *
 * @author A.Galdos
 * @see Sagardotegi
 * @generated
 */
public class SagardotegiCacheModel implements CacheModel<Sagardotegi>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{sagardotegiId=");
		sb.append(sagardotegiId);
		sb.append(", izena=");
		sb.append(izena);
		sb.append(", herria=");
		sb.append(herria);
		sb.append(", helbidea=");
		sb.append(helbidea);
		sb.append(", telefonoa=");
		sb.append(telefonoa);
		sb.append(", emaila=");
		sb.append(emaila);
		sb.append(", weborria=");
		sb.append(weborria);
		sb.append(", lat=");
		sb.append(lat);
		sb.append(", lng=");
		sb.append(lng);
		sb.append(", edukiera=");
		sb.append(edukiera);
		sb.append(", irudiKarpetaId=");
		sb.append(irudiKarpetaId);
		sb.append(", irudia=");
		sb.append(irudia);
		sb.append(", balorazioKopurua=");
		sb.append(balorazioKopurua);
		sb.append(", balorazioenBB=");
		sb.append(balorazioenBB);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	public Sagardotegi toEntityModel() {
		SagardotegiImpl sagardotegiImpl = new SagardotegiImpl();

		sagardotegiImpl.setSagardotegiId(sagardotegiId);

		if (izena == null) {
			sagardotegiImpl.setIzena(StringPool.BLANK);
		}
		else {
			sagardotegiImpl.setIzena(izena);
		}

		if (herria == null) {
			sagardotegiImpl.setHerria(StringPool.BLANK);
		}
		else {
			sagardotegiImpl.setHerria(herria);
		}

		if (helbidea == null) {
			sagardotegiImpl.setHelbidea(StringPool.BLANK);
		}
		else {
			sagardotegiImpl.setHelbidea(helbidea);
		}

		if (telefonoa == null) {
			sagardotegiImpl.setTelefonoa(StringPool.BLANK);
		}
		else {
			sagardotegiImpl.setTelefonoa(telefonoa);
		}

		if (emaila == null) {
			sagardotegiImpl.setEmaila(StringPool.BLANK);
		}
		else {
			sagardotegiImpl.setEmaila(emaila);
		}

		if (weborria == null) {
			sagardotegiImpl.setWeborria(StringPool.BLANK);
		}
		else {
			sagardotegiImpl.setWeborria(weborria);
		}

		sagardotegiImpl.setLat(lat);
		sagardotegiImpl.setLng(lng);
		sagardotegiImpl.setEdukiera(edukiera);
		sagardotegiImpl.setIrudiKarpetaId(irudiKarpetaId);

		if (irudia == null) {
			sagardotegiImpl.setIrudia(StringPool.BLANK);
		}
		else {
			sagardotegiImpl.setIrudia(irudia);
		}

		sagardotegiImpl.setBalorazioKopurua(balorazioKopurua);
		sagardotegiImpl.setBalorazioenBB(balorazioenBB);

		if (createDate == Long.MIN_VALUE) {
			sagardotegiImpl.setCreateDate(null);
		}
		else {
			sagardotegiImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sagardotegiImpl.setModifiedDate(null);
		}
		else {
			sagardotegiImpl.setModifiedDate(new Date(modifiedDate));
		}

		sagardotegiImpl.resetOriginalValues();

		return sagardotegiImpl;
	}

	public long sagardotegiId;
	public String izena;
	public String herria;
	public String helbidea;
	public String telefonoa;
	public String emaila;
	public String weborria;
	public double lat;
	public double lng;
	public long edukiera;
	public long irudiKarpetaId;
	public String irudia;
	public long balorazioKopurua;
	public double balorazioenBB;
	public long createDate;
	public long modifiedDate;
}