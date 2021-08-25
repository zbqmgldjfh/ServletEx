package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest")
public class QueryTestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>GET ������� ��û�Ǿ����ϴ�</h1>");
		
		String id = req.getParameter("id");
		String password = req.getParameter("pwd");
		String name = req.getParameter("name");
		String[] hobbies = req.getParameterValues("hobby");
		String gender = req.getParameter("gender");
		String religion = req.getParameter("religion");
		String intro = req.getParameter("introduction");
		
		out.print("ID : " + id + "<br/>");
		out.print("��й�ȣ : " + password + "<br/>");
		out.print("�̸� : " + name + "<br/>");
		out.print("��� : ");
		for(int i = 0; i < hobbies.length; i++) {
			out.print(hobbies[i] + " ");
		}
		out.print("<br/>");
		out.print("���� : " + gender + "<br/>");
		out.print("���� : " + religion + "<br/>");
		out.print("�Ұ� : " + intro + "<br/>");
		out.print("��ü ���� ���ڿ� : " + req.getQueryString());
		
		out.print("</body></html>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head><title>Query ���ڿ� �׽�Ʈ</title></head>");
		out.print("<body>");
		out.print("<h1>POST ������� ��û�Ǿ����ϴ�</h1>");
		
		String id = req.getParameter("id");
		String password = req.getParameter("pwd");
		String name = req.getParameter("name");
		String[] hobbies = req.getParameterValues("hobby");
		String gender = req.getParameter("gender");
		String religion = req.getParameter("religion");
		String intro = req.getParameter("introduction");
		
		out.print("ID : " + id + "<br/>");
		out.print("��й�ȣ : " + password + "<br/>");
		out.print("�̸� : " + name + "<br/>");
		out.print("��� : ");
		for(int i = 0; i < hobbies.length; i++) {
			out.print(hobbies[i] + " ");
		}
		out.print("<br/>");
		out.print("���� : " + gender + "<br/>");
		out.print("���� : " + religion + "<br/>");
		out.print("�Ұ� : " + intro + "<br/>");
		
		out.print("</body></html>");
		out.close();
	}
}
