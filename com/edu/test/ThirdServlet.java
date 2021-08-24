package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest res, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>���� �Ϸ�!</h1>");
		out.close();
	}
}
