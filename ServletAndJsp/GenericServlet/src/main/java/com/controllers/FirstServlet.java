package com.controllers;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{
      ServletConfig serveltConfig=null;
	@Override
	public void destroy() {
		System.out.println("Destroyed");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("We are inside servlet congig");
		return serveltConfig;
	}

	@Override
	public String getServletInfo() {
		System.out.println("Servlet info");
		return "servlet created by laxman nath";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet is initialized");
		this.serveltConfig=config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("We are inside service");
		System.out.println("Servlet Config"+serveltConfig);
		System.out.println(getServletInfo());
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		out.write("<h1>This is simple servlet</h1>");
	     
		
	}

}
