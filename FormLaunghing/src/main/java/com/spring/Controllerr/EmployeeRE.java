package com.spring.Controllerr;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.DTO.DTOimpl;
@Controller
public class EmployeeRE{

@GetMapping("home")
public String laungh(@ModelAttribute("kmll")DTOimpl kp)
{
kp.setName("unknown");
return "home";	
}
@PostMapping("home")
public String pmm(@ModelAttribute("kmll")DTOimpl kp,Map mp)
{
mp.put("id",kp.getId());
mp.put("name",kp.getName());
mp.put("job",kp.getJob());
return "result";	
}


@GetMapping("sws")
public void pmm(@RequestParam("kppd")int kl)
{
System.out.println("this is hiperlink output "+kl);
}

}
