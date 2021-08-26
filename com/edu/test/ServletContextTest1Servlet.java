package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/context1")
public class ServletContextTest1Servlet extends HttpServlet {
	ServletContext sc;
	@Override
	public void init(ServletConfig config) throws ServletException {
		sc = config.getServletContext();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;cahrset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("Context : " + sc);
		out.close();
	}
}
