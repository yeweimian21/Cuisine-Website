package com.sh.biz.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.LinkedMap;

import com.sh.biz.CategoryBiz;
import com.sh.dao.CategoryDao;
import com.sh.model.Category;

public class CategoryBizImpl implements CategoryBiz {

	CategoryDao categoryDao;
	
	public CategoryDao getCategoryDao() {
		return categoryDao;
	}

	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	public Map getCategoryList() {
		Map categoryListMap=new LinkedMap();
		categoryListMap.put("title", "类别");
		categoryListMap.put("name", "category");
		categoryListMap.put("dataList", categoryDao.getCategoryList());
		return categoryListMap;
	}

	public void addCategory(Category category) {
		categoryDao.addCategory(category);
		
	}

	public void deleteCategory(int categoryId) {
		categoryDao.deleteCategory(categoryId);
		
	}

	public List<Category> getAllCategory() {
		
		return categoryDao.getCategoryList();
	}

	public Category getCategory(int categoryId) {
		
		return categoryDao.getCategory(categoryId);
	}

	public void updateCategory(int categoryId, Category category) {
		categoryDao.updateCategory(categoryId, category);
		
	}

	
	
}
