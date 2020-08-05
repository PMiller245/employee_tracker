package com.techelevator.dao;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.transaction.annotation.Transactional;

import com.techelevator.model.Employee;

@SpringBootTest
@Transactional
class EmployeeSqlDaoTest {

	private static SingleConnectionDataSource dataSource;

	
	@Autowired
	private EmployeeSqlDao dao;
	
	
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/employee-tracker");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		dataSource.setAutoCommit(false);
		
		
	}
	
	@Before
	public void setup() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);		

	}
	
	
	@After
	public void rollback() throws SQLException {
		
		dataSource.getConnection().rollback();
	}
	
	@AfterClass
	public static void closeDataSource() {
		dataSource.destroy();
	}

//	public static void resetEmployePk() {
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//		jdbcTemplate.execute("SELECT pg_catalog.setval(pg_get_serial_sequence('employee', 'employee_id'), MAX(employee_id)) FROM employee");
//	}
	
	@Test
	public void create_employee_no_address_no_skills_no_id_return_id() {
		
		Employee testEmployee = new Employee("test" ,"test last name", "test@test.gmail", "peter.miller@perficient.com", "1/1/1980", "1/1/2010", "Jr Dev", "Sales",  "Dave");
		Employee createdEmployee = dao.createEmployee(testEmployee);
		
		int createdId = createdEmployee.getId();
		System.out.println("THE CREATED ID WAS :" + createdId);

		assertTrue(createdId > 0);
		
		
		
				
	}
	
	
}
