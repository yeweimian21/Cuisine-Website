package com.sh.biz.impl;

import java.util.List;

import com.sh.biz.CookTechniqueBiz;
import com.sh.dao.CookTechniqueDao;
import com.sh.model.CookTechnique;

public class CookTechniqueBizImpl implements CookTechniqueBiz {
	
	CookTechniqueDao cookTechniqueDao;

	public CookTechniqueDao getCookTechniqueDao() {
		return cookTechniqueDao;
	}

	public void setCookTechniqueDao(CookTechniqueDao cookTechniqueDao) {
		this.cookTechniqueDao = cookTechniqueDao;
	}

	public List<CookTechnique> getCookTechnique(int recipeId) {
		
		return cookTechniqueDao.getCookTechnique(recipeId);
	}

	public void addCookTechnique(CookTechnique cookTechnique) {
		cookTechniqueDao.addCookTechnique(cookTechnique);
		
	}

}
