package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Skill;

public class SkillSqlDao implements SkillDao {

	public SkillSqlDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Skill> getSkillsForEmployee(int employeeId) {
		String sqlSkills = "SELECT * FROM employee_skills WHERE employee_id = ?";
		return null;
	}

	@Override
	public Skill addSkillToEmployee(int employeeId, Skill skill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skill findSkillByEmployeeId(int employeeId, int skillId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skill updateSkillOnEmployee(int employeeId, Skill skill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSkillFromEmployee(int employeeId, int skillId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Skill getSkillById(int skillId) {
		// TODO Auto-generated method stub
		return null;
	}

}
