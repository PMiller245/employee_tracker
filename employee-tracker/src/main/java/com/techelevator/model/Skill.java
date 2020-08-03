package com.techelevator.model;

public class Skill {
	
	private int skillId;
	private int fieldId;
	private int experience;
	private String summary;
	
	
	
	

	public Skill(int skillId, int fieldId, int experience, String summary) {
		super();
		this.skillId = skillId;
		this.fieldId = fieldId;
		this.experience = experience;
		this.summary = summary;
	}





	public int getSkillId() {
		return skillId;
	}





	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}





	public int getFieldId() {
		return fieldId;
	}





	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}





	public int getExperience() {
		return experience;
	}





	public void setExperience(int experience) {
		this.experience = experience;
	}





	public String getSummary() {
		return summary;
	}





	public void setSummary(String summary) {
		this.summary = summary;
	}


	


	

}
