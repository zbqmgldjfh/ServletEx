package com.edu.test;

import javax.servlet.http.*;

public class TestSessionAttributeListener implements HttpSessionAttributeListener {
	public TestSessionAttributeListener() {
		System.out.println("TestSessionAttributeListener ��ü ����");
	}
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("���� ��ü�� �Ӽ� �߰�");
	}
	
	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("���� ��ü�� �߰��� �Ӽ� ����");
	}
	
	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("���� ��ü�� �߰��� �Ӽ� ��ü");	
	}
}

