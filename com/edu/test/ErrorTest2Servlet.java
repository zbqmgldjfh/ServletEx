package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/errorTest2")
public class ErrorTest2Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		try {
			String getquery = req.getQueryString();
			out.print("Query : " + getquery + "<br>");
			out.print("Query ���� : " + getquery.length());
		}catch(Exception e) {
			out.print("��û�� ó���ϴ� ���� ������ �߻��Ͽ����ϴ� : " + e);
		}
		out.print("<br>Done!");
		
		out.close();
	}

}
