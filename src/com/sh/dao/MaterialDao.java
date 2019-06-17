package com.sh.dao;

import java.util.List;

import com.sh.model.Material;

public interface MaterialDao {
	
	public void addMaterial(Material material);
	
	public void updateMaterial(int materialId,Material material);
	
	public void deleteMaterial(int materialId);
	
	public Material getMaterial(int materialId);
	
	public List<Material> getMaterialList();

	public List<Material> getMaterialByCategory(int materialCategoryId);
	
}
