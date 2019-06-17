package com.sh.dao;

import java.util.List;

import com.sh.model.Hottest;

public interface HottestDao {
	
	public void addHottest(Hottest hottest);
	
	public void updateHottest(int hottestId,Hottest hottest);
	
	public void deleteHottest(int hottestId);
	
	public Hottest getHottest(int hottestId);

	public List<Hottest> getHottestList();
	
}
