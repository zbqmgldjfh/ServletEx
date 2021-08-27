package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/logProc")
public class LoginOutServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		
		if(id.isEmpty() || pwd.isEmpty()) {
			out.print("ID �Ǵ� ��й�ȣ�� ��Ȯ�� �Է����ּ���.");
			return;
		}
		
		HttpSession session = req.getSession();
		
		if(session.isNew() || session.getAttribute("id") == null) {
			session.setAttribute("id", id);
			if(session.isNew()) {
				out.print("Session������, �α��� �Ϸ�");
			}else out.print("�α����� �Ϸ��Ͽ����ϴ�.");
		}else {
			out.print("���� �α��� �����Դϴ�.");
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false);
		if(session != null && session.getAttribute("id") != null) {
			session.invalidate();
			out.print("�α׾ƿ� �Ϸ�");
		}else {
			out.print("���� �α��� ���°� �ƴմϴ�.");
		}
		out.close();
	}
}
