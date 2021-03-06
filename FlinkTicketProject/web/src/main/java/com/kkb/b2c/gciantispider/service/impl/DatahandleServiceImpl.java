/**
 * 
 */
package com.kkb.b2c.gciantispider.service.impl;

import com.kkb.b2c.gciantispider.dao.IDatahandleDao;
import com.kkb.b2c.gciantispider.model.Analyzerule;
import com.kkb.b2c.gciantispider.service.IDatahandleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;



@Service
public class DatahandleServiceImpl implements IDatahandleService {

	@Autowired
	private IDatahandleDao datahandleDao;
	
	
	@Override
	public Analyzerule getAnalyzerule(String behaviorType, String flightType, String hql) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("behaviorType", behaviorType);
		params.put("flightType", flightType);
		return datahandleDao.get(hql, params);
	}


	@Override
	public void saveOrUpdateData(Analyzerule analyzerule) {
		datahandleDao.saveOrUpdate(analyzerule);
	}


}
