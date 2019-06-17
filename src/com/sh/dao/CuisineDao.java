package com.sh.dao;

import java.util.List;
import java.util.Map;

import com.sh.model.Craft;
import com.sh.model.Cuisine;

public interface CuisineDao {

	public void addCuisine(Cuisine cuisine);
	
	public void updateCuisine(int cuisineId,Cuisine cuisine);
	
	public void deleteCuisine(int cuisineId);

	public List<Cuisine> getCuisineList();
	
	public Cuisine getCuisine(int cuisineId);
	
}
