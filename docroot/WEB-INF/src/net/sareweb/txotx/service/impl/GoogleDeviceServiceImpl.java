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

import java.util.Date;
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

import net.sareweb.txotx.model.GoogleDevice;
import net.sareweb.txotx.service.GoogleDeviceLocalServiceUtil;
import net.sareweb.txotx.service.base.GoogleDeviceServiceBaseImpl;

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
	
	public void addGoogeDevice(String emailAddress, String registrationId) throws SystemException{
		GoogleDevice googleDevice;
		User user = null;;
		Date now = new Date();
		try {
			googleDevice = googleDevicePersistence.findByRegistrationId(registrationId);
			googleDevice.setCreateDate(now);
		} catch (Exception e) {
			googleDevice =GoogleDeviceLocalServiceUtil.createGoogleDevice(CounterLocalServiceUtil.increment());
		}
		googleDevice.setModifiedDate(now);
		
		try {
			user = UserLocalServiceUtil.getUserByEmailAddress(getGuestOrUser().getCompanyId(), emailAddress);
		} catch (PortalException e) {
			e.printStackTrace();
			return;
		}
		
		googleDevice.setUserId(user.getUserId());
		googleDevice.setEmailAddress(user.getEmailAddress());
		googleDevice.setRegistrationId(registrationId);
		
		GoogleDeviceLocalServiceUtil.updateGoogleDevice(googleDevice);
		
	}
	
	public List<GoogleDevice> getGoogleDevicesByUserId(long userId) throws SystemException{
		return googleDevicePersistence.findByUserId(userId);
	}
	
}