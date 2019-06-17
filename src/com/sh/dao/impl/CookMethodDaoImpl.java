package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.CookMethodDao;
import com.sh.model.CookIngredient;
import com.sh.model.CookMethod;

public class CookMethodDaoImpl implements CookMethodDao {

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<CookMethod> getCookMethod(int recipeId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from CookMethod where recipeId=:recipeId";
		Query query=session.createQuery(hql);
		query.setInteger("recipeId", recipeId);
		List<CookMethod> list=query.list();
		return list;
	}

	public void addCookMethod(CookMethod cookMethod) {
		Session session=sessionFactory.getCurrentSession();
		session.save(cookMethod);
		
	}

}
