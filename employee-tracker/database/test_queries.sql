SELECT s.*
        FROM employee_skill
        JOIN skill AS s
                ON employee_skill.skill_id = s.skill_id
                WHERE employee_skill.employee_id = 1;
                
                
SELECT skill.* FROM employee_skill JOIN skill 
			ON employee_skill.skill_id = skill.skill_id
			WHERE employee_skill.employee_id = 1;
			
			                
SELECT skill.* FROM employee_skill JOIN skill 
			ON employee_skill.skill_id = skill.skill_id
			WHERE employee_skill.employee_id = 1 AND skill.skill_id = 1;