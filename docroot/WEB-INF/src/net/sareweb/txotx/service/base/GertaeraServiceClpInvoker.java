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
		_methodName58 = "getBeanIdentifier";

		_methodParameterTypes58 = new String[] {  };

		_methodName59 = "setBeanIdentifier";

		_methodParameterTypes59 = new String[] { "java.lang.String" };

		_methodName64 = "gehituTestuGertaera";

		_methodParameterTypes64 = new String[] { "long", "java.lang.String" };

		_methodName65 = "gehituTestuGertaeraSagardotegian";

		_methodParameterTypes65 = new String[] { "long", "java.lang.String" };

		_methodName66 = "gehituTestuGertaeraSagardoEgunean";

		_methodParameterTypes66 = new String[] { "long", "java.lang.String" };

		_methodName68 = "gehituArgazkiGertaera";

		_methodParameterTypes68 = new String[] {
				"long", "java.lang.String", "long", "java.lang.String"
			};

		_methodName69 = "gehituArgazkiGertaeraSagardotegian";

		_methodParameterTypes69 = new String[] {
				"long", "java.lang.String", "long", "java.lang.String"
			};

		_methodName70 = "gehituArgazkiGertaeraSagardoEgunean";

		_methodParameterTypes70 = new String[] {
				"long", "java.lang.String", "long", "java.lang.String"
			};

		_methodName72 = "gehituBalorazioGertaera";

		_methodParameterTypes72 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName73 = "gehituBalorazioGertaeraSagardotegian";

		_methodParameterTypes73 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName74 = "gehituBalorazioGertaeraSagardoEgunean";

		_methodParameterTypes74 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName76 = "getGertaerakOlderThanDate";

		_methodParameterTypes76 = new String[] { "long", "long", "int" };

		_methodName77 = "getGertaerakNewerThanDate";

		_methodParameterTypes77 = new String[] { "long", "long", "int" };

		_methodName79 = "fake";

		_methodParameterTypes79 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName58.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
			return GertaeraServiceUtil.getBeanIdentifier();
		}

		if (_methodName59.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
			GertaeraServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName64.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
			return GertaeraServiceUtil.gehituTestuGertaera(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName65.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes65, parameterTypes)) {
			return GertaeraServiceUtil.gehituTestuGertaeraSagardotegian(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName66.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
			return GertaeraServiceUtil.gehituTestuGertaeraSagardoEgunean(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName68.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
			return GertaeraServiceUtil.gehituArgazkiGertaera(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(), (java.lang.String)arguments[3]);
		}

		if (_methodName69.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
			return GertaeraServiceUtil.gehituArgazkiGertaeraSagardotegian(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(), (java.lang.String)arguments[3]);
		}

		if (_methodName70.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
			return GertaeraServiceUtil.gehituArgazkiGertaeraSagardoEgunean(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(), (java.lang.String)arguments[3]);
		}

		if (_methodName72.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
			return GertaeraServiceUtil.gehituBalorazioGertaera(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
		}

		if (_methodName73.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes73, parameterTypes)) {
			return GertaeraServiceUtil.gehituBalorazioGertaeraSagardotegian(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
		}

		if (_methodName74.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
			return GertaeraServiceUtil.gehituBalorazioGertaeraSagardoEgunean(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
		}

		if (_methodName76.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
			return GertaeraServiceUtil.getGertaerakOlderThanDate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName77.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
			return GertaeraServiceUtil.getGertaerakNewerThanDate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName79.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
			GertaeraServiceUtil.fake();
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName58;
	private String[] _methodParameterTypes58;
	private String _methodName59;
	private String[] _methodParameterTypes59;
	private String _methodName64;
	private String[] _methodParameterTypes64;
	private String _methodName65;
	private String[] _methodParameterTypes65;
	private String _methodName66;
	private String[] _methodParameterTypes66;
	private String _methodName68;
	private String[] _methodParameterTypes68;
	private String _methodName69;
	private String[] _methodParameterTypes69;
	private String _methodName70;
	private String[] _methodParameterTypes70;
	private String _methodName72;
	private String[] _methodParameterTypes72;
	private String _methodName73;
	private String[] _methodParameterTypes73;
	private String _methodName74;
	private String[] _methodParameterTypes74;
	private String _methodName76;
	private String[] _methodParameterTypes76;
	private String _methodName77;
	private String[] _methodParameterTypes77;
	private String _methodName79;
	private String[] _methodParameterTypes79;
}