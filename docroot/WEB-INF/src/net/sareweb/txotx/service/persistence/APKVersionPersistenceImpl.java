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

import net.sareweb.txotx.NoSuchAPKVersionException;
import net.sareweb.txotx.model.APKVersion;
import net.sareweb.txotx.model.impl.APKVersionImpl;
import net.sareweb.txotx.model.impl.APKVersionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the a p k version service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see APKVersionPersistence
 * @see APKVersionUtil
 * @generated
 */
public class APKVersionPersistenceImpl extends BasePersistenceImpl<APKVersion>
	implements APKVersionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link APKVersionUtil} to access the a p k version persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = APKVersionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(APKVersionModelImpl.ENTITY_CACHE_ENABLED,
			APKVersionModelImpl.FINDER_CACHE_ENABLED, APKVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(APKVersionModelImpl.ENTITY_CACHE_ENABLED,
			APKVersionModelImpl.FINDER_CACHE_ENABLED, APKVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(APKVersionModelImpl.ENTITY_CACHE_ENABLED,
			APKVersionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the a p k version in the entity cache if it is enabled.
	 *
	 * @param apkVersion the a p k version
	 */
	public void cacheResult(APKVersion apkVersion) {
		EntityCacheUtil.putResult(APKVersionModelImpl.ENTITY_CACHE_ENABLED,
			APKVersionImpl.class, apkVersion.getPrimaryKey(), apkVersion);

		apkVersion.resetOriginalValues();
	}

	/**
	 * Caches the a p k versions in the entity cache if it is enabled.
	 *
	 * @param apkVersions the a p k versions
	 */
	public void cacheResult(List<APKVersion> apkVersions) {
		for (APKVersion apkVersion : apkVersions) {
			if (EntityCacheUtil.getResult(
						APKVersionModelImpl.ENTITY_CACHE_ENABLED,
						APKVersionImpl.class, apkVersion.getPrimaryKey()) == null) {
				cacheResult(apkVersion);
			}
			else {
				apkVersion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all a p k versions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(APKVersionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(APKVersionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the a p k version.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(APKVersion apkVersion) {
		EntityCacheUtil.removeResult(APKVersionModelImpl.ENTITY_CACHE_ENABLED,
			APKVersionImpl.class, apkVersion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<APKVersion> apkVersions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (APKVersion apkVersion : apkVersions) {
			EntityCacheUtil.removeResult(APKVersionModelImpl.ENTITY_CACHE_ENABLED,
				APKVersionImpl.class, apkVersion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new a p k version with the primary key. Does not add the a p k version to the database.
	 *
	 * @param apkVersionId the primary key for the new a p k version
	 * @return the new a p k version
	 */
	public APKVersion create(long apkVersionId) {
		APKVersion apkVersion = new APKVersionImpl();

		apkVersion.setNew(true);
		apkVersion.setPrimaryKey(apkVersionId);

		return apkVersion;
	}

	/**
	 * Removes the a p k version with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param apkVersionId the primary key of the a p k version
	 * @return the a p k version that was removed
	 * @throws net.sareweb.txotx.NoSuchAPKVersionException if a a p k version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public APKVersion remove(long apkVersionId)
		throws NoSuchAPKVersionException, SystemException {
		return remove(Long.valueOf(apkVersionId));
	}

	/**
	 * Removes the a p k version with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the a p k version
	 * @return the a p k version that was removed
	 * @throws net.sareweb.txotx.NoSuchAPKVersionException if a a p k version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public APKVersion remove(Serializable primaryKey)
		throws NoSuchAPKVersionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			APKVersion apkVersion = (APKVersion)session.get(APKVersionImpl.class,
					primaryKey);

			if (apkVersion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAPKVersionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(apkVersion);
		}
		catch (NoSuchAPKVersionException nsee) {
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
	protected APKVersion removeImpl(APKVersion apkVersion)
		throws SystemException {
		apkVersion = toUnwrappedModel(apkVersion);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, apkVersion);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(apkVersion);

		return apkVersion;
	}

	@Override
	public APKVersion updateImpl(
		net.sareweb.txotx.model.APKVersion apkVersion, boolean merge)
		throws SystemException {
		apkVersion = toUnwrappedModel(apkVersion);

		boolean isNew = apkVersion.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, apkVersion, merge);

			apkVersion.setNew(false);
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

		EntityCacheUtil.putResult(APKVersionModelImpl.ENTITY_CACHE_ENABLED,
			APKVersionImpl.class, apkVersion.getPrimaryKey(), apkVersion);

		return apkVersion;
	}

	protected APKVersion toUnwrappedModel(APKVersion apkVersion) {
		if (apkVersion instanceof APKVersionImpl) {
			return apkVersion;
		}

		APKVersionImpl apkVersionImpl = new APKVersionImpl();

		apkVersionImpl.setNew(apkVersion.isNew());
		apkVersionImpl.setPrimaryKey(apkVersion.getPrimaryKey());

		apkVersionImpl.setApkVersionId(apkVersion.getApkVersionId());
		apkVersionImpl.setSupportedMinVersion(apkVersion.getSupportedMinVersion());
		apkVersionImpl.setSupportedMinVersionName(apkVersion.getSupportedMinVersionName());
		apkVersionImpl.setCurrentVersion(apkVersion.getCurrentVersion());
		apkVersionImpl.setCurrentVersionName(apkVersion.getCurrentVersionName());
		apkVersionImpl.setCreateDate(apkVersion.getCreateDate());

		return apkVersionImpl;
	}

	/**
	 * Returns the a p k version with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the a p k version
	 * @return the a p k version
	 * @throws com.liferay.portal.NoSuchModelException if a a p k version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public APKVersion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the a p k version with the primary key or throws a {@link net.sareweb.txotx.NoSuchAPKVersionException} if it could not be found.
	 *
	 * @param apkVersionId the primary key of the a p k version
	 * @return the a p k version
	 * @throws net.sareweb.txotx.NoSuchAPKVersionException if a a p k version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public APKVersion findByPrimaryKey(long apkVersionId)
		throws NoSuchAPKVersionException, SystemException {
		APKVersion apkVersion = fetchByPrimaryKey(apkVersionId);

		if (apkVersion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + apkVersionId);
			}

			throw new NoSuchAPKVersionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				apkVersionId);
		}

		return apkVersion;
	}

	/**
	 * Returns the a p k version with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the a p k version
	 * @return the a p k version, or <code>null</code> if a a p k version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public APKVersion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the a p k version with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param apkVersionId the primary key of the a p k version
	 * @return the a p k version, or <code>null</code> if a a p k version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public APKVersion fetchByPrimaryKey(long apkVersionId)
		throws SystemException {
		APKVersion apkVersion = (APKVersion)EntityCacheUtil.getResult(APKVersionModelImpl.ENTITY_CACHE_ENABLED,
				APKVersionImpl.class, apkVersionId);

		if (apkVersion == _nullAPKVersion) {
			return null;
		}

		if (apkVersion == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				apkVersion = (APKVersion)session.get(APKVersionImpl.class,
						Long.valueOf(apkVersionId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (apkVersion != null) {
					cacheResult(apkVersion);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(APKVersionModelImpl.ENTITY_CACHE_ENABLED,
						APKVersionImpl.class, apkVersionId, _nullAPKVersion);
				}

				closeSession(session);
			}
		}

		return apkVersion;
	}

	/**
	 * Returns all the a p k versions.
	 *
	 * @return the a p k versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<APKVersion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the a p k versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of a p k versions
	 * @param end the upper bound of the range of a p k versions (not inclusive)
	 * @return the range of a p k versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<APKVersion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the a p k versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of a p k versions
	 * @param end the upper bound of the range of a p k versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of a p k versions
	 * @throws SystemException if a system exception occurred
	 */
	public List<APKVersion> findAll(int start, int end,
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

		List<APKVersion> list = (List<APKVersion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_APKVERSION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_APKVERSION.concat(APKVersionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<APKVersion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<APKVersion>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the a p k versions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (APKVersion apkVersion : findAll()) {
			remove(apkVersion);
		}
	}

	/**
	 * Returns the number of a p k versions.
	 *
	 * @return the number of a p k versions
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_APKVERSION);

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
	 * Initializes the a p k version persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.net.sareweb.txotx.model.APKVersion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<APKVersion>> listenersList = new ArrayList<ModelListener<APKVersion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<APKVersion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(APKVersionImpl.class.getName());
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
	private static final String _SQL_SELECT_APKVERSION = "SELECT apkVersion FROM APKVersion apkVersion";
	private static final String _SQL_COUNT_APKVERSION = "SELECT COUNT(apkVersion) FROM APKVersion apkVersion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "apkVersion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No APKVersion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(APKVersionPersistenceImpl.class);
	private static APKVersion _nullAPKVersion = new APKVersionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<APKVersion> toCacheModel() {
				return _nullAPKVersionCacheModel;
			}
		};

	private static CacheModel<APKVersion> _nullAPKVersionCacheModel = new CacheModel<APKVersion>() {
			public APKVersion toEntityModel() {
				return _nullAPKVersion;
			}
		};
}