package com.spring.cont;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DTO.DtoImp;

@Controller
public class MyCont {
@Autowired
GetMSG jop;
@RequestMapping(value = {"/home","/kemal"})
public String showHome()
{
return "welcome";	
}
@RequestMapping(value ="/HOME",method = RequestMethod.POST)
public String howHome()
{
return "welcome";
}
@RequestMapping("/Wise")
public ModelAndView getmm()
{
List<DtoImp>coun=new ArrayList<>();
for(int s=0;s<5;s++)
{
	DtoImp obj=new DtoImp();
	obj.setId(s);
	obj.setName("kaml");
	obj.setLast("hasan");
	obj.setRoll(s+100);
	coun.add(obj);
}
ModelAndView mav=new ModelAndView();
mav.addObject("val",coun);
mav.setViewName("Wise");
return  mav;

}
@RequestMapping("/homep")
public String direct()
{
	
return "redirect:Wise";
}
}
