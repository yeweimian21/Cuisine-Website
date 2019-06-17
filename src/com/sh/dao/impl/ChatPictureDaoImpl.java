package com.sh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sh.dao.ChatPictureDao;
import com.sh.model.ChatPicture;

public class ChatPictureDaoImpl implements ChatPictureDao {

	SessionFactory sessionFactory; 
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public List<ChatPicture> getChatPicture(int chatId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from ChatPicture where chatId=:chatId";
		Query query=session.createQuery(hql);
		query.setInteger("chatId", chatId);
		List<ChatPicture> list=query.list();
		return list;
	}

	public void addChatPicture(ChatPicture chatPicture) {
		Session session=sessionFactory.getCurrentSession();
		session.save(chatPicture);
		
	}

}
