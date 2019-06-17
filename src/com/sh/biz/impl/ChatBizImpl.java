package com.sh.biz.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.LinkedMap;

import com.sh.biz.ChatBiz;
import com.sh.dao.ChatDao;
import com.sh.dao.ChatPictureDao;
import com.sh.dao.UserDao;
import com.sh.model.Chat;
import com.sh.model.ChatPicture;
import com.sh.model.User;

public class ChatBizImpl implements ChatBiz {

	ChatDao chatDao;
	UserDao userDao;
	ChatPictureDao chatPictureDao;
	
	public ChatDao getChatDao() {
		return chatDao;
	}

	public void setChatDao(ChatDao chatDao) {
		this.chatDao = chatDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public ChatPictureDao getChatPictureDao() {
		return chatPictureDao;
	}

	public void setChatPictureDao(ChatPictureDao chatPictureDao) {
		this.chatPictureDao = chatPictureDao;
	}

	public void addChat(Chat chat) {
		chatDao.addChat(chat);

	}

	public List<Map> getChatList() {
		List<Map> list=new ArrayList<Map>();
		List<Chat> chatList=chatDao.getChatList();
		Iterator<Chat> iterator=chatList.iterator();
		while(iterator.hasNext()){
			Chat chat=iterator.next();
			int userId=chat.getUserId();
			User user=userDao.getUser(userId);
			int chatId=chat.getChatId();
			List<ChatPicture> pictureList=chatPictureDao.getChatPicture(chatId);
			Map map=new LinkedMap();
			map.put("user", user);
			map.put("chat", chat);
			map.put("picture", pictureList);
			list.add(map);
		}
		return list;
	}

	public void deleteChat(int chatId) {
		chatDao.deleteChat(chatId);
		
	}

	public Chat getChat(int chatId) {
		return chatDao.getChat(chatId);
		
	}

	public List<Chat> getChatByUser(int userId) {
		
		return chatDao.getChatByUser(userId);
	}

	public void updateChat(int chatId, Chat chat) {
		
		
	}

	public Chat getChat(int userId, String chatContent) {
		
		return chatDao.getChat(userId, chatContent);
	}

}
