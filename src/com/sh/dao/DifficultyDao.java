package com.sh.dao;

import java.util.List;
import java.util.Map;

import com.sh.model.Craft;
import com.sh.model.Difficulty;

public interface DifficultyDao {
	
	public void addDifficulty(Difficulty difficulty);
	
	public void updateDifficulty(int difficultyId,Difficulty difficulty);
	
	public void deleteDifficulty(int difficultyId);

	public List<Difficulty> getDifficultyList();
	
	public Difficulty getDifficulty(int difficultyId);
	
}
