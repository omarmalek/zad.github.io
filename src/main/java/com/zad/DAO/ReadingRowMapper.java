package com.zad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.zad.model.ReadingText;

public class ReadingRowMapper implements RowMapper<ReadingText> {

	@Override
	public ReadingText mapRow(ResultSet rs, int rowNum) throws SQLException {

		ReadingText reading = new ReadingText();
		
		reading.setId(rs.getInt("id"));
		reading.setTitle(rs.getString("title"));
		reading.setText(rs.getString("text"));
		
		//type
		reading.setType("readingtext");
		return reading;
	}

}
