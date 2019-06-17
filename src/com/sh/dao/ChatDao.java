package com.sh.dao;

import java.util.List;

import com.sh.model.Chat;

public interface ChatDao {

	public void addChat(Chat chat);
	
	public void updateChat(int chatId,Chat chat);
	
	public void deleteChat(int chatId);
	
	public Chat getChat(int chatId);
	
	public List<Chat> getChatList();
	
	public List<Chat> getChatByUser(int userId);
	
	public Chat getChat(int userId,String chatContent);
	
}
