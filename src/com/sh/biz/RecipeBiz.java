package com.sh.biz;

import java.util.List;
import java.util.Map;

import com.sh.model.Category;
import com.sh.model.CostTime;
import com.sh.model.Craft;
import com.sh.model.Cuisine;
import com.sh.model.Difficulty;
import com.sh.model.Recipe;

public interface RecipeBiz {

	public Recipe getRecipe(int recipeId);
	
	public Map getRecipeDetail(int recipeId);
	
	public List<Recipe> getReciptList();
	
	public List<Recipe> getRecipeListByTaste(int tasteId);
	public List<Recipe> getRecipeListByCraft(int craftId);
	public List<Recipe> getRecipeListByCostTime(int costTimeId);
	public List<Recipe> getRecipeListByDifficulty(int difficultyId);
	public List<Recipe> getRecipeListByCategory(int categoryId);
	public List<Recipe> getRecipeListByCuisine(int cuisineId);
	
	public List<Recipe> getRecipeListByMaterial(int materialId);
	
	public List<Recipe> getReciptList(String recipeName);
	
	public List<Map> getRecipeNav();
}
