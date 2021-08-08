package com.spring.BO;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class BOimpl {

	private String name;
	private String last;
	String image;
	public String getName() {
		return name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
	
	

}
