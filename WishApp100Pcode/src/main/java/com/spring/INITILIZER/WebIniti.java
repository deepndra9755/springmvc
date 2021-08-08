package com.spring.INITILIZER;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.spring.Config.ChildCont;
import com.spring.Config.ParentCont;

public class WebIniti implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		// TODO Auto-generated method stub
		
	AnnotationConfigWebApplicationContext kop=new AnnotationConfigWebApplicationContext();
	kop.register(ParentCont.class);
	ContextLoaderListener p=new ContextLoaderListener(kop);
	sc.addListener(p);

	AnnotationConfigWebApplicationContext k=new AnnotationConfigWebApplicationContext();
	k.register(ChildCont.class);
	DispatcherServlet s=new DispatcherServlet(k);
	ServletRegistration.Dynamic d=sc.addServlet("sd",s);
	d.addMapping("/");
	

	}

}
