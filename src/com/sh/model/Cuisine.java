package com.sh.model;

import java.io.Serializable;

//菜系--实体类
public class Cuisine implements Serializable {
	
	private int cuisineId;			//菜系Id
	private String cuisineName;		//菜系名称
	
	public Cuisine() {
		super();
	}

	public Cuisine(int cuisineId, String cuisineName) {
		super();
		this.cuisineId = cuisineId;
		this.cuisineName = cuisineName;
	}

	public int getCuisineId() {
		return cuisineId;
	}

	public void setCuisineId(int cuisineId) {
		this.cuisineId = cuisineId;
	}

	public String getCuisineName() {
		return cuisineName;
	}

	public void setCuisineName(String cuisineName) {
		this.cuisineName = cuisineName;
	}
	
}
