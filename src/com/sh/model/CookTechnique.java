package com.sh.model;

import java.io.Serializable;

//菜谱制作技巧--实体类
public class CookTechnique implements Serializable {

	private int recipeId;					//所属菜谱id
	private int techniqueId;
	private String techniqueContent;
	
	public CookTechnique() {
		super();
	}

	public CookTechnique(int recipeId, int techniqueId,
			String techniqueContent) {
		super();
		this.recipeId = recipeId;
		this.techniqueId = techniqueId;
		this.techniqueContent = techniqueContent;
	}

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
	
}
