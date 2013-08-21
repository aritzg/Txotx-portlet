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

import net.sareweb.txotx.model.APKVersion;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing APKVersion in entity cache.
 *
 * @author A.Galdos
 * @see APKVersion
 * @generated
 */
public class APKVersionCacheModel implements CacheModel<APKVersion>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{apkVersionId=");
		sb.append(apkVersionId);
		sb.append(", supportedMinVersion=");
		sb.append(supportedMinVersion);
		sb.append(", supportedMinVersionName=");
		sb.append(supportedMinVersionName);
		sb.append(", currentVersion=");
		sb.append(currentVersion);
		sb.append(", currentVersionName=");
		sb.append(currentVersionName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	public APKVersion toEntityModel() {
		APKVersionImpl apkVersionImpl = new APKVersionImpl();

		apkVersionImpl.setApkVersionId(apkVersionId);
		apkVersionImpl.setSupportedMinVersion(supportedMinVersion);

		if (supportedMinVersionName == null) {
			apkVersionImpl.setSupportedMinVersionName(StringPool.BLANK);
		}
		else {
			apkVersionImpl.setSupportedMinVersionName(supportedMinVersionName);
		}

		apkVersionImpl.setCurrentVersion(currentVersion);

		if (currentVersionName == null) {
			apkVersionImpl.setCurrentVersionName(StringPool.BLANK);
		}
		else {
			apkVersionImpl.setCurrentVersionName(currentVersionName);
		}

		if (createDate == Long.MIN_VALUE) {
			apkVersionImpl.setCreateDate(null);
		}
		else {
			apkVersionImpl.setCreateDate(new Date(createDate));
		}

		apkVersionImpl.resetOriginalValues();

		return apkVersionImpl;
	}

	public long apkVersionId;
	public int supportedMinVersion;
	public String supportedMinVersionName;
	public int currentVersion;
	public String currentVersionName;
	public long createDate;
}