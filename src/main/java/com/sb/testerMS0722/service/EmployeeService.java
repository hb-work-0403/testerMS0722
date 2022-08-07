package com.sb.testerMS0722.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.sb.testerMS0722.db.entity.EmployeeE;
import com.sb.testerMS0722.db.repo.EmployeeRepo;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeRepo employeeRepo;
	
	public EmployeeE getEmployee(int id) {
		return employeeRepo.findById(id).get();
	}

	public List<EmployeeE> getEmployeeAll() {
		return employeeRepo.findAll();
	}
}
