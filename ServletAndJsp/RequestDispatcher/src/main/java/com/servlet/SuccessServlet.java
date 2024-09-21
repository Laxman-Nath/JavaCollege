package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nameString =(String)req.getAttribute("name");
		resp.setContentType("text/html");
		resp.getWriter().println("<h1>Welcome "+nameString+" it is post method</h1>");
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nameString =(String)req.getAttribute("name");
		resp.setContentType("text/html");
		resp.getWriter().println("<h1>Welcome "+nameString+" it is get method</h1>");
		
	}

}
