package com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class Area extends TagSupport{
  int side;

public int getSide() {
	return side;
}

public void setSide(int side) {
	this.side = side;
}

public int doStartTag() {
	JspWriter out=pageContext.getOut();
	try {
		out.println("<h1>Area="+side*side+"</h1>");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return SKIP_BODY;
}
}
