package com.techelevator.model;

public class Address {

	private int addressId;
	private String street;
	private String suite;
	private String city;
	private String region;
	private String postal;
	private String country;
	
	
	public Address(int id, String street, String suite, String city, String region, String postal, String country) {
		super();
		this.addressId = id;
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.region = region;
		this.postal = postal;
		this.country = country;
	}
	
	public Address() {
		
		this.street = "";
		this.suite = "";
		this.city = "";
		this.region = "";
		this.postal = "";
		this.country = "";
	}
	



	public int getId() {
		return addressId;
	}


	public void setId(int id) {
		this.addressId = id;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getSuite() {
		return suite;
	}


	public void setSuite(String suite) {
		this.suite = suite;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getPostal() {
		return postal;
	}


	public void setPostal(String postal) {
		this.postal = postal;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	

}
