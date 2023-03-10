package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.Validators;

//servlet-api.jar --> 
public class SignupServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("SignupServlet::service()");

		String firstName = request.getParameter("firstName"); // blank
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println("FirstName => " + firstName);
		System.out.println("Email => " + email);
		System.out.println("Password => " + password);

		// validation
		boolean isError = false;
		String errorMsg = "";

		if (Validators.isEmpty(firstName)) {
			isError = true;
			errorMsg = errorMsg + "Please Enter FirstName<br>";
		} else {

			if (Validators.isAlpha(firstName) == false) {
				isError = true;
				errorMsg = errorMsg + "Please Enter ValidName";
			}
		}
		if (Validators.isEmpty(email)) {
			isError = true;
			errorMsg = errorMsg + "Please Enter Email<br>";
		} else {
			String emailRegex = "[0-9a-zA-Z]+[@][a-zA-Z]+[\\.][a-zA-Z]{2,3}";
			if (email.matches(emailRegex) == false) {
				isError = true;
				errorMsg += "Please Enter ValidEmail<br>";
			}
		}

		response.setContentType("text/html"); // MIME
		// java html ->generate --> 1947
		PrintWriter out = response.getWriter();
		out.print("<html><body>");

		if (isError == true) {
			out.print(errorMsg);
		} else {
			out.println("<br>FirstName => " + firstName);
			out.println("<br>Email => " + email);
			out.println("<br>Password => " + password);

		}

		out.print("</body></html>");
	}
}
