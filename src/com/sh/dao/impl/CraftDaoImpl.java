package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.CraftDao;
import com.sh.model.Craft;

public class CraftDaoImpl implements CraftDao {

	SessionFactory sessionFactory; 
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public List<Craft> getCraftList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Craft order by craftId";
		Query query=session.createQuery(hql);
		List<Craft> craftList=query.list();
		return craftList;
	}

	public Craft getCraft(int craftId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Craft where craftId=:craftId";
		Query query=session.createQuery(hql);
		query.setInteger("craftId", craftId);
		Craft craft=(Craft)query.uniqueResult();
		return craft;
	}

	public void addCraft(Craft craft) {
		Session session=sessionFactory.getCurrentSession();
		session.save(craft);
		
	}

	public void deleteCraft(int craftId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Craft where craftId=:craftId";
		Query query=session.createQuery(hql);
		query.setInteger("craftId", craftId);
		Craft craft=(Craft)query.uniqueResult();
		session.delete(craft);
		
	}

	public void updateCraft(int craftId, Craft craft) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Craft where craftId=:craftId";
		Query query=session.createQuery(hql);
		query.setInteger("craftId", craftId);
		Craft craft2=(Craft)query.uniqueResult();
		
		craft2.setCraftName(craft.getCraftName());
		
		session.update(craft2);
		
	}

}
