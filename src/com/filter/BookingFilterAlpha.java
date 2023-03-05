package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.util.Validators;

public class BookingFilterAlpha implements Filter{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response , FilterChain chain)
			throws IOException, ServletException {
		System.out.println("BookingFilterAlpha::doFilter()");
		String name = request.getParameter("name");
		boolean isError = false;
		if(Validators.isAlpha(name) == false) {
			isError = true; 
			request.setAttribute("nameError", "Please Enter Valid Name");
		}
		if(isError == true) {
			RequestDispatcher rd = request.getRequestDispatcher("Booking.jsp");
			rd.forward(request, response);
		}else {
			chain.doFilter(request, response);
		}
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
