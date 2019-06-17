package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.TasteDao;
import com.sh.model.Taste;

public class TasteDaoImpl implements TasteDao {

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Taste> getTasteList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Taste order by tasteId asc";
		Query query=session.createQuery(hql);
		List<Taste> tasteList=query.list();
		return tasteList;
	}

	public Taste getTaste(int tasteId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Taste where tasteId=:tasteId";
		Query query=session.createQuery(hql);
		query.setInteger("tasteId", tasteId);
		Taste taste=(Taste)query.uniqueResult();
		return taste;
	}

	public void addTaste(Taste taste) {
		Session session=sessionFactory.getCurrentSession();
		session.save(taste);
		
	}

	public void deleteTaste(int tasteId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Taste where tasteId=:tasteId";
		Query query=session.createQuery(hql);
		query.setInteger("tasteId", tasteId);
		Taste taste=(Taste)query.uniqueResult();
		session.delete(taste);
		
	}

	public void updateTaste(int tasteId, Taste taste) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Taste where tasteId=:tasteId";
		Query query=session.createQuery(hql);
		query.setInteger("tasteId",tasteId);
		Taste taste2=(Taste)query.uniqueResult();
		
		taste2.setTasteName(taste.getTasteName());
		
		session.update(taste2);
		
	}

}
