package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.model.Employee;



@Component
public class EmployeeSqlDao implements EmployeeDao {
	
	private JdbcTemplate template;

	
	@Autowired
	public EmployeeSqlDao(DataSource datasource) {
	
		this.template = new JdbcTemplate (datasource);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		String sqlEmployees = "SELECT * FROM employee";
		
		SqlRowSet results = template.queryForRowSet(sqlEmployees);

		return mapResultsToEmployees(results);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		
	}
	
	private Employee mapResultToEmployee(SqlRowSet result) {
		
		int employeeId = result.getInt("employee_id");
		 String firstName = result.getString("first_name");
		String lastName = result.getString("last_name");
		 String contactEmail = result.getString("contact_email");
		String companyEmail = result.getString("company_email");
		 String birthDate = result.getString("birth_date");
		 String hiredDate = result.getString("hired_date");
		 String role = result.getString("role");
		String businessUnit = result.getString("business_unit");
		 int addressId = result.getInt("address_id");
		 String assignedTo = result.getString("assigned_to");
	
	    Employee retrievedEmployee = new Employee(employeeId, firstName,lastName, contactEmail, companyEmail,
				 birthDate,  hiredDate,  role,  businessUnit,  addressId,  assignedTo);
	    		

	    return retrievedEmployee;
	}
	
	
	private List <Employee> mapResultsToEmployees(SqlRowSet results){
		
		List <Employee> retrievedEmployees = new ArrayList<>();
		while(results.next()) {
			retrievedEmployees.add(mapResultToEmployee(results));
		}
		
		
		return retrievedEmployees;
		
	}

}
