package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.CuisineDao;
import com.sh.model.Craft;
import com.sh.model.Cuisine;

public class CuisineDaoImpl implements CuisineDao {

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<Cuisine> getCuisineList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Cuisine order by cuisineId asc";
		Query query=session.createQuery(hql);
		List<Cuisine> cuisineList=query.list();
		return cuisineList;
	}

	public void addCuisine(Cuisine cuisine) {
		Session session=sessionFactory.getCurrentSession();
		session.save(cuisine);
		
	}

	public void deleteCuisine(int cuisineId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Cuisine where cuisineId=:cuisineId";
		Query query=session.createQuery(hql);
		query.setInteger("cuisineId", cuisineId);
		Cuisine cuisine=(Cuisine)query.uniqueResult();
		session.delete(cuisine);
		
	}

	public Cuisine getCuisine(int cuisineId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Cuisine where cuisineId=:cuisineId";
		Query query=session.createQuery(hql);
		query.setInteger("cuisineId", cuisineId);
		Cuisine cuisine=(Cuisine)query.uniqueResult();
		return cuisine;
	}

	public void updateCuisine(int cuisineId, Cuisine cuisine) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Cuisine where cuisineId=:cuisineId";
		Query query=session.createQuery(hql);
		query.setInteger("cuisineId", cuisineId);
		Cuisine cuisine2=(Cuisine)query.uniqueResult();
		
		cuisine2.setCuisineName(cuisine.getCuisineName());
		
		session.update(cuisine2);
		
	}

}
