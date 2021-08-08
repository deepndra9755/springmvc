package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.DAO.Dao;
import com.spring.DTO.DtoImp;
import com.spring.bo.BOimp;

@Component("servi")
public class ServiceImpl {
	@Autowired
	@Qualifier("dap")
	Dao dd;
	
	public List<DtoImp> getem()
	{
	List<DtoImp> dt=new ArrayList<DtoImp>();
	List<BOimp> h=dd.getEMP();
	for(BOimp k:h)
	{
	DtoImp j=new DtoImp();
	BeanUtils.copyProperties(k, j);
  	dt.add(j);
	}
	return dt;
	}

}
