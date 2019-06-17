package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.CookTechniqueDao;
import com.sh.model.CookMethod;
import com.sh.model.CookTechnique;

public class CookTechniqueDaoImpl implements CookTechniqueDao {

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<CookTechnique> getCookTechnique(int recipeId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from CookTechnique where recipeId=:recipeId";
		Query query=session.createQuery(hql);
		query.setInteger("recipeId", recipeId);
		List<CookTechnique> list=query.list();
		return list;
	}

	public void addCookTechnique(CookTechnique cookTechnique) {
		Session session=sessionFactory.getCurrentSession();
		session.save(cookTechnique);
		
	}

}
