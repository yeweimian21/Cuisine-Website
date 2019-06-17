package com.sh.action;

import java.io.UnsupportedEncodingException;

import com.opensymphony.xwork2.ActionSupport;
import com.sh.biz.CookIngredientBiz;
import com.sh.model.CookIngredient;

public class CookIngredientlAction extends ActionSupport{

	private int recipeId;					//所属菜谱Id
	private String ingredientName;			//原料名称
	private String ingredientAmount;
	
	CookIngredientBiz cookIngredientBiz;
	
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
	public CookIngredientBiz getCookIngredientBiz() {
		return cookIngredientBiz;
	}
	public void setCookIngredientBiz(CookIngredientBiz cookIngredientBiz) {
		this.cookIngredientBiz = cookIngredientBiz;
	}
	
	public String addIngredient(){
		String name="",amount="";
		try {
			name=new String(ingredientName.getBytes("iso-8859-1"), "UTF-8");
			amount=new String(ingredientAmount.getBytes("iso-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		CookIngredient cookIngredient=new CookIngredient();
		cookIngredient.setRecipeId(recipeId);
		cookIngredient.setIngredientName(name);
		cookIngredient.setIngredientAmount(amount);
		
		cookIngredientBiz.addCookIngredient(cookIngredient);
		return "success";
	}
	
}
