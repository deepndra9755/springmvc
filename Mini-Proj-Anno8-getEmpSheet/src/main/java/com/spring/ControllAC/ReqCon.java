package com.spring.ControllAC;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.DTO.DTOimpl;
import com.spring.model.Mode;
import com.spring.service.IService;

@Controller
public class ReqCon {
    @Autowired
    @Qualifier("serv")
	IService ij;    
//	@GetMapping("/home")
//	public String setvi(Map<String,Object> kl)
//	{
//		Mode jj=new Mode();
//		kl.put("kl",jj);
//		return "welcome";
//	}
	@GetMapping("/home")
	public String setvi(@ModelAttribute Mode joo)
	{
		
		return "welcome";
	}
	@PostMapping("/Wise")
	public String seta(@ModelAttribute Mode stfrm,Map<String,Object> map)
	{
	DTOimpl obj=new DTOimpl(); 
	
	//String uname=stfrm.getUname();
	//String pass=stfrm.getPass();
	//System.out.println("thhis user cont "+uname+"  "+pass);
	//obj.setSname(uname);
	//obj.setSpass(pass);
   // String fin=ij.Authontication(obj);	
    //map.put("resul",fin);
//	map.put("roll",stfrm.getRoll());
//	map.put("name",stfrm.getName());
//	map.put("school",stfrm.getScl());
	return "welcome";	
	}
}
