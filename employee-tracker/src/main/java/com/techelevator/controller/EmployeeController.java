package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.EmployeeDao;
import com.techelevator.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeDao employees;
	
	@RequestMapping(path= {"/"})
	public List<Employee> getAllEmployees(){
		
		List<Employee> allEmployees = employees.getAllEmployees();
		return allEmployees;
}

}
