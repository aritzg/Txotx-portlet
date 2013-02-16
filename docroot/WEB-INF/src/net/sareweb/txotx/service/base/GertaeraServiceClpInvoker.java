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

import net.sareweb.txotx.service.GertaeraServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class GertaeraServiceClpInvoker {
	public GertaeraServiceClpInvoker() {
		_methodName34 = "getBeanIdentifier";

		_methodParameterTypes34 = new String[] {  };

		_methodName35 = "setBeanIdentifier";

		_methodParameterTypes35 = new String[] { "java.lang.String" };

		_methodName40 = "gehituTestuGertaera";

		_methodParameterTypes40 = new String[] { "long", "java.lang.String" };

		_methodName41 = "gehituArgazkiGertaera";

		_methodParameterTypes41 = new String[] {
				"long", "java.lang.String", "long", "java.lang.String"
			};

		_methodName42 = "gehituBalorazioGertaera";

		_methodParameterTypes42 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName43 = "getGertaerakOlderThanDate";

		_methodParameterTypes43 = new String[] { "long", "long", "int" };

		_methodName44 = "getGertaerakNewerThanDate";

		_methodParameterTypes44 = new String[] { "long", "long", "int" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName34.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
			return GertaeraServiceUtil.getBeanIdentifier();
		}

		if (_methodName35.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
			GertaeraServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			return GertaeraServiceUtil.gehituTestuGertaera(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
			return GertaeraServiceUtil.gehituArgazkiGertaera(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(), (java.lang.String)arguments[3]);
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return GertaeraServiceUtil.gehituBalorazioGertaera(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return GertaeraServiceUtil.getGertaerakOlderThanDate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			return GertaeraServiceUtil.getGertaerakNewerThanDate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName34;
	private String[] _methodParameterTypes34;
	private String _methodName35;
	private String[] _methodParameterTypes35;
	private String _methodName40;
	private String[] _methodParameterTypes40;
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
}