package com.sh.dao;

import java.util.List;

import com.sh.model.ChatPicture;

public interface ChatPictureDao {

	public void addChatPicture(ChatPicture chatPicture);
	
	
	
	public List<ChatPicture> getChatPicture(int chatId);
	
}
