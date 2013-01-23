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

import net.sareweb.txotx.NoSuchGertaeraException;
import net.sareweb.txotx.model.Gertaera;
import net.sareweb.txotx.model.impl.GertaeraImpl;
import net.sareweb.txotx.model.impl.GertaeraModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the gertaera service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see GertaeraPersistence
 * @see GertaeraUtil
 * @generated
 */
public class GertaeraPersistenceImpl extends BasePersistenceImpl<Gertaera>
	implements GertaeraPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link GertaeraUtil} to access the gertaera persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = GertaeraImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(GertaeraModelImpl.ENTITY_CACHE_ENABLED,
			GertaeraModelImpl.FINDER_CACHE_ENABLED, GertaeraImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(GertaeraModelImpl.ENTITY_CACHE_ENABLED,
			GertaeraModelImpl.FINDER_CACHE_ENABLED, GertaeraImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(GertaeraModelImpl.ENTITY_CACHE_ENABLED,
			GertaeraModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the gertaera in the entity cache if it is enabled.
	 *
	 * @param gertaera the gertaera
	 */
	public void cacheResult(Gertaera gertaera) {
		EntityCacheUtil.putResult(GertaeraModelImpl.ENTITY_CACHE_ENABLED,
			GertaeraImpl.class, gertaera.getPrimaryKey(), gertaera);

		gertaera.resetOriginalValues();
	}

	/**
	 * Caches the gertaeras in the entity cache if it is enabled.
	 *
	 * @param gertaeras the gertaeras
	 */
	public void cacheResult(List<Gertaera> gertaeras) {
		for (Gertaera gertaera : gertaeras) {
			if (EntityCacheUtil.getResult(
						GertaeraModelImpl.ENTITY_CACHE_ENABLED,
						GertaeraImpl.class, gertaera.getPrimaryKey()) == null) {
				cacheResult(gertaera);
			}
			else {
				gertaera.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all gertaeras.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(GertaeraImpl.class.getName());
		}

		EntityCacheUtil.clearCache(GertaeraImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the gertaera.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Gertaera gertaera) {
		EntityCacheUtil.removeResult(GertaeraModelImpl.ENTITY_CACHE_ENABLED,
			GertaeraImpl.class, gertaera.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Gertaera> gertaeras) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Gertaera gertaera : gertaeras) {
			EntityCacheUtil.removeResult(GertaeraModelImpl.ENTITY_CACHE_ENABLED,
				GertaeraImpl.class, gertaera.getPrimaryKey());
		}
	}

	/**
	 * Creates a new gertaera with the primary key. Does not add the gertaera to the database.
	 *
	 * @param gertaeraId the primary key for the new gertaera
	 * @return the new gertaera
	 */
	public Gertaera create(long gertaeraId) {
		Gertaera gertaera = new GertaeraImpl();

		gertaera.setNew(true);
		gertaera.setPrimaryKey(gertaeraId);

		return gertaera;
	}

	/**
	 * Removes the gertaera with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param gertaeraId the primary key of the gertaera
	 * @return the gertaera that was removed
	 * @throws net.sareweb.txotx.NoSuchGertaeraException if a gertaera with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Gertaera remove(long gertaeraId)
		throws NoSuchGertaeraException, SystemException {
		return remove(Long.valueOf(gertaeraId));
	}

	/**
	 * Removes the gertaera with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the gertaera
	 * @return the gertaera that was removed
	 * @throws net.sareweb.txotx.NoSuchGertaeraException if a gertaera with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Gertaera remove(Serializable primaryKey)
		throws NoSuchGertaeraException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Gertaera gertaera = (Gertaera)session.get(GertaeraImpl.class,
					primaryKey);

			if (gertaera == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchGertaeraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(gertaera);
		}
		catch (NoSuchGertaeraException nsee) {
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
	protected Gertaera removeImpl(Gertaera gertaera) throws SystemException {
		gertaera = toUnwrappedModel(gertaera);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, gertaera);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(gertaera);

		return gertaera;
	}

	@Override
	public Gertaera updateImpl(net.sareweb.txotx.model.Gertaera gertaera,
		boolean merge) throws SystemException {
		gertaera = toUnwrappedModel(gertaera);

		boolean isNew = gertaera.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, gertaera, merge);

			gertaera.setNew(false);
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

		EntityCacheUtil.putResult(GertaeraModelImpl.ENTITY_CACHE_ENABLED,
			GertaeraImpl.class, gertaera.getPrimaryKey(), gertaera);

		return gertaera;
	}

	protected Gertaera toUnwrappedModel(Gertaera gertaera) {
		if (gertaera instanceof GertaeraImpl) {
			return gertaera;
		}

		GertaeraImpl gertaeraImpl = new GertaeraImpl();

		gertaeraImpl.setNew(gertaera.isNew());
		gertaeraImpl.setPrimaryKey(gertaera.getPrimaryKey());

		gertaeraImpl.setGertaeraId(gertaera.getGertaeraId());
		gertaeraImpl.setSagardotegiId(gertaera.getSagardotegiId());
		gertaeraImpl.setUserId(gertaera.getUserId());
		gertaeraImpl.setScreenName(gertaera.getScreenName());
		gertaeraImpl.setGertaeraMota(gertaera.getGertaeraMota());
		gertaeraImpl.setTestua(gertaera.getTestua());
		gertaeraImpl.setIrudiKarpetaId(gertaera.getIrudiKarpetaId());
		gertaeraImpl.setIrudia(gertaera.getIrudia());
		gertaeraImpl.setBalorazioa(gertaera.getBalorazioa());
		gertaeraImpl.setCreateDate(gertaera.getCreateDate());
		gertaeraImpl.setModifiedDate(gertaera.getModifiedDate());

		return gertaeraImpl;
	}

	/**
	 * Returns the gertaera with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the gertaera
	 * @return the gertaera
	 * @throws com.liferay.portal.NoSuchModelException if a gertaera with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Gertaera findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the gertaera with the primary key or throws a {@link net.sareweb.txotx.NoSuchGertaeraException} if it could not be found.
	 *
	 * @param gertaeraId the primary key of the gertaera
	 * @return the gertaera
	 * @throws net.sareweb.txotx.NoSuchGertaeraException if a gertaera with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Gertaera findByPrimaryKey(long gertaeraId)
		throws NoSuchGertaeraException, SystemException {
		Gertaera gertaera = fetchByPrimaryKey(gertaeraId);

		if (gertaera == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + gertaeraId);
			}

			throw new NoSuchGertaeraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				gertaeraId);
		}

		return gertaera;
	}

	/**
	 * Returns the gertaera with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the gertaera
	 * @return the gertaera, or <code>null</code> if a gertaera with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Gertaera fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the gertaera with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param gertaeraId the primary key of the gertaera
	 * @return the gertaera, or <code>null</code> if a gertaera with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Gertaera fetchByPrimaryKey(long gertaeraId)
		throws SystemException {
		Gertaera gertaera = (Gertaera)EntityCacheUtil.getResult(GertaeraModelImpl.ENTITY_CACHE_ENABLED,
				GertaeraImpl.class, gertaeraId);

		if (gertaera == _nullGertaera) {
			return null;
		}

		if (gertaera == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				gertaera = (Gertaera)session.get(GertaeraImpl.class,
						Long.valueOf(gertaeraId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (gertaera != null) {
					cacheResult(gertaera);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(GertaeraModelImpl.ENTITY_CACHE_ENABLED,
						GertaeraImpl.class, gertaeraId, _nullGertaera);
				}

				closeSession(session);
			}
		}

		return gertaera;
	}

	/**
	 * Returns all the gertaeras.
	 *
	 * @return the gertaeras
	 * @throws SystemException if a system exception occurred
	 */
	public List<Gertaera> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the gertaeras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of gertaeras
	 * @param end the upper bound of the range of gertaeras (not inclusive)
	 * @return the range of gertaeras
	 * @throws SystemException if a system exception occurred
	 */
	public List<Gertaera> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the gertaeras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of gertaeras
	 * @param end the upper bound of the range of gertaeras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of gertaeras
	 * @throws SystemException if a system exception occurred
	 */
	public List<Gertaera> findAll(int start, int end,
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

		List<Gertaera> list = (List<Gertaera>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_GERTAERA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_GERTAERA.concat(GertaeraModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Gertaera>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Gertaera>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the gertaeras from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Gertaera gertaera : findAll()) {
			remove(gertaera);
		}
	}

	/**
	 * Returns the number of gertaeras.
	 *
	 * @return the number of gertaeras
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_GERTAERA);

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
	 * Initializes the gertaera persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.net.sareweb.txotx.model.Gertaera")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Gertaera>> listenersList = new ArrayList<ModelListener<Gertaera>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Gertaera>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(GertaeraImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = GertaeraPersistence.class)
	protected GertaeraPersistence gertaeraPersistence;
	@BeanReference(type = SagardotegiPersistence.class)
	protected SagardotegiPersistence sagardotegiPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_GERTAERA = "SELECT gertaera FROM Gertaera gertaera";
	private static final String _SQL_COUNT_GERTAERA = "SELECT COUNT(gertaera) FROM Gertaera gertaera";
	private static final String _ORDER_BY_ENTITY_ALIAS = "gertaera.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Gertaera exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(GertaeraPersistenceImpl.class);
	private static Gertaera _nullGertaera = new GertaeraImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Gertaera> toCacheModel() {
				return _nullGertaeraCacheModel;
			}
		};

	private static CacheModel<Gertaera> _nullGertaeraCacheModel = new CacheModel<Gertaera>() {
			public Gertaera toEntityModel() {
				return _nullGertaera;
			}
		};
}