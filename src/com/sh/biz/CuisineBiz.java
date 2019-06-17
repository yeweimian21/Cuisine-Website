package com.sh.biz;

import java.util.List;
import java.util.Map;

import com.sh.model.Cuisine;

public interface CuisineBiz {

	public Map getCuisineList();

	public void addCuisine(Cuisine cuisine);
	
	public void updateCuisine(int cuisineId,Cuisine cuisine);
	
	public void deleteCuisine(int cuisineId);

	public List<Cuisine> getAllCuisine();
	
	public Cuisine getCuisine(int cuisineId);
	
	
}
