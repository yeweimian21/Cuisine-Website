package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.LatestDao;
import com.sh.model.Latest;

public class LatestDaoImpl implements LatestDao {
	
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Latest> getLatestList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Latest order by latestId";
		Query query=session.createQuery(hql);
		List<Latest> latestList=query.list();
		return latestList;
	}

	public Latest getLatest(int latestId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Latest where latestId=:latestId";
		Query query=session.createQuery(hql);
		query.setInteger("latestId", latestId);
		Latest latest=(Latest)query.uniqueResult();
		return latest;
	}

	public void addLatest(Latest latest) {
		Session session=sessionFactory.getCurrentSession();
		session.save(latest);
		
	}

	public void deleteLatest(int latestId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Latest where latestId=:latestId";
		Query query=session.createQuery(hql);
		query.setInteger("latestId", latestId);
		Latest latest=(Latest)query.uniqueResult();
		session.delete(latest);
		
	}

	public void updateLatest(int latestId, Latest latest) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Latest where latestId=:latestId";
		Query query=session.createQuery(hql);
		query.setInteger("latestId", latestId);
		Latest latest2=(Latest)query.uniqueResult();
		
		latest2.setRecipeId(latest.getRecipeId());
		
		session.update(latest2);
		
	}

}
