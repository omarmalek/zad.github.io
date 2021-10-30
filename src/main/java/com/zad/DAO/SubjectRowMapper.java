package com.zad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.zad.model.Subject;

public class SubjectRowMapper implements RowMapper<Subject> {

	@Override
	public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
		Subject subject = new Subject();
		
		subject.setId(rs.getInt("id"));
		subject.setLevel(rs.getInt("level_id"));
		subject.setTitle(rs.getString("title"));
		subject.setSemester(rs.getInt("semester"));
		
		return subject;
	}

}
