package com.spring.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.BO.BOimpl;
import com.spring.DAO.IDAO;
import com.spring.DTO.DTOimpl;
@Service
public class ServiceImpl implements IService {
    @Autowired
   IDAO obk;
    List<DTOimpl> lop=new ArrayList<DTOimpl>();
	@Override
	public int insert(DTOimpl dd) {
		System.out.println(dd.getName()+""+dd.getLast()+""+dd.getImage());
		BOimpl objj=new BOimpl();
		BeanUtils.copyProperties(dd,objj);
		// TODO Auto-generated method stub
		return obk.insertEmp(objj);
	}
	@Override
	public List<DTOimpl> retriveST() {
		// TODO Auto-generated method stub
		List<BOimpl> kop=obk.retrive();
		for(BOimpl g:kop)
		{
		  DTOimpl obd=new DTOimpl();
		  BeanUtils.copyProperties(g, obd);
		  lop.add(obd);
		}
		return lop;
		
	}

}
