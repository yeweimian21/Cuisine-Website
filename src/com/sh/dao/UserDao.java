package com.sh.dao;

import java.util.List;

import com.sh.model.User;

public interface UserDao {

	public User login(String userName,String password);
	
	public void addUser(User user);
	
	public void updateUser(int userId,User user);
	
	public void deleteUser(int userId);
	
	public User getUser(int userId);
	
	public List<User> getUserList();
	
}
