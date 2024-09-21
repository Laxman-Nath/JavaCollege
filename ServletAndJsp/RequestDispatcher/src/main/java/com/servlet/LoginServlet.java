
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		PrintWriter out = resp.getWriter();
		RequestDispatcher rd;
		if ("laxman".equals(name) && "1234".equals(password)) {
			req.setAttribute("name", name);
//			rd = req.getRequestDispatcher("SuccessServlet");
//			rd.forward(req, resp);
			
			resp.sendRedirect("SuccessServlet");
		} else {
			resp.setContentType("text/html");
			out.print("<h1>Login failed</h1>");
			rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);

		}
	}
}
