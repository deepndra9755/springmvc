package com.spring.DAO;

import java.util.List;

import com.spring.BO.BOimpl;

public interface IDAO {
	public int insertEmp(BOimpl ok);

	public List<BOimpl> retrive();

}
