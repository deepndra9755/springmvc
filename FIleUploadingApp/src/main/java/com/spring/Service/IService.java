package com.spring.Service;

import java.util.List;

import com.spring.BO.BOimpl;
import com.spring.DTO.DTOimpl;

public interface IService {
	public int insert(DTOimpl dd);
 public List<DTOimpl> retriveST();

}
