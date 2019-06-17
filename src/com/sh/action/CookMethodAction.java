package com.sh.action;

import java.io.UnsupportedEncodingException;

import com.opensymphony.xwork2.ActionSupport;
import com.sh.biz.CookMethodBiz;
import com.sh.model.CookMethod;

public class CookMethodAction extends ActionSupport{
	
	private int recipeId;				//所属的菜谱Id
	private int stepId;					//步骤序号
	private String stepContent;			//步骤内容
	private String stepPicture;			//步骤配图
	
	CookMethodBiz cookMethodBiz;
	
	public CookMethodBiz getCookMethodBiz() {
		return cookMethodBiz;
	}
	public void setCookMethodBiz(CookMethodBiz cookMethodBiz) {
		this.cookMethodBiz = cookMethodBiz;
	}
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public int getStepId() {
		return stepId;
	}
	public void setStepId(int stepId) {
		this.stepId = stepId;
	}
	public String getStepContent() {
		return stepContent;
	}
	public void setStepContent(String stepContent) {
		this.stepContent = stepContent;
	}
	public String getStepPicture() {
		return stepPicture;
	}
	public void setStepPicture(String stepPicture) {
		this.stepPicture = stepPicture;
	}
	
	public String addMethod(){
		String content="",picture="";
		try {
			content=new String(stepContent.getBytes("iso-8859-1"), "UTF-8");
			picture=new String(stepPicture.getBytes("iso-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CookMethod cookMethod=new CookMethod();
		cookMethod.setRecipeId(recipeId);
		cookMethod.setStepId(stepId);
		cookMethod.setStepContent(content);
		cookMethod.setStepPicture(picture);
		
		cookMethodBiz.addCookMethod(cookMethod);
		
		return "success";
	}
}
