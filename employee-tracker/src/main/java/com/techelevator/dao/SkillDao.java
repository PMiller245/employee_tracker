package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Skill;

public interface SkillDao {
	
	List<Skill> getSkillsForEmployee(int employeeId);
	
	Skill addSkillToEmployee(int employeeId, Skill skill);
	
	Skill findSkillByEmployeeIdAndSkillId(int employeeId, int skillId);
	
	Skill updateSkillOnEmployee(int employeeId, Skill skill);
	
	void deleteSkillFromEmployee(int employeeId, int skillId);
	
	Skill getSkillById(int skillId);

}
