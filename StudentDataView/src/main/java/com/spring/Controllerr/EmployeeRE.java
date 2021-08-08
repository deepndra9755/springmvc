package com.spring.Controllerr;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.DTO.DTOimpl;
import com.spring.Service.IServiceManage;
@Controller
public class EmployeeRE{
@Autowired
@Qualifier("hto")
IServiceManage obj;

@RequestMapping("home")
public String getpage()
{	
return "home";	
}
@RequestMapping("home1")
public String getpage1(Map ob1)
{	
	List<DTOimpl> pop=obj.processing();
	ob1.put("kml",pop);
return "home1";	
}
}
