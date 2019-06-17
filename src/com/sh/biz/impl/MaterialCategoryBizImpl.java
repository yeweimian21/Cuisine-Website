package com.sh.biz.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.LinkedMap;

import com.sh.biz.MaterialCategoryBiz;
import com.sh.dao.MaterialCategoryDao;
import com.sh.dao.MaterialDao;
import com.sh.model.MaterialCategory;

public class MaterialCategoryBizImpl implements MaterialCategoryBiz {

	MaterialCategoryDao materialCategoryDao;
	MaterialDao materialDao;
	
	public MaterialCategoryDao getMaterialCategoryDao() {
		return materialCategoryDao;
	}

	public void setMaterialCategoryDao(MaterialCategoryDao materialCategoryDao) {
		this.materialCategoryDao = materialCategoryDao;
	}

	public MaterialDao getMaterialDao() {
		return materialDao;
	}

	public void setMaterialDao(MaterialDao materialDao) {
		this.materialDao = materialDao;
	}

	public List<Map> getMaterialCategoryList() {
		List<Map> list=new ArrayList<Map>();
		List<MaterialCategory> materialCategoryList=materialCategoryDao.getMaterialCategoryList();
		Iterator<MaterialCategory> iterator=materialCategoryList.iterator();
		MaterialCategory materialCategory;
		while(iterator.hasNext()){
			materialCategory=iterator.next();
			Map map=new LinkedMap();
			map.put("materialCategory", materialCategory);
			map.put("material", materialDao.getMaterialByCategory(materialCategory.getMaterialCategoryId()));
			list.add(map);
		}
		return list;
	}

	public void addMaterialCategory(MaterialCategory materialCategory) {
		materialCategoryDao.addMaterialCategory(materialCategory);
		
	}

	public void deleteMaterialCategory(int materialCategoryId) {
		materialCategoryDao.deleteMaterialCategory(materialCategoryId);
		
	}

	public MaterialCategory getMaterialCategory(int materialCategoryId) {
		
		return materialCategoryDao.getMaterialCategory(materialCategoryId);
	}

	public void updateMaterialCategory(int materialCategoryId,
			MaterialCategory materialCategory) {
		materialCategoryDao.updateMaterialCategory(materialCategoryId, materialCategory);
		
	}

	public List<MaterialCategory> getMaterialCategory() {
		
		return materialCategoryDao.getMaterialCategoryList();
	}

}
