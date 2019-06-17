package com.sh.model;

import java.io.Serializable;

public class ChatPicture implements Serializable {

	private int chatId;
	private String chatPicture;
	
	public ChatPicture() {
		super();
	}

	public ChatPicture(int chatId, String chatPicture) {
		super();
		this.chatId = chatId;
		this.chatPicture = chatPicture;
	}

	public int getChatId() {
		return chatId;
	}

	public void setChatId(int chatId) {
		this.chatId = chatId;
	}

	public String getChatPicture() {
		return chatPicture;
	}

	public void setChatPicture(String chatPicture) {
		this.chatPicture = chatPicture;
	}
}
