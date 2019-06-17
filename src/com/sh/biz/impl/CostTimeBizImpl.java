package com.sh.biz.impl;

import java.util.Map;

import org.apache.commons.collections.map.LinkedMap;

import com.sh.biz.CostTimeBiz;
import com.sh.dao.CostTimeDao;
import com.sh.model.CostTime;

public class CostTimeBizImpl implements CostTimeBiz {
	
	CostTimeDao costTimeDao;

	public CostTimeDao getCostTimeDao() {
		return costTimeDao;
	}

	public void setCostTimeDao(CostTimeDao costTimeDao) {
		this.costTimeDao = costTimeDao;
	}

	public Map getCostTimeList() {
		Map costTimeListMap=new LinkedMap();
		costTimeListMap.put("title", "耗时");
		costTimeListMap.put("name", "costTime");
		costTimeListMap.put("dataList", costTimeDao.getCostTimeList());
		return costTimeListMap;
	}

	public CostTime getCostTime(int costTimeId) {
		
		return costTimeDao.getCostTime(costTimeId);
	}

}
