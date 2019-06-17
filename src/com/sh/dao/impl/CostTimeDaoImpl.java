package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.CostTimeDao;
import com.sh.model.CostTime;

public class CostTimeDaoImpl implements CostTimeDao {

	SessionFactory sessionFactory; 
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<CostTime> getCostTimeList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from CostTime order by costTimeId";
		Query query=session.createQuery(hql);
		List<CostTime> costTimeList=query.list();
		return costTimeList;
	}

	public CostTime getCostTime(int costTimeId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from CostTime where costTimeId=:costTimeId";
		Query query=session.createQuery(hql);
		query.setInteger("costTimeId", costTimeId);
		CostTime costTime=(CostTime)query.uniqueResult();
		return costTime;
	}

	public void addCostTime(CostTime costTime) {
		Session session=sessionFactory.getCurrentSession();
		session.save(costTime);
		
	}

	public void deleteCostTime(int costTimeId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from CostTime where costTimeId=:costTimeId";
		Query query=session.createQuery(hql);
		query.setInteger("costTimeId", costTimeId);
		CostTime costTime=(CostTime)query.uniqueResult();
		session.delete(costTime);
		
	}

	public void updateCostTime(int costTimeId, CostTime costTime) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from CostTime where costTimeId=:costTimeId";
		Query query=session.createQuery(hql);
		query.setInteger("costTimeId", costTimeId);
		CostTime costTime2=(CostTime)query.uniqueResult();
		
		costTime2.setCostTimeName(costTime2.getCostTimeName());
		
		session.update(costTime2);
		
	}

	
	
}
