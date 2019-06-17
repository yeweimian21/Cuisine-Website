package com.sh.biz;

import java.util.List;
import java.util.Map;

import com.sh.model.MaterialCategory;

public interface MaterialCategoryBiz {
	
	public void addMaterialCategory(MaterialCategory materialCategory);
	
	public void updateMaterialCategory(int materialCategoryId,MaterialCategory materialCategory);
	
	public void deleteMaterialCategory(int materialCategoryId);
	
	public List<MaterialCategory> getMaterialCategory();
	
	public List<Map> getMaterialCategoryList();
	
	public MaterialCategory getMaterialCategory(int materialCategoryId);
	
}
