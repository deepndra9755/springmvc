package com.spring.ControllAC;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Mode;

@Controller
public class ReqCon {
    
//	@GetMapping("/home")
//	public String setvi(Map<String,Object> kl)
//	{
//		Mode jj=new Mode();
//		kl.put("kl",jj);
//		return "welcome";
//	}
	@GetMapping("/home")
	public String setvi(@ModelAttribute("jop") Mode joo)
	{
		return "welcome";
	}
	@PostMapping("/home")
	public String seta(@ModelAttribute("stfrm")Mode stfrm,Map<String,Object> map)
	{
	map.put("id",stfrm.getId());
	map.put("roll",stfrm.getRoll());
	map.put("name",stfrm.getName());
	map.put("school",stfrm.getScl());
	return "result";	
	}
}
