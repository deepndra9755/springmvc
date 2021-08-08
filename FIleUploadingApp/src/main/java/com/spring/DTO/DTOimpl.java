package com.spring.DTO;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class DTOimpl {
	
	private String name;
	private String last;
	private String image;
	public String getImage() {
		return image;
	}
	private Date dt;
	String ent;
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	
	public Date getDt() {
		return dt;
	}
	public void setDt(Date dt) {
		this.dt = dt;
	}
	public String getEnt() {
		return ent;
	}
	public void setEnt(String ent) {
		this.ent = ent;
	}
	

}
