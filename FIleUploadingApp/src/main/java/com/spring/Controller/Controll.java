package com.spring.Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.spring.DTO.DTOimpl;
import com.spring.Model.Modell;
import com.spring.Service.IService;

@Controller
public class Controll {
@Autowired
IService iss;
@Autowired
ServletContext sc;

@RequestMapping("/homee")
public String Home(@ModelAttribute("frmm")Modell obj)
{
	System.out.println("inside home");
    return "home";
    
}
@PostMapping("/procc")
public String upload(@ModelAttribute("frmm")Modell obj)
{
	DTOimpl po=new DTOimpl();
    String name=obj.getName();
    String last=obj.getLast();
    po.setName(name);
    po.setLast(last);
    MultipartFile kop=obj.getImage();
    ;
    try {
    
	InputStream st=kop.getInputStream();
	
	File f=new File(sc.getInitParameter("location")+kop.getOriginalFilename());
	po.setImage(sc.getInitParameter("location")+kop.getOriginalFilename());
	
	System.out.println(sc.getInitParameter("location")+kop.getName());
	OutputStream objv=new FileOutputStream(f);
	IOUtils.copy(st, objv);
	iss.insert(po);
	
	} 
    catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "home";
}
@GetMapping("/std")
public String getall(Map<String,Object> k)
{
	List<DTOimpl> dd=iss.retriveST();
	for(DTOimpl h:dd)
	{
  System.out.println("this is image"+h.getImage());	
	}
	k.put("val",dd);
	return "report";
}
@GetMapping("/imk")
public String down(@RequestParam("std")String img,HttpServletResponse req,HttpServletRequest res)
{
File obj=new File(img);
req.setContentType("application/octet-stream");
req.setHeader("Content-Disposition","attachment; filename=\"" +obj.getName()+ "\""); 
System.out.println("Controll.down()");

FileInputStream s;
try {
	s = new FileInputStream(obj);
	OutputStream os=req.getOutputStream();
	req.addHeader("Content-Disposition","attachment");

	IOUtils.copy(s, os);
	System.out.println("Controll.down()");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



return null;
}

}
