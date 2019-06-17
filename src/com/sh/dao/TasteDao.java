package com.sh.dao;

import java.util.List;

import com.sh.model.Taste;

public interface TasteDao {
	
	public void addTaste(Taste taste);
	
	public void updateTaste(int tasteId,Taste taste);
	
	public void deleteTaste(int tasteId);

	public List<Taste> getTasteList();
	
	public Taste getTaste(int tasteId);
	
}
