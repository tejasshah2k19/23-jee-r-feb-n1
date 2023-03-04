package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.Validators;

public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstName"); // blank
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println("FirstName => " + firstName);
		System.out.println("Email => " + email);
		System.out.println("Password => " + password);

		// validation
		boolean isError = false;

		if (Validators.isEmpty(firstName)) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		} else {

			if (Validators.isAlpha(firstName) == false) {
				isError = true;
				request.setAttribute("firstNameError", "Please Enter Valid FirstName");
			}
		}
		if (Validators.isEmpty(email)) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		} else {
			String emailRegex = "[0-9a-zA-Z]+[@][a-zA-Z]+[\\.][a-zA-Z]{2,3}";
			if (email.matches(emailRegex) == false) {
				isError = true;
				request.setAttribute("emailError", "Please Enter Valid Email");

			}
		}

		RequestDispatcher rd = null;
		if (isError == true) {
			// go back
			rd = request.getRequestDispatcher("Registration.jsp");
			// set error
		} else {
			rd = request.getRequestDispatcher("Home.jsp");

		}
		rd.forward(request, response);
	}
}
