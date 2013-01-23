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
 * This class is used by SOAP remote services, specifically {@link net.sareweb.txotx.service.http.SagardotegiServiceSoap}.
 *
 * @author    A.Galdos
 * @see       net.sareweb.txotx.service.http.SagardotegiServiceSoap
 * @generated
 */
public class SagardotegiSoap implements Serializable {
	public static SagardotegiSoap toSoapModel(Sagardotegi model) {
		SagardotegiSoap soapModel = new SagardotegiSoap();

		soapModel.setSagardotegiId(model.getSagardotegiId());
		soapModel.setIzena(model.getIzena());
		soapModel.setHerria(model.getHerria());
		soapModel.setHelbidea(model.getHelbidea());
		soapModel.setTelefonoa(model.getTelefonoa());
		soapModel.setEmaila(model.getEmaila());
		soapModel.setWeborria(model.getWeborria());
		soapModel.setLat(model.getLat());
		soapModel.setLng(model.getLng());
		soapModel.setEdukiera(model.getEdukiera());
		soapModel.setIrudiKarpetaId(model.getIrudiKarpetaId());
		soapModel.setIrudia(model.getIrudia());
		soapModel.setBalorazioKopurua(model.getBalorazioKopurua());
		soapModel.setBalorazioenBB(model.getBalorazioenBB());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static SagardotegiSoap[] toSoapModels(Sagardotegi[] models) {
		SagardotegiSoap[] soapModels = new SagardotegiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SagardotegiSoap[][] toSoapModels(Sagardotegi[][] models) {
		SagardotegiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SagardotegiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SagardotegiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SagardotegiSoap[] toSoapModels(List<Sagardotegi> models) {
		List<SagardotegiSoap> soapModels = new ArrayList<SagardotegiSoap>(models.size());

		for (Sagardotegi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SagardotegiSoap[soapModels.size()]);
	}

	public SagardotegiSoap() {
	}

	public long getPrimaryKey() {
		return _sagardotegiId;
	}

	public void setPrimaryKey(long pk) {
		setSagardotegiId(pk);
	}

	public long getSagardotegiId() {
		return _sagardotegiId;
	}

	public void setSagardotegiId(long sagardotegiId) {
		_sagardotegiId = sagardotegiId;
	}

	public String getIzena() {
		return _izena;
	}

	public void setIzena(String izena) {
		_izena = izena;
	}

	public String getHerria() {
		return _herria;
	}

	public void setHerria(String herria) {
		_herria = herria;
	}

	public String getHelbidea() {
		return _helbidea;
	}

	public void setHelbidea(String helbidea) {
		_helbidea = helbidea;
	}

	public String getTelefonoa() {
		return _telefonoa;
	}

	public void setTelefonoa(String telefonoa) {
		_telefonoa = telefonoa;
	}

	public String getEmaila() {
		return _emaila;
	}

	public void setEmaila(String emaila) {
		_emaila = emaila;
	}

	public String getWeborria() {
		return _weborria;
	}

	public void setWeborria(String weborria) {
		_weborria = weborria;
	}

	public double getLat() {
		return _lat;
	}

	public void setLat(double lat) {
		_lat = lat;
	}

	public double getLng() {
		return _lng;
	}

	public void setLng(double lng) {
		_lng = lng;
	}

	public long getEdukiera() {
		return _edukiera;
	}

	public void setEdukiera(long edukiera) {
		_edukiera = edukiera;
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

	public long getBalorazioKopurua() {
		return _balorazioKopurua;
	}

	public void setBalorazioKopurua(long balorazioKopurua) {
		_balorazioKopurua = balorazioKopurua;
	}

	public double getBalorazioenBB() {
		return _balorazioenBB;
	}

	public void setBalorazioenBB(double balorazioenBB) {
		_balorazioenBB = balorazioenBB;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _sagardotegiId;
	private String _izena;
	private String _herria;
	private String _helbidea;
	private String _telefonoa;
	private String _emaila;
	private String _weborria;
	private double _lat;
	private double _lng;
	private long _edukiera;
	private long _irudiKarpetaId;
	private String _irudia;
	private long _balorazioKopurua;
	private double _balorazioenBB;
	private Date _createDate;
	private Date _modifiedDate;
}