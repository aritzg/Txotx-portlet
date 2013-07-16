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

package net.sareweb.txotx.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import net.sareweb.txotx.service.OharraServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link net.sareweb.txotx.service.OharraServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link net.sareweb.txotx.model.OharraSoap}.
 * If the method in the service utility returns a
 * {@link net.sareweb.txotx.model.Oharra}, that is translated to a
 * {@link net.sareweb.txotx.model.OharraSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at
 * http://localhost:8080/api/secure/axis. Set the property
 * <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author    A.Galdos
 * @see       OharraServiceHttp
 * @see       net.sareweb.txotx.model.OharraSoap
 * @see       net.sareweb.txotx.service.OharraServiceUtil
 * @generated
 */
public class OharraServiceSoap {
	public static net.sareweb.txotx.model.OharraSoap getAzkenErronka()
		throws RemoteException {
		try {
			net.sareweb.txotx.model.Oharra returnValue = OharraServiceUtil.getAzkenErronka();

			return net.sareweb.txotx.model.OharraSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.OharraSoap getAzkenOharra()
		throws RemoteException {
		try {
			net.sareweb.txotx.model.Oharra returnValue = OharraServiceUtil.getAzkenOharra();

			return net.sareweb.txotx.model.OharraSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.OharraSoap getOharra(long oharraId)
		throws RemoteException {
		try {
			net.sareweb.txotx.model.Oharra returnValue = OharraServiceUtil.getOharra(oharraId);

			return net.sareweb.txotx.model.OharraSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void bidaliOharra(long oharraId) throws RemoteException {
		try {
			OharraServiceUtil.bidaliOharra(oharraId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void bidaliOharra(long oharraId,
		java.lang.String toEmailAddress) throws RemoteException {
		try {
			OharraServiceUtil.bidaliOharra(oharraId, toEmailAddress);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(OharraServiceSoap.class);
}