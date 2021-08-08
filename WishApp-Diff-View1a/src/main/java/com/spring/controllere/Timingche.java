package com.spring.controllere;

import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class Timingche implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		RequestDispatcher rd=null;
		Date d=new Date();
		int hourr=d.getDay();
		if(10>1)
		{ 
		
		rd=request.getRequestDispatcher("tml.jsp");
		rd.forward(request, response);
		return false;	
		}
		// TODO Auto-generated method stub
		return true;
	}

}
