package com.spring.BO;

public class Boimpl {
//| id | name  | address  | city     | sallary | job  | DEPARTMENT
private int id;
private String name,address,city,job,DEPARTMENT;
private float sallary;
private int dept;

public int getDept() {
	return dept;
}
public void setDept(int dept) {
	this.dept = dept;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public String getDEPARTMENT() {
	return DEPARTMENT;
}
public void setDEPARTMENT(String dEPARTMENT) {
	DEPARTMENT = dEPARTMENT;
}
public float getSallary() {
	return sallary;
}
public void setSallary(float sallary) {
	this.sallary = sallary;
}

}
