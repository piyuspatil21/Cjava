package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

@Entity
public class Department {
	
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.AUTO)  //autogenerated id with annotation
	private Long departmentId;
	@NotBlank(message= "Not empty")
	private String departmentName;
	@Length(max = 20,min = 5,message = "Length should be in range" )
	private String departmentAddress;
	
	public Department() {
		super();
	}
	public Department(Long  departmentId, String departmentName, String departmentAddress) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
	}
	
	
	public Long  getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long  departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	
	
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + "]";
	}
	
	

}