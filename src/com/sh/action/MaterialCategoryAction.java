package com.sh.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import net.sf.json.util.PropertyFilter;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sh.biz.MaterialCategoryBiz;
import com.sh.model.Material;
import com.sh.model.MaterialCategory;

public class MaterialCategoryAction extends ActionSupport{
	private int materialCategoryId;
	private String materialCategoryName;
	
	MaterialCategoryBiz materialCategoryBiz;

	public MaterialCategoryBiz getMaterialCategoryBiz() {
		return materialCategoryBiz;
	}

	public void setMaterialCategoryBiz(MaterialCategoryBiz materialCategoryBiz) {
		this.materialCategoryBiz = materialCategoryBiz;
	}

	public int getMaterialCategoryId() {
		return materialCategoryId;
	}

	public void setMaterialCategoryId(int materialCategoryId) {
		this.materialCategoryId = materialCategoryId;
	}

	public String getMaterialCategoryName() {
		return materialCategoryName;
	}

	public void setMaterialCategoryName(String materialCategoryName) {
		this.materialCategoryName = materialCategoryName;
	}

	public String getMaterialCategory(){
		
		List<Map> list=materialCategoryBiz.getMaterialCategoryList();
		
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
	
	public String addMaterialCategory(){
		String name="";
		try {
			name=new String(materialCategoryName.getBytes("iso-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		MaterialCategory materialCategory=new MaterialCategory();
		materialCategory.setMaterialCategoryName(name);
		
		materialCategoryBiz.addMaterialCategory(materialCategory);
		
		return "success";
	}
	
	public String updateMaterialCategory(){
		String name="";
		try {
			name=new String(materialCategoryName.getBytes("iso-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		MaterialCategory materialCategory=new MaterialCategory();
		materialCategory.setMaterialCategoryId(materialCategoryId);
		materialCategory.setMaterialCategoryName(name);
		materialCategoryBiz.updateMaterialCategory(materialCategoryId, materialCategory);
		return "success";
	}
	
	public String deleteMaterialCategory(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String idstr=request.getParameter("id");
		int id=Integer.parseInt(idstr);
		System.out.println("----id:"+id);
		materialCategoryBiz.deleteMaterialCategory(id);
		return "success";
	}
	
	public String getMaterialCategoryAll(){
		List<MaterialCategory> list=materialCategoryBiz.getMaterialCategory();
		
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
