package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddBookingServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("AddBookingServlet::service()");
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		System.out.println(name);
		System.out.println(email);

		RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
		rd.forward(request, response);
	}
}
