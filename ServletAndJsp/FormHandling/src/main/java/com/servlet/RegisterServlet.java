package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String password=req.getParameter("password");
	String email=req.getParameter("email");
	String course=req.getParameter("course");
	resp.setContentType("text/html");
	PrintWriter outPrintWriter =resp.getWriter();
	outPrintWriter.print("<h1>Name="+name+"</h1>");
	outPrintWriter.print("<h1> password="+password+"</h1>");
	outPrintWriter.print("<h1>Email="+email+"</h1>");
	outPrintWriter.print("<h1>Course="+course+"</h1>");
}
}
