package com.dao;

import java.util.ArrayList;

import com.bean.UserBean;

public class UserDao {

	static ArrayList<UserBean> users = new ArrayList<UserBean>();
	
	//userBean -> users -> add 
	//server start -> activity  -> users[1,2,3,4,5]  
	
	//server stop -> activity -> user[] -> 

	//event --> action 
	
	//login logout 
	
	//Listener --> listen event  -> activity 
	
	public void addUser(UserBean userBean) {

		// db insert
		users.add(userBean);
	}

	public ArrayList<UserBean> getAllUsers() {
		return users;
	}

	public UserBean login(String email, String password) {
	
		for (UserBean user : users) {
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return user;
			}

		}
		return null;
	}

	public void deleteUser(String email) {
		int i;// noMatch
		for (i = 0; i < users.size(); i++)// 5[ 0 1 2 3 4]
		{

			if (users.get(i).getEmail().equals(email)) {
				users.remove(i);
				break;
			}

		}
	}

	public UserBean getUserDetailByEmail(String email) {

		for (UserBean user : users) {
			if (user.getEmail().equals(email)) {
				return user;
			}

		}
		return null;
	}

	public ArrayList<UserBean> searchUserByName(String firstName) {
		ArrayList<UserBean> searchUserData = new ArrayList<UserBean>();
		
		
		for(UserBean user:users) {
			if(user.getFirstName().trim().toLowerCase().startsWith(firstName.trim().toLowerCase())) {
				searchUserData.add(user);
			}
		}
		
		return searchUserData;
	}

}
