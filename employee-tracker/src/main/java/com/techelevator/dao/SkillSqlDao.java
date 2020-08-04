package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.model.Field;
import com.techelevator.model.Skill;

@Component
public class SkillSqlDao implements SkillDao {
	
	private JdbcTemplate template;
	
	@Autowired
	FieldDao fieldDao;

	public SkillSqlDao(DataSource datasource) {
		this.template = new JdbcTemplate(datasource);
	}

	@Override
	public List<Skill> getSkillsForEmployee(int employeeId) {
		String sqlSkillsByEmployeeId = "SELECT skill.* FROM employee_skill JOIN skill "
				+ "ON employee_skill.skill_id = skill.skill_id"
				+ " WHERE employee_skill.employee_id = ?";
	
		SqlRowSet results = template.queryForRowSet(sqlSkillsByEmployeeId, employeeId);
		

		
		return mapResultsToSkills(results);
	}

	@Override
	public Skill addSkillToEmployee(int employeeId, Skill skill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skill findSkillByEmployeeIdAndSkillId(int employeeId, int skillId) {
		Skill skill = new Skill();
		
		String sqlSkillsByEmployeeId = "SELECT skill.* FROM employee_skill JOIN skill "
				+ "ON employee_skill.skill_id = skill.skill_id"
				+ " WHERE employee_skill.employee_id = ? AND skill.skill_id = ?";
	
		SqlRowSet results = template.queryForRowSet(sqlSkillsByEmployeeId, employeeId, skillId);
		
		if(results.next()) {
			skill = mapResultToSkill(results);
		}
		
		return skill;
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
	
	
	private Skill mapResultToSkill(SqlRowSet result) {
		
		int skillId = result.getInt("skill_id");
		int fieldId = result.getInt("field_id");
		Field field = new Field();
		field.setFieldId(fieldId);
		field = fieldDao.getFieldById(fieldId);
		int experience = result.getInt("experience");
		String summary = result.getString("summary");
		
		Skill skill = new Skill (skillId, field, experience, summary);
		
		return skill;
		
	}
	
	private List <Skill> mapResultsToSkills(SqlRowSet results){
		
		List <Skill> retrievedSkills = new ArrayList<>();
		while(results.next()) {
			retrievedSkills.add(mapResultToSkill(results));
		}
		
		return retrievedSkills;
		
	}
	
	

}
