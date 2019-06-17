package com.sh.biz.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sh.biz.LatestBiz;
import com.sh.dao.LatestDao;
import com.sh.dao.RecipeDao;
import com.sh.model.Latest;
import com.sh.model.Recipe;

public class LatestBizimpl implements LatestBiz {
	
	LatestDao latestDao;
	RecipeDao recipeDao;

	public LatestDao getLatestDao() {
		return latestDao;
	}

	public void setLatestDao(LatestDao latestDao) {
		this.latestDao = latestDao;
	}

	public RecipeDao getRecipeDao() {
		return recipeDao;
	}

	public void setRecipeDao(RecipeDao recipeDao) {
		this.recipeDao = recipeDao;
	}

	//获得最新上线
	public List<Recipe> getLatestRecipe() {
		List<Recipe> list=new ArrayList<Recipe>();
		List<Latest> latestList=latestDao.getLatestList();
		Iterator<Latest> iterator=latestList.iterator();
		while(iterator.hasNext()){
			Latest latest=iterator.next();
			int recipeId=latest.getRecipeId();
			Recipe recipe=recipeDao.getRecipe(recipeId);
			list.add(recipe);
		}
		return list;
	}

}
