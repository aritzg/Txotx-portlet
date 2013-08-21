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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.sareweb.txotx.service.http.JarraipenServiceSoap}.
 *
 * @author    A.Galdos
 * @see       net.sareweb.txotx.service.http.JarraipenServiceSoap
 * @generated
 */
public class JarraipenSoap implements Serializable {
	public static JarraipenSoap toSoapModel(Jarraipen model) {
		JarraipenSoap soapModel = new JarraipenSoap();

		soapModel.setJarraipenId(model.getJarraipenId());
		soapModel.setJarraitzaileUserId(model.getJarraitzaileUserId());
		soapModel.setJarraituaId(model.getJarraituaId());
		soapModel.setJarraipenMota(model.getJarraipenMota());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static JarraipenSoap[] toSoapModels(Jarraipen[] models) {
		JarraipenSoap[] soapModels = new JarraipenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static JarraipenSoap[][] toSoapModels(Jarraipen[][] models) {
		JarraipenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new JarraipenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new JarraipenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static JarraipenSoap[] toSoapModels(List<Jarraipen> models) {
		List<JarraipenSoap> soapModels = new ArrayList<JarraipenSoap>(models.size());

		for (Jarraipen model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new JarraipenSoap[soapModels.size()]);
	}

	public JarraipenSoap() {
	}

	public long getPrimaryKey() {
		return _jarraipenId;
	}

	public void setPrimaryKey(long pk) {
		setJarraipenId(pk);
	}

	public long getJarraipenId() {
		return _jarraipenId;
	}

	public void setJarraipenId(long jarraipenId) {
		_jarraipenId = jarraipenId;
	}

	public long getJarraitzaileUserId() {
		return _jarraitzaileUserId;
	}

	public void setJarraitzaileUserId(long jarraitzaileUserId) {
		_jarraitzaileUserId = jarraitzaileUserId;
	}

	public long getJarraituaId() {
		return _jarraituaId;
	}

	public void setJarraituaId(long jarraituaId) {
		_jarraituaId = jarraituaId;
	}

	public String getJarraipenMota() {
		return _jarraipenMota;
	}

	public void setJarraipenMota(String jarraipenMota) {
		_jarraipenMota = jarraipenMota;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private long _jarraipenId;
	private long _jarraitzaileUserId;
	private long _jarraituaId;
	private String _jarraipenMota;
	private Date _createDate;
}