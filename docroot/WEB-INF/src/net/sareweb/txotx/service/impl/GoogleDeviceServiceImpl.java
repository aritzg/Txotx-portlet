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

package net.sareweb.txotx.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Sender;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

import net.sareweb.txotx.model.GoogleDevice;
import net.sareweb.txotx.service.GoogleDeviceLocalServiceUtil;
import net.sareweb.txotx.service.base.GoogleDeviceServiceBaseImpl;
import net.sareweb.txotx.util.Constants;

/**
 * The implementation of the google device remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.sareweb.txotx.service.GoogleDeviceService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author A.Galdos
 * @see net.sareweb.txotx.service.base.GoogleDeviceServiceBaseImpl
 * @see net.sareweb.txotx.service.GoogleDeviceServiceUtil
 */
public class GoogleDeviceServiceImpl extends GoogleDeviceServiceBaseImpl {
	
	public GoogleDevice addGoogleDevice(String emailAddress, String registrationId) throws SystemException{
		boolean isNew = false;
		GoogleDevice googleDevice;
		User user = null;;
		Date now = new Date();
		try {
			googleDevice = googleDevicePersistence.findByRegistrationId(registrationId);
		} catch (Exception e) {
			googleDevice =GoogleDeviceLocalServiceUtil.createGoogleDevice(CounterLocalServiceUtil.increment());
			googleDevice.setCreateDate(now);
			isNew=true;
		}
		googleDevice.setModifiedDate(now);
		
		try {
			user = UserLocalServiceUtil.getUserByEmailAddress(getGuestOrUser().getCompanyId(), emailAddress);
		} catch (PortalException e) {
			e.printStackTrace();
			return null;
		}
		
		googleDevice.setUserId(user.getUserId());
		googleDevice.setEmailAddress(user.getEmailAddress());
		googleDevice.setRegistrationId(registrationId);
		googleDevice = GoogleDeviceLocalServiceUtil.updateGoogleDevice(googleDevice);
		
		if(isNew){
			Sender sender = new Sender(Constants.API_KEY);
			List<String> regIds = new ArrayList<String>();
			regIds.add(googleDevice.getRegistrationId());
			Message message = new Message.Builder()
				.delayWhileIdle(false)
				.collapseKey(String.valueOf(googleDevice.getGoogleDeviceId()))
				.addData("messageType", "registration")
				.build();
			try {
				sender.send(message, regIds, 5);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return googleDevice;
		
	}
	
	public GoogleDevice unregisterGoogleDevice(String registrationId) throws SystemException{
		GoogleDevice googleDevice = googleDevicePersistence.fetchByRegistrationId(registrationId);
		return GoogleDeviceLocalServiceUtil.deleteGoogleDevice(googleDevice);
	}
	
	public List<GoogleDevice> getGoogleDevicesByUserId(long userId) throws SystemException{
		return googleDevicePersistence.findByUserId(userId);
	}
	
}