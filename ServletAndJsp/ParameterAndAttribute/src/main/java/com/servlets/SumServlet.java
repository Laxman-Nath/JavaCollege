package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SumServlet
 */
@WebServlet("/SumServlet")
public class SumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a=Integer.parseInt(request.getParameter("firstno"));
		int b=Integer.parseInt(request.getParameter("secondno"));
		int sum=a+b;
		request.setAttribute("a",a);
		request.setAttribute("b",b);
		request.setAttribute("sum",sum);
		request.getRequestDispatcher("MulServlet").forward(request, response);
		
	}

}
