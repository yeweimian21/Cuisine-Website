package com.sh.model;

import java.io.Serializable;

//菜谱--实体类
public class Recipe implements Serializable {
	
	private int recipeId;				//菜谱Id
	private String recipeName;			//菜谱名称
	private String recipePicture;		//菜谱图片
	private String introduction;		//菜谱简介
	private int tasteId;				//菜谱口味
	private int craftId;				//菜谱工艺
	private int costTimeId;				//菜谱耗时
	private int difficultyId;			//菜谱难度
	private int categoryId;				//菜谱类别
	private int cuisineId;				//菜系
	private int materialId;			//食材
	
	public Recipe() {
		super();
	}

	public Recipe(int recipeId, String recipeName, String recipePicture,
			String introduction, int tasteId, int craftId, int costTimeId,
			int difficultyId, int categoryId, int cuisineId, int materialId) {
		super();
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.recipePicture = recipePicture;
		this.introduction = introduction;
		this.tasteId = tasteId;
		this.craftId = craftId;
		this.costTimeId = costTimeId;
		this.difficultyId = difficultyId;
		this.categoryId = categoryId;
		this.cuisineId = cuisineId;
		this.materialId = materialId;
	}



	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getRecipePicture() {
		return recipePicture;
	}

	public void setRecipePicture(String recipePicture) {
		this.recipePicture = recipePicture;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public int getTasteId() {
		return tasteId;
	}

	public void setTasteId(int tasteId) {
		this.tasteId = tasteId;
	}

	public int getCraftId() {
		return craftId;
	}

	public void setCraftId(int craftId) {
		this.craftId = craftId;
	}

	public int getCostTimeId() {
		return costTimeId;
	}

	public void setCostTimeId(int costTimeId) {
		this.costTimeId = costTimeId;
	}

	public int getDifficultyId() {
		return difficultyId;
	}

	public void setDifficultyId(int difficultyId) {
		this.difficultyId = difficultyId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getCuisineId() {
		return cuisineId;
	}

	public void setCuisineId(int cuisineId) {
		this.cuisineId = cuisineId;
	}

	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}
	
}
