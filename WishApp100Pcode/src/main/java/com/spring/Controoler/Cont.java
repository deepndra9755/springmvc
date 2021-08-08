package com.spring.Controoler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.Service.WIshGenrator;

@Controller
public class Cont {
	@Autowired
	WIshGenrator j;

@GetMapping("/home1")
public String first()
{
return "home";	
}
@GetMapping("/msg")
public String msg(Map<String,Object>o)
{
String k=j.wish();
o.put("val",k);
return "wish";	
}
}
