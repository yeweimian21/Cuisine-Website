package com.sh.action;

import java.io.UnsupportedEncodingException;

import com.opensymphony.xwork2.ActionSupport;
import com.sh.biz.CookTechniqueBiz;
import com.sh.model.CookTechnique;

public class CookTechniqueAction extends ActionSupport{

	private int recipeId;					//所属菜谱id
	private int techniqueId;				//技巧序号
	private String techniqueContent;
	
	CookTechniqueBiz cookTechniqueBiz;
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public int getTechniqueId() {
		return techniqueId;
	}
	public void setTechniqueId(int techniqueId) {
		this.techniqueId = techniqueId;
	}
	public String getTechniqueContent() {
		return techniqueContent;
	}
	public void setTechniqueContent(String techniqueContent) {
		this.techniqueContent = techniqueContent;
	}
	public CookTechniqueBiz getCookTechniqueBiz() {
		return cookTechniqueBiz;
	}
	public void setCookTechniqueBiz(CookTechniqueBiz cookTechniqueBiz) {
		this.cookTechniqueBiz = cookTechniqueBiz;
	}
	
	public String addTechnique(){
		String content="";
		try {
			content=new String(techniqueContent.getBytes("iso-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CookTechnique cookTechnique=new CookTechnique();
		cookTechnique.setRecipeId(recipeId);
		cookTechnique.setTechniqueId(techniqueId);
		cookTechnique.setTechniqueContent(content);
		
		cookTechniqueBiz.addCookTechnique(cookTechnique);
		
		return "success";
	}
}
