package com.sh.biz;

import java.util.List;
import java.util.Map;

import com.sh.model.Category;

public interface CategoryBiz {

	public Map getCategoryList();
	
	public void addCategory(Category category);
	
	public void updateCategory(int categoryId,Category category);
	
	public void deleteCategory(int categoryId);

	public List<Category> getAllCategory();
	
	public Category getCategory(int categoryId);
	
}
