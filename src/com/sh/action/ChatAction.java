package com.sh.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sh.biz.ChatBiz;
import com.sh.biz.ChatPictureBiz;
import com.sh.model.Chat;
import com.sh.model.ChatPicture;
import com.sh.model.User;

public class ChatAction extends ActionSupport{
	
	ChatBiz chatBiz;
	ChatPictureBiz chatPictureBiz;
	
	private int chatId;
	private int userId;
	private String chatContent;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	
	public ChatBiz getChatBiz() {
		return chatBiz;
	}
	public void setChatBiz(ChatBiz chatBiz) {
		this.chatBiz = chatBiz;
	}
	public ChatPictureBiz getChatPictureBiz() {
		return chatPictureBiz;
	}
	public void setChatPictureBiz(ChatPictureBiz chatPictureBiz) {
		this.chatPictureBiz = chatPictureBiz;
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
	
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public String getImage4() {
		return image4;
	}
	public void setImage4(String image4) {
		this.image4 = image4;
	}
	
	public String getChatList(){
		List<Map> list=chatBiz.getChatList();
		
		JSONArray jsonArray=JSONArray.fromObject(list);
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		//清理浏览器缓存
		response.setHeader("Pragma", "No-cache");
		response.addHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		
		try {
			PrintWriter printWriter=response.getWriter();
			printWriter.println(jsonArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	public String addChat(){
		String content="";
		try {
			content=new String(chatContent.getBytes("iso-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute("user");
		
		Chat chat=new Chat();
		chat.setUserId(user.getUserId());
		System.out.println("userId:"+user.getUserId());
		chat.setChatContent(content);
		
		System.out.println("chatContent:"+chatContent);
		chatBiz.addChat(chat);
		
		Chat chat2=chatBiz.getChat(user.getUserId(), chatContent);
		ChatPicture chatPicture=new ChatPicture();
		if(!image1.equals("")){
			chatPicture.setChatId(chat2.getChatId());
			chatPicture.setChatPicture(image1);
			chatPictureBiz.addChatPicture(chatPicture);
		}
		if(!image2.equals("")){
			chatPicture.setChatId(chat2.getChatId());
			chatPicture.setChatPicture(image2);
			chatPictureBiz.addChatPicture(chatPicture);
		}
		if(!image3.equals("")){
			chatPicture.setChatId(chat2.getChatId());
			chatPicture.setChatPicture(image3);
			chatPictureBiz.addChatPicture(chatPicture);
		}
		if(!image4.equals("")){
			chatPicture.setChatId(chat2.getChatId());
			chatPicture.setChatPicture(image4);
			chatPictureBiz.addChatPicture(chatPicture);
		}
		return "success";
	}
	
}
