package com.sh.biz.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sh.biz.RecommendationBiz;
import com.sh.dao.RecipeDao;
import com.sh.dao.RecommendationDao;
import com.sh.model.Recipe;
import com.sh.model.Recommendation;

public class RecommendationBizImpl implements RecommendationBiz {

	RecommendationDao recommendationDao;
	RecipeDao recipeDao;
	
	public RecommendationDao getRecommendationDao() {
		return recommendationDao;
	}

	public void setRecommendationDao(RecommendationDao recommendationDao) {
		this.recommendationDao = recommendationDao;
	}

	public RecipeDao getRecipeDao() {
		return recipeDao;
	}

	public void setRecipeDao(RecipeDao recipeDao) {
		this.recipeDao = recipeDao;
	}

	//获得今日推荐的菜谱
	public List<Recipe> getRecommendationRecipe() {
		ArrayList<Recipe> recipeList=new ArrayList<Recipe>();
		Recommendation recommendation;
		int recipeId;
		Recipe recipe;
		List<Recommendation> recommendationList=recommendationDao.getRecommendationList();
		Iterator<Recommendation> iterator=recommendationList.iterator();
		while(iterator.hasNext()){
			recommendation=iterator.next();
			recipeId=recommendation.getRecipeId();
			recipe=recipeDao.getRecipe(recipeId);
			recipeList.add(recipe);
		}
		return recipeList;
	}

}
