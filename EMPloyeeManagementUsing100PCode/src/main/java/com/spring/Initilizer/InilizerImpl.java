package com.spring.Initilizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.spring.config.WebDispatcher;
import com.spring.config.WebRoot;

public class InilizerImpl implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		// TODO Auto-generated method stub
      AnnotationConfigWebApplicationContext aw=new AnnotationConfigWebApplicationContext();
      aw.register(WebRoot.class);
    ContextLoaderListener poi=new ContextLoaderListener(aw);
	sc.addListener(poi);
	
	AnnotationConfigWebApplicationContext km=new AnnotationConfigWebApplicationContext();
	km.register(WebDispatcher.class);
	DispatcherServlet dss=new DispatcherServlet(km);
      ServletRegistration.Dynamic h=sc.addServlet("dsa",dss);
      h.addMapping("/");
      
	}

}
