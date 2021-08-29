package com.edu.test;

import java.io.IOException;

import javax.servlet.*;

public class FlowFilterOne implements Filter {
	public void init(FilterConfig config) {
		System.out.println("init() ȣ�� .......... one");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter() ȣ�� �� .......... one");
		chain.doFilter(request, response);
		System.out.println("doFilter() ȣ�� �� .......... one");
	}
	
	@Override
	public void destroy() {
		System.out.println("destory() ȣ�� .......... one");
	}
}
