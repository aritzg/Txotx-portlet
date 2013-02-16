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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import net.sareweb.txotx.service.SailkapenaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author A.Galdos
 */
public class SailkapenaClp extends BaseModelImpl<Sailkapena>
	implements Sailkapena {
	public SailkapenaClp() {
	}

	public Class<?> getModelClass() {
		return Sailkapena.class;
	}

	public String getModelClassName() {
		return Sailkapena.class.getName();
	}

	public long getPrimaryKey() {
		return _sailkapenaId;
	}

	public void setPrimaryKey(long primaryKey) {
		setSailkapenaId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_sailkapenaId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sailkapenaId", getSailkapenaId());
		attributes.put("userId", getUserId());
		attributes.put("screenName", getScreenName());
		attributes.put("iruzkinKopurua", getIruzkinKopurua());
		attributes.put("balorazioKopurua", getBalorazioKopurua());
		attributes.put("argazkiKopurua", getArgazkiKopurua());
		attributes.put("gertaeraKopurua", getGertaeraKopurua());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sailkapenaId = (Long)attributes.get("sailkapenaId");

		if (sailkapenaId != null) {
			setSailkapenaId(sailkapenaId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String screenName = (String)attributes.get("screenName");

		if (screenName != null) {
			setScreenName(screenName);
		}

		Long iruzkinKopurua = (Long)attributes.get("iruzkinKopurua");

		if (iruzkinKopurua != null) {
			setIruzkinKopurua(iruzkinKopurua);
		}

		Long balorazioKopurua = (Long)attributes.get("balorazioKopurua");

		if (balorazioKopurua != null) {
			setBalorazioKopurua(balorazioKopurua);
		}

		Long argazkiKopurua = (Long)attributes.get("argazkiKopurua");

		if (argazkiKopurua != null) {
			setArgazkiKopurua(argazkiKopurua);
		}

		Long gertaeraKopurua = (Long)attributes.get("gertaeraKopurua");

		if (gertaeraKopurua != null) {
			setGertaeraKopurua(gertaeraKopurua);
		}
	}

	public long getSailkapenaId() {
		return _sailkapenaId;
	}

	public void setSailkapenaId(long sailkapenaId) {
		_sailkapenaId = sailkapenaId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getScreenName() {
		return _screenName;
	}

	public void setScreenName(String screenName) {
		_screenName = screenName;
	}

	public long getIruzkinKopurua() {
		return _iruzkinKopurua;
	}

	public void setIruzkinKopurua(long iruzkinKopurua) {
		_iruzkinKopurua = iruzkinKopurua;
	}

	public long getBalorazioKopurua() {
		return _balorazioKopurua;
	}

	public void setBalorazioKopurua(long balorazioKopurua) {
		_balorazioKopurua = balorazioKopurua;
	}

	public long getArgazkiKopurua() {
		return _argazkiKopurua;
	}

	public void setArgazkiKopurua(long argazkiKopurua) {
		_argazkiKopurua = argazkiKopurua;
	}

	public long getGertaeraKopurua() {
		return _gertaeraKopurua;
	}

	public void setGertaeraKopurua(long gertaeraKopurua) {
		_gertaeraKopurua = gertaeraKopurua;
	}

	public BaseModel<?> getSailkapenaRemoteModel() {
		return _sailkapenaRemoteModel;
	}

	public void setSailkapenaRemoteModel(BaseModel<?> sailkapenaRemoteModel) {
		_sailkapenaRemoteModel = sailkapenaRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SailkapenaLocalServiceUtil.addSailkapena(this);
		}
		else {
			SailkapenaLocalServiceUtil.updateSailkapena(this);
		}
	}

	@Override
	public Sailkapena toEscapedModel() {
		return (Sailkapena)Proxy.newProxyInstance(Sailkapena.class.getClassLoader(),
			new Class[] { Sailkapena.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SailkapenaClp clone = new SailkapenaClp();

		clone.setSailkapenaId(getSailkapenaId());
		clone.setUserId(getUserId());
		clone.setScreenName(getScreenName());
		clone.setIruzkinKopurua(getIruzkinKopurua());
		clone.setBalorazioKopurua(getBalorazioKopurua());
		clone.setArgazkiKopurua(getArgazkiKopurua());
		clone.setGertaeraKopurua(getGertaeraKopurua());

		return clone;
	}

	public int compareTo(Sailkapena sailkapena) {
		int value = 0;

		if (getGertaeraKopurua() < sailkapena.getGertaeraKopurua()) {
			value = -1;
		}
		else if (getGertaeraKopurua() > sailkapena.getGertaeraKopurua()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		SailkapenaClp sailkapena = null;

		try {
			sailkapena = (SailkapenaClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = sailkapena.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{sailkapenaId=");
		sb.append(getSailkapenaId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", screenName=");
		sb.append(getScreenName());
		sb.append(", iruzkinKopurua=");
		sb.append(getIruzkinKopurua());
		sb.append(", balorazioKopurua=");
		sb.append(getBalorazioKopurua());
		sb.append(", argazkiKopurua=");
		sb.append(getArgazkiKopurua());
		sb.append(", gertaeraKopurua=");
		sb.append(getGertaeraKopurua());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("net.sareweb.txotx.model.Sailkapena");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sailkapenaId</column-name><column-value><![CDATA[");
		sb.append(getSailkapenaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>screenName</column-name><column-value><![CDATA[");
		sb.append(getScreenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>iruzkinKopurua</column-name><column-value><![CDATA[");
		sb.append(getIruzkinKopurua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>balorazioKopurua</column-name><column-value><![CDATA[");
		sb.append(getBalorazioKopurua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>argazkiKopurua</column-name><column-value><![CDATA[");
		sb.append(getArgazkiKopurua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gertaeraKopurua</column-name><column-value><![CDATA[");
		sb.append(getGertaeraKopurua());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _sailkapenaId;
	private long _userId;
	private String _userUuid;
	private String _screenName;
	private long _iruzkinKopurua;
	private long _balorazioKopurua;
	private long _argazkiKopurua;
	private long _gertaeraKopurua;
	private BaseModel<?> _sailkapenaRemoteModel;
}