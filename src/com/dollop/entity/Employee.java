package com.dollop.entity;

import java.sql.Date;

public class Employee {
	
	//define the fields
	private Integer id;
	
	private String name;
	
	private String department;
	
	private String dob;

	//setters and getters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public String getXYZ() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	public void PQR(String dob) {
		this.dob = dob;
	}
	
	//generate toString()
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", dob=" + dob + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getDepartment()=" + getDepartment() + ", getDob()="
				+ getDob() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
