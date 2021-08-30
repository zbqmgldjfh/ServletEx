package com.edu.test;

import javax.servlet.http.*;

public class TestSessionListener implements HttpSessionListener{
	public TestSessionListener() {
		System.out.println("TestSessionListener ��ü ����");
	}
	@Override
	public void sessionCreated(HttpSessionEvent e) {
		System.out.println("���� ��ü ����");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent e) {
		System.out.println("���� ��ü ����");
	}
}
