package com.spring.DTO;

import java.io.Serializable;

public class DTOimpl implements Serializable{
	
	String Sname;
	String Spass;
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSpass() {
		return Spass;
	}
	public void setSpass(String spass) {
		Spass = spass;
	}
	
	

	
	
}
