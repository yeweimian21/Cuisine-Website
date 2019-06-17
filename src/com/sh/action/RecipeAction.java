package com.sh.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.map.LinkedMap;
import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;
import com.sh.biz.CategoryBiz;
import com.sh.biz.CostTimeBiz;
import com.sh.biz.CraftBiz;
import com.sh.biz.CuisineBiz;
import com.sh.biz.DifficultyBiz;
import com.sh.biz.RecipeBiz;
import com.sh.biz.TasteBiz;
import com.sh.dao.CostTimeDao;
import com.sh.dao.CraftDao;
import com.sh.model.CostTime;
import com.sh.model.Craft;
import com.sh.model.Recipe;
import com.sh.model.Taste;

public class RecipeAction extends ActionSupport{
	
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
	
	private RecipeBiz recipeBiz; 

	public RecipeBiz getRecipeBiz() {
		return recipeBiz;
	}

	public void setRecipeBiz(RecipeBiz recipeBiz) {
		this.recipeBiz = recipeBiz;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
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

	//
	public String getRecipeNav(){		
		List<Map> list=recipeBiz.getRecipeNav();
		
		JSONArray jsonArray=JSONArray.fromObject(list);
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		//清理浏览器缓存
		response.setHeader("Pragma", "No-cache");
		response.addHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		
		try {
			PrintWriter printWriter=response.getWriter();
			printWriter.println(jsonArray);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String getRecipeList(){
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		JSONArray jsonArray;
		if(session.getAttribute("recipeList")!=null){
			System.out.println("-----"+session.getAttribute("recipeList"));
			List<Recipe> list=(List<Recipe>)session.getAttribute("recipeList");
			jsonArray=JSONArray.fromObject(list);
		}
		else{
			jsonArray=JSONArray.fromObject(new ArrayList());
		}
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		//清理浏览器缓存
		response.setHeader("Pragma", "No-cache");
		response.addHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		
		try {
			PrintWriter printWriter=response.getWriter();
			printWriter.println(jsonArray);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String getRecipeListByTaste(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String tasteIdParam=request.getParameter("tasteId");
		int tasteId=Integer.parseInt(tasteIdParam);
		List<Recipe> list=recipeBiz.getRecipeListByTaste(tasteId);
		
		JSONArray jsonArray=JSONArray.fromObject(list);
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		//清理浏览器缓存
		response.setHeader("Pragma", "No-cache");
		response.addHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		
		try {
			PrintWriter printWriter=response.getWriter();
			printWriter.println(jsonArray);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String getRecipeListByMaterial(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String materialIdParam=request.getParameter("materialId");
		int materialId=Integer.parseInt(materialIdParam);
		List<Recipe> list=recipeBiz.getRecipeListByMaterial(materialId);
		
		JSONArray jsonArray=JSONArray.fromObject(list);
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		//清理浏览器缓存
		response.setHeader("Pragma", "No-cache");
		response.addHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		
		try {
			PrintWriter printWriter=response.getWriter();
			printWriter.println(jsonArray);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String getRecipeDetail(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String recipeIdParam=request.getParameter("recipeId");
		int recipeId=Integer.parseInt(recipeIdParam);
		
		Map map=recipeBiz.getRecipeDetail(recipeId);
		
		JSONObject jsonObject=JSONObject.fromObject(map);
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		//清理浏览器缓存
		response.setHeader("Pragma", "No-cache");
		response.addHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		
		try {
			PrintWriter printWriter=response.getWriter();
			printWriter.println(jsonObject);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String searchRecipe(){
		String recipeNameFilter="";
		//处理乱码
		try {
			recipeNameFilter=new String(recipeName.getBytes("iso-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		List<Recipe> list=recipeBiz.getReciptList(recipeNameFilter);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		session.setAttribute("searchRecipe", list);
		
		return "success";
	}
	
	public String getSearchRecipe(){
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		List<Recipe> list=(List<Recipe>)session.getAttribute("searchRecipe");
		
		JSONArray jsonArray=JSONArray.fromObject(list);
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		//清理浏览器缓存
		response.setHeader("Pragma", "No-cache");
		response.addHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		
		try {
			PrintWriter printWriter=response.getWriter();
			printWriter.println(jsonArray);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String addRecipe(){
		
		return null;
	}
	
	//根据工艺筛选
	public String getRecipeListByCraft(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String craftIdParam=request.getParameter("craftId");
		int craftId=Integer.parseInt(craftIdParam);
		List<Recipe> list=recipeBiz.getRecipeListByCraft(craftId);
		
		JSONArray jsonArray=JSONArray.fromObject(list);
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		//清理浏览器缓存
		response.setHeader("Pragma", "No-cache");
		response.addHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		
		try {
			PrintWriter printWriter=response.getWriter();
			printWriter.println(jsonArray);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//根据耗时筛选
	public String getRecipeListByCostTime(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String costTimeParam=request.getParameter("costTimeId");
		int costTime=Integer.parseInt(costTimeParam);
		List<Recipe> list=recipeBiz.getRecipeListByCostTime(costTime);
		
		JSONArray jsonArray=JSONArray.fromObject(list);
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		//清理浏览器缓存
		response.setHeader("Pragma", "No-cache");
		response.addHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		
		try {
			PrintWriter printWriter=response.getWriter();
			printWriter.println(jsonArray);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//根据难度筛选
	public String getRecipeListByDifficulty(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String difficultyParam=request.getParameter("difficultyId");
		int difficultyId=Integer.parseInt(difficultyParam);
		List<Recipe> list=recipeBiz.getRecipeListByDifficulty(difficultyId);
		
		JSONArray jsonArray=JSONArray.fromObject(list);
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		//清理浏览器缓存
		response.setHeader("Pragma", "No-cache");
		response.addHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		
		try {
			PrintWriter printWriter=response.getWriter();
			printWriter.println(jsonArray);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//根据类型筛选
	public String getRecipeListByCategory(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String categoryIdParam=request.getParameter("categoryId");
		int categoryId=Integer.parseInt(categoryIdParam);
		List<Recipe> list=recipeBiz.getRecipeListByCategory(categoryId);
		
		JSONArray jsonArray=JSONArray.fromObject(list);
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		//清理浏览器缓存
		response.setHeader("Pragma", "No-cache");
		response.addHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		
		try {
			PrintWriter printWriter=response.getWriter();
			printWriter.println(jsonArray);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//根据菜系筛选
	public String getRecipeListByCuisine(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String cuisineIdParam=request.getParameter("cuisineId");
		int cuisineId=Integer.parseInt(cuisineIdParam);
		List<Recipe> list=recipeBiz.getRecipeListByCuisine(cuisineId);
		
		JSONArray jsonArray=JSONArray.fromObject(list);
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		//清理浏览器缓存
		response.setHeader("Pragma", "No-cache");
		response.addHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		
		try {
			PrintWriter printWriter=response.getWriter();
			printWriter.println(jsonArray);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
