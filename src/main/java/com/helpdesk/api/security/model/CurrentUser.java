package com.helpdesk.api.security.model;

import com.helpdesk.api.entity.User;

public class CurrentUser {
	
	private User user;
	
	private String token;

	public CurrentUser(String token, User user) {
		this.user = user;
		this.token = token;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
