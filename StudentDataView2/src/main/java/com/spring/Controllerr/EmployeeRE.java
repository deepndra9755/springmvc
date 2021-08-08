package com.spring.Controllerr;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.DTO.DTOimpl;
import com.spring.Service.IServiceManage;
import com.spring.model.EmpDetails;
@Controller
public class EmployeeRE{
	@Autowired
	ServletContext context;
@Autowired
@Qualifier("hto")

IServiceManage obj;

@RequestMapping("home")
public String getpage()
{	
return "home";	
}

@PostMapping("regis")
public String update(@ModelAttribute("sbn")DTOimpl jj)
{
	String ct=jj.getCity();
	System.out.println("before "+ct);
	String add=jj.getAddress();
	System.out.println("before add"+add);
	int id=jj.getId();
	 int vals=obj.update(id,ct,add);
     context.setAttribute("val",vals);
	
	
	 return "redirect:home1";
	
}

@GetMapping("hand")
public String editer(@ModelAttribute("sbn")DTOimpl pi,@RequestParam("id")int id)
{
System.out.println("this is request param value"+id);
DTOimpl opo=obj.processing(id);
//m2.put("id",opo.getid());
//m2.put("name",opo.getname());
pi.setId(opo.getId());
pi.setName(opo.getName());
pi.setAddress(opo.getAddress());
pi.setCity(opo.getCity());
pi.setDEPARTMENT(opo.getDEPARTMENT());
pi.setJob(opo.getJob());
return "hand";	
}
@RequestMapping("home1")
public String getpage1(Map ob1)
{	
	List<DTOimpl> pop=obj.processing();
	ob1.put("kml",pop);
	ob1.put("val",context.getAttribute("val"));
return "home1";	
}
}
