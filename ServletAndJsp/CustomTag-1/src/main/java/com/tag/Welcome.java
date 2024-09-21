package com.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Welcome extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		try {
			JspWriter out=pageContext.getOut();
			out.println("Welcome laxman");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return super.doStartTag();
	}

}
