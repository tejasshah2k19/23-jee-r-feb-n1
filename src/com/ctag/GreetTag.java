package com.ctag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class GreetTag extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut(); 
		try {
			out.print("Hey Welcome");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;//no body tag --> SKIP BODY
		//<b> test</b> 
		
	}
	
	@Override
	public int doEndTag() throws JspException {
		//
//		return EVAL_PAGE;//execute page
		return SKIP_PAGE;
	}
}
