package com.sh.dao;

import java.util.List;

import com.sh.model.Craft;

public interface CraftDao {
	
	public void addCraft(Craft craft);
	
	public void updateCraft(int craftId,Craft craft);
	
	public void deleteCraft(int craftId);

	public List<Craft> getCraftList();
	
	public Craft getCraft(int craftId);
	
}
