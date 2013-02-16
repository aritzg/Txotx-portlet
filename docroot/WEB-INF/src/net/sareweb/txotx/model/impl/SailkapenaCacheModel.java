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

import net.sareweb.txotx.model.Sailkapena;

import java.io.Serializable;

/**
 * The cache model class for representing Sailkapena in entity cache.
 *
 * @author A.Galdos
 * @see Sailkapena
 * @generated
 */
public class SailkapenaCacheModel implements CacheModel<Sailkapena>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{sailkapenaId=");
		sb.append(sailkapenaId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", screenName=");
		sb.append(screenName);
		sb.append(", iruzkinKopurua=");
		sb.append(iruzkinKopurua);
		sb.append(", balorazioKopurua=");
		sb.append(balorazioKopurua);
		sb.append(", argazkiKopurua=");
		sb.append(argazkiKopurua);
		sb.append(", gertaeraKopurua=");
		sb.append(gertaeraKopurua);
		sb.append("}");

		return sb.toString();
	}

	public Sailkapena toEntityModel() {
		SailkapenaImpl sailkapenaImpl = new SailkapenaImpl();

		sailkapenaImpl.setSailkapenaId(sailkapenaId);
		sailkapenaImpl.setUserId(userId);

		if (screenName == null) {
			sailkapenaImpl.setScreenName(StringPool.BLANK);
		}
		else {
			sailkapenaImpl.setScreenName(screenName);
		}

		sailkapenaImpl.setIruzkinKopurua(iruzkinKopurua);
		sailkapenaImpl.setBalorazioKopurua(balorazioKopurua);
		sailkapenaImpl.setArgazkiKopurua(argazkiKopurua);
		sailkapenaImpl.setGertaeraKopurua(gertaeraKopurua);

		sailkapenaImpl.resetOriginalValues();

		return sailkapenaImpl;
	}

	public long sailkapenaId;
	public long userId;
	public String screenName;
	public long iruzkinKopurua;
	public long balorazioKopurua;
	public long argazkiKopurua;
	public long gertaeraKopurua;
}