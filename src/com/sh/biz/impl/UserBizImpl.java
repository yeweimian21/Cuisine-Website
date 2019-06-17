package com.sh.biz.impl;

import java.util.List;

import com.sh.biz.UserBiz;
import com.sh.dao.UserDao;
import com.sh.model.User;

public class UserBizImpl implements UserBiz {

	UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User login(String userName, String password) {
		
		return userDao.login(userName, password);
	}

	public void updateUser(int userId, User user) {
		userDao.updateUser(userId, user);
		
	}

	public void addUser(User user) {
		userDao.addUser(user);
		
	}

	public void deleteUser(int userId) {
		userDao.deleteUser(userId);
		
	}

	public User getUser(int userId) {
		
		return userDao.getUser(userId);
	}

	public List<User> getUserList() {
		
		return userDao.getUserList();
	}

}
