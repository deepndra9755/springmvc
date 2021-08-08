package com.spring.model;

public class EMP {
	//id | name  | address  | city     | sallary | job  | DEPARTMENT
private int id;
private String name;
private String address;
private String city;
private String job;
private String Department;
private float sallary;
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
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public float getSallary() {
	return sallary;
}
public void setSallary(float sallary) {
	this.sallary = sallary;
}

}
