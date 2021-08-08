package com.springMVC.demo;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Mycvv implements Controller {

	public Mycvv()
	{
		System.out.println("this is controller logic views");
		
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is mav object creation and ");
		ModelAndView so=new ModelAndView("Daate","syss",new Date());
		return so;
	}

}
