package com.sh.biz;

import java.util.Map;

import com.sh.model.Craft;

public interface CraftBiz {
	
	public Map getCraftList();
	
	public Craft getCraft(int craftId);

}
