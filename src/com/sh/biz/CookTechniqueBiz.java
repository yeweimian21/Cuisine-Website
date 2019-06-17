package com.sh.biz;

import java.util.List;

import com.sh.model.CookTechnique;

public interface CookTechniqueBiz {
	
	public void addCookTechnique(CookTechnique cookTechnique);

	public List<CookTechnique> getCookTechnique(int recipeId);
	
}
