package com.sh.model;

import java.io.Serializable;

//菜谱原料--实体类
public class CookIngredient implements Serializable {

	private int recipeId;					//所属菜谱Id
	private String ingredientName;			//原料名称
	private String ingredientAmount;		//原料用量
	
	public CookIngredient() {
		super();
	}

	public CookIngredient(int recipeId, String ingredientName,
			String ingredientAmount) {
		super();
		this.recipeId = recipeId;
		this.ingredientName = ingredientName;
		this.ingredientAmount = ingredientAmount;
	}

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public String getIngredientAmount() {
		return ingredientAmount;
	}

	public void setIngredientAmount(String ingredientAmount) {
		this.ingredientAmount = ingredientAmount;
	}
	
}
