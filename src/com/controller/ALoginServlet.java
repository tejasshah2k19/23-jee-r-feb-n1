package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ALoginServlet extends HttpServlet {

	String correctEmail;
	String correctPassword;

	// ServletConfig

	public void init(ServletConfig config) {
		correctEmail = config.getInitParameter("email");
		correctPassword = config.getInitParameter("password");

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext context = getServletContext();
		String appName = context.getInitParameter("appName");

	}

}
