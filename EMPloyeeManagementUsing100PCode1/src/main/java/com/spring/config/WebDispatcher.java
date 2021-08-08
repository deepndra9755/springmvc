package com.spring.config;

import javax.activation.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.spring.Controllerr.EmployeeRE;
import com.spring.DAO.IStudentRetrive;
import com.spring.DAO.StudentRetrive;
import com.spring.Service.IServiceImplement;

@Configuration
@EnableWebMvc
@ComponentScan("com.spring")
@Import({StudentRetrive.class,IServiceImplement.class,EmployeeRE.class})
public class WebDispatcher {
	
	@Bean
	public InternalResourceViewResolver getrs()
	{
		InternalResourceViewResolver rs=new InternalResourceViewResolver();
		rs.setPrefix("/WEB-INF/pager/");
		rs.setSuffix(".jsp");
		return rs;
	}
	@Bean
	public javax.sql.DataSource getds() throws NamingException
	{
		InitialContext cts=new InitialContext();
		javax.sql.DataSource ds=(javax.sql.DataSource)cts.lookup("java:comp/env/dsjndi");
		return ds;
	}
	@Bean("jop")
	public JdbcTemplate getjdbc() throws NamingException
	{
	JdbcTemplate tm=new JdbcTemplate();
	tm.setDataSource(this.getds());
	return tm;
	}
}
