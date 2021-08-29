package com.edu.test;

import java.io.IOException;

import javax.servlet.*;

public class FlowFilterTwo implements Filter {
	public void init(FilterConfig config) {
		System.out.println("init() ȣ�� .......... two");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter() ȣ�� �� .......... two");
		chain.doFilter(request, response);
		System.out.println("doFilter() ȣ�� �� .......... two");
	}
	
	@Override
	public void destroy() {
		System.out.println("destory() ȣ�� .......... two");
	}
}
