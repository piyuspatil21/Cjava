package com.edu;

public class Employee {
	private String ename;
	private int eid;
	private float salary;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void display() {
		System.out.println("Name="+ename);
		System.out.println("Id="+eid);
		System.out.println("Salary="+salary);
	
		
	}

}
