package com.techelevator.model;

import java.util.List;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String contactEmail;
	private String companyEmail;
	private String birthDate;
	private String hiredDate;
	private String role;
	private String businessUnit;
	private Address address;
	private List <Skill> skills;
	private String assignedTo;
	
	
	public Employee(int id, String firstName, String lastName, String contactEmail, String companyEmail,
			String birthDate, String hiredDate, String role, String businessUnit, Address address, String assignedTo) {
		super();
		this.employeeId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactEmail = contactEmail;
		this.companyEmail = companyEmail;
		this.birthDate = birthDate;
		this.hiredDate = hiredDate;
		this.role = role;
		this.businessUnit = businessUnit;
		this.address = address;
		this.assignedTo = assignedTo;
	}


	public int getId() {
		return employeeId;
	}


	public void setId(int id) {
		this.employeeId = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getContactEmail() {
		return contactEmail;
	}


	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}


	public String getCompanyEmail() {
		return companyEmail;
	}


	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public String getHiredDate() {
		return hiredDate;
	}


	public void setHiredDate(String hiredDate) {
		this.hiredDate = hiredDate;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getBusinessUnit() {
		return businessUnit;
	}


	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(int address_id) {
		this.address = address;
	}


	public String getAssignedTo() {
		return assignedTo;
	}


	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	

}
