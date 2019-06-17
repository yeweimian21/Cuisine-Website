package com.sh.model;

import java.io.Serializable;

//菜谱难度
public class Difficulty implements Serializable {

	private int difficultyId;
	private String difficultyName;
	
	public Difficulty() {
		super();
	}

	public Difficulty(int difficultyId, String difficultyName) {
		super();
		this.difficultyId = difficultyId;
		this.difficultyName = difficultyName;
	}

	public int getDifficultyId() {
		return difficultyId;
	}

	public void setDifficultyId(int difficultyId) {
		this.difficultyId = difficultyId;
	}

	public String getDifficultyName() {
		return difficultyName;
	}

	public void setDifficultyName(String difficultyName) {
		this.difficultyName = difficultyName;
	}
	
}
