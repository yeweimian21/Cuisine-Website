package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.RecommendationDao;
import com.sh.model.Recommendation;

public class RecommendationDaoImpl implements RecommendationDao {

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Recommendation> getRecommendationList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Recommendation";
		Query query=session.createQuery(hql);
		List<Recommendation> recommendationList=query.list();
		return recommendationList;
	}

	public void addRecommendation(Recommendation recommendation) {
		Session session=sessionFactory.getCurrentSession();
		session.save(recommendation);
		
	}

	public void deleteRecommendation(int recommendationId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Recommendation where recommendationId=:recommendationId";
		Query query=session.createQuery(hql);
		query.setInteger("recommendationId", recommendationId);
		Recommendation recommendation=(Recommendation)query.uniqueResult();
		session.delete(recommendation);
		
	}

	public Recommendation getRecommendation(int recommendationId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Recommendation where recommendationId=:recommendationId";
		Query query=session.createQuery(hql);
		query.setInteger("recommendationId", recommendationId);
		Recommendation recommendation=(Recommendation)query.uniqueResult();
		return recommendation;
	}

	public void updateRecommendation(int recommendationId,
			Recommendation recommendation) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Recommendation where recommendationId=:recommendationId";
		Query query=session.createQuery(hql);
		query.setInteger("recommendationId", recommendationId);
		Recommendation recommendation2=(Recommendation)query.uniqueResult();
		
		recommendation2.setRecipeId(recommendation.getRecipeId());
		
		session.update(recommendation2);
		
	}

}
