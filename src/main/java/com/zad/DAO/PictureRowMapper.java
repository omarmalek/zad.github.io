package com.zad.DAO;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.zad.model.Picture;

public class PictureRowMapper implements RowMapper<Picture> {

	//HttpServletResponse response = null;
	@Override
	public Picture mapRow(ResultSet rs, int arg1) throws SQLException {
		Picture picture =  new Picture();
		picture.setId(rs.getInt("id"));
		picture.setSectionId(rs.getInt("section_id"));
		picture.setTitle(rs.getString("title"));
		picture.setName(rs.getString("name"));
		picture.setContentType(rs.getString("content_type"));
		
		Blob blob = rs.getBlob("image");
		if(blob != null) {
			byte[] data = blob.getBytes(1, (int) blob.length());
			picture.setImagebytes(data);
		}
		
		
		picture.setDesc(rs.getString("description"));
		picture.setType("picture"); 
		
		return picture;
	}

}
