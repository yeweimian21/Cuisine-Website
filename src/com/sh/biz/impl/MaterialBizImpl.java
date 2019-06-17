package com.sh.biz.impl;

import java.util.List;

import com.sh.biz.MaterialBiz;
import com.sh.dao.MaterialDao;
import com.sh.model.Material;

public class MaterialBizImpl implements MaterialBiz {
	
	MaterialDao materialDao;

	public MaterialDao getMaterialDao() {
		return materialDao;
	}

	public void setMaterialDao(MaterialDao materialDao) {
		this.materialDao = materialDao;
	}

	public void addMaterial(Material material) {
		materialDao.addMaterial(material);

	}

	public void deleteMaterial(int materialId) {
		materialDao.deleteMaterial(materialId);

	}

	public Material getMaterial(int materialId) {
		
		return materialDao.getMaterial(materialId);
	}

	public List<Material> getMaterialByCategory(int materialCategoryId) {
		
		return materialDao.getMaterialByCategory(materialCategoryId);
	}

	public List<Material> getMaterialList() {
		
		return materialDao.getMaterialList();
	}

	public void updateMaterial(int materialId, Material material) {
		materialDao.updateMaterial(materialId, material);

	}

}
