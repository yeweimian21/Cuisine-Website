package com.sh.biz.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.LinkedMap;

import com.sh.biz.CuisineBiz;
import com.sh.dao.CuisineDao;
import com.sh.model.Cuisine;

public class CuisineBizImpl implements CuisineBiz {

	CuisineDao cuisineDao;
	
	public CuisineDao getCuisineDao() {
		return cuisineDao;
	}

	public void setCuisineDao(CuisineDao cuisineDao) {
		this.cuisineDao = cuisineDao;
	}

	public Map getCuisineList() {
		Map cuisineListMap=new LinkedMap();
		cuisineListMap.put("title", "菜系");
		cuisineListMap.put("name", "cuisine");
		cuisineListMap.put("dataList", cuisineDao.getCuisineList());
		return cuisineListMap;
	}

	public void addCuisine(Cuisine cuisine) {
		cuisineDao.addCuisine(cuisine);
		
	}

	public void deleteCuisine(int cuisineId) {
		cuisineDao.deleteCuisine(cuisineId);
		
	}

	public List<Cuisine> getAllCuisine() {
		
		return cuisineDao.getCuisineList();
	}

	public Cuisine getCuisine(int cuisineId) {
		
		return cuisineDao.getCuisine(cuisineId);
	}

	public void updateCuisine(int cuisineId, Cuisine cuisine) {
		cuisineDao.updateCuisine(cuisineId, cuisine);
		
	}

	

}
