package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class ViewUserServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// click ? email ?

		String email = request.getParameter("email");
		UserDao userDao = new UserDao();
		UserBean user = userDao.getUserDetailByEmail(email);
		
		request.setAttribute("user", user);
		
		RequestDispatcher rd = request.getRequestDispatcher("ViewUser.jsp"); 
		rd.forward(request, response);
	}

}
