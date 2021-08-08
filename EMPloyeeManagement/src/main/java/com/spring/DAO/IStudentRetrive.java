package com.spring.DAO;

import java.util.List;

import com.spring.BO.Boimpl;
import com.spring.DTO.DTOimpl;

public interface IStudentRetrive {
public List<Boimpl> retrive();
public List<Boimpl> retrive(int id);
public int retrive(int id,String city,String add);
public List<Integer> dept();

}
