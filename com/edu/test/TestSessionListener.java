package com.edu.test;

import javax.servlet.http.*;

public class TestSessionListener implements HttpSessionListener{
	public TestSessionListener() {
		System.out.println("TestSessionListener 按眉 积己");
	}
	@Override
	public void sessionCreated(HttpSessionEvent e) {
		System.out.println("技记 按眉 积己");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent e) {
		System.out.println("技记 按眉 秦力");
	}
}
