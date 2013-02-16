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

package net.sareweb.txotx.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;

import net.sareweb.txotx.model.Gertaera;
import net.sareweb.txotx.service.GertaeraLocalServiceUtil;
import net.sareweb.txotx.service.base.GertaeraLocalServiceBaseImpl;

/**
 * The implementation of the gertaera local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.sareweb.txotx.service.GertaeraLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author A.Galdos
 * @see net.sareweb.txotx.service.base.GertaeraLocalServiceBaseImpl
 * @see net.sareweb.txotx.service.GertaeraLocalServiceUtil
 */
public class GertaeraLocalServiceImpl extends GertaeraLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link net.sareweb.txotx.service.GertaeraLocalServiceUtil} to access the gertaera local service.
	 */
	
	public double getSagardotegiarenBalorazioBB(long sagardotegiId) throws SystemException{
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(Gertaera.class);
		Criterion sagardotegiCr = PropertyFactoryUtil.forName("sagardotegiId").eq(sagardotegiId);
		dq.add(sagardotegiCr);
		
		Criterion gertaeraMotaCr = PropertyFactoryUtil.forName("gertaeraMota").eq("GERTAERA_MOTA_BALORAZIOA");
		dq.add(gertaeraMotaCr);
		
		dq.setProjection(ProjectionFactoryUtil.avg("balorazioa"));
		List<Double> results = GertaeraLocalServiceUtil.dynamicQuery(dq);
		if(results!=null){
			return results.get(0);
		}else{
			return 0;
		}
		
	}
}