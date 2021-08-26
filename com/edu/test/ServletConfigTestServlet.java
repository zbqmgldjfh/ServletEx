package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletConfigTestServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String env = this.getInitParameter("charset");
		req.setCharacterEncoding(env);
		out.print("<h3> �̸� : " + req.getParameter("name"));
		out.close();
	}
}
