package com.zad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.zad.model.Section;

public class SectionRowMapper implements RowMapper<Section> {

	@Override
	public Section mapRow(ResultSet rs, int rowNum) throws SQLException {
		Section section = new Section();
		
		section.setId(rs.getInt("id"));
		section.setLessonId(rs.getInt("lesson_id"));
		section.setTitle(rs.getString("title"));
		
		return section;
	}

	

}
