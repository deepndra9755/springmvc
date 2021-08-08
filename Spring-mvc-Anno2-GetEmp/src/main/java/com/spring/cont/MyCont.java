package com.spring.cont;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DTO.DtoImp;
import com.spring.service.ServiceImpl;

@Controller
public class MyCont {
@Autowired
GetMSG jop;
@Autowired
@Qualifier("servi")
ServiceImpl kp;
@RequestMapping("/home")
public String showHome()
{
return "welcome";	
}

@RequestMapping("/Wise")
public ModelAndView getmm()
{

ModelAndView mav=new ModelAndView();
List<DtoImp> coun=kp.getem();
mav.addObject("val",coun);
mav.setViewName("Wise");
return  mav;

}

}
