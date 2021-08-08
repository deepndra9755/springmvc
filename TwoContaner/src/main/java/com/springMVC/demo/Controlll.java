package com.springMVC.demo;
import com.spring.service.*;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.spring.service.TimeGetter;

public class Controlll implements Controller {
     
	TimeGetter tms;	
	
	public Controlll(TimeGetter tms) {
		this.tms = tms;
		System.out.println("ccccccccccccccccccccccccccccccc");
		
	}
	String msg=tms.getmms();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ccccccccccccccccccccccccccccccc");
		return new ModelAndView("msgd",msg,new Date());
		
		
	}

}
