package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
public class DeleteUserServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		
		UserDao userDao = new UserDao();
		userDao.deleteUser(email);
		
		//ListServlet
		
		RequestDispatcher rd = request.getRequestDispatcher("EcomListUserServlet");
		rd.forward(request, response);
		
	}

}
