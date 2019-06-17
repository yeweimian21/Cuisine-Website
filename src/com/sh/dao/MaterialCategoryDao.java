package com.sh.dao;

import java.util.List;

import com.sh.model.MaterialCategory;

public interface MaterialCategoryDao {
	
	public void addMaterialCategory(MaterialCategory materialCategory);
	
	public void updateMaterialCategory(int materialCategoryId,MaterialCategory materialCategory);
	
	public void deleteMaterialCategory(int materialCategoryId);
	
	public List<MaterialCategory> getMaterialCategoryList();
	
	public MaterialCategory getMaterialCategory(int materialCategoryId);
	
}
