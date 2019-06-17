package com.sh.biz;

import java.util.List;

import com.sh.model.CookIngredient;

public interface CookIngredientBiz {
	
	public void addCookIngredient(CookIngredient cookIngredient);

	public List<CookIngredient> getCookIngredient(int recipeId);
	
}
