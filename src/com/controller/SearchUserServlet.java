package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

@WebServlet("/SearchUserServlet")
public class SearchUserServlet extends HttpServlet{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		UserDao userDao  = new UserDao(); 
		ArrayList<UserBean> users =  userDao.searchUserByName(firstName);
		request.setAttribute("users", users);
		request.getRequestDispatcher("SearchUser.jsp").forward(request, response);
		
	}
}
