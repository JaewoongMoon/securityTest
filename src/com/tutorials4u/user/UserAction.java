package com.tutorials4u.user;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String message;
	
	public String execute()
	{
		setMessage("From execute method");
		return SUCCESS;		
	}
	
	public String add()
	{
		setMessage("From add method");
		return SUCCESS;		
	}
	
	public String update()
	{
		setMessage("From update method");
		return SUCCESS;		
	}
	
	public String delete()
	{
		setMessage("From delete method");
		return SUCCESS;		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
