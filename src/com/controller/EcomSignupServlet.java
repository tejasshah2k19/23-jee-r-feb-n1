package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

@WebServlet("/EcomSignupServlet")
public class EcomSignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String firstName = request.getParameter("firstName"); // blank
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		//validation 
		
		//db insert 

		UserBean userBean = new UserBean();
		userBean.setEmail(email);
		userBean.setFirstName(firstName);
		userBean.setPassword(password);
		userBean.setRole(2);//2 customer
		
		
		
		UserDao userDao = new UserDao();
		userDao.addUser(userBean);
		
		//userDao.addUser(fn,ln,em,pwd);
		
		//cookie 
		
		RequestDispatcher rd = request.getRequestDispatcher("EcomSignup.jsp");
		rd.forward(request, response);
	}
	
}
