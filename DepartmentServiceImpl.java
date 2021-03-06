package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl  implements DepartmentService{
	
	@Autowired
	DepartmentRepository departmentRepository ;
	
	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}
	
	@Override
	public List<Department> fetchDepartList() {
		
		return departmentRepository.findAll();
	}
	
	@Override
	public Department fetchDepartmentById(Long did) throws DepartmentNotFoundException {
		
Optional<Department> department=departmentRepository.findById(did);
		
		if(!department.isPresent()) {
			throw new DepartmentNotFoundException("Department not available");
		}
		else 
			return department.get();
	}
	
	@Override
	public void deleteDepartmentById(Long did) throws DepartmentNotFoundException {
		Optional<Department> department=departmentRepository.findById(did);
		if(department.isPresent()) {
			departmentRepository.deleteById(did);
		}
		else {
			throw new DepartmentNotFoundException("Department not available");
	}
	}
	
	@Override
	public Department updateDepartment(Long did, Department department) throws DepartmentNotFoundException {
		if(departmentRepository.existsById(did)) {
		Department depDB=departmentRepository.findById(did).get();
		if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			depDB.setDepartmentName(department.getDepartmentName());
			
		}
		
		if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			depDB.setDepartmentAddress(department.getDepartmentAddress());
			System.out.println(department.getDepartmentAddress());
		}
		
		return departmentRepository.save(depDB);
		}
		else {
			throw new DepartmentNotFoundException("Department not found");
		}
	}
	
	@Override
	public Department fetchDepartmentByName(String departmentName) {
		
		return departmentRepository.findByDepartmentName(departmentName);
	}

	@Override
	public Department fetchDepartmentByAddress(String departmentAddress) {
		return departmentRepository.findByDepartmentAddress(departmentAddress);
	}

}
