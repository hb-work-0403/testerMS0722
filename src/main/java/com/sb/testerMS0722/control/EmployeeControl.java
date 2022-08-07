package com.sb.testerMS0722.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sb.testerMS0722.db.entity.EmployeeE;
import com.sb.testerMS0722.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeControl {

	@Autowired
	EmployeeService employeeService;
	
	
    @GetMapping(path = "/getById",produces = "application/json")
	public EmployeeE getById(@RequestParam int id) {
		return employeeService.getEmployee(id);
	}

	@GetMapping(path = "/getAll",produces = "application/json")
	public List<EmployeeE> getAll() {
		return employeeService.getEmployeeAll();
	}
}