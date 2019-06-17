package com.sh.biz.impl;

import java.util.List;

import com.sh.biz.CookIngredientBiz;
import com.sh.dao.CookIngredientDao;
import com.sh.model.CookIngredient;

public class CookIngredientBizImpl implements CookIngredientBiz {
	
	CookIngredientDao cookIngredientDao;

	public CookIngredientDao getCookIngredientDao() {
		return cookIngredientDao;
	}

	public void setCookIngredientDao(CookIngredientDao cookIngredientDao) {
		this.cookIngredientDao = cookIngredientDao;
	}

	public List<CookIngredient> getCookIngredient(int recipeId) {
		
		return cookIngredientDao.getCookIngredient(recipeId);
	}

	public void addCookIngredient(CookIngredient cookIngredient) {
		cookIngredientDao.addCookIngredient(cookIngredient);
		
	}

}
