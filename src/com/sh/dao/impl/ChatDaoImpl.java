package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.ChatDao;
import com.sh.model.Chat;
import com.sh.model.CostTime;

public class ChatDaoImpl implements ChatDao {

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void addChat(Chat chat) {
		Session session=sessionFactory.getCurrentSession();
		session.save(chat);

	}

	public List<Chat> getChatList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Chat";
		Query query=session.createQuery(hql);
		List<Chat> list=query.list();
		return list;
	}

	public void deleteChat(int chatId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from ChatTime where chatId=:chatId";
		Query query=session.createQuery(hql);
		query.setInteger("chatId", chatId);
		Chat chat=(Chat)query.uniqueResult();
		session.delete(chat);
		
	}

	public Chat getChat(int chatId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from ChatTime where chatId=:chatId";
		Query query=session.createQuery(hql);
		query.setInteger("chatId", chatId);
		Chat chat=(Chat)query.uniqueResult();
		return chat;
	}

	public void updateChat(int chatId, Chat chat) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from ChatTime where chatId=:chatId";
		Query query=session.createQuery(hql);
		query.setInteger("chatId", chatId);
		Chat chat2=(Chat)query.uniqueResult();
		
		chat2.setUserId(chat.getUserId());
		chat2.setChatContent(chat.getChatContent());
		
		session.update(chat2);
		
	}

	public List<Chat> getChatByUser(int userId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Chat where userId=:userId";
		Query query=session.createQuery(hql);
		query.setInteger("userId", userId);
		List<Chat> list=query.list();
		return list;
	}

	public Chat getChat(int userId, String chatContent) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Chat where userId=:userId and chatContent=:chatContent";
		Query query=session.createQuery(hql);
		query.setInteger("userId", userId);
		query.setString("chatContent", chatContent);
		Chat chat=(Chat)query.uniqueResult();
		
		return chat;
	}

}
