package com.sh.model;

import java.io.Serializable;

public class Chat implements Serializable {

	private int chatId;
	private int userId;
	private String chatContent;
	
	public Chat() {
		super();
	}

	public Chat(int chatId, int userId, String chatContent) {
		super();
		this.chatId = chatId;
		this.userId = userId;
		this.chatContent = chatContent;
	}

	public int getChatId() {
		return chatId;
	}

	public void setChatId(int chatId) {
		this.chatId = chatId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getChatContent() {
		return chatContent;
	}

	public void setChatContent(String chatContent) {
		this.chatContent = chatContent;
	}
	
}
