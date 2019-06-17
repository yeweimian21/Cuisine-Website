package com.sh.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class MaterialCategory implements Serializable {

	private int materialCategoryId;
	private String materialCategoryName;

	public MaterialCategory() {
		super();
	}

	public MaterialCategory(int materialCategoryId, String materialCategoryName) {
		super();
		this.materialCategoryId = materialCategoryId;
		this.materialCategoryName = materialCategoryName;
	}

	public int getMaterialCategoryId() {
		return materialCategoryId;
	}

	public void setMaterialCategoryId(int materialCategoryId) {
		this.materialCategoryId = materialCategoryId;
	}

	public String getMaterialCategoryName() {
		return materialCategoryName;
	}

	public void setMaterialCategoryName(String materialCategoryName) {
		this.materialCategoryName = materialCategoryName;
	}
	
}
