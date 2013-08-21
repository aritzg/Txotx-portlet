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

package net.sareweb.txotx.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import net.sareweb.txotx.NoSuchOharraException;
import net.sareweb.txotx.model.Oharra;
import net.sareweb.txotx.model.impl.OharraImpl;
import net.sareweb.txotx.model.impl.OharraModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the oharra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see OharraPersistence
 * @see OharraUtil
 * @generated
 */
public class OharraPersistenceImpl extends BasePersistenceImpl<Oharra>
	implements OharraPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OharraUtil} to access the oharra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OharraImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OharraModelImpl.ENTITY_CACHE_ENABLED,
			OharraModelImpl.FINDER_CACHE_ENABLED, OharraImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OharraModelImpl.ENTITY_CACHE_ENABLED,
			OharraModelImpl.FINDER_CACHE_ENABLED, OharraImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OharraModelImpl.ENTITY_CACHE_ENABLED,
			OharraModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the oharra in the entity cache if it is enabled.
	 *
	 * @param oharra the oharra
	 */
	public void cacheResult(Oharra oharra) {
		EntityCacheUtil.putResult(OharraModelImpl.ENTITY_CACHE_ENABLED,
			OharraImpl.class, oharra.getPrimaryKey(), oharra);

		oharra.resetOriginalValues();
	}

	/**
	 * Caches the oharras in the entity cache if it is enabled.
	 *
	 * @param oharras the oharras
	 */
	public void cacheResult(List<Oharra> oharras) {
		for (Oharra oharra : oharras) {
			if (EntityCacheUtil.getResult(
						OharraModelImpl.ENTITY_CACHE_ENABLED, OharraImpl.class,
						oharra.getPrimaryKey()) == null) {
				cacheResult(oharra);
			}
			else {
				oharra.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all oharras.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OharraImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OharraImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the oharra.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Oharra oharra) {
		EntityCacheUtil.removeResult(OharraModelImpl.ENTITY_CACHE_ENABLED,
			OharraImpl.class, oharra.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Oharra> oharras) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Oharra oharra : oharras) {
			EntityCacheUtil.removeResult(OharraModelImpl.ENTITY_CACHE_ENABLED,
				OharraImpl.class, oharra.getPrimaryKey());
		}
	}

	/**
	 * Creates a new oharra with the primary key. Does not add the oharra to the database.
	 *
	 * @param oharraId the primary key for the new oharra
	 * @return the new oharra
	 */
	public Oharra create(long oharraId) {
		Oharra oharra = new OharraImpl();

		oharra.setNew(true);
		oharra.setPrimaryKey(oharraId);

		return oharra;
	}

	/**
	 * Removes the oharra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oharraId the primary key of the oharra
	 * @return the oharra that was removed
	 * @throws net.sareweb.txotx.NoSuchOharraException if a oharra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Oharra remove(long oharraId)
		throws NoSuchOharraException, SystemException {
		return remove(Long.valueOf(oharraId));
	}

	/**
	 * Removes the oharra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the oharra
	 * @return the oharra that was removed
	 * @throws net.sareweb.txotx.NoSuchOharraException if a oharra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oharra remove(Serializable primaryKey)
		throws NoSuchOharraException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Oharra oharra = (Oharra)session.get(OharraImpl.class, primaryKey);

			if (oharra == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOharraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oharra);
		}
		catch (NoSuchOharraException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Oharra removeImpl(Oharra oharra) throws SystemException {
		oharra = toUnwrappedModel(oharra);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, oharra);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(oharra);

		return oharra;
	}

	@Override
	public Oharra updateImpl(net.sareweb.txotx.model.Oharra oharra,
		boolean merge) throws SystemException {
		oharra = toUnwrappedModel(oharra);

		boolean isNew = oharra.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, oharra, merge);

			oharra.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(OharraModelImpl.ENTITY_CACHE_ENABLED,
			OharraImpl.class, oharra.getPrimaryKey(), oharra);

		return oharra;
	}

	protected Oharra toUnwrappedModel(Oharra oharra) {
		if (oharra instanceof OharraImpl) {
			return oharra;
		}

		OharraImpl oharraImpl = new OharraImpl();

		oharraImpl.setNew(oharra.isNew());
		oharraImpl.setPrimaryKey(oharra.getPrimaryKey());

		oharraImpl.setOharraId(oharra.getOharraId());
		oharraImpl.setOharMota(oharra.getOharMota());
		oharraImpl.setIrudiKarpetaId(oharra.getIrudiKarpetaId());
		oharraImpl.setIrudia(oharra.getIrudia());
		oharraImpl.setIzenburua(oharra.getIzenburua());
		oharraImpl.setTestua(oharra.getTestua());
		oharraImpl.setEsteka(oharra.getEsteka());
		oharraImpl.setEstekaTestua(oharra.getEstekaTestua());
		oharraImpl.setCreateDate(oharra.getCreateDate());

		return oharraImpl;
	}

	/**
	 * Returns the oharra with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the oharra
	 * @return the oharra
	 * @throws com.liferay.portal.NoSuchModelException if a oharra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oharra findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the oharra with the primary key or throws a {@link net.sareweb.txotx.NoSuchOharraException} if it could not be found.
	 *
	 * @param oharraId the primary key of the oharra
	 * @return the oharra
	 * @throws net.sareweb.txotx.NoSuchOharraException if a oharra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Oharra findByPrimaryKey(long oharraId)
		throws NoSuchOharraException, SystemException {
		Oharra oharra = fetchByPrimaryKey(oharraId);

		if (oharra == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + oharraId);
			}

			throw new NoSuchOharraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				oharraId);
		}

		return oharra;
	}

	/**
	 * Returns the oharra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the oharra
	 * @return the oharra, or <code>null</code> if a oharra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oharra fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the oharra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param oharraId the primary key of the oharra
	 * @return the oharra, or <code>null</code> if a oharra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Oharra fetchByPrimaryKey(long oharraId) throws SystemException {
		Oharra oharra = (Oharra)EntityCacheUtil.getResult(OharraModelImpl.ENTITY_CACHE_ENABLED,
				OharraImpl.class, oharraId);

		if (oharra == _nullOharra) {
			return null;
		}

		if (oharra == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				oharra = (Oharra)session.get(OharraImpl.class,
						Long.valueOf(oharraId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (oharra != null) {
					cacheResult(oharra);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(OharraModelImpl.ENTITY_CACHE_ENABLED,
						OharraImpl.class, oharraId, _nullOharra);
				}

				closeSession(session);
			}
		}

		return oharra;
	}

	/**
	 * Returns all the oharras.
	 *
	 * @return the oharras
	 * @throws SystemException if a system exception occurred
	 */
	public List<Oharra> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the oharras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of oharras
	 * @param end the upper bound of the range of oharras (not inclusive)
	 * @return the range of oharras
	 * @throws SystemException if a system exception occurred
	 */
	public List<Oharra> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the oharras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of oharras
	 * @param end the upper bound of the range of oharras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of oharras
	 * @throws SystemException if a system exception occurred
	 */
	public List<Oharra> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Oharra> list = (List<Oharra>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OHARRA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OHARRA.concat(OharraModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Oharra>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Oharra>)QueryUtil.list(q, getDialect(), start,
							end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the oharras from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Oharra oharra : findAll()) {
			remove(oharra);
		}
	}

	/**
	 * Returns the number of oharras.
	 *
	 * @return the number of oharras
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OHARRA);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the oharra persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.net.sareweb.txotx.model.Oharra")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Oharra>> listenersList = new ArrayList<ModelListener<Oharra>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Oharra>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(OharraImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = APKVersionPersistence.class)
	protected APKVersionPersistence apkVersionPersistence;
	@BeanReference(type = GertaeraPersistence.class)
	protected GertaeraPersistence gertaeraPersistence;
	@BeanReference(type = GoogleDevicePersistence.class)
	protected GoogleDevicePersistence googleDevicePersistence;
	@BeanReference(type = JarraipenPersistence.class)
	protected JarraipenPersistence jarraipenPersistence;
	@BeanReference(type = OharraPersistence.class)
	protected OharraPersistence oharraPersistence;
	@BeanReference(type = SagardoEgunPersistence.class)
	protected SagardoEgunPersistence sagardoEgunPersistence;
	@BeanReference(type = SagardotegiPersistence.class)
	protected SagardotegiPersistence sagardotegiPersistence;
	@BeanReference(type = SailkapenaPersistence.class)
	protected SailkapenaPersistence sailkapenaPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_OHARRA = "SELECT oharra FROM Oharra oharra";
	private static final String _SQL_COUNT_OHARRA = "SELECT COUNT(oharra) FROM Oharra oharra";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oharra.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Oharra exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OharraPersistenceImpl.class);
	private static Oharra _nullOharra = new OharraImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Oharra> toCacheModel() {
				return _nullOharraCacheModel;
			}
		};

	private static CacheModel<Oharra> _nullOharraCacheModel = new CacheModel<Oharra>() {
			public Oharra toEntityModel() {
				return _nullOharra;
			}
		};
}