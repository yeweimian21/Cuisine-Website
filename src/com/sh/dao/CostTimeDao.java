package com.sh.dao;

import java.util.List;

import com.sh.model.CostTime;

public interface CostTimeDao {
	
	public void addCostTime(CostTime costTime);
	
	public void updateCostTime(int costTimeId,CostTime costTime);
	
	public void deleteCostTime(int costTimeId);

	public List<CostTime> getCostTimeList();
	
	public CostTime getCostTime(int costTimeId);
	
}
