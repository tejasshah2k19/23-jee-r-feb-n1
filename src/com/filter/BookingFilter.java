package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class BookingFilter implements Filter {
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("BookingFilter::doFilter()");

		String name = request.getParameter("name");
		String email = request.getParameter("email");

		boolean isError = false;
		if (name == null || name.trim().length() == 0) {
			isError = true;
			request.setAttribute("nameError", "Please Enter Name");
		}
		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		}

		if (isError == true) {
			RequestDispatcher rd = request.getRequestDispatcher("Booking.jsp");
			rd.forward(request, response);
		} else {
			// goto servlet
			chain.doFilter(request, response);// goto next filter is present else call my servlet

		}
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}
}
