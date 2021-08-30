package com.edu.test;

import javax.servlet.*;

public class TestRequestListener implements ServletRequestListener{
	public TestRequestListener() {
		System.out.println("TestRequestListener ��ü ����");
	}
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("TestRequestListener ��ü �ʱ�ȭ");
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("TestRequestListener ��ü ����");
	}
}
