package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.EmployeeDao;
import com.techelevator.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	
	@Autowired
	EmployeeDao employees;
	

	
	@RequestMapping(path= "", method = RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		
		List<Employee> allEmployees = employees.getAllEmployees();
		return allEmployees;
		
	}
		
	@RequestMapping(path="/{id}", method= RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable("id") int employeeId) {
		
		return employees.getEmployeeById(employeeId);
	}
}


