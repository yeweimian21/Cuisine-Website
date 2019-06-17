package com.sh.model;

import java.io.Serializable;

//菜谱制作步骤--实体类
public class CookMethod implements Serializable {
	
	private int recipeId;				//所属的菜谱Id
	private int stepId;					//步骤序号
	private String stepContent;			//步骤内容
	private String stepPicture;			//步骤配图
	
	public CookMethod() {
		super();
	}

	public CookMethod(int recipeId, int stepId,
			String stepContent, String stepPicture) {
		super();
		this.recipeId = recipeId;
		this.stepId = stepId;
		this.stepContent = stepContent;
		this.stepPicture = stepPicture;
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
	
}
