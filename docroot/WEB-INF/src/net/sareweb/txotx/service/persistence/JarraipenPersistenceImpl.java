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

import net.sareweb.txotx.NoSuchJarraipenException;
import net.sareweb.txotx.model.Jarraipen;
import net.sareweb.txotx.model.impl.JarraipenImpl;
import net.sareweb.txotx.model.impl.JarraipenModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the jarraipen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see JarraipenPersistence
 * @see JarraipenUtil
 * @generated
 */
public class JarraipenPersistenceImpl extends BasePersistenceImpl<Jarraipen>
	implements JarraipenPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link JarraipenUtil} to access the jarraipen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = JarraipenImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_JARRAITZAILEUSERID =
		new FinderPath(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
			JarraipenModelImpl.FINDER_CACHE_ENABLED, JarraipenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByJarraitzaileUserId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JARRAITZAILEUSERID =
		new FinderPath(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
			JarraipenModelImpl.FINDER_CACHE_ENABLED, JarraipenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByJarraitzaileUserId", new String[] { Long.class.getName() },
			JarraipenModelImpl.JARRAITZAILEUSERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_JARRAITZAILEUSERID = new FinderPath(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
			JarraipenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByJarraitzaileUserId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_JARRAITUAID =
		new FinderPath(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
			JarraipenModelImpl.FINDER_CACHE_ENABLED, JarraipenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByJarraituaId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JARRAITUAID =
		new FinderPath(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
			JarraipenModelImpl.FINDER_CACHE_ENABLED, JarraipenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByJarraituaId",
			new String[] { Long.class.getName() },
			JarraipenModelImpl.JARRAITUAID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_JARRAITUAID = new FinderPath(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
			JarraipenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByJarraituaId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
			JarraipenModelImpl.FINDER_CACHE_ENABLED, JarraipenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
			JarraipenModelImpl.FINDER_CACHE_ENABLED, JarraipenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
			JarraipenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the jarraipen in the entity cache if it is enabled.
	 *
	 * @param jarraipen the jarraipen
	 */
	public void cacheResult(Jarraipen jarraipen) {
		EntityCacheUtil.putResult(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
			JarraipenImpl.class, jarraipen.getPrimaryKey(), jarraipen);

		jarraipen.resetOriginalValues();
	}

	/**
	 * Caches the jarraipens in the entity cache if it is enabled.
	 *
	 * @param jarraipens the jarraipens
	 */
	public void cacheResult(List<Jarraipen> jarraipens) {
		for (Jarraipen jarraipen : jarraipens) {
			if (EntityCacheUtil.getResult(
						JarraipenModelImpl.ENTITY_CACHE_ENABLED,
						JarraipenImpl.class, jarraipen.getPrimaryKey()) == null) {
				cacheResult(jarraipen);
			}
			else {
				jarraipen.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all jarraipens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(JarraipenImpl.class.getName());
		}

		EntityCacheUtil.clearCache(JarraipenImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the jarraipen.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Jarraipen jarraipen) {
		EntityCacheUtil.removeResult(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
			JarraipenImpl.class, jarraipen.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Jarraipen> jarraipens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Jarraipen jarraipen : jarraipens) {
			EntityCacheUtil.removeResult(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
				JarraipenImpl.class, jarraipen.getPrimaryKey());
		}
	}

	/**
	 * Creates a new jarraipen with the primary key. Does not add the jarraipen to the database.
	 *
	 * @param jarraipenId the primary key for the new jarraipen
	 * @return the new jarraipen
	 */
	public Jarraipen create(long jarraipenId) {
		Jarraipen jarraipen = new JarraipenImpl();

		jarraipen.setNew(true);
		jarraipen.setPrimaryKey(jarraipenId);

		return jarraipen;
	}

	/**
	 * Removes the jarraipen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jarraipenId the primary key of the jarraipen
	 * @return the jarraipen that was removed
	 * @throws net.sareweb.txotx.NoSuchJarraipenException if a jarraipen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Jarraipen remove(long jarraipenId)
		throws NoSuchJarraipenException, SystemException {
		return remove(Long.valueOf(jarraipenId));
	}

	/**
	 * Removes the jarraipen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jarraipen
	 * @return the jarraipen that was removed
	 * @throws net.sareweb.txotx.NoSuchJarraipenException if a jarraipen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jarraipen remove(Serializable primaryKey)
		throws NoSuchJarraipenException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Jarraipen jarraipen = (Jarraipen)session.get(JarraipenImpl.class,
					primaryKey);

			if (jarraipen == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJarraipenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(jarraipen);
		}
		catch (NoSuchJarraipenException nsee) {
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
	protected Jarraipen removeImpl(Jarraipen jarraipen)
		throws SystemException {
		jarraipen = toUnwrappedModel(jarraipen);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, jarraipen);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(jarraipen);

		return jarraipen;
	}

	@Override
	public Jarraipen updateImpl(net.sareweb.txotx.model.Jarraipen jarraipen,
		boolean merge) throws SystemException {
		jarraipen = toUnwrappedModel(jarraipen);

		boolean isNew = jarraipen.isNew();

		JarraipenModelImpl jarraipenModelImpl = (JarraipenModelImpl)jarraipen;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, jarraipen, merge);

			jarraipen.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !JarraipenModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((jarraipenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JARRAITZAILEUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(jarraipenModelImpl.getOriginalJarraitzaileUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_JARRAITZAILEUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JARRAITZAILEUSERID,
					args);

				args = new Object[] {
						Long.valueOf(jarraipenModelImpl.getJarraitzaileUserId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_JARRAITZAILEUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JARRAITZAILEUSERID,
					args);
			}

			if ((jarraipenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JARRAITUAID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(jarraipenModelImpl.getOriginalJarraituaId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_JARRAITUAID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JARRAITUAID,
					args);

				args = new Object[] {
						Long.valueOf(jarraipenModelImpl.getJarraituaId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_JARRAITUAID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JARRAITUAID,
					args);
			}
		}

		EntityCacheUtil.putResult(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
			JarraipenImpl.class, jarraipen.getPrimaryKey(), jarraipen);

		return jarraipen;
	}

	protected Jarraipen toUnwrappedModel(Jarraipen jarraipen) {
		if (jarraipen instanceof JarraipenImpl) {
			return jarraipen;
		}

		JarraipenImpl jarraipenImpl = new JarraipenImpl();

		jarraipenImpl.setNew(jarraipen.isNew());
		jarraipenImpl.setPrimaryKey(jarraipen.getPrimaryKey());

		jarraipenImpl.setJarraipenId(jarraipen.getJarraipenId());
		jarraipenImpl.setJarraitzaileUserId(jarraipen.getJarraitzaileUserId());
		jarraipenImpl.setJarraituaId(jarraipen.getJarraituaId());
		jarraipenImpl.setJarraipenMota(jarraipen.getJarraipenMota());
		jarraipenImpl.setCreateDate(jarraipen.getCreateDate());

		return jarraipenImpl;
	}

	/**
	 * Returns the jarraipen with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the jarraipen
	 * @return the jarraipen
	 * @throws com.liferay.portal.NoSuchModelException if a jarraipen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jarraipen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the jarraipen with the primary key or throws a {@link net.sareweb.txotx.NoSuchJarraipenException} if it could not be found.
	 *
	 * @param jarraipenId the primary key of the jarraipen
	 * @return the jarraipen
	 * @throws net.sareweb.txotx.NoSuchJarraipenException if a jarraipen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Jarraipen findByPrimaryKey(long jarraipenId)
		throws NoSuchJarraipenException, SystemException {
		Jarraipen jarraipen = fetchByPrimaryKey(jarraipenId);

		if (jarraipen == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + jarraipenId);
			}

			throw new NoSuchJarraipenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				jarraipenId);
		}

		return jarraipen;
	}

	/**
	 * Returns the jarraipen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jarraipen
	 * @return the jarraipen, or <code>null</code> if a jarraipen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Jarraipen fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the jarraipen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jarraipenId the primary key of the jarraipen
	 * @return the jarraipen, or <code>null</code> if a jarraipen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Jarraipen fetchByPrimaryKey(long jarraipenId)
		throws SystemException {
		Jarraipen jarraipen = (Jarraipen)EntityCacheUtil.getResult(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
				JarraipenImpl.class, jarraipenId);

		if (jarraipen == _nullJarraipen) {
			return null;
		}

		if (jarraipen == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				jarraipen = (Jarraipen)session.get(JarraipenImpl.class,
						Long.valueOf(jarraipenId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (jarraipen != null) {
					cacheResult(jarraipen);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(JarraipenModelImpl.ENTITY_CACHE_ENABLED,
						JarraipenImpl.class, jarraipenId, _nullJarraipen);
				}

				closeSession(session);
			}
		}

		return jarraipen;
	}

	/**
	 * Returns all the jarraipens where jarraitzaileUserId = &#63;.
	 *
	 * @param jarraitzaileUserId the jarraitzaile user ID
	 * @return the matching jarraipens
	 * @throws SystemException if a system exception occurred
	 */
	public List<Jarraipen> findByJarraitzaileUserId(long jarraitzaileUserId)
		throws SystemException {
		return findByJarraitzaileUserId(jarraitzaileUserId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jarraipens where jarraitzaileUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param jarraitzaileUserId the jarraitzaile user ID
	 * @param start the lower bound of the range of jarraipens
	 * @param end the upper bound of the range of jarraipens (not inclusive)
	 * @return the range of matching jarraipens
	 * @throws SystemException if a system exception occurred
	 */
	public List<Jarraipen> findByJarraitzaileUserId(long jarraitzaileUserId,
		int start, int end) throws SystemException {
		return findByJarraitzaileUserId(jarraitzaileUserId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jarraipens where jarraitzaileUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param jarraitzaileUserId the jarraitzaile user ID
	 * @param start the lower bound of the range of jarraipens
	 * @param end the upper bound of the range of jarraipens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jarraipens
	 * @throws SystemException if a system exception occurred
	 */
	public List<Jarraipen> findByJarraitzaileUserId(long jarraitzaileUserId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JARRAITZAILEUSERID;
			finderArgs = new Object[] { jarraitzaileUserId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_JARRAITZAILEUSERID;
			finderArgs = new Object[] {
					jarraitzaileUserId,
					
					start, end, orderByComparator
				};
		}

		List<Jarraipen> list = (List<Jarraipen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Jarraipen jarraipen : list) {
				if ((jarraitzaileUserId != jarraipen.getJarraitzaileUserId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_JARRAIPEN_WHERE);

			query.append(_FINDER_COLUMN_JARRAITZAILEUSERID_JARRAITZAILEUSERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(JarraipenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(jarraitzaileUserId);

				list = (List<Jarraipen>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Returns the first jarraipen in the ordered set where jarraitzaileUserId = &#63;.
	 *
	 * @param jarraitzaileUserId the jarraitzaile user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jarraipen
	 * @throws net.sareweb.txotx.NoSuchJarraipenException if a matching jarraipen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Jarraipen findByJarraitzaileUserId_First(long jarraitzaileUserId,
		OrderByComparator orderByComparator)
		throws NoSuchJarraipenException, SystemException {
		Jarraipen jarraipen = fetchByJarraitzaileUserId_First(jarraitzaileUserId,
				orderByComparator);

		if (jarraipen != null) {
			return jarraipen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("jarraitzaileUserId=");
		msg.append(jarraitzaileUserId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJarraipenException(msg.toString());
	}

	/**
	 * Returns the first jarraipen in the ordered set where jarraitzaileUserId = &#63;.
	 *
	 * @param jarraitzaileUserId the jarraitzaile user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jarraipen, or <code>null</code> if a matching jarraipen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Jarraipen fetchByJarraitzaileUserId_First(long jarraitzaileUserId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Jarraipen> list = findByJarraitzaileUserId(jarraitzaileUserId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jarraipen in the ordered set where jarraitzaileUserId = &#63;.
	 *
	 * @param jarraitzaileUserId the jarraitzaile user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jarraipen
	 * @throws net.sareweb.txotx.NoSuchJarraipenException if a matching jarraipen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Jarraipen findByJarraitzaileUserId_Last(long jarraitzaileUserId,
		OrderByComparator orderByComparator)
		throws NoSuchJarraipenException, SystemException {
		Jarraipen jarraipen = fetchByJarraitzaileUserId_Last(jarraitzaileUserId,
				orderByComparator);

		if (jarraipen != null) {
			return jarraipen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("jarraitzaileUserId=");
		msg.append(jarraitzaileUserId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJarraipenException(msg.toString());
	}

	/**
	 * Returns the last jarraipen in the ordered set where jarraitzaileUserId = &#63;.
	 *
	 * @param jarraitzaileUserId the jarraitzaile user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jarraipen, or <code>null</code> if a matching jarraipen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Jarraipen fetchByJarraitzaileUserId_Last(long jarraitzaileUserId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByJarraitzaileUserId(jarraitzaileUserId);

		List<Jarraipen> list = findByJarraitzaileUserId(jarraitzaileUserId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jarraipens before and after the current jarraipen in the ordered set where jarraitzaileUserId = &#63;.
	 *
	 * @param jarraipenId the primary key of the current jarraipen
	 * @param jarraitzaileUserId the jarraitzaile user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jarraipen
	 * @throws net.sareweb.txotx.NoSuchJarraipenException if a jarraipen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Jarraipen[] findByJarraitzaileUserId_PrevAndNext(long jarraipenId,
		long jarraitzaileUserId, OrderByComparator orderByComparator)
		throws NoSuchJarraipenException, SystemException {
		Jarraipen jarraipen = findByPrimaryKey(jarraipenId);

		Session session = null;

		try {
			session = openSession();

			Jarraipen[] array = new JarraipenImpl[3];

			array[0] = getByJarraitzaileUserId_PrevAndNext(session, jarraipen,
					jarraitzaileUserId, orderByComparator, true);

			array[1] = jarraipen;

			array[2] = getByJarraitzaileUserId_PrevAndNext(session, jarraipen,
					jarraitzaileUserId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Jarraipen getByJarraitzaileUserId_PrevAndNext(Session session,
		Jarraipen jarraipen, long jarraitzaileUserId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JARRAIPEN_WHERE);

		query.append(_FINDER_COLUMN_JARRAITZAILEUSERID_JARRAITZAILEUSERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(JarraipenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(jarraitzaileUserId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(jarraipen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Jarraipen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the jarraipens where jarraituaId = &#63;.
	 *
	 * @param jarraituaId the jarraitua ID
	 * @return the matching jarraipens
	 * @throws SystemException if a system exception occurred
	 */
	public List<Jarraipen> findByJarraituaId(long jarraituaId)
		throws SystemException {
		return findByJarraituaId(jarraituaId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jarraipens where jarraituaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param jarraituaId the jarraitua ID
	 * @param start the lower bound of the range of jarraipens
	 * @param end the upper bound of the range of jarraipens (not inclusive)
	 * @return the range of matching jarraipens
	 * @throws SystemException if a system exception occurred
	 */
	public List<Jarraipen> findByJarraituaId(long jarraituaId, int start,
		int end) throws SystemException {
		return findByJarraituaId(jarraituaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jarraipens where jarraituaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param jarraituaId the jarraitua ID
	 * @param start the lower bound of the range of jarraipens
	 * @param end the upper bound of the range of jarraipens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jarraipens
	 * @throws SystemException if a system exception occurred
	 */
	public List<Jarraipen> findByJarraituaId(long jarraituaId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JARRAITUAID;
			finderArgs = new Object[] { jarraituaId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_JARRAITUAID;
			finderArgs = new Object[] { jarraituaId, start, end, orderByComparator };
		}

		List<Jarraipen> list = (List<Jarraipen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Jarraipen jarraipen : list) {
				if ((jarraituaId != jarraipen.getJarraituaId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_JARRAIPEN_WHERE);

			query.append(_FINDER_COLUMN_JARRAITUAID_JARRAITUAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(JarraipenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(jarraituaId);

				list = (List<Jarraipen>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Returns the first jarraipen in the ordered set where jarraituaId = &#63;.
	 *
	 * @param jarraituaId the jarraitua ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jarraipen
	 * @throws net.sareweb.txotx.NoSuchJarraipenException if a matching jarraipen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Jarraipen findByJarraituaId_First(long jarraituaId,
		OrderByComparator orderByComparator)
		throws NoSuchJarraipenException, SystemException {
		Jarraipen jarraipen = fetchByJarraituaId_First(jarraituaId,
				orderByComparator);

		if (jarraipen != null) {
			return jarraipen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("jarraituaId=");
		msg.append(jarraituaId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJarraipenException(msg.toString());
	}

	/**
	 * Returns the first jarraipen in the ordered set where jarraituaId = &#63;.
	 *
	 * @param jarraituaId the jarraitua ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jarraipen, or <code>null</code> if a matching jarraipen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Jarraipen fetchByJarraituaId_First(long jarraituaId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Jarraipen> list = findByJarraituaId(jarraituaId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jarraipen in the ordered set where jarraituaId = &#63;.
	 *
	 * @param jarraituaId the jarraitua ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jarraipen
	 * @throws net.sareweb.txotx.NoSuchJarraipenException if a matching jarraipen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Jarraipen findByJarraituaId_Last(long jarraituaId,
		OrderByComparator orderByComparator)
		throws NoSuchJarraipenException, SystemException {
		Jarraipen jarraipen = fetchByJarraituaId_Last(jarraituaId,
				orderByComparator);

		if (jarraipen != null) {
			return jarraipen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("jarraituaId=");
		msg.append(jarraituaId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJarraipenException(msg.toString());
	}

	/**
	 * Returns the last jarraipen in the ordered set where jarraituaId = &#63;.
	 *
	 * @param jarraituaId the jarraitua ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jarraipen, or <code>null</code> if a matching jarraipen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Jarraipen fetchByJarraituaId_Last(long jarraituaId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByJarraituaId(jarraituaId);

		List<Jarraipen> list = findByJarraituaId(jarraituaId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jarraipens before and after the current jarraipen in the ordered set where jarraituaId = &#63;.
	 *
	 * @param jarraipenId the primary key of the current jarraipen
	 * @param jarraituaId the jarraitua ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jarraipen
	 * @throws net.sareweb.txotx.NoSuchJarraipenException if a jarraipen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Jarraipen[] findByJarraituaId_PrevAndNext(long jarraipenId,
		long jarraituaId, OrderByComparator orderByComparator)
		throws NoSuchJarraipenException, SystemException {
		Jarraipen jarraipen = findByPrimaryKey(jarraipenId);

		Session session = null;

		try {
			session = openSession();

			Jarraipen[] array = new JarraipenImpl[3];

			array[0] = getByJarraituaId_PrevAndNext(session, jarraipen,
					jarraituaId, orderByComparator, true);

			array[1] = jarraipen;

			array[2] = getByJarraituaId_PrevAndNext(session, jarraipen,
					jarraituaId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Jarraipen getByJarraituaId_PrevAndNext(Session session,
		Jarraipen jarraipen, long jarraituaId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JARRAIPEN_WHERE);

		query.append(_FINDER_COLUMN_JARRAITUAID_JARRAITUAID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(JarraipenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(jarraituaId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(jarraipen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Jarraipen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the jarraipens.
	 *
	 * @return the jarraipens
	 * @throws SystemException if a system exception occurred
	 */
	public List<Jarraipen> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jarraipens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of jarraipens
	 * @param end the upper bound of the range of jarraipens (not inclusive)
	 * @return the range of jarraipens
	 * @throws SystemException if a system exception occurred
	 */
	public List<Jarraipen> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jarraipens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of jarraipens
	 * @param end the upper bound of the range of jarraipens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jarraipens
	 * @throws SystemException if a system exception occurred
	 */
	public List<Jarraipen> findAll(int start, int end,
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

		List<Jarraipen> list = (List<Jarraipen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_JARRAIPEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JARRAIPEN.concat(JarraipenModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Jarraipen>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Jarraipen>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the jarraipens where jarraitzaileUserId = &#63; from the database.
	 *
	 * @param jarraitzaileUserId the jarraitzaile user ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByJarraitzaileUserId(long jarraitzaileUserId)
		throws SystemException {
		for (Jarraipen jarraipen : findByJarraitzaileUserId(jarraitzaileUserId)) {
			remove(jarraipen);
		}
	}

	/**
	 * Removes all the jarraipens where jarraituaId = &#63; from the database.
	 *
	 * @param jarraituaId the jarraitua ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByJarraituaId(long jarraituaId) throws SystemException {
		for (Jarraipen jarraipen : findByJarraituaId(jarraituaId)) {
			remove(jarraipen);
		}
	}

	/**
	 * Removes all the jarraipens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Jarraipen jarraipen : findAll()) {
			remove(jarraipen);
		}
	}

	/**
	 * Returns the number of jarraipens where jarraitzaileUserId = &#63;.
	 *
	 * @param jarraitzaileUserId the jarraitzaile user ID
	 * @return the number of matching jarraipens
	 * @throws SystemException if a system exception occurred
	 */
	public int countByJarraitzaileUserId(long jarraitzaileUserId)
		throws SystemException {
		Object[] finderArgs = new Object[] { jarraitzaileUserId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_JARRAITZAILEUSERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_JARRAIPEN_WHERE);

			query.append(_FINDER_COLUMN_JARRAITZAILEUSERID_JARRAITZAILEUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(jarraitzaileUserId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_JARRAITZAILEUSERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of jarraipens where jarraituaId = &#63;.
	 *
	 * @param jarraituaId the jarraitua ID
	 * @return the number of matching jarraipens
	 * @throws SystemException if a system exception occurred
	 */
	public int countByJarraituaId(long jarraituaId) throws SystemException {
		Object[] finderArgs = new Object[] { jarraituaId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_JARRAITUAID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_JARRAIPEN_WHERE);

			query.append(_FINDER_COLUMN_JARRAITUAID_JARRAITUAID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(jarraituaId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_JARRAITUAID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of jarraipens.
	 *
	 * @return the number of jarraipens
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_JARRAIPEN);

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
	 * Initializes the jarraipen persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.net.sareweb.txotx.model.Jarraipen")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Jarraipen>> listenersList = new ArrayList<ModelListener<Jarraipen>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Jarraipen>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(JarraipenImpl.class.getName());
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
	private static final String _SQL_SELECT_JARRAIPEN = "SELECT jarraipen FROM Jarraipen jarraipen";
	private static final String _SQL_SELECT_JARRAIPEN_WHERE = "SELECT jarraipen FROM Jarraipen jarraipen WHERE ";
	private static final String _SQL_COUNT_JARRAIPEN = "SELECT COUNT(jarraipen) FROM Jarraipen jarraipen";
	private static final String _SQL_COUNT_JARRAIPEN_WHERE = "SELECT COUNT(jarraipen) FROM Jarraipen jarraipen WHERE ";
	private static final String _FINDER_COLUMN_JARRAITZAILEUSERID_JARRAITZAILEUSERID_2 =
		"jarraipen.jarraitzaileUserId = ?";
	private static final String _FINDER_COLUMN_JARRAITUAID_JARRAITUAID_2 = "jarraipen.jarraituaId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "jarraipen.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Jarraipen exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Jarraipen exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(JarraipenPersistenceImpl.class);
	private static Jarraipen _nullJarraipen = new JarraipenImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Jarraipen> toCacheModel() {
				return _nullJarraipenCacheModel;
			}
		};

	private static CacheModel<Jarraipen> _nullJarraipenCacheModel = new CacheModel<Jarraipen>() {
			public Jarraipen toEntityModel() {
				return _nullJarraipen;
			}
		};
}