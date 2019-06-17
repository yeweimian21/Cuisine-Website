package com.sh.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sh.biz.UserBiz;
import com.sh.model.User;

public class UserAction extends ActionSupport{
	
	private int userId;
	private String userName;
	private String password;
	private String gender;
	private int age;
	private String address;
	private String phone;
	private String email;
	
	private UserBiz userBiz; 
	
	public UserBiz getUserBiz() {
		return userBiz;
	}
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String login(){
		String userNameFilter="";
		try {
			userNameFilter=new String(userName.getBytes("iso-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		User user=userBiz.login(userNameFilter, password);
		if(user!=null){
			HttpServletRequest request=ServletActionContext.getRequest();
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			return "success";
		}
		else{
			return "error";
		}
		
	}
	
	public String register(){
		String userNameFilter="";
		String addressFilter="";
		try {
			userNameFilter=new String(userName.getBytes("iso-8859-1"), "UTF-8");
			addressFilter=new String(userName.getBytes("iso-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		User user=new User();
		user.setUserName(userNameFilter);
		user.setPassword(password);
		user.setGender(gender);
		user.setAge(age);
		user.setAddress(addressFilter);
		user.setPhone(phone);
		user.setEmail(email);
		userBiz.addUser(user);
		
		return "success";
	}
	
	public String getUser(){
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute("user");
		if(user==null){
			HttpServletResponse response=ServletActionContext.getResponse();
			response.setContentType("application/json;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			//清理浏览器缓存
			response.setHeader("Pragma", "No-cache");
			response.addHeader("Cache-Control", "no-cache");
			response.setDateHeader("Expires", 0);
			
			try {
				PrintWriter printWriter=response.getWriter();
				printWriter.println("");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		else{
			JSONObject jsonObject=JSONObject.fromObject(user);
			
			HttpServletResponse response=ServletActionContext.getResponse();
			response.setContentType("application/json;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			//清理浏览器缓存
			response.setHeader("Pragma", "No-cache");
			response.addHeader("Cache-Control", "no-cache");
			response.setDateHeader("Expires", 0);
			
			try {
				PrintWriter printWriter=response.getWriter();
				printWriter.println(jsonObject);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	}
	
	public String updateUser(){
		String userNameFilter="";
		String addressFilter="";
		try {
			userNameFilter=new String(userName.getBytes("iso-8859-1"), "UTF-8");
			addressFilter=new String(userName.getBytes("iso-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		User user=new User();
		user.setUserName(userNameFilter);
		user.setPassword(password);
		user.setGender(gender);
		user.setAge(age);
		user.setAddress(addressFilter);
		user.setPhone(phone);
		user.setEmail(email);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		User user2=(User)session.getAttribute("user");
		
		userBiz.updateUser(user2.getUserId(), user);
		
		return "success";
	}
	
	public String logout(){
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		session.removeAttribute("user");
		return "success";
	}
	
	public String check(){
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute("user");
		System.out.println("user:-------"+user);
		if(user==null){
			return "error";
		}
		else{
			
			return "success";
		}
	}
	
}
