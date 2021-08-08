package com.example.Controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Civil;
import com.example.Service.IServiceImpl;
import com.example.dto.DTOcls;

@Controller
public class Contss {
@Autowired
IServiceImpl is;
@GetMapping("/index")
public String insertHome(@ModelAttribute("obj")Civil obj)
{	
return "home";	
}
//sub
@PostMapping("/sub")
public String insertForm(@ModelAttribute("obj")Civil obj)
{	
	
	DTOcls ss=new DTOcls();
BeanUtils.copyProperties(obj,ss);
int d=is.EmpInserting(ss);
if(d>0)
{
	obj.setRes("inserted");
return "home";
}
obj.setRes(" not insertet");
return "home";	
}
}

