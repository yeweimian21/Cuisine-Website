package com.sh.model;

import java.io.Serializable;

//菜谱口味--实体类
public class Taste implements Serializable {

	private int tasteId;
	private String tasteName;
	
	public Taste() {
		super();
	}

	public Taste(int tasteId, String tasteName) {
		super();
		this.tasteId = tasteId;
		this.tasteName = tasteName;
	}

	public int getTasteId() {
		return tasteId;
	}

	public void setTasteId(int tasteId) {
		this.tasteId = tasteId;
	}

	public String getTasteName() {
		return tasteName;
	}

	public void setTasteName(String tasteName) {
		this.tasteName = tasteName;
	}
	
}
