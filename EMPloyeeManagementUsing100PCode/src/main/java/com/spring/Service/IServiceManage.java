package com.spring.Service;

import java.util.List;

import com.spring.DTO.DTOimpl;

public interface IServiceManage {
	public List<DTOimpl> processing();
	public DTOimpl processing(int id);
	public int update(int id,String city,String address);
	public List<Integer> depts();
	
}
