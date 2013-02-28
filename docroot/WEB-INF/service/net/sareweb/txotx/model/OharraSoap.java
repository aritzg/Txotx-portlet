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
 * This class is used by SOAP remote services, specifically {@link net.sareweb.txotx.service.http.OharraServiceSoap}.
 *
 * @author    A.Galdos
 * @see       net.sareweb.txotx.service.http.OharraServiceSoap
 * @generated
 */
public class OharraSoap implements Serializable {
	public static OharraSoap toSoapModel(Oharra model) {
		OharraSoap soapModel = new OharraSoap();

		soapModel.setOharraId(model.getOharraId());
		soapModel.setOharMota(model.getOharMota());
		soapModel.setIrudiKarpetaId(model.getIrudiKarpetaId());
		soapModel.setIrudia(model.getIrudia());
		soapModel.setIzenburua(model.getIzenburua());
		soapModel.setTestua(model.getTestua());
		soapModel.setEsteka(model.getEsteka());
		soapModel.setEstekaTestua(model.getEstekaTestua());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static OharraSoap[] toSoapModels(Oharra[] models) {
		OharraSoap[] soapModels = new OharraSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OharraSoap[][] toSoapModels(Oharra[][] models) {
		OharraSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OharraSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OharraSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OharraSoap[] toSoapModels(List<Oharra> models) {
		List<OharraSoap> soapModels = new ArrayList<OharraSoap>(models.size());

		for (Oharra model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OharraSoap[soapModels.size()]);
	}

	public OharraSoap() {
	}

	public long getPrimaryKey() {
		return _oharraId;
	}

	public void setPrimaryKey(long pk) {
		setOharraId(pk);
	}

	public long getOharraId() {
		return _oharraId;
	}

	public void setOharraId(long oharraId) {
		_oharraId = oharraId;
	}

	public String getOharMota() {
		return _oharMota;
	}

	public void setOharMota(String oharMota) {
		_oharMota = oharMota;
	}

	public long getIrudiKarpetaId() {
		return _irudiKarpetaId;
	}

	public void setIrudiKarpetaId(long irudiKarpetaId) {
		_irudiKarpetaId = irudiKarpetaId;
	}

	public String getIrudia() {
		return _irudia;
	}

	public void setIrudia(String irudia) {
		_irudia = irudia;
	}

	public String getIzenburua() {
		return _izenburua;
	}

	public void setIzenburua(String izenburua) {
		_izenburua = izenburua;
	}

	public String getTestua() {
		return _testua;
	}

	public void setTestua(String testua) {
		_testua = testua;
	}

	public String getEsteka() {
		return _esteka;
	}

	public void setEsteka(String esteka) {
		_esteka = esteka;
	}

	public String getEstekaTestua() {
		return _estekaTestua;
	}

	public void setEstekaTestua(String estekaTestua) {
		_estekaTestua = estekaTestua;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private long _oharraId;
	private String _oharMota;
	private long _irudiKarpetaId;
	private String _irudia;
	private String _izenburua;
	private String _testua;
	private String _esteka;
	private String _estekaTestua;
	private Date _createDate;
}