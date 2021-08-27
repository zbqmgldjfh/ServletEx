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
			out.print("ID 또는 비밀번호를 정확히 입력해주세요.");
			return;
		}
		
		HttpSession session = req.getSession();
		
		if(session.isNew() || session.getAttribute("id") == null) {
			session.setAttribute("id", id);
			if(session.isNew()) {
				out.print("Session생성후, 로그인 완료");
			}else out.print("로그인을 완료하였습니다.");
		}else {
			out.print("현재 로그인 상태입니다.");
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false);
		if(session != null && session.getAttribute("id") != null) {
			session.invalidate();
			out.print("로그아웃 완료");
		}else {
			out.print("현재 로그인 상태가 아닙니다.");
		}
		out.close();
	}
}
