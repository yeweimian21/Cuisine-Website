package com.sh.biz.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sh.biz.HottestBiz;
import com.sh.dao.HottestDao;
import com.sh.dao.RecipeDao;
import com.sh.model.Hottest;
import com.sh.model.Recipe;

public class HottestBizImpl implements HottestBiz {

	HottestDao hottestDao;
	RecipeDao recipeDao;

	public HottestDao getHottestDao() {
		return hottestDao;
	}

	public void setHottestDao(HottestDao hottestDao) {
		this.hottestDao = hottestDao;
	}

	public RecipeDao getRecipeDao() {
		return recipeDao;
	}

	public void setRecipeDao(RecipeDao recipeDao) {
		this.recipeDao = recipeDao;
	}

	public List<Recipe> getHottestRecipe() {
		ArrayList<Recipe> recipeList=new ArrayList<Recipe>();
		Hottest hottest;
		int recipeId;
		Recipe recipe;
		List<Hottest> hottestList=hottestDao.getHottestList();
		Iterator<Hottest> iterator=hottestList.iterator();
		while(iterator.hasNext()){
			hottest=iterator.next();
			recipeId=hottest.getRecipeId();
			recipe=recipeDao.getRecipe(recipeId);
			recipeList.add(recipe);
		}
		return recipeList;
	}

}
