package com.servlets;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet4")
public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public Servlet4() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    // Get the cookies from the request
	    Cookie[] cookies = request.getCookies();
	    
	    if (cookies != null) {
	        for (Cookie cookie : cookies) {
	            response.getWriter().println("<h2>Cookie Name: " + cookie.getName() + "</h2>");
	            response.getWriter().println("<h2>Cookie Value: " + cookie.getValue() + "</h2>");
	        }
	    } else {
	        response.getWriter().println("<h1>No cookies found!</h1>");
	    }
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
