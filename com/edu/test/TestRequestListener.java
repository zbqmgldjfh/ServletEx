package com.edu.test;

import javax.servlet.*;

public class TestRequestListener implements ServletRequestListener{
	public TestRequestListener() {
		System.out.println("TestRequestListener 按眉 积己");
	}
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("TestRequestListener 按眉 檬扁拳");
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("TestRequestListener 按眉 秦力");
	}
}
