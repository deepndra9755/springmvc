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

Locale[] valess=jop.msgRead();
List<String> loc=new ArrayList<String>();
for(Locale g:valess)
{
loc.add(g.getDisplayCountry());
}

ModelAndView mop=new ModelAndView();
mop.addObject("val",loc);

return  mop;

}
@RequestMapping("/homep")
public String direct()
{
	
return "redirect:Wise";
}
}
