package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyGenericServlet extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		PrintWriter outPrintWriter=arg1.getWriter();
		arg1.setContentType("text/html");
		outPrintWriter.print("<h1>This is my generic servelt</h1>");
		outPrintWriter.print("<h1>Todays date is:"+LocalDate.now()+"</h1>");
		
	}

}
