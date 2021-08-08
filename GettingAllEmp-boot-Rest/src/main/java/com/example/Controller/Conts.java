package com.example.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.DTOcls;
import com.example.service.IserviceIMPL;
@Component
@RestController
@RequestMapping("serve")
public class Conts {
@Autowired
IserviceIMPL sd;
//@GetMapping("/frm")	
//public String getfrm()
//{
//return "home";
//}
@GetMapping("frm")
public String getcnt(@Param("id")int id)
{
DTOcls sds=sd.getEmp(id);
String s=sds.toString();
System.out.println(sds);
//ins.put("clm",s);
return s;
}
}

