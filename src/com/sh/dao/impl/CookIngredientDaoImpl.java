package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.CookIngredientDao;
import com.sh.model.CookIngredient;

public class CookIngredientDaoImpl implements CookIngredientDao {
	
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<CookIngredient> getCookIngredient(int recipeId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from CookIngredient where recipeId=:recipeId";
		Query query=session.createQuery(hql);
		query.setInteger("recipeId", recipeId);
		List<CookIngredient> list=query.list();
		return list;
	}

	public void addCookIngredient(CookIngredient cookIngredient) {
		Session session=sessionFactory.getCurrentSession();
		session.save(cookIngredient);
		
	}

}
