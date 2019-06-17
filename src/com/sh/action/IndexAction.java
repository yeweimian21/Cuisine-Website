package com.sh.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONArray;

import com.opensymphony.xwork2.ActionSupport;
import com.sh.biz.HottestBiz;
import com.sh.biz.LatestBiz;
import com.sh.biz.RecommendationBiz;
import com.sh.model.Recipe;

public class IndexAction extends ActionSupport{

	RecommendationBiz recommendationBiz;
	LatestBiz latestBiz;
	HottestBiz hottestBiz;

	public RecommendationBiz getRecommendationBiz() {
		return recommendationBiz;
	}

	public void setRecommendationBiz(RecommendationBiz recommendationBiz) {
		this.recommendationBiz = recommendationBiz;
	}
	
	public LatestBiz getLatestBiz() {
		return latestBiz;
	}

	public void setLatestBiz(LatestBiz latestBiz) {
		this.latestBiz = latestBiz;
	}

	public HottestBiz getHottestBiz() {
		return hottestBiz;
	}

	public void setHottestBiz(HottestBiz hottestBiz) {
		this.hottestBiz = hottestBiz;
	}

	public String getRecommendationRecipe(){
		List<Recipe> recipeList=recommendationBiz.getRecommendationRecipe();
		JSONArray jsonArray=JSONArray.fromObject(recipeList);
		
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
	
	public String getLatestRecipe(){
		List<Recipe> recipeList=latestBiz.getLatestRecipe();
		JSONArray jsonArray=JSONArray.fromObject(recipeList);
		
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
	
	public String getHottestRecipe(){
		List<Recipe> recipeList=hottestBiz.getHottestRecipe();
		JSONArray jsonArray=JSONArray.fromObject(recipeList);
		
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
