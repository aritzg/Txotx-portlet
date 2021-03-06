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

package net.sareweb.txotx.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import net.sareweb.txotx.service.APKVersionLocalServiceUtil;
import net.sareweb.txotx.service.APKVersionServiceUtil;
import net.sareweb.txotx.service.ClpSerializer;
import net.sareweb.txotx.service.GertaeraLocalServiceUtil;
import net.sareweb.txotx.service.GertaeraServiceUtil;
import net.sareweb.txotx.service.GoogleDeviceLocalServiceUtil;
import net.sareweb.txotx.service.GoogleDeviceServiceUtil;
import net.sareweb.txotx.service.JarraipenLocalServiceUtil;
import net.sareweb.txotx.service.JarraipenServiceUtil;
import net.sareweb.txotx.service.OharraLocalServiceUtil;
import net.sareweb.txotx.service.OharraServiceUtil;
import net.sareweb.txotx.service.SagardoEgunLocalServiceUtil;
import net.sareweb.txotx.service.SagardoEgunServiceUtil;
import net.sareweb.txotx.service.SagardotegiLocalServiceUtil;
import net.sareweb.txotx.service.SagardotegiServiceUtil;
import net.sareweb.txotx.service.SailkapenaLocalServiceUtil;
import net.sareweb.txotx.service.SailkapenaServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			APKVersionLocalServiceUtil.clearService();

			APKVersionServiceUtil.clearService();
			GertaeraLocalServiceUtil.clearService();

			GertaeraServiceUtil.clearService();
			GoogleDeviceLocalServiceUtil.clearService();

			GoogleDeviceServiceUtil.clearService();
			JarraipenLocalServiceUtil.clearService();

			JarraipenServiceUtil.clearService();
			OharraLocalServiceUtil.clearService();

			OharraServiceUtil.clearService();
			SagardoEgunLocalServiceUtil.clearService();

			SagardoEgunServiceUtil.clearService();
			SagardotegiLocalServiceUtil.clearService();

			SagardotegiServiceUtil.clearService();
			SailkapenaLocalServiceUtil.clearService();

			SailkapenaServiceUtil.clearService();
		}
	}
}