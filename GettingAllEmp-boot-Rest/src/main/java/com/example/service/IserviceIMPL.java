package com.example.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entities.EmpENTI;
import com.example.Reposis.EMPgetting;
import com.example.dto.DTOcls;

@Service("ss")
public class IserviceIMPL implements IService {

	@Autowired
	EMPgetting objs;
	
	public DTOcls getEmp(Integer ids) {
		// TODO Auto-generated method stub
		Optional<EmpENTI> gs=objs.findById(ids);
		DTOcls is=new DTOcls();
		if(gs.isPresent())
		{
		EmpENTI sd=gs.get();
		
		BeanUtils.copyProperties(sd, is);
		is.setPrs(true);
		return is;
		}
		
		return is;
	}
	
	

}
