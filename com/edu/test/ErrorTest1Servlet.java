package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/errorTest")
public class ErrorTest1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		String getquery = req.getQueryString();
		out.print("Query : " + getquery + "<br>");
		out.print("Query ���� : " + getquery.length());
		out.print("Done!");
		
		out.close();
	}
}
