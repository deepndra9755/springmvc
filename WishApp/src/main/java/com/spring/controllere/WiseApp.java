package com.spring.controllere;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WiseApp implements GetMsg,Controller {
	WPPApp wp;
	String msgg;
	 public WiseApp(WPPApp j) {
		// TODO Auto-generated constructor stub
		 wp=j;
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		  msgg=wp.msg();
		  System.out.println("this is value of"+msgg);
		return new ModelAndView("wpp","lop",msgg);
		//return new ModelAndView("wpp","kml",msgg);
	}

}
