package com.sh.model;

import java.io.Serializable;

//今日推荐菜谱
public class Recommendation implements Serializable {

	private int recommendationId;
	private int recipeId;
	
	public Recommendation() {
		super();
	}

	public Recommendation(int recommendationId, int recipeId) {
		super();
		this.recommendationId = recommendationId;
		this.recipeId = recipeId;
	}

	public int getRecommendationId() {
		return recommendationId;
	}

	public void setRecommendationId(int recommendationId) {
		this.recommendationId = recommendationId;
	}

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	
}
