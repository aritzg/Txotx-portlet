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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.sareweb.txotx.service.http.SailkapenaServiceSoap}.
 *
 * @author    A.Galdos
 * @see       net.sareweb.txotx.service.http.SailkapenaServiceSoap
 * @generated
 */
public class SailkapenaSoap implements Serializable {
	public static SailkapenaSoap toSoapModel(Sailkapena model) {
		SailkapenaSoap soapModel = new SailkapenaSoap();

		soapModel.setSailkapenaId(model.getSailkapenaId());
		soapModel.setUserId(model.getUserId());
		soapModel.setScreenName(model.getScreenName());
		soapModel.setIruzkinKopurua(model.getIruzkinKopurua());
		soapModel.setBalorazioKopurua(model.getBalorazioKopurua());
		soapModel.setArgazkiKopurua(model.getArgazkiKopurua());
		soapModel.setGertaeraKopurua(model.getGertaeraKopurua());

		return soapModel;
	}

	public static SailkapenaSoap[] toSoapModels(Sailkapena[] models) {
		SailkapenaSoap[] soapModels = new SailkapenaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SailkapenaSoap[][] toSoapModels(Sailkapena[][] models) {
		SailkapenaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SailkapenaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SailkapenaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SailkapenaSoap[] toSoapModels(List<Sailkapena> models) {
		List<SailkapenaSoap> soapModels = new ArrayList<SailkapenaSoap>(models.size());

		for (Sailkapena model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SailkapenaSoap[soapModels.size()]);
	}

	public SailkapenaSoap() {
	}

	public long getPrimaryKey() {
		return _sailkapenaId;
	}

	public void setPrimaryKey(long pk) {
		setSailkapenaId(pk);
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

	private long _sailkapenaId;
	private long _userId;
	private String _screenName;
	private long _iruzkinKopurua;
	private long _balorazioKopurua;
	private long _argazkiKopurua;
	private long _gertaeraKopurua;
}