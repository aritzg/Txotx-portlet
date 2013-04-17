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

import net.sareweb.txotx.model.SagardoEgun;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing SagardoEgun in entity cache.
 *
 * @author A.Galdos
 * @see SagardoEgun
 * @generated
 */
public class SagardoEgunCacheModel implements CacheModel<SagardoEgun>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{sagardoEgunId=");
		sb.append(sagardoEgunId);
		sb.append(", izena=");
		sb.append(izena);
		sb.append(", edizioa=");
		sb.append(edizioa);
		sb.append(", herria=");
		sb.append(herria);
		sb.append(", lekua=");
		sb.append(lekua);
		sb.append(", emaila=");
		sb.append(emaila);
		sb.append(", twitter=");
		sb.append(twitter);
		sb.append(", weborria=");
		sb.append(weborria);
		sb.append(", hasieraDate=");
		sb.append(hasieraDate);
		sb.append(", lat=");
		sb.append(lat);
		sb.append(", lng=");
		sb.append(lng);
		sb.append(", irudiKarpetaId=");
		sb.append(irudiKarpetaId);
		sb.append(", irudia=");
		sb.append(irudia);
		sb.append(", irudiKopurua=");
		sb.append(irudiKopurua);
		sb.append(", iruzkinKopurua=");
		sb.append(iruzkinKopurua);
		sb.append(", balorazioKopurua=");
		sb.append(balorazioKopurua);
		sb.append(", balorazioenBB=");
		sb.append(balorazioenBB);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", userId=");
		sb.append(userId);
		sb.append("}");

		return sb.toString();
	}

	public SagardoEgun toEntityModel() {
		SagardoEgunImpl sagardoEgunImpl = new SagardoEgunImpl();

		sagardoEgunImpl.setSagardoEgunId(sagardoEgunId);

		if (izena == null) {
			sagardoEgunImpl.setIzena(StringPool.BLANK);
		}
		else {
			sagardoEgunImpl.setIzena(izena);
		}

		sagardoEgunImpl.setEdizioa(edizioa);

		if (herria == null) {
			sagardoEgunImpl.setHerria(StringPool.BLANK);
		}
		else {
			sagardoEgunImpl.setHerria(herria);
		}

		if (lekua == null) {
			sagardoEgunImpl.setLekua(StringPool.BLANK);
		}
		else {
			sagardoEgunImpl.setLekua(lekua);
		}

		if (emaila == null) {
			sagardoEgunImpl.setEmaila(StringPool.BLANK);
		}
		else {
			sagardoEgunImpl.setEmaila(emaila);
		}

		if (twitter == null) {
			sagardoEgunImpl.setTwitter(StringPool.BLANK);
		}
		else {
			sagardoEgunImpl.setTwitter(twitter);
		}

		if (weborria == null) {
			sagardoEgunImpl.setWeborria(StringPool.BLANK);
		}
		else {
			sagardoEgunImpl.setWeborria(weborria);
		}

		if (hasieraDate == Long.MIN_VALUE) {
			sagardoEgunImpl.setHasieraDate(null);
		}
		else {
			sagardoEgunImpl.setHasieraDate(new Date(hasieraDate));
		}

		sagardoEgunImpl.setLat(lat);
		sagardoEgunImpl.setLng(lng);
		sagardoEgunImpl.setIrudiKarpetaId(irudiKarpetaId);

		if (irudia == null) {
			sagardoEgunImpl.setIrudia(StringPool.BLANK);
		}
		else {
			sagardoEgunImpl.setIrudia(irudia);
		}

		sagardoEgunImpl.setIrudiKopurua(irudiKopurua);
		sagardoEgunImpl.setIruzkinKopurua(iruzkinKopurua);
		sagardoEgunImpl.setBalorazioKopurua(balorazioKopurua);
		sagardoEgunImpl.setBalorazioenBB(balorazioenBB);

		if (createDate == Long.MIN_VALUE) {
			sagardoEgunImpl.setCreateDate(null);
		}
		else {
			sagardoEgunImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sagardoEgunImpl.setModifiedDate(null);
		}
		else {
			sagardoEgunImpl.setModifiedDate(new Date(modifiedDate));
		}

		sagardoEgunImpl.setUserId(userId);

		sagardoEgunImpl.resetOriginalValues();

		return sagardoEgunImpl;
	}

	public long sagardoEgunId;
	public String izena;
	public long edizioa;
	public String herria;
	public String lekua;
	public String emaila;
	public String twitter;
	public String weborria;
	public long hasieraDate;
	public double lat;
	public double lng;
	public long irudiKarpetaId;
	public String irudia;
	public long irudiKopurua;
	public long iruzkinKopurua;
	public long balorazioKopurua;
	public double balorazioenBB;
	public long createDate;
	public long modifiedDate;
	public long userId;
}