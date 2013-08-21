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

package net.sareweb.txotx.service.base;

import net.sareweb.txotx.service.JarraipenServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class JarraipenServiceClpInvoker {
	public JarraipenServiceClpInvoker() {
		_methodName64 = "getBeanIdentifier";

		_methodParameterTypes64 = new String[] {  };

		_methodName65 = "setBeanIdentifier";

		_methodParameterTypes65 = new String[] { "java.lang.String" };

		_methodName70 = "gehituJarraipenaByEmail";

		_methodParameterTypes70 = new String[] {
				"java.lang.String", "long", "java.lang.String"
			};

		_methodName71 = "gehituJarraipena";

		_methodParameterTypes71 = new String[] {
				"long", "long", "java.lang.String"
			};

		_methodName72 = "getJarraipenakByEmail";

		_methodParameterTypes72 = new String[] { "java.lang.String" };

		_methodName73 = "getJarraipenak";

		_methodParameterTypes73 = new String[] { "long" };

		_methodName74 = "getErabiltzailearenJarraitzaileak";

		_methodParameterTypes74 = new String[] { "long" };

		_methodName75 = "getSagardotegiarenJarraitzaileak";

		_methodParameterTypes75 = new String[] { "long" };

		_methodName76 = "getSagardoEgunarenJarraitzaileak";

		_methodParameterTypes76 = new String[] { "long" };

		_methodName77 = "deleteJarraipena";

		_methodParameterTypes77 = new String[] { "java.lang.String", "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName64.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
			return JarraipenServiceUtil.getBeanIdentifier();
		}

		if (_methodName65.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes65, parameterTypes)) {
			JarraipenServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName70.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
			return JarraipenServiceUtil.gehituJarraipenaByEmail((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(), (java.lang.String)arguments[2]);
		}

		if (_methodName71.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes71, parameterTypes)) {
			return JarraipenServiceUtil.gehituJarraipena(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (java.lang.String)arguments[2]);
		}

		if (_methodName72.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
			return JarraipenServiceUtil.getJarraipenakByEmail((java.lang.String)arguments[0]);
		}

		if (_methodName73.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes73, parameterTypes)) {
			return JarraipenServiceUtil.getJarraipenak(((Long)arguments[0]).longValue());
		}

		if (_methodName74.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
			return JarraipenServiceUtil.getErabiltzailearenJarraitzaileak(((Long)arguments[0]).longValue());
		}

		if (_methodName75.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
			return JarraipenServiceUtil.getSagardotegiarenJarraitzaileak(((Long)arguments[0]).longValue());
		}

		if (_methodName76.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
			return JarraipenServiceUtil.getSagardoEgunarenJarraitzaileak(((Long)arguments[0]).longValue());
		}

		if (_methodName77.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
			return JarraipenServiceUtil.deleteJarraipena((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName64;
	private String[] _methodParameterTypes64;
	private String _methodName65;
	private String[] _methodParameterTypes65;
	private String _methodName70;
	private String[] _methodParameterTypes70;
	private String _methodName71;
	private String[] _methodParameterTypes71;
	private String _methodName72;
	private String[] _methodParameterTypes72;
	private String _methodName73;
	private String[] _methodParameterTypes73;
	private String _methodName74;
	private String[] _methodParameterTypes74;
	private String _methodName75;
	private String[] _methodParameterTypes75;
	private String _methodName76;
	private String[] _methodParameterTypes76;
	private String _methodName77;
	private String[] _methodParameterTypes77;
}