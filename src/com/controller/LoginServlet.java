package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class LoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserDao userDao = new UserDao();
		UserBean user  = userDao.login(email,password);
	
		if(user == null) {
			//credentials wrong
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp"); 
			rd.forward(request, response);
		}else {
			//correct

			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp"); 
			rd.forward(request, response);
		}
	}

}
