package com.zad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.zad.model.Vedio;

public class VedioRowMapper implements RowMapper<Vedio> {

	@Override
	public Vedio mapRow(ResultSet rs, int arg1) throws SQLException {
		Vedio vedio = new Vedio();
		vedio.setId(rs.getInt("id"));
		vedio.setTitle(rs.getString("title"));
		vedio.setSource(rs.getString("source"));
		

		// permenent
		vedio.setType("vedio");
		return vedio;
	}

}
