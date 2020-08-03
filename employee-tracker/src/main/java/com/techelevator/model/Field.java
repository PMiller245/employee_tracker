package com.techelevator.model;

public class Field {
	
	
	private int fieldId;
	private String name;
	private String type;
	
	public Field(int fieldId, String name, String type) {
		super();
		this.fieldId = fieldId;
		this.name = name;
		this.type = type;
	}

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

	
}
