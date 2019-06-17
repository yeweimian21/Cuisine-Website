package com.sh.action;

import java.io.UnsupportedEncodingException;

import com.opensymphony.xwork2.ActionSupport;
import com.sh.biz.MaterialBiz;
import com.sh.model.Material;

public class MaterialAction extends ActionSupport{

	private int materialId;			//食材Id
	private String materialName;	//食材名称
	private int materialCategoryId;		//食材类别
	
	MaterialBiz materialBiz;
	
	public MaterialBiz getMaterialBiz() {
		return materialBiz;
	}
	public void setMaterialBiz(MaterialBiz materialBiz) {
		this.materialBiz = materialBiz;
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
	
	public String addMaterial(){
		String name="";
		try {
			name=new String(materialName.getBytes("iso-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		Material material=new Material();
		material.setMaterialId(materialId);
		material.setMaterialName(name);
		material.setMaterialCategoryId(materialCategoryId);
		
		materialBiz.addMaterial(material);
		return "success";
	}
	
}
