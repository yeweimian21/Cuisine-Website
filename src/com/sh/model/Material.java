package com.sh.model;

import java.io.Serializable;

//食材--实体类
public class Material implements Serializable {
	
	private int materialId;			//食材Id
	private String materialName;	//食材名称
	private int materialCategoryId;		//食材类别
	
	public Material() {
		super();
	}

	public Material(int materialId, String materialName, int materialCategoryId) {
		super();
		this.materialId = materialId;
		this.materialName = materialName;
		this.materialCategoryId = materialCategoryId;
	}

	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public int getMaterialCategoryId() {
		return materialCategoryId;
	}

	public void setMaterialCategoryId(int materialCategoryId) {
		this.materialCategoryId = materialCategoryId;
	}

}
