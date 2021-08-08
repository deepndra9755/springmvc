package com.example.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Civil;
import com.example.Reposis.MyEmpRepos;
import com.example.dto.DTOcls;

@Service
public class IServiceImpl implements IService {

	@Autowired
	MyEmpRepos objRp;
	@Override
	public int EmpInserting(DTOcls sd) {
		// TODO Auto-generated method stub
		Civil s=new Civil();
		BeanUtils.copyProperties(sd, s);
		Civil ss=objRp.save(s);
		if(ss.getId()!=0)
		return ss.getId();
		else
		return 0;
	}

}
