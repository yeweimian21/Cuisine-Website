package com.sh.dao;

import java.util.List;

import com.sh.model.CookTechnique;

public interface CookTechniqueDao {

	public void addCookTechnique(CookTechnique cookTechnique);
	
	public List<CookTechnique> getCookTechnique(int recipeId);
	
}
