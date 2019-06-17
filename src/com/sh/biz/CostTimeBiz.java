package com.sh.biz;

import java.util.Map;

import com.sh.model.CostTime;

public interface CostTimeBiz {

	public Map getCostTimeList();
	
	public CostTime getCostTime(int costTimeId);
}
