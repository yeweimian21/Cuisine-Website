package com.sh.biz;

import java.util.List;

import com.sh.model.CookMethod;

public interface CookMethodBiz {
	
	public void addCookMethod(CookMethod cookMethod);
	
	public List<CookMethod> getCookMethod(int recipeId);

}
