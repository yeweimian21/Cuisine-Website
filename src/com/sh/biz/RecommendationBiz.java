package com.sh.biz;

import java.util.List;

import com.sh.model.Recipe;

public interface RecommendationBiz {

	//获得今日推荐的菜谱
	public List<Recipe> getRecommendationRecipe();
	
}
