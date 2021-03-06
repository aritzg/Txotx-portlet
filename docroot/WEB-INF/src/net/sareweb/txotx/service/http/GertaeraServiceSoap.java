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

import net.sareweb.txotx.service.GertaeraServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link net.sareweb.txotx.service.GertaeraServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link net.sareweb.txotx.model.GertaeraSoap}.
 * If the method in the service utility returns a
 * {@link net.sareweb.txotx.model.Gertaera}, that is translated to a
 * {@link net.sareweb.txotx.model.GertaeraSoap}. Methods that SOAP cannot
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
 * @see       GertaeraServiceHttp
 * @see       net.sareweb.txotx.model.GertaeraSoap
 * @see       net.sareweb.txotx.service.GertaeraServiceUtil
 * @generated
 */
public class GertaeraServiceSoap {
	public static net.sareweb.txotx.model.GertaeraSoap gehituTestuGertaera(
		long sagardotegiId, java.lang.String testua) throws RemoteException {
		try {
			net.sareweb.txotx.model.Gertaera returnValue = GertaeraServiceUtil.gehituTestuGertaera(sagardotegiId,
					testua);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.GertaeraSoap gehituTestuGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua) throws RemoteException {
		try {
			net.sareweb.txotx.model.Gertaera returnValue = GertaeraServiceUtil.gehituTestuGertaeraSagardotegian(sagardotegiId,
					testua);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.GertaeraSoap gehituTestuGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua) throws RemoteException {
		try {
			net.sareweb.txotx.model.Gertaera returnValue = GertaeraServiceUtil.gehituTestuGertaeraSagardoEgunean(sagardoEgunId,
					testua);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.GertaeraSoap gehituArgazkiGertaera(
		long sagardotegiId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia) throws RemoteException {
		try {
			net.sareweb.txotx.model.Gertaera returnValue = GertaeraServiceUtil.gehituArgazkiGertaera(sagardotegiId,
					testua, irudiKarpetaId, irudia);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.GertaeraSoap gehituArgazkiGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia) throws RemoteException {
		try {
			net.sareweb.txotx.model.Gertaera returnValue = GertaeraServiceUtil.gehituArgazkiGertaeraSagardotegian(sagardotegiId,
					testua, irudiKarpetaId, irudia);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.GertaeraSoap gehituArgazkiGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia) throws RemoteException {
		try {
			net.sareweb.txotx.model.Gertaera returnValue = GertaeraServiceUtil.gehituArgazkiGertaeraSagardoEgunean(sagardoEgunId,
					testua, irudiKarpetaId, irudia);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.GertaeraSoap gehituBalorazioGertaera(
		long sagardotegiId, java.lang.String testua, long balorazioa)
		throws RemoteException {
		try {
			net.sareweb.txotx.model.Gertaera returnValue = GertaeraServiceUtil.gehituBalorazioGertaera(sagardotegiId,
					testua, balorazioa);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.GertaeraSoap gehituBalorazioGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua, long balorazioa)
		throws RemoteException {
		try {
			net.sareweb.txotx.model.Gertaera returnValue = GertaeraServiceUtil.gehituBalorazioGertaeraSagardotegian(sagardotegiId,
					testua, balorazioa);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.GertaeraSoap gehituBalorazioGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua, long balorazioa)
		throws RemoteException {
		try {
			net.sareweb.txotx.model.Gertaera returnValue = GertaeraServiceUtil.gehituBalorazioGertaeraSagardoEgunean(sagardoEgunId,
					testua, balorazioa);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.GertaeraSoap[] getGertaerakOlderThanDate(
		long sagardotegiId, long date, int blockSize) throws RemoteException {
		try {
			java.util.List<net.sareweb.txotx.model.Gertaera> returnValue = GertaeraServiceUtil.getGertaerakOlderThanDate(sagardotegiId,
					date, blockSize);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.GertaeraSoap[] getGertaerakSagardotegianOlderThanDate(
		long sagardotegiId, long date, int blockSize) throws RemoteException {
		try {
			java.util.List<net.sareweb.txotx.model.Gertaera> returnValue = GertaeraServiceUtil.getGertaerakSagardotegianOlderThanDate(sagardotegiId,
					date, blockSize);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.GertaeraSoap[] getGertaerakSagardoEguneanOlderThanDate(
		long sagardoEgunId, long date, int blockSize) throws RemoteException {
		try {
			java.util.List<net.sareweb.txotx.model.Gertaera> returnValue = GertaeraServiceUtil.getGertaerakSagardoEguneanOlderThanDate(sagardoEgunId,
					date, blockSize);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.GertaeraSoap[] getGertaerakNewerThanDate(
		long sagardotegiId, long date, int blockSize) throws RemoteException {
		try {
			java.util.List<net.sareweb.txotx.model.Gertaera> returnValue = GertaeraServiceUtil.getGertaerakNewerThanDate(sagardotegiId,
					date, blockSize);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.GertaeraSoap[] getGertaerakSagardotegianNewerThanDate(
		long sagardotegiId, long date, int blockSize) throws RemoteException {
		try {
			java.util.List<net.sareweb.txotx.model.Gertaera> returnValue = GertaeraServiceUtil.getGertaerakSagardotegianNewerThanDate(sagardotegiId,
					date, blockSize);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.txotx.model.GertaeraSoap[] getGertaerakSagardoEguneanNewerThanDate(
		long sagardoEgunId, long date, int blockSize) throws RemoteException {
		try {
			java.util.List<net.sareweb.txotx.model.Gertaera> returnValue = GertaeraServiceUtil.getGertaerakSagardoEguneanNewerThanDate(sagardoEgunId,
					date, blockSize);

			return net.sareweb.txotx.model.GertaeraSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void fake() throws RemoteException {
		try {
			GertaeraServiceUtil.fake();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(GertaeraServiceSoap.class);
}