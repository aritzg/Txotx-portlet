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
 * This class is used by SOAP remote services, specifically {@link net.sareweb.txotx.service.http.SagardoEgunServiceSoap}.
 *
 * @author    A.Galdos
 * @see       net.sareweb.txotx.service.http.SagardoEgunServiceSoap
 * @generated
 */
public class SagardoEgunSoap implements Serializable {
	public static SagardoEgunSoap toSoapModel(SagardoEgun model) {
		SagardoEgunSoap soapModel = new SagardoEgunSoap();

		soapModel.setSagardoEgunId(model.getSagardoEgunId());
		soapModel.setIzena(model.getIzena());
		soapModel.setEdizioa(model.getEdizioa());
		soapModel.setHerria(model.getHerria());
		soapModel.setLekua(model.getLekua());
		soapModel.setEmaila(model.getEmaila());
		soapModel.setTwitter(model.getTwitter());
		soapModel.setWeborria(model.getWeborria());
		soapModel.setHasieraDate(model.getHasieraDate());
		soapModel.setLat(model.getLat());
		soapModel.setLng(model.getLng());
		soapModel.setIrudiKarpetaId(model.getIrudiKarpetaId());
		soapModel.setIrudia(model.getIrudia());
		soapModel.setIrudiKopurua(model.getIrudiKopurua());
		soapModel.setIruzkinKopurua(model.getIruzkinKopurua());
		soapModel.setBalorazioKopurua(model.getBalorazioKopurua());
		soapModel.setBalorazioenBB(model.getBalorazioenBB());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setUserId(model.getUserId());

		return soapModel;
	}

	public static SagardoEgunSoap[] toSoapModels(SagardoEgun[] models) {
		SagardoEgunSoap[] soapModels = new SagardoEgunSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SagardoEgunSoap[][] toSoapModels(SagardoEgun[][] models) {
		SagardoEgunSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SagardoEgunSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SagardoEgunSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SagardoEgunSoap[] toSoapModels(List<SagardoEgun> models) {
		List<SagardoEgunSoap> soapModels = new ArrayList<SagardoEgunSoap>(models.size());

		for (SagardoEgun model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SagardoEgunSoap[soapModels.size()]);
	}

	public SagardoEgunSoap() {
	}

	public long getPrimaryKey() {
		return _sagardoEgunId;
	}

	public void setPrimaryKey(long pk) {
		setSagardoEgunId(pk);
	}

	public long getSagardoEgunId() {
		return _sagardoEgunId;
	}

	public void setSagardoEgunId(long sagardoEgunId) {
		_sagardoEgunId = sagardoEgunId;
	}

	public String getIzena() {
		return _izena;
	}

	public void setIzena(String izena) {
		_izena = izena;
	}

	public long getEdizioa() {
		return _edizioa;
	}

	public void setEdizioa(long edizioa) {
		_edizioa = edizioa;
	}

	public String getHerria() {
		return _herria;
	}

	public void setHerria(String herria) {
		_herria = herria;
	}

	public String getLekua() {
		return _lekua;
	}

	public void setLekua(String lekua) {
		_lekua = lekua;
	}

	public String getEmaila() {
		return _emaila;
	}

	public void setEmaila(String emaila) {
		_emaila = emaila;
	}

	public String getTwitter() {
		return _twitter;
	}

	public void setTwitter(String twitter) {
		_twitter = twitter;
	}

	public String getWeborria() {
		return _weborria;
	}

	public void setWeborria(String weborria) {
		_weborria = weborria;
	}

	public Date getHasieraDate() {
		return _hasieraDate;
	}

	public void setHasieraDate(Date hasieraDate) {
		_hasieraDate = hasieraDate;
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

	public long getIrudiKopurua() {
		return _irudiKopurua;
	}

	public void setIrudiKopurua(long irudiKopurua) {
		_irudiKopurua = irudiKopurua;
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

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	private long _sagardoEgunId;
	private String _izena;
	private long _edizioa;
	private String _herria;
	private String _lekua;
	private String _emaila;
	private String _twitter;
	private String _weborria;
	private Date _hasieraDate;
	private double _lat;
	private double _lng;
	private long _irudiKarpetaId;
	private String _irudia;
	private long _irudiKopurua;
	private long _iruzkinKopurua;
	private long _balorazioKopurua;
	private double _balorazioenBB;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
}