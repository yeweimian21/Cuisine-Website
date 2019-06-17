package com.sh.dao;

import java.util.List;

import com.sh.model.Category;

public interface CategoryDao {
	
	public void addCategory(Category category);
	
	public void updateCategory(int categoryId,Category category);
	
	public void deleteCategory(int categoryId);

	public List<Category> getCategoryList();
	
	public Category getCategory(int categoryId);
	
}
