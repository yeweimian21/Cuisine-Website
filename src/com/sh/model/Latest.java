package com.sh.model;

import java.io.Serializable;

//最新发布菜谱
public class Latest implements Serializable {

	private int latestId;
	private int recipeId;
	
	public Latest() {
		super();
	}

	public Latest(int latestId, int recipeId) {
		super();
		this.latestId = latestId;
		this.recipeId = recipeId;
	}

	public int getLatestId() {
		return latestId;
	}

	public void setLatestId(int latestId) {
		this.latestId = latestId;
	}

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	
}
