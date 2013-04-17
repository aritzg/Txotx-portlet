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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import net.sareweb.txotx.model.GertaeraClp;
import net.sareweb.txotx.model.GoogleDeviceClp;
import net.sareweb.txotx.model.JarraipenClp;
import net.sareweb.txotx.model.OharraClp;
import net.sareweb.txotx.model.SagardoEgunClp;
import net.sareweb.txotx.model.SagardotegiClp;
import net.sareweb.txotx.model.SailkapenaClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"Txotx-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"Txotx-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "Txotx-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(GertaeraClp.class.getName())) {
			return translateInputGertaera(oldModel);
		}

		if (oldModelClassName.equals(GoogleDeviceClp.class.getName())) {
			return translateInputGoogleDevice(oldModel);
		}

		if (oldModelClassName.equals(JarraipenClp.class.getName())) {
			return translateInputJarraipen(oldModel);
		}

		if (oldModelClassName.equals(OharraClp.class.getName())) {
			return translateInputOharra(oldModel);
		}

		if (oldModelClassName.equals(SagardoEgunClp.class.getName())) {
			return translateInputSagardoEgun(oldModel);
		}

		if (oldModelClassName.equals(SagardotegiClp.class.getName())) {
			return translateInputSagardotegi(oldModel);
		}

		if (oldModelClassName.equals(SailkapenaClp.class.getName())) {
			return translateInputSailkapena(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputGertaera(BaseModel<?> oldModel) {
		GertaeraClp oldClpModel = (GertaeraClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getGertaeraRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputGoogleDevice(BaseModel<?> oldModel) {
		GoogleDeviceClp oldClpModel = (GoogleDeviceClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getGoogleDeviceRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputJarraipen(BaseModel<?> oldModel) {
		JarraipenClp oldClpModel = (JarraipenClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getJarraipenRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputOharra(BaseModel<?> oldModel) {
		OharraClp oldClpModel = (OharraClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getOharraRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSagardoEgun(BaseModel<?> oldModel) {
		SagardoEgunClp oldClpModel = (SagardoEgunClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSagardoEgunRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSagardotegi(BaseModel<?> oldModel) {
		SagardotegiClp oldClpModel = (SagardotegiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSagardotegiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSailkapena(BaseModel<?> oldModel) {
		SailkapenaClp oldClpModel = (SailkapenaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSailkapenaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"net.sareweb.txotx.model.impl.GertaeraImpl")) {
			return translateOutputGertaera(oldModel);
		}

		if (oldModelClassName.equals(
					"net.sareweb.txotx.model.impl.GoogleDeviceImpl")) {
			return translateOutputGoogleDevice(oldModel);
		}

		if (oldModelClassName.equals(
					"net.sareweb.txotx.model.impl.JarraipenImpl")) {
			return translateOutputJarraipen(oldModel);
		}

		if (oldModelClassName.equals("net.sareweb.txotx.model.impl.OharraImpl")) {
			return translateOutputOharra(oldModel);
		}

		if (oldModelClassName.equals(
					"net.sareweb.txotx.model.impl.SagardoEgunImpl")) {
			return translateOutputSagardoEgun(oldModel);
		}

		if (oldModelClassName.equals(
					"net.sareweb.txotx.model.impl.SagardotegiImpl")) {
			return translateOutputSagardotegi(oldModel);
		}

		if (oldModelClassName.equals(
					"net.sareweb.txotx.model.impl.SailkapenaImpl")) {
			return translateOutputSailkapena(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals("net.sareweb.txotx.NoSuchGertaeraException")) {
			return new net.sareweb.txotx.NoSuchGertaeraException();
		}

		if (className.equals("net.sareweb.txotx.NoSuchGoogleDeviceException")) {
			return new net.sareweb.txotx.NoSuchGoogleDeviceException();
		}

		if (className.equals("net.sareweb.txotx.NoSuchJarraipenException")) {
			return new net.sareweb.txotx.NoSuchJarraipenException();
		}

		if (className.equals("net.sareweb.txotx.NoSuchOharraException")) {
			return new net.sareweb.txotx.NoSuchOharraException();
		}

		if (className.equals("net.sareweb.txotx.NoSuchSagardoEgunException")) {
			return new net.sareweb.txotx.NoSuchSagardoEgunException();
		}

		if (className.equals("net.sareweb.txotx.NoSuchSagardotegiException")) {
			return new net.sareweb.txotx.NoSuchSagardotegiException();
		}

		if (className.equals("net.sareweb.txotx.NoSuchSailkapenaException")) {
			return new net.sareweb.txotx.NoSuchSailkapenaException();
		}

		return throwable;
	}

	public static Object translateOutputGertaera(BaseModel<?> oldModel) {
		GertaeraClp newModel = new GertaeraClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setGertaeraRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputGoogleDevice(BaseModel<?> oldModel) {
		GoogleDeviceClp newModel = new GoogleDeviceClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setGoogleDeviceRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputJarraipen(BaseModel<?> oldModel) {
		JarraipenClp newModel = new JarraipenClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setJarraipenRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputOharra(BaseModel<?> oldModel) {
		OharraClp newModel = new OharraClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setOharraRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSagardoEgun(BaseModel<?> oldModel) {
		SagardoEgunClp newModel = new SagardoEgunClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSagardoEgunRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSagardotegi(BaseModel<?> oldModel) {
		SagardotegiClp newModel = new SagardotegiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSagardotegiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSailkapena(BaseModel<?> oldModel) {
		SailkapenaClp newModel = new SailkapenaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSailkapenaRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}