package com.sh.biz.impl;

import com.sh.biz.ChatPictureBiz;
import com.sh.dao.ChatPictureDao;
import com.sh.model.ChatPicture;

public class ChatPictureBizImpl implements ChatPictureBiz {
	
	ChatPictureDao chatPictureDao;

	
	public ChatPictureDao getChatPictureDao() {
		return chatPictureDao;
	}


	public void setChatPictureDao(ChatPictureDao chatPictureDao) {
		this.chatPictureDao = chatPictureDao;
	}


	public void addChatPicture(ChatPicture chatPicture) {
		chatPictureDao.addChatPicture(chatPicture);
		
	}

}
