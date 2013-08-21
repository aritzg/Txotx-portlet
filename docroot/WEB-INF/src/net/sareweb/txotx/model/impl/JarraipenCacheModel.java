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

import net.sareweb.txotx.model.Jarraipen;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Jarraipen in entity cache.
 *
 * @author A.Galdos
 * @see Jarraipen
 * @generated
 */
public class JarraipenCacheModel implements CacheModel<Jarraipen>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{jarraipenId=");
		sb.append(jarraipenId);
		sb.append(", jarraitzaileUserId=");
		sb.append(jarraitzaileUserId);
		sb.append(", jarraituaId=");
		sb.append(jarraituaId);
		sb.append(", jarraipenMota=");
		sb.append(jarraipenMota);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	public Jarraipen toEntityModel() {
		JarraipenImpl jarraipenImpl = new JarraipenImpl();

		jarraipenImpl.setJarraipenId(jarraipenId);
		jarraipenImpl.setJarraitzaileUserId(jarraitzaileUserId);
		jarraipenImpl.setJarraituaId(jarraituaId);

		if (jarraipenMota == null) {
			jarraipenImpl.setJarraipenMota(StringPool.BLANK);
		}
		else {
			jarraipenImpl.setJarraipenMota(jarraipenMota);
		}

		if (createDate == Long.MIN_VALUE) {
			jarraipenImpl.setCreateDate(null);
		}
		else {
			jarraipenImpl.setCreateDate(new Date(createDate));
		}

		jarraipenImpl.resetOriginalValues();

		return jarraipenImpl;
	}

	public long jarraipenId;
	public long jarraitzaileUserId;
	public long jarraituaId;
	public String jarraipenMota;
	public long createDate;
}