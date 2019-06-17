package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.UserDao;
import com.sh.model.User;

public class UserDaoImpl implements UserDao {
	
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public User login(String userName, String password) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User where userName=:userName and password=:password";
		Query query=session.createQuery(hql);
		query.setString("userName", userName);
		query.setString("password", password);
		User user=(User)query.uniqueResult();
		return user;
	}

	public User getUser(int userId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User where userId=:userId";
		Query query=session.createQuery(hql);
		query.setInteger("userId", userId);
		User user=(User)query.uniqueResult();
		return user;
	}

	public void updateUser(int userId, User user) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User where userId=:userId";
		Query query=session.createQuery(hql);
		query.setInteger("userId",userId);
		User user2=(User)query.uniqueResult();
		
		user2.setUserName(user.getUserName());
		user2.setPassword(user.getPassword());
		user2.setGender(user.getGender());
		user2.setAge(user.getAge());
		user2.setAddress(user.getAddress());
		user2.setPhone(user.getPhone());
		user2.setEmail(user.getEmail());
		
		session.update(user2);
		
	}

	public void addUser(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
		
	}

	public void deleteUser(int userId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User where userId=userId";
		Query query=session.createQuery(hql);
		query.setInteger("userId", userId);
		User user=(User)query.uniqueResult();
		session.delete(user);
		
	}

	public List<User> getUserList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User";
		Query query=session.createQuery(hql);
		List<User> list=query.list();
		return list;
	}

	

}
