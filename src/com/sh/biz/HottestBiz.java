package com.sh.biz;

import java.util.List;

import com.sh.model.Recipe;

public interface HottestBiz {

	//获得最热菜谱
	public List<Recipe> getHottestRecipe();
	
}
