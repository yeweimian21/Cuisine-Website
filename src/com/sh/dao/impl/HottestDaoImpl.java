package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.HottestDao;
import com.sh.model.Hottest;

public class HottestDaoImpl implements HottestDao {

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<Hottest> getHottestList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Hottest order by hottestId asc";
		Query query=session.createQuery(hql);
		List<Hottest> hottestList=query.list();
		return hottestList;
	}

	public void addHottest(Hottest hottest) {
		Session session=sessionFactory.getCurrentSession();
		session.save(hottest);
		
	}

	public void deleteHottest(int hottestId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Hottest where hottestId=:hottestId";
		Query query=session.createQuery(hql);
		query.setInteger("hottestId", hottestId);
		Hottest hottest=(Hottest)query.uniqueResult();
		session.delete(hottest);
		
	}

	public Hottest getHottest(int hottestId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Hottest where hottestId=:hottestId";
		Query query=session.createQuery(hql);
		query.setInteger("hottestId", hottestId);
		Hottest hottest=(Hottest)query.uniqueResult();
		return hottest;
	}

	public void updateHottest(int hottestId,
			Hottest hottest) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Hottest where hottestId=:hottestId";
		Query query=session.createQuery(hql);
		query.setInteger("hottestId", hottestId);
		Hottest hottest2=(Hottest)query.uniqueResult();
		
		hottest2.setRecipeId(hottest.getRecipeId());
		
		session.update(hottest2);
		
	}
	
}
