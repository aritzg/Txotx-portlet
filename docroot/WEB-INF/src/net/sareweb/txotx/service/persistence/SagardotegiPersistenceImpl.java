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

import net.sareweb.txotx.NoSuchSagardotegiException;
import net.sareweb.txotx.model.Sagardotegi;
import net.sareweb.txotx.model.impl.SagardotegiImpl;
import net.sareweb.txotx.model.impl.SagardotegiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the sagardotegi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see SagardotegiPersistence
 * @see SagardotegiUtil
 * @generated
 */
public class SagardotegiPersistenceImpl extends BasePersistenceImpl<Sagardotegi>
	implements SagardotegiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SagardotegiUtil} to access the sagardotegi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SagardotegiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SagardotegiModelImpl.ENTITY_CACHE_ENABLED,
			SagardotegiModelImpl.FINDER_CACHE_ENABLED, SagardotegiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SagardotegiModelImpl.ENTITY_CACHE_ENABLED,
			SagardotegiModelImpl.FINDER_CACHE_ENABLED, SagardotegiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SagardotegiModelImpl.ENTITY_CACHE_ENABLED,
			SagardotegiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the sagardotegi in the entity cache if it is enabled.
	 *
	 * @param sagardotegi the sagardotegi
	 */
	public void cacheResult(Sagardotegi sagardotegi) {
		EntityCacheUtil.putResult(SagardotegiModelImpl.ENTITY_CACHE_ENABLED,
			SagardotegiImpl.class, sagardotegi.getPrimaryKey(), sagardotegi);

		sagardotegi.resetOriginalValues();
	}

	/**
	 * Caches the sagardotegis in the entity cache if it is enabled.
	 *
	 * @param sagardotegis the sagardotegis
	 */
	public void cacheResult(List<Sagardotegi> sagardotegis) {
		for (Sagardotegi sagardotegi : sagardotegis) {
			if (EntityCacheUtil.getResult(
						SagardotegiModelImpl.ENTITY_CACHE_ENABLED,
						SagardotegiImpl.class, sagardotegi.getPrimaryKey()) == null) {
				cacheResult(sagardotegi);
			}
			else {
				sagardotegi.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sagardotegis.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SagardotegiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SagardotegiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sagardotegi.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Sagardotegi sagardotegi) {
		EntityCacheUtil.removeResult(SagardotegiModelImpl.ENTITY_CACHE_ENABLED,
			SagardotegiImpl.class, sagardotegi.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Sagardotegi> sagardotegis) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Sagardotegi sagardotegi : sagardotegis) {
			EntityCacheUtil.removeResult(SagardotegiModelImpl.ENTITY_CACHE_ENABLED,
				SagardotegiImpl.class, sagardotegi.getPrimaryKey());
		}
	}

	/**
	 * Creates a new sagardotegi with the primary key. Does not add the sagardotegi to the database.
	 *
	 * @param sagardotegiId the primary key for the new sagardotegi
	 * @return the new sagardotegi
	 */
	public Sagardotegi create(long sagardotegiId) {
		Sagardotegi sagardotegi = new SagardotegiImpl();

		sagardotegi.setNew(true);
		sagardotegi.setPrimaryKey(sagardotegiId);

		return sagardotegi;
	}

	/**
	 * Removes the sagardotegi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sagardotegiId the primary key of the sagardotegi
	 * @return the sagardotegi that was removed
	 * @throws net.sareweb.txotx.NoSuchSagardotegiException if a sagardotegi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Sagardotegi remove(long sagardotegiId)
		throws NoSuchSagardotegiException, SystemException {
		return remove(Long.valueOf(sagardotegiId));
	}

	/**
	 * Removes the sagardotegi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sagardotegi
	 * @return the sagardotegi that was removed
	 * @throws net.sareweb.txotx.NoSuchSagardotegiException if a sagardotegi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sagardotegi remove(Serializable primaryKey)
		throws NoSuchSagardotegiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Sagardotegi sagardotegi = (Sagardotegi)session.get(SagardotegiImpl.class,
					primaryKey);

			if (sagardotegi == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSagardotegiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sagardotegi);
		}
		catch (NoSuchSagardotegiException nsee) {
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
	protected Sagardotegi removeImpl(Sagardotegi sagardotegi)
		throws SystemException {
		sagardotegi = toUnwrappedModel(sagardotegi);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, sagardotegi);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(sagardotegi);

		return sagardotegi;
	}

	@Override
	public Sagardotegi updateImpl(
		net.sareweb.txotx.model.Sagardotegi sagardotegi, boolean merge)
		throws SystemException {
		sagardotegi = toUnwrappedModel(sagardotegi);

		boolean isNew = sagardotegi.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, sagardotegi, merge);

			sagardotegi.setNew(false);
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

		EntityCacheUtil.putResult(SagardotegiModelImpl.ENTITY_CACHE_ENABLED,
			SagardotegiImpl.class, sagardotegi.getPrimaryKey(), sagardotegi);

		return sagardotegi;
	}

	protected Sagardotegi toUnwrappedModel(Sagardotegi sagardotegi) {
		if (sagardotegi instanceof SagardotegiImpl) {
			return sagardotegi;
		}

		SagardotegiImpl sagardotegiImpl = new SagardotegiImpl();

		sagardotegiImpl.setNew(sagardotegi.isNew());
		sagardotegiImpl.setPrimaryKey(sagardotegi.getPrimaryKey());

		sagardotegiImpl.setSagardotegiId(sagardotegi.getSagardotegiId());
		sagardotegiImpl.setIzena(sagardotegi.getIzena());
		sagardotegiImpl.setHerria(sagardotegi.getHerria());
		sagardotegiImpl.setHelbidea(sagardotegi.getHelbidea());
		sagardotegiImpl.setTelefonoa(sagardotegi.getTelefonoa());
		sagardotegiImpl.setEmaila(sagardotegi.getEmaila());
		sagardotegiImpl.setTwitter(sagardotegi.getTwitter());
		sagardotegiImpl.setWeborria(sagardotegi.getWeborria());
		sagardotegiImpl.setLat(sagardotegi.getLat());
		sagardotegiImpl.setLng(sagardotegi.getLng());
		sagardotegiImpl.setEdukiera(sagardotegi.getEdukiera());
		sagardotegiImpl.setIrudiKarpetaId(sagardotegi.getIrudiKarpetaId());
		sagardotegiImpl.setIrudia(sagardotegi.getIrudia());
		sagardotegiImpl.setIrudiKopurua(sagardotegi.getIrudiKopurua());
		sagardotegiImpl.setIruzkinKopurua(sagardotegi.getIruzkinKopurua());
		sagardotegiImpl.setBalorazioKopurua(sagardotegi.getBalorazioKopurua());
		sagardotegiImpl.setBalorazioenBB(sagardotegi.getBalorazioenBB());
		sagardotegiImpl.setCreateDate(sagardotegi.getCreateDate());
		sagardotegiImpl.setModifiedDate(sagardotegi.getModifiedDate());

		return sagardotegiImpl;
	}

	/**
	 * Returns the sagardotegi with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sagardotegi
	 * @return the sagardotegi
	 * @throws com.liferay.portal.NoSuchModelException if a sagardotegi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sagardotegi findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the sagardotegi with the primary key or throws a {@link net.sareweb.txotx.NoSuchSagardotegiException} if it could not be found.
	 *
	 * @param sagardotegiId the primary key of the sagardotegi
	 * @return the sagardotegi
	 * @throws net.sareweb.txotx.NoSuchSagardotegiException if a sagardotegi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Sagardotegi findByPrimaryKey(long sagardotegiId)
		throws NoSuchSagardotegiException, SystemException {
		Sagardotegi sagardotegi = fetchByPrimaryKey(sagardotegiId);

		if (sagardotegi == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + sagardotegiId);
			}

			throw new NoSuchSagardotegiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				sagardotegiId);
		}

		return sagardotegi;
	}

	/**
	 * Returns the sagardotegi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sagardotegi
	 * @return the sagardotegi, or <code>null</code> if a sagardotegi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sagardotegi fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the sagardotegi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sagardotegiId the primary key of the sagardotegi
	 * @return the sagardotegi, or <code>null</code> if a sagardotegi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Sagardotegi fetchByPrimaryKey(long sagardotegiId)
		throws SystemException {
		Sagardotegi sagardotegi = (Sagardotegi)EntityCacheUtil.getResult(SagardotegiModelImpl.ENTITY_CACHE_ENABLED,
				SagardotegiImpl.class, sagardotegiId);

		if (sagardotegi == _nullSagardotegi) {
			return null;
		}

		if (sagardotegi == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				sagardotegi = (Sagardotegi)session.get(SagardotegiImpl.class,
						Long.valueOf(sagardotegiId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (sagardotegi != null) {
					cacheResult(sagardotegi);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(SagardotegiModelImpl.ENTITY_CACHE_ENABLED,
						SagardotegiImpl.class, sagardotegiId, _nullSagardotegi);
				}

				closeSession(session);
			}
		}

		return sagardotegi;
	}

	/**
	 * Returns all the sagardotegis.
	 *
	 * @return the sagardotegis
	 * @throws SystemException if a system exception occurred
	 */
	public List<Sagardotegi> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sagardotegis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of sagardotegis
	 * @param end the upper bound of the range of sagardotegis (not inclusive)
	 * @return the range of sagardotegis
	 * @throws SystemException if a system exception occurred
	 */
	public List<Sagardotegi> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sagardotegis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of sagardotegis
	 * @param end the upper bound of the range of sagardotegis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sagardotegis
	 * @throws SystemException if a system exception occurred
	 */
	public List<Sagardotegi> findAll(int start, int end,
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

		List<Sagardotegi> list = (List<Sagardotegi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SAGARDOTEGI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SAGARDOTEGI.concat(SagardotegiModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Sagardotegi>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Sagardotegi>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the sagardotegis from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Sagardotegi sagardotegi : findAll()) {
			remove(sagardotegi);
		}
	}

	/**
	 * Returns the number of sagardotegis.
	 *
	 * @return the number of sagardotegis
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SAGARDOTEGI);

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
	 * Initializes the sagardotegi persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.net.sareweb.txotx.model.Sagardotegi")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Sagardotegi>> listenersList = new ArrayList<ModelListener<Sagardotegi>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Sagardotegi>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SagardotegiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

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
	private static final String _SQL_SELECT_SAGARDOTEGI = "SELECT sagardotegi FROM Sagardotegi sagardotegi";
	private static final String _SQL_COUNT_SAGARDOTEGI = "SELECT COUNT(sagardotegi) FROM Sagardotegi sagardotegi";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sagardotegi.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Sagardotegi exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SagardotegiPersistenceImpl.class);
	private static Sagardotegi _nullSagardotegi = new SagardotegiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Sagardotegi> toCacheModel() {
				return _nullSagardotegiCacheModel;
			}
		};

	private static CacheModel<Sagardotegi> _nullSagardotegiCacheModel = new CacheModel<Sagardotegi>() {
			public Sagardotegi toEntityModel() {
				return _nullSagardotegi;
			}
		};
}