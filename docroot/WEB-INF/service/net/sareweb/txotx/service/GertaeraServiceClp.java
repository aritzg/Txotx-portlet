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

package net.sareweb.txotx.service;

import com.liferay.portal.service.InvokableService;

/**
 * @author A.Galdos
 */
public class GertaeraServiceClp implements GertaeraService {
	public GertaeraServiceClp(InvokableService invokableService) {
		_invokableService = invokableService;

		_methodName0 = "getBeanIdentifier";

		_methodParameterTypes0 = new String[] {  };

		_methodName1 = "setBeanIdentifier";

		_methodParameterTypes1 = new String[] { "java.lang.String" };

		_methodName3 = "gehituTestuGertaera";

		_methodParameterTypes3 = new String[] { "long", "java.lang.String" };

		_methodName4 = "gehituTestuGertaeraSagardotegian";

		_methodParameterTypes4 = new String[] { "long", "java.lang.String" };

		_methodName5 = "gehituTestuGertaeraSagardoEgunean";

		_methodParameterTypes5 = new String[] { "long", "java.lang.String" };

		_methodName6 = "gehituArgazkiGertaera";

		_methodParameterTypes6 = new String[] {
				"long", "java.lang.String", "long", "java.lang.String"
			};

		_methodName7 = "gehituArgazkiGertaeraSagardotegian";

		_methodParameterTypes7 = new String[] {
				"long", "java.lang.String", "long", "java.lang.String"
			};

		_methodName8 = "gehituArgazkiGertaeraSagardoEgunean";

		_methodParameterTypes8 = new String[] {
				"long", "java.lang.String", "long", "java.lang.String"
			};

		_methodName9 = "gehituBalorazioGertaera";

		_methodParameterTypes9 = new String[] { "long", "java.lang.String", "long" };

		_methodName10 = "gehituBalorazioGertaeraSagardotegian";

		_methodParameterTypes10 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName11 = "gehituBalorazioGertaeraSagardoEgunean";

		_methodParameterTypes11 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName12 = "getGertaerakOlderThanDate";

		_methodParameterTypes12 = new String[] { "long", "long", "int" };

		_methodName13 = "getGertaerakNewerThanDate";

		_methodParameterTypes13 = new String[] { "long", "long", "int" };

		_methodName14 = "fake";

		_methodParameterTypes14 = new String[] {  };
	}

	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName0,
					_methodParameterTypes0, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableService.invokeMethod(_methodName1,
				_methodParameterTypes1,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	public net.sareweb.txotx.model.Gertaera gehituTestuGertaera(
		long sagardotegiId, java.lang.String testua)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] {
						sagardotegiId,
						
					ClpSerializer.translateInput(testua)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.liferay.portal.security.auth.PrincipalException) {
				throw (com.liferay.portal.security.auth.PrincipalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (net.sareweb.txotx.model.Gertaera)ClpSerializer.translateOutput(returnObj);
	}

	public net.sareweb.txotx.model.Gertaera gehituTestuGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName4,
					_methodParameterTypes4,
					new Object[] {
						sagardotegiId,
						
					ClpSerializer.translateInput(testua)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.liferay.portal.security.auth.PrincipalException) {
				throw (com.liferay.portal.security.auth.PrincipalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (net.sareweb.txotx.model.Gertaera)ClpSerializer.translateOutput(returnObj);
	}

	public net.sareweb.txotx.model.Gertaera gehituTestuGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName5,
					_methodParameterTypes5,
					new Object[] {
						sagardoEgunId,
						
					ClpSerializer.translateInput(testua)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.liferay.portal.security.auth.PrincipalException) {
				throw (com.liferay.portal.security.auth.PrincipalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (net.sareweb.txotx.model.Gertaera)ClpSerializer.translateOutput(returnObj);
	}

	public net.sareweb.txotx.model.Gertaera gehituArgazkiGertaera(
		long sagardotegiId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] {
						sagardotegiId,
						
					ClpSerializer.translateInput(testua),
						
					irudiKarpetaId,
						
					ClpSerializer.translateInput(irudia)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.liferay.portal.security.auth.PrincipalException) {
				throw (com.liferay.portal.security.auth.PrincipalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (net.sareweb.txotx.model.Gertaera)ClpSerializer.translateOutput(returnObj);
	}

	public net.sareweb.txotx.model.Gertaera gehituArgazkiGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName7,
					_methodParameterTypes7,
					new Object[] {
						sagardotegiId,
						
					ClpSerializer.translateInput(testua),
						
					irudiKarpetaId,
						
					ClpSerializer.translateInput(irudia)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.liferay.portal.security.auth.PrincipalException) {
				throw (com.liferay.portal.security.auth.PrincipalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (net.sareweb.txotx.model.Gertaera)ClpSerializer.translateOutput(returnObj);
	}

	public net.sareweb.txotx.model.Gertaera gehituArgazkiGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua, long irudiKarpetaId,
		java.lang.String irudia)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName8,
					_methodParameterTypes8,
					new Object[] {
						sagardoEgunId,
						
					ClpSerializer.translateInput(testua),
						
					irudiKarpetaId,
						
					ClpSerializer.translateInput(irudia)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.liferay.portal.security.auth.PrincipalException) {
				throw (com.liferay.portal.security.auth.PrincipalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (net.sareweb.txotx.model.Gertaera)ClpSerializer.translateOutput(returnObj);
	}

	public net.sareweb.txotx.model.Gertaera gehituBalorazioGertaera(
		long sagardotegiId, java.lang.String testua, long balorazioa)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName9,
					_methodParameterTypes9,
					new Object[] {
						sagardotegiId,
						
					ClpSerializer.translateInput(testua),
						
					balorazioa
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.liferay.portal.security.auth.PrincipalException) {
				throw (com.liferay.portal.security.auth.PrincipalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (net.sareweb.txotx.model.Gertaera)ClpSerializer.translateOutput(returnObj);
	}

	public net.sareweb.txotx.model.Gertaera gehituBalorazioGertaeraSagardotegian(
		long sagardotegiId, java.lang.String testua, long balorazioa)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName10,
					_methodParameterTypes10,
					new Object[] {
						sagardotegiId,
						
					ClpSerializer.translateInput(testua),
						
					balorazioa
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.liferay.portal.security.auth.PrincipalException) {
				throw (com.liferay.portal.security.auth.PrincipalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (net.sareweb.txotx.model.Gertaera)ClpSerializer.translateOutput(returnObj);
	}

	public net.sareweb.txotx.model.Gertaera gehituBalorazioGertaeraSagardoEgunean(
		long sagardoEgunId, java.lang.String testua, long balorazioa)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName11,
					_methodParameterTypes11,
					new Object[] {
						sagardoEgunId,
						
					ClpSerializer.translateInput(testua),
						
					balorazioa
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.liferay.portal.security.auth.PrincipalException) {
				throw (com.liferay.portal.security.auth.PrincipalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (net.sareweb.txotx.model.Gertaera)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakOlderThanDate(
		long sagardotegiId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName12,
					_methodParameterTypes12,
					new Object[] { sagardotegiId, date, blockSize });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<net.sareweb.txotx.model.Gertaera>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<net.sareweb.txotx.model.Gertaera> getGertaerakNewerThanDate(
		long sagardotegiId, long date, int blockSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName13,
					_methodParameterTypes13,
					new Object[] { sagardotegiId, date, blockSize });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<net.sareweb.txotx.model.Gertaera>)ClpSerializer.translateOutput(returnObj);
	}

	public void fake()
		throws com.liferay.portal.security.auth.PrincipalException {
		try {
			_invokableService.invokeMethod(_methodName14,
				_methodParameterTypes14, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.security.auth.PrincipalException) {
				throw (com.liferay.portal.security.auth.PrincipalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	private InvokableService _invokableService;
	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
}