package com.sh.biz;

import java.util.List;
import java.util.Map;

import com.sh.model.Chat;

public interface ChatBiz {

	public void addChat(Chat chat);
	
	public void updateChat(int chatId,Chat chat);
	
	public void deleteChat(int chatId);
	
	public Chat getChat(int chatId);
	
	public List<Map> getChatList();
	
	public List<Chat> getChatByUser(int userId);
	
	public Chat getChat(int userId,String chatContent);
}
