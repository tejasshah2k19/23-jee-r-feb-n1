package com.stag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class GreetTag extends SimpleTagSupport{

	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		
		Date d = new Date();
		
		if(d.getHours() >= 0 && d.getHours() <= 11) {
			out.print("Good Morning");
		}else if(d.getHours() >= 12 && d.getHours()<= 17) {
			out.print("Good Noon");
		}else {
			out.print("Good Evening");
		}
	
	}
}
