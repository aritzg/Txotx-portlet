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
 * This class is used by SOAP remote services, specifically {@link net.sareweb.txotx.service.http.GertaeraServiceSoap}.
 *
 * @author    A.Galdos
 * @see       net.sareweb.txotx.service.http.GertaeraServiceSoap
 * @generated
 */
public class GertaeraSoap implements Serializable {
	public static GertaeraSoap toSoapModel(Gertaera model) {
		GertaeraSoap soapModel = new GertaeraSoap();

		soapModel.setGertaeraId(model.getGertaeraId());
		soapModel.setSagardotegiId(model.getSagardotegiId());
		soapModel.setUserId(model.getUserId());
		soapModel.setScreenName(model.getScreenName());
		soapModel.setGertaeraMota(model.getGertaeraMota());
		soapModel.setTestua(model.getTestua());
		soapModel.setIrudiKarpetaId(model.getIrudiKarpetaId());
		soapModel.setIrudia(model.getIrudia());
		soapModel.setBalorazioa(model.getBalorazioa());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static GertaeraSoap[] toSoapModels(Gertaera[] models) {
		GertaeraSoap[] soapModels = new GertaeraSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static GertaeraSoap[][] toSoapModels(Gertaera[][] models) {
		GertaeraSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new GertaeraSoap[models.length][models[0].length];
		}
		else {
			soapModels = new GertaeraSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static GertaeraSoap[] toSoapModels(List<Gertaera> models) {
		List<GertaeraSoap> soapModels = new ArrayList<GertaeraSoap>(models.size());

		for (Gertaera model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new GertaeraSoap[soapModels.size()]);
	}

	public GertaeraSoap() {
	}

	public long getPrimaryKey() {
		return _gertaeraId;
	}

	public void setPrimaryKey(long pk) {
		setGertaeraId(pk);
	}

	public long getGertaeraId() {
		return _gertaeraId;
	}

	public void setGertaeraId(long gertaeraId) {
		_gertaeraId = gertaeraId;
	}

	public long getSagardotegiId() {
		return _sagardotegiId;
	}

	public void setSagardotegiId(long sagardotegiId) {
		_sagardotegiId = sagardotegiId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getScreenName() {
		return _screenName;
	}

	public void setScreenName(String screenName) {
		_screenName = screenName;
	}

	public String getGertaeraMota() {
		return _gertaeraMota;
	}

	public void setGertaeraMota(String gertaeraMota) {
		_gertaeraMota = gertaeraMota;
	}

	public String getTestua() {
		return _testua;
	}

	public void setTestua(String testua) {
		_testua = testua;
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

	public long getBalorazioa() {
		return _balorazioa;
	}

	public void setBalorazioa(long balorazioa) {
		_balorazioa = balorazioa;
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

	private long _gertaeraId;
	private long _sagardotegiId;
	private long _userId;
	private String _screenName;
	private String _gertaeraMota;
	private String _testua;
	private long _irudiKarpetaId;
	private String _irudia;
	private long _balorazioa;
	private Date _createDate;
	private Date _modifiedDate;
}