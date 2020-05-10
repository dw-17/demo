package com.example.springboot.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 用于接受传递参数的封装
 */
public class User {
	private static Logger LOGGER = LoggerFactory.getLogger(User.class);
	private String username;
	private String password;

	public void init() {
		LOGGER.info("这是User的初始化回调");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
