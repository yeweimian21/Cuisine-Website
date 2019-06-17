package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.DifficultyDao;
import com.sh.model.Craft;
import com.sh.model.Difficulty;

public class DifficultyDaoImpl implements DifficultyDao {

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Difficulty> getDifficultyList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Difficulty order by difficultyId asc";
		Query query=session.createQuery(hql);
		List<Difficulty> difficultyList=query.list();
		return difficultyList;
	}

	public Difficulty getDifficulty(int difficultyId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Difficulty where difficultyId=:difficultyId";
		Query query=session.createQuery(hql);
		query.setInteger("difficultyId", difficultyId);
		Difficulty difficulty=(Difficulty)query.uniqueResult();
		return difficulty;
	}

	public void addDifficulty(Difficulty difficulty) {
		Session session=sessionFactory.getCurrentSession();
		session.save(difficulty);
		
	}

	public void deleteDifficulty(int difficultyId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Craft where difficultyId=:difficultyId";
		Query query=session.createQuery(hql);
		query.setInteger("difficultyId", difficultyId);
		Difficulty difficulty=(Difficulty)query.uniqueResult();
		session.delete(difficulty);
		
	}

	public void updateDifficulty(int difficultyId, Difficulty difficulty) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Craft where difficultyId=:difficultyId";
		Query query=session.createQuery(hql);
		query.setInteger("difficultyId", difficultyId);
		Difficulty difficulty2=(Difficulty)query.uniqueResult();
		
		difficulty2.setDifficultyName(difficulty.getDifficultyName());
		
		session.update(difficulty2);
		
	}
	
	

}
