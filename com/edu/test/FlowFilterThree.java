package com.edu.test;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.*;

@WebFilter(filterName="timer", urlPatterns="/third")
public class FlowFilterThree implements Filter{
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		long startTime = System.currentTimeMillis();
		chain.doFilter(request, response);
		long endTime = System.currentTimeMillis();
		long executeTime = endTime - startTime;
		System.out.println("���� �ð� :" + executeTime + " ms");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
