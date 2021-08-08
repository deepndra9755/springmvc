package com.spring.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.spring.Service.WIshGenrator;

@Configuration
@ComponentScan("com.spring")
@Import({WIshGenrator.class})
@EnableWebMvc
public class ChildCont {

	@Bean
	public ViewResolver msgs()
	{
	InternalResourceViewResolver ob=new InternalResourceViewResolver();
	ob.setPrefix("/WEB-INF/page/");
	ob.setSuffix(".jsp");
	return ob;
	}
	
}
