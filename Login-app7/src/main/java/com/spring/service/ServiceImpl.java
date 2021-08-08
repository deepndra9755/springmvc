package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.DAO.AutoticationManager;
import com.spring.DTO.DTOimpl;
@Service("serv")
public class ServiceImpl implements IService {
    @Autowired
    @Qualifier("daoimp")
	AutoticationManager pol;
        
	@Override
	public String Authontication(DTOimpl obj) {
		// TODO Auto-generated method stub
		System.out.println("thhis user sercv "+obj.getSname()+"  "+obj.getSpass());
		int countt=pol.Cheker(obj);
		
		if(countt==0)
		{
		return("in-valid");
		}
		else
	
		
		return " valid";
		

}
	}