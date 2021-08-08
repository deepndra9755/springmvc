package com.spring.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.BO.Boimpl;
import com.spring.DAO.IStudentRetrive;
import com.spring.DAO.StudentRetrive;
import com.spring.DTO.DTOimpl;
@Service("hto")
public class IServiceImplement implements IServiceManage {
    @Autowired
    @Qualifier("gop")
    StudentRetrive iss;
    List<DTOimpl> jop;
	@Override
	public List<DTOimpl> processing() {
		// TODO Auto-generated method stub
		List<Boimpl> obj=iss.retrive();
		jop=new  ArrayList<DTOimpl>();
		for(Boimpl p:obj)
		{
		    DTOimpl pp=new DTOimpl();
		    pp.setId(p.getId());
		    pp.setJob(p.getJob());
		    pp.setName(p.getName());
		    pp.setSallary(p.getSallary());
		    pp.setDEPARTMENT(p.getDEPARTMENT());
		    pp.setAddress(p.getAddress());
		    pp.setCity(p.getCity());
		    jop.add(pp);
		}
		return jop;
	}

}
