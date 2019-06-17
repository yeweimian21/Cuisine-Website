package com.sh.model;

import java.io.Serializable;

//热门菜谱
public class Hottest implements Serializable {
	
	private int hottestId;
	private int recipeId;
	
	public Hottest() {
		super();
	}

	public Hottest(int hottestId, int recipeId) {
		super();
		this.hottestId = hottestId;
		this.recipeId = recipeId;
	}

	public int getHottestId() {
		return hottestId;
	}

	public void setHottestId(int hottestId) {
		this.hottestId = hottestId;
	}

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	
	
}
