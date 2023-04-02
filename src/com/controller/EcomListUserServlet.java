package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class EcomListUserServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean isLogIn = false;
		Cookie c[] = request.getCookies();
		if (c != null) {
			for (Cookie x : c) {
				if (x.getName().equals("firstName")) {
					isLogIn = true;
				}
			}
		}
		RequestDispatcher rd = null;
		if (isLogIn == true) {
			UserDao userDao = new UserDao();

			ArrayList<UserBean> users = userDao.getAllUsers();// 1 2
			request.setAttribute("users", users);

			rd = request.getRequestDispatcher("EcomListUser.jsp");
			rd.forward(request, response);
		} else {
			rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
	}

}
