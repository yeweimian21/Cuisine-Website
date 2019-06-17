package com.sh.dao;

import java.util.List;

import com.sh.model.Latest;

public interface LatestDao {

public void addLatest(Latest latest);
	
	public void updateLatest(int latestId,Latest latest);
	
	public void deleteLatest(int latestId);
	
	public Latest getLatest(int latestId);
	
	public List<Latest> getLatestList();
	
}
