package com.spring.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.DTO.DTOimpl;
@Repository("daoimp")

public class UserApp implements AutoticationManager {
	@Autowired
	JdbcTemplate obj;
	 //id | name  | address  | city     | sallary | job  | DEPARTMENT
	 
	public static String QRY_CHECK="select id,name,civil,sallary,job,DEPARTMENT from autho where user=?&&password=?";
	@Override
	public int Cheker(DTOimpl imp) {
		// TODO Auto-generated method stub
		String d=imp.getSname();
		String d2=imp.getSpass();
		System.out.println("this is value before"+d+"  "+d2);
		//mp.getSpass()
		int m=obj.queryForObject(QRY_CHECK,Integer.class,d,d2);
		System.out.println(m);
		//int j=obj.queryForObject
		return m; 
	}

}
