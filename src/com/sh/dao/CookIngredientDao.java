package com.sh.dao;

import java.util.List;

import com.sh.model.CookIngredient;

public interface CookIngredientDao {
	
	public void addCookIngredient(CookIngredient cookIngredient);

	public List<CookIngredient> getCookIngredient(int recipeId);
	
}
