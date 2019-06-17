package com.sh.model;

import java.io.Serializable;

//菜谱耗时--实体类
public class CostTime implements Serializable {

	private int costTimeId;
	private String costTimeName;
	
	public CostTime() {
		super();
	}

	public CostTime(int costTimeId, String costTimeName) {
		super();
		this.costTimeId = costTimeId;
		this.costTimeName = costTimeName;
	}

	public int getCostTimeId() {
		return costTimeId;
	}

	public void setCostTimeId(int costTimeId) {
		this.costTimeId = costTimeId;
	}

	public String getCostTimeName() {
		return costTimeName;
	}

	public void setCostTimeName(String costTimeName) {
		this.costTimeName = costTimeName;
	}
	
}
