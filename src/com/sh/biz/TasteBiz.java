package com.sh.biz;

import java.util.Map;

import com.sh.model.Taste;

public interface TasteBiz {

	public Map getTasteList();
	
	public Taste getTaste(int tasteId);
	
}
