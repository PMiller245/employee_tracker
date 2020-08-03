package com.techelevator.model;

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
	private int addressId;
	private String assignedTo;
	
	
	public Employee(int id, String firstName, String lastName, String contactEmail, String companyEmail,
			String birthDate, String hiredDate, String role, String businessUnit, int address_id, String assignedTo) {
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
		this.addressId = address_id;
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


	public int getAddress_id() {
		return addressId;
	}


	public void setAddress_id(int address_id) {
		this.addressId = address_id;
	}


	public String getAssignedTo() {
		return assignedTo;
	}


	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	

}
