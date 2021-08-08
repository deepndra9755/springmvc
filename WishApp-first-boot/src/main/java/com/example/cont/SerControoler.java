package com.example.cont;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SerControoler {

@GetMapping("/homeIN")
public String Hoee()
{
return "home";	
}
@GetMapping("/home")
public String Home(Map<String,String> ds)
{
return "cnt";	
}

}
