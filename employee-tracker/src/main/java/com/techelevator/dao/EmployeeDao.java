package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Employee;

public interface EmployeeDao {
	
	List <Employee> getAllEmployees();
	
	Employee getEmployeeById(int employeeId); //TODO exception, employee not found
	
	Employee createEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee);  //TODO exception, employee not found
	
	void deleteEmployee(int employeeId); //TODO exception, employee not found
	
	

}
