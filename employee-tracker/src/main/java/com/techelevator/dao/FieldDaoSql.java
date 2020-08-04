package com.techelevator.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.model.Field;

@Component
public class FieldDaoSql implements FieldDao {
	
	private JdbcTemplate template;

	public FieldDaoSql(DataSource datasource) {
		this.template = new JdbcTemplate(datasource);
	}

	@Override
	public Field getFieldById(int fieldId) {
		
		Field field = new Field();
		
		String sqlFieldById = "SELECT * FROM field WHERE field_id = ?";
		
		SqlRowSet results = template.queryForRowSet(sqlFieldById, fieldId);
		
		if(results.next()) {
			field = mapResultsToField(results);
		}
		
		return field;
	}
	
	
	private Field mapResultsToField(SqlRowSet results) {
		
		int fieldId = results.getInt("field_id");
		String name = results.getString("name");
		String type = results.getString("type");
		
		Field field = new Field(fieldId, name, type);
		
		return field;
		
	}
	
	

}
