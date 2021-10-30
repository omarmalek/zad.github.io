package com.zad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.zad.model.Lesson;

public class LessonRowMapper implements RowMapper<Lesson> {

	@Override
	public Lesson mapRow(ResultSet rs, int rowNum) throws SQLException {
		Lesson lesson = new Lesson();
		
		lesson.setId(rs.getInt("id"));
		lesson.setUnitId(rs.getInt("unit_id"));
		lesson.setName(rs.getString("name"));
		lesson.setTitle(rs.getString("title"));
		
		
		return lesson;
	}

}
