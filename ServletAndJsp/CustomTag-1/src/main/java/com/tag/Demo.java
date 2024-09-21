package com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Demo extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		JspWriter out =pageContext.getOut();
		try {
			out.println("This is a demo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doStartTag();
	}

}
