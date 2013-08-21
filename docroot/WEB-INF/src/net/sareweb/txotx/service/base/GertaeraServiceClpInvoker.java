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
		_methodName64 = "getBeanIdentifier";

		_methodParameterTypes64 = new String[] {  };

		_methodName65 = "setBeanIdentifier";

		_methodParameterTypes65 = new String[] { "java.lang.String" };

		_methodName70 = "gehituTestuGertaera";

		_methodParameterTypes70 = new String[] { "long", "java.lang.String" };

		_methodName71 = "gehituTestuGertaeraSagardotegian";

		_methodParameterTypes71 = new String[] { "long", "java.lang.String" };

		_methodName72 = "gehituTestuGertaeraSagardoEgunean";

		_methodParameterTypes72 = new String[] { "long", "java.lang.String" };

		_methodName74 = "gehituArgazkiGertaera";

		_methodParameterTypes74 = new String[] {
				"long", "java.lang.String", "long", "java.lang.String"
			};

		_methodName75 = "gehituArgazkiGertaeraSagardotegian";

		_methodParameterTypes75 = new String[] {
				"long", "java.lang.String", "long", "java.lang.String"
			};

		_methodName76 = "gehituArgazkiGertaeraSagardoEgunean";

		_methodParameterTypes76 = new String[] {
				"long", "java.lang.String", "long", "java.lang.String"
			};

		_methodName78 = "gehituBalorazioGertaera";

		_methodParameterTypes78 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName79 = "gehituBalorazioGertaeraSagardotegian";

		_methodParameterTypes79 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName80 = "gehituBalorazioGertaeraSagardoEgunean";

		_methodParameterTypes80 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName82 = "getGertaerakOlderThanDate";

		_methodParameterTypes82 = new String[] { "long", "long", "int" };

		_methodName83 = "getGertaerakSagardotegianOlderThanDate";

		_methodParameterTypes83 = new String[] { "long", "long", "int" };

		_methodName84 = "getGertaerakSagardoEguneanOlderThanDate";

		_methodParameterTypes84 = new String[] { "long", "long", "int" };

		_methodName86 = "getGertaerakNewerThanDate";

		_methodParameterTypes86 = new String[] { "long", "long", "int" };

		_methodName87 = "getGertaerakSagardotegianNewerThanDate";

		_methodParameterTypes87 = new String[] { "long", "long", "int" };

		_methodName88 = "getGertaerakSagardoEguneanNewerThanDate";

		_methodParameterTypes88 = new String[] { "long", "long", "int" };

		_methodName91 = "fake";

		_methodParameterTypes91 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName64.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
			return GertaeraServiceUtil.getBeanIdentifier();
		}

		if (_methodName65.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes65, parameterTypes)) {
			GertaeraServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName70.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
			return GertaeraServiceUtil.gehituTestuGertaera(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName71.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes71, parameterTypes)) {
			return GertaeraServiceUtil.gehituTestuGertaeraSagardotegian(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName72.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
			return GertaeraServiceUtil.gehituTestuGertaeraSagardoEgunean(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName74.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
			return GertaeraServiceUtil.gehituArgazkiGertaera(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(), (java.lang.String)arguments[3]);
		}

		if (_methodName75.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
			return GertaeraServiceUtil.gehituArgazkiGertaeraSagardotegian(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(), (java.lang.String)arguments[3]);
		}

		if (_methodName76.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
			return GertaeraServiceUtil.gehituArgazkiGertaeraSagardoEgunean(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(), (java.lang.String)arguments[3]);
		}

		if (_methodName78.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
			return GertaeraServiceUtil.gehituBalorazioGertaera(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
		}

		if (_methodName79.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
			return GertaeraServiceUtil.gehituBalorazioGertaeraSagardotegian(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
		}

		if (_methodName80.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
			return GertaeraServiceUtil.gehituBalorazioGertaeraSagardoEgunean(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
		}

		if (_methodName82.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
			return GertaeraServiceUtil.getGertaerakOlderThanDate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName83.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes83, parameterTypes)) {
			return GertaeraServiceUtil.getGertaerakSagardotegianOlderThanDate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return GertaeraServiceUtil.getGertaerakSagardoEguneanOlderThanDate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName86.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
			return GertaeraServiceUtil.getGertaerakNewerThanDate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName87.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
			return GertaeraServiceUtil.getGertaerakSagardotegianNewerThanDate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName88.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
			return GertaeraServiceUtil.getGertaerakSagardoEguneanNewerThanDate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			GertaeraServiceUtil.fake();
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
	private String _methodName74;
	private String[] _methodParameterTypes74;
	private String _methodName75;
	private String[] _methodParameterTypes75;
	private String _methodName76;
	private String[] _methodParameterTypes76;
	private String _methodName78;
	private String[] _methodParameterTypes78;
	private String _methodName79;
	private String[] _methodParameterTypes79;
	private String _methodName80;
	private String[] _methodParameterTypes80;
	private String _methodName82;
	private String[] _methodParameterTypes82;
	private String _methodName83;
	private String[] _methodParameterTypes83;
	private String _methodName84;
	private String[] _methodParameterTypes84;
	private String _methodName86;
	private String[] _methodParameterTypes86;
	private String _methodName87;
	private String[] _methodParameterTypes87;
	private String _methodName88;
	private String[] _methodParameterTypes88;
	private String _methodName91;
	private String[] _methodParameterTypes91;
}