package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
			
			Cookie c = new Cookie("firstName", user.getFirstName());
			c.setMaxAge(60*60*24*7); //after 7 days cookie will expired 
			response.addCookie(c);
			
			//1st request -> server -> check no -> memory  -> session -> 12515365 
			//client ->browser ->cookie -> JSESSIONID 
			//2nd request -> server -> check yes -> no create [use]
			
			HttpSession session = request.getSession(); //new | old 
			session.setAttribute("email",user.getEmail());
			session.setMaxInactiveInterval(60*5);//seconds 
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp"); 
			rd.forward(request, response);
		}
	}

}
