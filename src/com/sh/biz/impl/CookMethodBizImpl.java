package com.sh.biz.impl;

import java.util.List;

import com.sh.biz.CookMethodBiz;
import com.sh.dao.CookMethodDao;
import com.sh.model.CookMethod;

public class CookMethodBizImpl implements CookMethodBiz {
	
	CookMethodDao cookMethodDao;

	public CookMethodDao getCookMethodDao() {
		return cookMethodDao;
	}

	public void setCookMethodDao(CookMethodDao cookMethodDao) {
		this.cookMethodDao = cookMethodDao;
	}

	public List<CookMethod> getCookMethod(int recipeId) {
		
		return cookMethodDao.getCookMethod(recipeId);
	}

	public void addCookMethod(CookMethod cookMethod) {
		cookMethodDao.addCookMethod(cookMethod);
		
	}

}
