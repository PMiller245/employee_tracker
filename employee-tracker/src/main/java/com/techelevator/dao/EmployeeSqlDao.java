package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.model.Address;
import com.techelevator.model.Employee;
import com.techelevator.model.Skill;

@Component
public class EmployeeSqlDao implements EmployeeDao {

	private JdbcTemplate template;

	@Autowired
	AddressDao addressDao;

	@Autowired
	SkillDao skillDao;

	@Autowired
	public EmployeeSqlDao(DataSource datasource) {

		this.template = new JdbcTemplate(datasource);

	}

	@Override
	public List<Employee> getAllEmployees() {
		String sqlEmployees = "SELECT * FROM employee";

		SqlRowSet results = template.queryForRowSet(sqlEmployees);

		return mapResultsToEmployees(results);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {

		Employee employee = new Employee();

		String sqlEmployeeById = "SELECT * FROM employee WHERE employee_id = ?";

		SqlRowSet results = template.queryForRowSet(sqlEmployeeById, employeeId);

		if (results.next()) {
			employee = mapResultToEmployee(results);
		}

		return employee;
	}

	//Currently returns Primary Key, should be changed to UUID
	@Override
	public Employee createEmployee(Employee employee) {

		String sqlInsertEmployee = "INSERT INTO employee (first_name, last_name, contact_email, "
				+ "company_email, birth_date, hired_date, role, business_unit,assigned_to) VALUES "
				+ "(?, ?, ?, ?, ?, ?, ?, ? , ?) RETURNING employee_id";

		int id = template.queryForObject(sqlInsertEmployee, int.class, employee.getFirstName(), employee.getLastName(),
				employee.getContactEmail(), employee.getCompanyEmail(), employee.getBirthDate(),
				employee.getHiredDate(), employee.getRole(), employee.getBusinessUnit(), employee.getAssignedTo());

		employee.setId(id);
		// TODO Auto-generated method stub
		return employee;
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
		String assignedTo = result.getString("assigned_to");

		
		// TODO optimize this function to reduce database hits
		Address address = new Address();
		address.setId(result.getInt("address_id"));
		address = addressDao.getAddressById(address.getId());

		List<Skill> skills = skillDao.getSkillsForEmployee(employeeId);

		Employee retrievedEmployee = new Employee(employeeId, firstName, lastName, contactEmail, companyEmail,
				birthDate, hiredDate, role, businessUnit, address, assignedTo, skills);
		

		return retrievedEmployee;
	}

	private List<Employee> mapResultsToEmployees(SqlRowSet results) {

		List<Employee> retrievedEmployees = new ArrayList<>();
		while (results.next()) {
			retrievedEmployees.add(mapResultToEmployee(results));
		}

		return retrievedEmployees;

	}

}
