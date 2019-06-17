package com.sh.dao;

import java.util.List;

import com.sh.model.Recommendation;

public interface RecommendationDao {

	public void addRecommendation(Recommendation recommendation);
	
	public void updateRecommendation(int recommendationId,Recommendation recommendation);
	
	public void deleteRecommendation(int recommendationId);
	
	public Recommendation getRecommendation(int recommendationId);
	
	public List<Recommendation> getRecommendationList();
	
}
