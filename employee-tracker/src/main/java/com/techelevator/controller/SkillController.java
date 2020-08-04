package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.EmployeeDao;
import com.techelevator.dao.SkillDao;
import com.techelevator.model.Skill;

@RestController
@CrossOrigin
public class SkillController {
	
	@Autowired
	EmployeeDao employees;
	
	@Autowired
	SkillDao skills;

	
	@RequestMapping(path="/employees/{employeeId}/skills", method = RequestMethod.GET)
	public List<Skill> getSkillsByEmployee(@PathVariable int employeeId){
		
		return skills.getSkillsForEmployee(employeeId);
		
	}
	
	@RequestMapping(path="/employees/{employeeId}/skills/{skillId}", method = RequestMethod.GET)
	public Skill getSkillsByEmployee(@PathVariable("employeeId") int employeeId, @PathVariable("skillId") int skillId){
		
		return skills.findSkillByEmployeeIdAndSkillId(employeeId, skillId);
		
	}

}
