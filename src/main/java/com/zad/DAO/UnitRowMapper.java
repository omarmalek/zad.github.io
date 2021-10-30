package com.zad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.zad.model.Unit;

public class UnitRowMapper implements RowMapper<Unit> {

	@Override
	public Unit mapRow(ResultSet rs, int arg1) throws SQLException {
		Unit unit =  new Unit();
		unit.setId(rs.getInt("id"));
		unit.setName(rs.getString("name"));
		unit.setTitle(rs.getString("title"));
		
		return unit;
	}

}
