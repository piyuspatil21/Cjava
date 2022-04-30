package com.example.demo.controller;

import java.util.List;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

	
		@PostMapping("/departments/")
		public Department saveDepartment(@Valid @RequestBody Department department) {
		
		return departmentService.saveDepartment(department);
		}
		@GetMapping("/departments")
		public List<Department> fetchDepartmentList(){
			LOGGER.info("Inside department fetchDepartmentList");
		return departmentService.fetchDepartList();
		}
	
		@GetMapping("/departments/{id}")
		public Department fetchDepartmentById(@PathVariable("id") Long did) throws DepartmentNotFoundException {
			LOGGER.info("Inside department fetchDepartmentById");
		return departmentService.fetchDepartmentById(did);
		}
	
	//delete
		@DeleteMapping("/departments/{id}")
		public String deleteDepartmentById(@PathVariable("id") Long did) throws DepartmentNotFoundException {
			departmentService.deleteDepartmentById(did);
			return "Department deleted Successfully";
		}
		
		//update
		@PutMapping("/departments/{id}")
		public Department updateDepartment(@PathVariable("id") Long did,@RequestBody Department department) throws DepartmentNotFoundException {
			return departmentService.updateDepartment(did,department);
		}
		
		//byname
		@GetMapping("/departments/name/{name}")
		public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
			return departmentService.fetchDepartmentByName(departmentName);
		}
		
		//byaddress
				@GetMapping("/departments/address/{address}")
				public Department fetchDepartmentByAddress(@PathVariable("address") String departmentAddress) {
					return departmentService.fetchDepartmentByAddress(departmentAddress);
				}
		
		
	
	

}
