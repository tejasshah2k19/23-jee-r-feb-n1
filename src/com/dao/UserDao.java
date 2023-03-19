package com.dao;

import java.util.ArrayList;

import com.bean.UserBean;

public class UserDao {

	static ArrayList<UserBean> users = new ArrayList<UserBean>();

	public void addUser(UserBean userBean) {

		// db insert
		users.add(userBean);
	}

	public ArrayList<UserBean> getAllUsers() {
		return users;
	}
	
	public UserBean login(String email,String password) {
		
		for(UserBean user:users) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return user;
			}

		}
		return null;
	}
}
