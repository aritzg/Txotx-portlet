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
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import net.sareweb.txotx.NoSuchSailkapenaException;
import net.sareweb.txotx.model.Sailkapena;
import net.sareweb.txotx.model.impl.SailkapenaImpl;
import net.sareweb.txotx.model.impl.SailkapenaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the sailkapena service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see SailkapenaPersistence
 * @see SailkapenaUtil
 * @generated
 */
public class SailkapenaPersistenceImpl extends BasePersistenceImpl<Sailkapena>
	implements SailkapenaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SailkapenaUtil} to access the sailkapena persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SailkapenaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_USERID = new FinderPath(SailkapenaModelImpl.ENTITY_CACHE_ENABLED,
			SailkapenaModelImpl.FINDER_CACHE_ENABLED, SailkapenaImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUserId",
			new String[] { Long.class.getName() },
			SailkapenaModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(SailkapenaModelImpl.ENTITY_CACHE_ENABLED,
			SailkapenaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SailkapenaModelImpl.ENTITY_CACHE_ENABLED,
			SailkapenaModelImpl.FINDER_CACHE_ENABLED, SailkapenaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SailkapenaModelImpl.ENTITY_CACHE_ENABLED,
			SailkapenaModelImpl.FINDER_CACHE_ENABLED, SailkapenaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SailkapenaModelImpl.ENTITY_CACHE_ENABLED,
			SailkapenaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the sailkapena in the entity cache if it is enabled.
	 *
	 * @param sailkapena the sailkapena
	 */
	public void cacheResult(Sailkapena sailkapena) {
		EntityCacheUtil.putResult(SailkapenaModelImpl.ENTITY_CACHE_ENABLED,
			SailkapenaImpl.class, sailkapena.getPrimaryKey(), sailkapena);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { Long.valueOf(sailkapena.getUserId()) }, sailkapena);

		sailkapena.resetOriginalValues();
	}

	/**
	 * Caches the sailkapenas in the entity cache if it is enabled.
	 *
	 * @param sailkapenas the sailkapenas
	 */
	public void cacheResult(List<Sailkapena> sailkapenas) {
		for (Sailkapena sailkapena : sailkapenas) {
			if (EntityCacheUtil.getResult(
						SailkapenaModelImpl.ENTITY_CACHE_ENABLED,
						SailkapenaImpl.class, sailkapena.getPrimaryKey()) == null) {
				cacheResult(sailkapena);
			}
			else {
				sailkapena.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sailkapenas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SailkapenaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SailkapenaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sailkapena.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Sailkapena sailkapena) {
		EntityCacheUtil.removeResult(SailkapenaModelImpl.ENTITY_CACHE_ENABLED,
			SailkapenaImpl.class, sailkapena.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(sailkapena);
	}

	@Override
	public void clearCache(List<Sailkapena> sailkapenas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Sailkapena sailkapena : sailkapenas) {
			EntityCacheUtil.removeResult(SailkapenaModelImpl.ENTITY_CACHE_ENABLED,
				SailkapenaImpl.class, sailkapena.getPrimaryKey());

			clearUniqueFindersCache(sailkapena);
		}
	}

	protected void clearUniqueFindersCache(Sailkapena sailkapena) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { Long.valueOf(sailkapena.getUserId()) });
	}

	/**
	 * Creates a new sailkapena with the primary key. Does not add the sailkapena to the database.
	 *
	 * @param sailkapenaId the primary key for the new sailkapena
	 * @return the new sailkapena
	 */
	public Sailkapena create(long sailkapenaId) {
		Sailkapena sailkapena = new SailkapenaImpl();

		sailkapena.setNew(true);
		sailkapena.setPrimaryKey(sailkapenaId);

		return sailkapena;
	}

	/**
	 * Removes the sailkapena with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sailkapenaId the primary key of the sailkapena
	 * @return the sailkapena that was removed
	 * @throws net.sareweb.txotx.NoSuchSailkapenaException if a sailkapena with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Sailkapena remove(long sailkapenaId)
		throws NoSuchSailkapenaException, SystemException {
		return remove(Long.valueOf(sailkapenaId));
	}

	/**
	 * Removes the sailkapena with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sailkapena
	 * @return the sailkapena that was removed
	 * @throws net.sareweb.txotx.NoSuchSailkapenaException if a sailkapena with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sailkapena remove(Serializable primaryKey)
		throws NoSuchSailkapenaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Sailkapena sailkapena = (Sailkapena)session.get(SailkapenaImpl.class,
					primaryKey);

			if (sailkapena == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSailkapenaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sailkapena);
		}
		catch (NoSuchSailkapenaException nsee) {
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
	protected Sailkapena removeImpl(Sailkapena sailkapena)
		throws SystemException {
		sailkapena = toUnwrappedModel(sailkapena);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, sailkapena);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(sailkapena);

		return sailkapena;
	}

	@Override
	public Sailkapena updateImpl(
		net.sareweb.txotx.model.Sailkapena sailkapena, boolean merge)
		throws SystemException {
		sailkapena = toUnwrappedModel(sailkapena);

		boolean isNew = sailkapena.isNew();

		SailkapenaModelImpl sailkapenaModelImpl = (SailkapenaModelImpl)sailkapena;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, sailkapena, merge);

			sailkapena.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SailkapenaModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(SailkapenaModelImpl.ENTITY_CACHE_ENABLED,
			SailkapenaImpl.class, sailkapena.getPrimaryKey(), sailkapena);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
				new Object[] { Long.valueOf(sailkapena.getUserId()) },
				sailkapena);
		}
		else {
			if ((sailkapenaModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(sailkapenaModelImpl.getOriginalUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
					new Object[] { Long.valueOf(sailkapena.getUserId()) },
					sailkapena);
			}
		}

		return sailkapena;
	}

	protected Sailkapena toUnwrappedModel(Sailkapena sailkapena) {
		if (sailkapena instanceof SailkapenaImpl) {
			return sailkapena;
		}

		SailkapenaImpl sailkapenaImpl = new SailkapenaImpl();

		sailkapenaImpl.setNew(sailkapena.isNew());
		sailkapenaImpl.setPrimaryKey(sailkapena.getPrimaryKey());

		sailkapenaImpl.setSailkapenaId(sailkapena.getSailkapenaId());
		sailkapenaImpl.setUserId(sailkapena.getUserId());
		sailkapenaImpl.setScreenName(sailkapena.getScreenName());
		sailkapenaImpl.setIruzkinKopurua(sailkapena.getIruzkinKopurua());
		sailkapenaImpl.setBalorazioKopurua(sailkapena.getBalorazioKopurua());
		sailkapenaImpl.setArgazkiKopurua(sailkapena.getArgazkiKopurua());
		sailkapenaImpl.setGertaeraKopurua(sailkapena.getGertaeraKopurua());

		return sailkapenaImpl;
	}

	/**
	 * Returns the sailkapena with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sailkapena
	 * @return the sailkapena
	 * @throws com.liferay.portal.NoSuchModelException if a sailkapena with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sailkapena findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the sailkapena with the primary key or throws a {@link net.sareweb.txotx.NoSuchSailkapenaException} if it could not be found.
	 *
	 * @param sailkapenaId the primary key of the sailkapena
	 * @return the sailkapena
	 * @throws net.sareweb.txotx.NoSuchSailkapenaException if a sailkapena with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Sailkapena findByPrimaryKey(long sailkapenaId)
		throws NoSuchSailkapenaException, SystemException {
		Sailkapena sailkapena = fetchByPrimaryKey(sailkapenaId);

		if (sailkapena == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + sailkapenaId);
			}

			throw new NoSuchSailkapenaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				sailkapenaId);
		}

		return sailkapena;
	}

	/**
	 * Returns the sailkapena with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sailkapena
	 * @return the sailkapena, or <code>null</code> if a sailkapena with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sailkapena fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the sailkapena with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sailkapenaId the primary key of the sailkapena
	 * @return the sailkapena, or <code>null</code> if a sailkapena with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Sailkapena fetchByPrimaryKey(long sailkapenaId)
		throws SystemException {
		Sailkapena sailkapena = (Sailkapena)EntityCacheUtil.getResult(SailkapenaModelImpl.ENTITY_CACHE_ENABLED,
				SailkapenaImpl.class, sailkapenaId);

		if (sailkapena == _nullSailkapena) {
			return null;
		}

		if (sailkapena == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				sailkapena = (Sailkapena)session.get(SailkapenaImpl.class,
						Long.valueOf(sailkapenaId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (sailkapena != null) {
					cacheResult(sailkapena);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(SailkapenaModelImpl.ENTITY_CACHE_ENABLED,
						SailkapenaImpl.class, sailkapenaId, _nullSailkapena);
				}

				closeSession(session);
			}
		}

		return sailkapena;
	}

	/**
	 * Returns the sailkapena where userId = &#63; or throws a {@link net.sareweb.txotx.NoSuchSailkapenaException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching sailkapena
	 * @throws net.sareweb.txotx.NoSuchSailkapenaException if a matching sailkapena could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Sailkapena findByUserId(long userId)
		throws NoSuchSailkapenaException, SystemException {
		Sailkapena sailkapena = fetchByUserId(userId);

		if (sailkapena == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchSailkapenaException(msg.toString());
		}

		return sailkapena;
	}

	/**
	 * Returns the sailkapena where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching sailkapena, or <code>null</code> if a matching sailkapena could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Sailkapena fetchByUserId(long userId) throws SystemException {
		return fetchByUserId(userId, true);
	}

	/**
	 * Returns the sailkapena where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching sailkapena, or <code>null</code> if a matching sailkapena could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Sailkapena fetchByUserId(long userId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_USERID,
					finderArgs, this);
		}

		if (result instanceof Sailkapena) {
			Sailkapena sailkapena = (Sailkapena)result;

			if ((userId != sailkapena.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_SAILKAPENA_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			query.append(SailkapenaModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				List<Sailkapena> list = q.list();

				result = list;

				Sailkapena sailkapena = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
						finderArgs, list);
				}
				else {
					sailkapena = list.get(0);

					cacheResult(sailkapena);

					if ((sailkapena.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
							finderArgs, sailkapena);
					}
				}

				return sailkapena;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (Sailkapena)result;
			}
		}
	}

	/**
	 * Returns all the sailkapenas.
	 *
	 * @return the sailkapenas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Sailkapena> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sailkapenas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of sailkapenas
	 * @param end the upper bound of the range of sailkapenas (not inclusive)
	 * @return the range of sailkapenas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Sailkapena> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sailkapenas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of sailkapenas
	 * @param end the upper bound of the range of sailkapenas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sailkapenas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Sailkapena> findAll(int start, int end,
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

		List<Sailkapena> list = (List<Sailkapena>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SAILKAPENA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SAILKAPENA.concat(SailkapenaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Sailkapena>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Sailkapena>)QueryUtil.list(q, getDialect(),
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
	 * Removes the sailkapena where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the sailkapena that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public Sailkapena removeByUserId(long userId)
		throws NoSuchSailkapenaException, SystemException {
		Sailkapena sailkapena = findByUserId(userId);

		return remove(sailkapena);
	}

	/**
	 * Removes all the sailkapenas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Sailkapena sailkapena : findAll()) {
			remove(sailkapena);
		}
	}

	/**
	 * Returns the number of sailkapenas where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching sailkapenas
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUserId(long userId) throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_USERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SAILKAPENA_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of sailkapenas.
	 *
	 * @return the number of sailkapenas
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SAILKAPENA);

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
	 * Initializes the sailkapena persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.net.sareweb.txotx.model.Sailkapena")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Sailkapena>> listenersList = new ArrayList<ModelListener<Sailkapena>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Sailkapena>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SailkapenaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = GertaeraPersistence.class)
	protected GertaeraPersistence gertaeraPersistence;
	@BeanReference(type = GoogleDevicePersistence.class)
	protected GoogleDevicePersistence googleDevicePersistence;
	@BeanReference(type = SagardotegiPersistence.class)
	protected SagardotegiPersistence sagardotegiPersistence;
	@BeanReference(type = SailkapenaPersistence.class)
	protected SailkapenaPersistence sailkapenaPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_SAILKAPENA = "SELECT sailkapena FROM Sailkapena sailkapena";
	private static final String _SQL_SELECT_SAILKAPENA_WHERE = "SELECT sailkapena FROM Sailkapena sailkapena WHERE ";
	private static final String _SQL_COUNT_SAILKAPENA = "SELECT COUNT(sailkapena) FROM Sailkapena sailkapena";
	private static final String _SQL_COUNT_SAILKAPENA_WHERE = "SELECT COUNT(sailkapena) FROM Sailkapena sailkapena WHERE ";
	private static final String _FINDER_COLUMN_USERID_USERID_2 = "sailkapena.userId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sailkapena.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Sailkapena exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Sailkapena exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SailkapenaPersistenceImpl.class);
	private static Sailkapena _nullSailkapena = new SailkapenaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Sailkapena> toCacheModel() {
				return _nullSailkapenaCacheModel;
			}
		};

	private static CacheModel<Sailkapena> _nullSailkapenaCacheModel = new CacheModel<Sailkapena>() {
			public Sailkapena toEntityModel() {
				return _nullSailkapena;
			}
		};
}