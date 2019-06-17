package com.sh.biz.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.LinkedMap;

import com.sh.biz.CategoryBiz;
import com.sh.biz.CookIngredientBiz;
import com.sh.biz.CookMethodBiz;
import com.sh.biz.CookTechniqueBiz;
import com.sh.biz.CostTimeBiz;
import com.sh.biz.CraftBiz;
import com.sh.biz.CuisineBiz;
import com.sh.biz.DifficultyBiz;
import com.sh.biz.RecipeBiz;
import com.sh.biz.TasteBiz;
import com.sh.dao.RecipeDao;
import com.sh.model.Category;
import com.sh.model.CookIngredient;
import com.sh.model.CookMethod;
import com.sh.model.CookTechnique;
import com.sh.model.CostTime;
import com.sh.model.Craft;
import com.sh.model.Cuisine;
import com.sh.model.Difficulty;
import com.sh.model.Recipe;
import com.sh.model.Taste;

public class RecipeBizImpl implements RecipeBiz {
	
	RecipeDao recipeDao;
	
	private TasteBiz tasteBiz;
	private CraftBiz craftBiz;
	private CostTimeBiz costTimeBiz;
	private DifficultyBiz difficultyBiz;
	private CategoryBiz categoryBiz;
	private CuisineBiz cuisineBiz;
	
	CookIngredientBiz cookIngredientBiz;
	CookMethodBiz cookMethodBiz;
	CookTechniqueBiz cookTechniqueBiz;

	public RecipeDao getRecipeDao() {
		return recipeDao;
	}

	public void setRecipeDao(RecipeDao recipeDao) {
		this.recipeDao = recipeDao;
	}

	public TasteBiz getTasteBiz() {
		return tasteBiz;
	}

	public void setTasteBiz(TasteBiz tasteBiz) {
		this.tasteBiz = tasteBiz;
	}

	public CraftBiz getCraftBiz() {
		return craftBiz;
	}

	public void setCraftBiz(CraftBiz craftBiz) {
		this.craftBiz = craftBiz;
	}

	public CostTimeBiz getCostTimeBiz() {
		return costTimeBiz;
	}

	public void setCostTimeBiz(CostTimeBiz costTimeBiz) {
		this.costTimeBiz = costTimeBiz;
	}

	public DifficultyBiz getDifficultyBiz() {
		return difficultyBiz;
	}

	public void setDifficultyBiz(DifficultyBiz difficultyBiz) {
		this.difficultyBiz = difficultyBiz;
	}

	public CategoryBiz getCategoryBiz() {
		return categoryBiz;
	}

	public void setCategoryBiz(CategoryBiz categoryBiz) {
		this.categoryBiz = categoryBiz;
	}

	public CuisineBiz getCuisineBiz() {
		return cuisineBiz;
	}

	public void setCuisineBiz(CuisineBiz cuisineBiz) {
		this.cuisineBiz = cuisineBiz;
	}

	public CookIngredientBiz getCookIngredientBiz() {
		return cookIngredientBiz;
	}

	public void setCookIngredientBiz(CookIngredientBiz cookIngredientBiz) {
		this.cookIngredientBiz = cookIngredientBiz;
	}

	public CookMethodBiz getCookMethodBiz() {
		return cookMethodBiz;
	}

	public void setCookMethodBiz(CookMethodBiz cookMethodBiz) {
		this.cookMethodBiz = cookMethodBiz;
	}

	public CookTechniqueBiz getCookTechniqueBiz() {
		return cookTechniqueBiz;
	}

	public void setCookTechniqueBiz(CookTechniqueBiz cookTechniqueBiz) {
		this.cookTechniqueBiz = cookTechniqueBiz;
	}

	public List<Recipe> getReciptList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Recipe getRecipe(int recipeId) {
		
		return recipeDao.getRecipe(recipeId);
	}

	public List<Recipe> getRecipeListByTaste(int tasteId) {
		
		return recipeDao.getRecipeListByTaste(tasteId);
	}

	public List<Recipe> getRecipeListByMaterial(int materialId) {
		
		return recipeDao.getRecipeListByMaterial(materialId);
	}

	public List<Recipe> getReciptList(String recipeName) {
		
		return recipeDao.getReciptList(recipeName);
	}

	public List<Map> getRecipeNav() {
		
		ArrayList<Map> list=new ArrayList<Map>();
		list.add(tasteBiz.getTasteList());
		list.add(craftBiz.getCraftList());
		list.add(costTimeBiz.getCostTimeList());
		list.add(difficultyBiz.getDifficultyList());
		list.add(categoryBiz.getCategoryList());
		list.add(cuisineBiz.getCuisineList());
		
		return list;
	}

	public Map getRecipeDetail(int recipeId) {
		Map map=new LinkedMap();
		
		Recipe recipe=recipeDao.getRecipe(recipeId);
		
		Taste taste=tasteBiz.getTaste(recipe.getTasteId());
		Craft craft=craftBiz.getCraft(recipe.getCraftId());
		CostTime costTime=costTimeBiz.getCostTime(recipe.getCostTimeId());
		Difficulty difficulty=difficultyBiz.getDifficulty(recipe.getDifficultyId());
		Category category=categoryBiz.getCategory(recipe.getCategoryId());
		Cuisine cuisine=cuisineBiz.getCuisine(recipe.getCuisineId());
		
		List<CookIngredient> ingredientList=cookIngredientBiz.getCookIngredient(recipeId);
		List<CookMethod> methodList=cookMethodBiz.getCookMethod(recipeId);
		List<CookTechnique> techniqueList=cookTechniqueBiz.getCookTechnique(recipeId);
		
		map.put("recipe", recipe);
		map.put("taste", taste);
		map.put("craft", craft);
		map.put("costTime", costTime);
		map.put("difficulty", difficulty);
		map.put("category", category);
		map.put("cuisine", cuisine);
		map.put("ingredient", ingredientList);
		map.put("method", methodList);
		map.put("technique", techniqueList);
		
		return map;
	}

	public List<Recipe> getRecipeListByCategory(int categoryId) {
		
		return recipeDao.getRecipeListByCategory(categoryId);
	}

	public List<Recipe> getRecipeListByCostTime(int costTimeId) {
		
		return recipeDao.getRecipeListByCostTime(costTimeId);
	}

	public List<Recipe> getRecipeListByCraft(int craftId) {
		
		return recipeDao.getRecipeListByCraft(craftId);
	}

	public List<Recipe> getRecipeListByCuisine(int cuisineId) {
		
		return recipeDao.getRecipeListByCuisine(cuisineId);
	}

	public List<Recipe> getRecipeListByDifficulty(int difficultyId) {
		
		return recipeDao.getRecipeListByDifficulty(difficultyId);
	}

}
