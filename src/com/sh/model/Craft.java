package com.sh.model;

import java.io.Serializable;

//菜谱制作工艺--实体类
public class Craft implements Serializable {

	private int craftId;
	private String craftName;
	
	public Craft() {
		super();
	}

	public Craft(int craftId, String craftName) {
		super();
		this.craftId = craftId;
		this.craftName = craftName;
	}

	public int getCraftId() {
		return craftId;
	}

	public void setCraftId(int craftId) {
		this.craftId = craftId;
	}

	public String getCraftName() {
		return craftName;
	}

	public void setCraftName(String craftName) {
		this.craftName = craftName;
	}
	
}
