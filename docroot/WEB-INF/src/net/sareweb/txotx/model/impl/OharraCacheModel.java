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

import net.sareweb.txotx.model.Oharra;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Oharra in entity cache.
 *
 * @author A.Galdos
 * @see Oharra
 * @generated
 */
public class OharraCacheModel implements CacheModel<Oharra>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{oharraId=");
		sb.append(oharraId);
		sb.append(", oharMota=");
		sb.append(oharMota);
		sb.append(", irudiKarpetaId=");
		sb.append(irudiKarpetaId);
		sb.append(", irudia=");
		sb.append(irudia);
		sb.append(", izenburua=");
		sb.append(izenburua);
		sb.append(", testua=");
		sb.append(testua);
		sb.append(", esteka=");
		sb.append(esteka);
		sb.append(", estekaTestua=");
		sb.append(estekaTestua);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	public Oharra toEntityModel() {
		OharraImpl oharraImpl = new OharraImpl();

		oharraImpl.setOharraId(oharraId);

		if (oharMota == null) {
			oharraImpl.setOharMota(StringPool.BLANK);
		}
		else {
			oharraImpl.setOharMota(oharMota);
		}

		oharraImpl.setIrudiKarpetaId(irudiKarpetaId);

		if (irudia == null) {
			oharraImpl.setIrudia(StringPool.BLANK);
		}
		else {
			oharraImpl.setIrudia(irudia);
		}

		if (izenburua == null) {
			oharraImpl.setIzenburua(StringPool.BLANK);
		}
		else {
			oharraImpl.setIzenburua(izenburua);
		}

		if (testua == null) {
			oharraImpl.setTestua(StringPool.BLANK);
		}
		else {
			oharraImpl.setTestua(testua);
		}

		if (esteka == null) {
			oharraImpl.setEsteka(StringPool.BLANK);
		}
		else {
			oharraImpl.setEsteka(esteka);
		}

		if (estekaTestua == null) {
			oharraImpl.setEstekaTestua(StringPool.BLANK);
		}
		else {
			oharraImpl.setEstekaTestua(estekaTestua);
		}

		if (createDate == Long.MIN_VALUE) {
			oharraImpl.setCreateDate(null);
		}
		else {
			oharraImpl.setCreateDate(new Date(createDate));
		}

		oharraImpl.resetOriginalValues();

		return oharraImpl;
	}

	public long oharraId;
	public String oharMota;
	public long irudiKarpetaId;
	public String irudia;
	public String izenburua;
	public String testua;
	public String esteka;
	public String estekaTestua;
	public long createDate;
}