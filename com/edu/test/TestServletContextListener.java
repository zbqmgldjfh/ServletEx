package com.edu.test;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestServletContextListener implements ServletContextListener {
	public TestServletContextListener() {
		System.out.println("TestServletContextListener ��ü ����");
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext ��ü �ʱ�ȭ");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext ��ü ����");
	}
}
