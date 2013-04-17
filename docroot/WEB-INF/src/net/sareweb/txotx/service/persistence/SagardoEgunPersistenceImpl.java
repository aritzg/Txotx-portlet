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

import net.sareweb.txotx.NoSuchSagardoEgunException;
import net.sareweb.txotx.model.SagardoEgun;
import net.sareweb.txotx.model.impl.SagardoEgunImpl;
import net.sareweb.txotx.model.impl.SagardoEgunModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the sagardo egun service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see SagardoEgunPersistence
 * @see SagardoEgunUtil
 * @generated
 */
public class SagardoEgunPersistenceImpl extends BasePersistenceImpl<SagardoEgun>
	implements SagardoEgunPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SagardoEgunUtil} to access the sagardo egun persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SagardoEgunImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SagardoEgunModelImpl.ENTITY_CACHE_ENABLED,
			SagardoEgunModelImpl.FINDER_CACHE_ENABLED, SagardoEgunImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SagardoEgunModelImpl.ENTITY_CACHE_ENABLED,
			SagardoEgunModelImpl.FINDER_CACHE_ENABLED, SagardoEgunImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SagardoEgunModelImpl.ENTITY_CACHE_ENABLED,
			SagardoEgunModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the sagardo egun in the entity cache if it is enabled.
	 *
	 * @param sagardoEgun the sagardo egun
	 */
	public void cacheResult(SagardoEgun sagardoEgun) {
		EntityCacheUtil.putResult(SagardoEgunModelImpl.ENTITY_CACHE_ENABLED,
			SagardoEgunImpl.class, sagardoEgun.getPrimaryKey(), sagardoEgun);

		sagardoEgun.resetOriginalValues();
	}

	/**
	 * Caches the sagardo eguns in the entity cache if it is enabled.
	 *
	 * @param sagardoEguns the sagardo eguns
	 */
	public void cacheResult(List<SagardoEgun> sagardoEguns) {
		for (SagardoEgun sagardoEgun : sagardoEguns) {
			if (EntityCacheUtil.getResult(
						SagardoEgunModelImpl.ENTITY_CACHE_ENABLED,
						SagardoEgunImpl.class, sagardoEgun.getPrimaryKey()) == null) {
				cacheResult(sagardoEgun);
			}
			else {
				sagardoEgun.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sagardo eguns.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SagardoEgunImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SagardoEgunImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sagardo egun.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SagardoEgun sagardoEgun) {
		EntityCacheUtil.removeResult(SagardoEgunModelImpl.ENTITY_CACHE_ENABLED,
			SagardoEgunImpl.class, sagardoEgun.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SagardoEgun> sagardoEguns) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SagardoEgun sagardoEgun : sagardoEguns) {
			EntityCacheUtil.removeResult(SagardoEgunModelImpl.ENTITY_CACHE_ENABLED,
				SagardoEgunImpl.class, sagardoEgun.getPrimaryKey());
		}
	}

	/**
	 * Creates a new sagardo egun with the primary key. Does not add the sagardo egun to the database.
	 *
	 * @param sagardoEgunId the primary key for the new sagardo egun
	 * @return the new sagardo egun
	 */
	public SagardoEgun create(long sagardoEgunId) {
		SagardoEgun sagardoEgun = new SagardoEgunImpl();

		sagardoEgun.setNew(true);
		sagardoEgun.setPrimaryKey(sagardoEgunId);

		return sagardoEgun;
	}

	/**
	 * Removes the sagardo egun with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sagardoEgunId the primary key of the sagardo egun
	 * @return the sagardo egun that was removed
	 * @throws net.sareweb.txotx.NoSuchSagardoEgunException if a sagardo egun with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SagardoEgun remove(long sagardoEgunId)
		throws NoSuchSagardoEgunException, SystemException {
		return remove(Long.valueOf(sagardoEgunId));
	}

	/**
	 * Removes the sagardo egun with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sagardo egun
	 * @return the sagardo egun that was removed
	 * @throws net.sareweb.txotx.NoSuchSagardoEgunException if a sagardo egun with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SagardoEgun remove(Serializable primaryKey)
		throws NoSuchSagardoEgunException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SagardoEgun sagardoEgun = (SagardoEgun)session.get(SagardoEgunImpl.class,
					primaryKey);

			if (sagardoEgun == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSagardoEgunException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sagardoEgun);
		}
		catch (NoSuchSagardoEgunException nsee) {
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
	protected SagardoEgun removeImpl(SagardoEgun sagardoEgun)
		throws SystemException {
		sagardoEgun = toUnwrappedModel(sagardoEgun);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, sagardoEgun);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(sagardoEgun);

		return sagardoEgun;
	}

	@Override
	public SagardoEgun updateImpl(
		net.sareweb.txotx.model.SagardoEgun sagardoEgun, boolean merge)
		throws SystemException {
		sagardoEgun = toUnwrappedModel(sagardoEgun);

		boolean isNew = sagardoEgun.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, sagardoEgun, merge);

			sagardoEgun.setNew(false);
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

		EntityCacheUtil.putResult(SagardoEgunModelImpl.ENTITY_CACHE_ENABLED,
			SagardoEgunImpl.class, sagardoEgun.getPrimaryKey(), sagardoEgun);

		return sagardoEgun;
	}

	protected SagardoEgun toUnwrappedModel(SagardoEgun sagardoEgun) {
		if (sagardoEgun instanceof SagardoEgunImpl) {
			return sagardoEgun;
		}

		SagardoEgunImpl sagardoEgunImpl = new SagardoEgunImpl();

		sagardoEgunImpl.setNew(sagardoEgun.isNew());
		sagardoEgunImpl.setPrimaryKey(sagardoEgun.getPrimaryKey());

		sagardoEgunImpl.setSagardoEgunId(sagardoEgun.getSagardoEgunId());
		sagardoEgunImpl.setIzena(sagardoEgun.getIzena());
		sagardoEgunImpl.setEdizioa(sagardoEgun.getEdizioa());
		sagardoEgunImpl.setHerria(sagardoEgun.getHerria());
		sagardoEgunImpl.setLekua(sagardoEgun.getLekua());
		sagardoEgunImpl.setEmaila(sagardoEgun.getEmaila());
		sagardoEgunImpl.setTwitter(sagardoEgun.getTwitter());
		sagardoEgunImpl.setWeborria(sagardoEgun.getWeborria());
		sagardoEgunImpl.setHasieraDate(sagardoEgun.getHasieraDate());
		sagardoEgunImpl.setLat(sagardoEgun.getLat());
		sagardoEgunImpl.setLng(sagardoEgun.getLng());
		sagardoEgunImpl.setIrudiKarpetaId(sagardoEgun.getIrudiKarpetaId());
		sagardoEgunImpl.setIrudia(sagardoEgun.getIrudia());
		sagardoEgunImpl.setIrudiKopurua(sagardoEgun.getIrudiKopurua());
		sagardoEgunImpl.setIruzkinKopurua(sagardoEgun.getIruzkinKopurua());
		sagardoEgunImpl.setBalorazioKopurua(sagardoEgun.getBalorazioKopurua());
		sagardoEgunImpl.setBalorazioenBB(sagardoEgun.getBalorazioenBB());
		sagardoEgunImpl.setCreateDate(sagardoEgun.getCreateDate());
		sagardoEgunImpl.setModifiedDate(sagardoEgun.getModifiedDate());
		sagardoEgunImpl.setUserId(sagardoEgun.getUserId());

		return sagardoEgunImpl;
	}

	/**
	 * Returns the sagardo egun with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sagardo egun
	 * @return the sagardo egun
	 * @throws com.liferay.portal.NoSuchModelException if a sagardo egun with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SagardoEgun findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the sagardo egun with the primary key or throws a {@link net.sareweb.txotx.NoSuchSagardoEgunException} if it could not be found.
	 *
	 * @param sagardoEgunId the primary key of the sagardo egun
	 * @return the sagardo egun
	 * @throws net.sareweb.txotx.NoSuchSagardoEgunException if a sagardo egun with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SagardoEgun findByPrimaryKey(long sagardoEgunId)
		throws NoSuchSagardoEgunException, SystemException {
		SagardoEgun sagardoEgun = fetchByPrimaryKey(sagardoEgunId);

		if (sagardoEgun == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + sagardoEgunId);
			}

			throw new NoSuchSagardoEgunException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				sagardoEgunId);
		}

		return sagardoEgun;
	}

	/**
	 * Returns the sagardo egun with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sagardo egun
	 * @return the sagardo egun, or <code>null</code> if a sagardo egun with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SagardoEgun fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the sagardo egun with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sagardoEgunId the primary key of the sagardo egun
	 * @return the sagardo egun, or <code>null</code> if a sagardo egun with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SagardoEgun fetchByPrimaryKey(long sagardoEgunId)
		throws SystemException {
		SagardoEgun sagardoEgun = (SagardoEgun)EntityCacheUtil.getResult(SagardoEgunModelImpl.ENTITY_CACHE_ENABLED,
				SagardoEgunImpl.class, sagardoEgunId);

		if (sagardoEgun == _nullSagardoEgun) {
			return null;
		}

		if (sagardoEgun == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				sagardoEgun = (SagardoEgun)session.get(SagardoEgunImpl.class,
						Long.valueOf(sagardoEgunId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (sagardoEgun != null) {
					cacheResult(sagardoEgun);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(SagardoEgunModelImpl.ENTITY_CACHE_ENABLED,
						SagardoEgunImpl.class, sagardoEgunId, _nullSagardoEgun);
				}

				closeSession(session);
			}
		}

		return sagardoEgun;
	}

	/**
	 * Returns all the sagardo eguns.
	 *
	 * @return the sagardo eguns
	 * @throws SystemException if a system exception occurred
	 */
	public List<SagardoEgun> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sagardo eguns.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of sagardo eguns
	 * @param end the upper bound of the range of sagardo eguns (not inclusive)
	 * @return the range of sagardo eguns
	 * @throws SystemException if a system exception occurred
	 */
	public List<SagardoEgun> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sagardo eguns.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of sagardo eguns
	 * @param end the upper bound of the range of sagardo eguns (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sagardo eguns
	 * @throws SystemException if a system exception occurred
	 */
	public List<SagardoEgun> findAll(int start, int end,
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

		List<SagardoEgun> list = (List<SagardoEgun>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SAGARDOEGUN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SAGARDOEGUN.concat(SagardoEgunModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<SagardoEgun>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<SagardoEgun>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the sagardo eguns from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (SagardoEgun sagardoEgun : findAll()) {
			remove(sagardoEgun);
		}
	}

	/**
	 * Returns the number of sagardo eguns.
	 *
	 * @return the number of sagardo eguns
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SAGARDOEGUN);

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
	 * Initializes the sagardo egun persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.net.sareweb.txotx.model.SagardoEgun")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SagardoEgun>> listenersList = new ArrayList<ModelListener<SagardoEgun>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SagardoEgun>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SagardoEgunImpl.class.getName());
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
	private static final String _SQL_SELECT_SAGARDOEGUN = "SELECT sagardoEgun FROM SagardoEgun sagardoEgun";
	private static final String _SQL_COUNT_SAGARDOEGUN = "SELECT COUNT(sagardoEgun) FROM SagardoEgun sagardoEgun";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sagardoEgun.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SagardoEgun exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SagardoEgunPersistenceImpl.class);
	private static SagardoEgun _nullSagardoEgun = new SagardoEgunImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SagardoEgun> toCacheModel() {
				return _nullSagardoEgunCacheModel;
			}
		};

	private static CacheModel<SagardoEgun> _nullSagardoEgunCacheModel = new CacheModel<SagardoEgun>() {
			public SagardoEgun toEntityModel() {
				return _nullSagardoEgun;
			}
		};
}