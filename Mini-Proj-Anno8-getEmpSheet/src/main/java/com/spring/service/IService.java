package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.DAO.UserApp;
import com.spring.DTO.DTOimpl;

public interface IService {
	
public String Authontication(DTOimpl ct);

}

