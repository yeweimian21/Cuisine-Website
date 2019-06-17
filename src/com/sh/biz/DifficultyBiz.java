package com.sh.biz;

import java.util.Map;

import com.sh.model.Difficulty;

public interface DifficultyBiz {

	public Map getDifficultyList();
	
	public Difficulty getDifficulty(int difficultyId);
}
