package com.sh.dao;

import java.util.List;

import com.sh.model.CookMethod;

public interface CookMethodDao {

	public void addCookMethod(CookMethod cookMethod);
	
	public List<CookMethod> getCookMethod(int recipeId);
	
}
