package com.sh.biz.impl;

import java.util.Map;

import org.apache.commons.collections.map.LinkedMap;

import com.sh.biz.DifficultyBiz;
import com.sh.dao.DifficultyDao;
import com.sh.model.Difficulty;

public class DifficultyBizImpl implements DifficultyBiz {

	DifficultyDao difficultyDao;
	
	public DifficultyDao getDifficultyDao() {
		return difficultyDao;
	}

	public void setDifficultyDao(DifficultyDao difficultyDao) {
		this.difficultyDao = difficultyDao;
	}

	public Map getDifficultyList() {
		Map difficultyListMap=new LinkedMap();
		difficultyListMap.put("title", "难度");
		difficultyListMap.put("name", "difficulty");
		difficultyListMap.put("dataList", difficultyDao.getDifficultyList());
		return difficultyListMap;
	}

	public Difficulty getDifficulty(int difficultyId) {
		
		return difficultyDao.getDifficulty(difficultyId);
	}

}
