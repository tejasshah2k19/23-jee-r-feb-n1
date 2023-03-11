package com.dao;

import java.util.ArrayList;

import com.bean.UserBean;

public class UserDao {

	static ArrayList<UserBean> users = new ArrayList<UserBean>();

	public void addUser(UserBean userBean) {

		// db insert
		users.add(userBean);
	}
}
