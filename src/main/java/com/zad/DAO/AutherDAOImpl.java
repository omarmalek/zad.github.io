package com.zad.DAO;

import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.aop.target.CommonsPool2TargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.mysql.cj.jdbc.Blob;
import com.zad.model.Lesson;
import com.zad.model.Picture;
import com.zad.model.ReadingText;
import com.zad.model.Section;
import com.zad.model.Subject;
import com.zad.model.Unit;
import com.zad.model.Vedio;

@Repository
public class AutherDAOImpl implements AutherDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean addReadingText(ReadingText readingText) {
		String sql = "INSERT INTO readingtext_tbl (section_id,title,text,desciption) VALUES (?,?,?,?)";
		Object[] args = { readingText.getSectionId(), readingText.getTitle(), readingText.getText(),readingText.getDescription()};
		int rowAffected = jdbcTemplate.update(sql, args);
		return (rowAffected > 0);
	}

	@Override
	public void saveSection(Section section) {
		String sql = "INSERT INTO section_tbl (id, lesson_id, title) VALUES (?,?,?)";

		Object[] args = { section.getId(), section.getLessonId(), section.getTitle() };
		System.out.println("here are the result :" + args[1]);
		jdbcTemplate.update(sql, args);
	}

	@Override
	public List<Section> getSectionsList(int lessonId) {
		String sql = "SELECT * FROM section_tbl WHERE lesson_id = ?";
		Object[] args = { lessonId };
		List<Section> sectionsList = jdbcTemplate.query(sql, args, new SectionRowMapper());

		return sectionsList;
	}

	@Override
	public List<Lesson> getLessonsList(int unitId) {
		String sql = "SELECT * FROM lesson_tbl WHERE unit_id = '" + unitId + "'";
		List<Lesson> lesssonsList = jdbcTemplate.query(sql, new LessonRowMapper());

		return lesssonsList;
	}

	@Override
	public List<Subject> getSubjectsList(int levelId) {
		String sql = "SELECT * FROM subject_tbl WHERE level_id = " + levelId;
		List<Subject> subjectsList = jdbcTemplate.query(sql, new SubjectRowMapper());
		return subjectsList;
	}

	@Override
	public void saveSubject(Subject subject) {
		String sql = "INSERT INTO subject_tbl (id, level_id, title,semester,description) VALUES (?,?,?,?,?)";
		Object[] args = { subject.getId(), subject.getLevel(), subject.getTitle(), subject.getSemester(),
				subject.getDescription() };
		jdbcTemplate.update(sql, args);
	}

	@Override // need to be maintain
	public void saveUnit(Unit unit) {
		String sql = "INSERT INTO unit_tbl (subject_id, name,title) VALUES (?,?,?)";
		Object[] args = { unit.getSubjectId(), unit.getName(), unit.getTitle() };
		jdbcTemplate.update(sql, args);

	}

	@Override
	public Subject getSubject(int subjectId) {
		String sql = "SELECT * FROM subject_tbl WHERE id = ?";
		Object[] args = { subjectId };
		Subject subject = jdbcTemplate.queryForObject(sql, args, new SubjectRowMapper());
		System.out.println(subject.getTitle());
		return subject;
	}
	@Override
	public List<Unit> getUnitsList(int subjectId) {
		String sql = "SELECT * FROM unit_tbl WHERE subject_id = ?";
		Object[] args = { subjectId };
		List<Unit> unitsList = jdbcTemplate.query(sql, args, new UnitRowMapper());
		return unitsList;
	}

	@Override
	public Unit getUnit(int unitId) {
		String sql = "SELECT * FROM unit_tbl WHERE id = ?";
		Object[] args = { unitId };
		Unit unit = jdbcTemplate.queryForObject(sql, args, new UnitRowMapper());
		return unit;
	}
	@Override
	public void deleteSubject(String subjectId) {
		String sql = "DELETE  FROM subject_tbl WHERE id = ?";
		Object[] args = { subjectId };
		jdbcTemplate.update(sql, args);
	}

	@Override
	public void updateSubject(Subject subject) {
		String sql = "UPDATE subject_tbl SET level_id=?,title=?, semester=?, description=? WHERE code=?";
		Object[] args = { subject.getLevel(), subject.getTitle(), subject.getSemester(), subject.getDescription(),
				subject.getId() };
		jdbcTemplate.update(sql, args);

	}

	

	@Override
	public void updateUnit(Unit unit) {
		String sql = "UPDATE unit_tbl SET title=?,  name=? WHERE id=?";
		Object[] args = { unit.getTitle(), unit.getName(), unit.getId() };
		jdbcTemplate.update(sql, args);
	}

	@Override
	public void deleteUnit(int unitId) {
		String sql = "DELETE  FROM unit_tbl WHERE id = ?";
		Object[] args = { unitId };
		jdbcTemplate.update(sql, args);
	}

	@Override
	public Lesson getLesson(int lessonId) {
		String sql = "SELECT * FROM lesson_tbl WHERE id = ?";
		Object[] args = { lessonId };
		Lesson lesson = jdbcTemplate.queryForObject(sql, args, new LessonRowMapper());
		return lesson;
	}

	@Override
	public void updateLesson(Lesson lesson) {
		String sql = "UPDATE lesson_tbl SET title=?,  name=? WHERE id=?";
		Object[] args = { lesson.getTitle(), lesson.getName(), lesson.getId() };
		jdbcTemplate.update(sql, args);

	}

	@Override
	public void deleteLesson(int lessonId) {
		String sql = "DELETE  FROM lesson_tbl WHERE id = ?";
		Object[] args = { lessonId };
		jdbcTemplate.update(sql, args);

	}

	@Override
	public void addLesson(Lesson lesson) {
		String sql = "INSERT INTO lesson_tbl (unit_id, name,title) VALUES (?,?,?)";
		Object[] args = { lesson.getUnitId(), lesson.getName(), lesson.getTitle() };
		jdbcTemplate.update(sql, args);

	}

	@Override
	public void deleteSection(int sectionId) {
		String sql = "DELETE  FROM section_tbl WHERE id = ?";
		Object[] args = { sectionId };
		jdbcTemplate.update(sql, args);

	}

	@Override
	public Section getSection(int sectionId) {
		String sql = "SELECT * FROM section_tbl WHERE id = ?";
		Object[] args = { sectionId };
		Section section = jdbcTemplate.queryForObject(sql, args, new SectionRowMapper());
		return section;
	}

	@Override
	public void updateSection(Section section) {
		String sql = "UPDATE section_tbl SET title=? WHERE id=?";
		Object[] args = { section.getTitle(), section.getId() };
		jdbcTemplate.update(sql, args);

	}

	@Override
	public void addSection(Section section) {
		String sql = "INSERT INTO section_tbl (lesson_id, title) VALUES (?,?)";
		Object[] args = { section.getLessonId(), section.getTitle() };
		jdbcTemplate.update(sql, args);

	}

	@Override
	public void addVedio(Vedio vedio) {
		String sql = "INSERT INTO vedio_tbl (section_id, title,source,description) VALUES (?,?,?,?)";
		Object[] args = { vedio.getSectionId(), vedio.getTitle(), vedio.getSource(),vedio.getDescription()};
		jdbcTemplate.update(sql, args);
	}

	@Override
	public void addPicture(Picture picture) {
		//CommonsMultipartFile multipart = picture.getImage();  no use
		//byte[] data = multipart.getBytes();    no use
	
		String sql = "INSERT INTO picture_tbl (section_id, title,image,name,content_type,description) VALUES (?,?,?,?,?,?)";
		
		Object[] args = { picture.getSectionId(), picture.getTitle(),picture.getImagebytes(),picture.getName(),picture.getContentType() ,picture.getDesc() };
		jdbcTemplate.update(sql, args);
	}

	@Override
	public List<Picture> getPicturesList(int sectionId) {
		String sql = "SELECT * FROM picture_tbl WHERE section_id = ? ";
		Object[] args = { sectionId };
		List<Picture> picturesList = jdbcTemplate.query(sql, args, new PictureRowMapper());
		return picturesList;
	
	}

	@Override
	public List<Vedio> getVediosList(int sectionId) {
		String sql = "SELECT * FROM vedio_tbl WHERE section_id = ?";
		Object[] args = { sectionId };
		List<Vedio> vediosList = jdbcTemplate.query(sql, args, new VedioRowMapper());
		return vediosList;
	}

	@Override
	public List<ReadingText> getReadingsList(int sectionId) {
		String sql = "SELECT * FROM readingtext_tbl WHERE section_id = ?";
		Object[] args = { sectionId };
		List<ReadingText> readingsList = jdbcTemplate.query(sql, args, new ReadingRowMapper());
		return readingsList;
	}

	@Override
	public Picture getPicture(int id) {
		String sql = "SELECT * FROM picture_tbl WHERE id = ?";// i will update this query to unchoos blob and leave it to getImage
		Object[] args = {id};
		Picture picture = jdbcTemplate.queryForObject(sql,args, new PictureRowMapper());
	
		
		return picture;
	}

	@Override
	public void updatepicture(Picture p) {
		String sql = "UPDATE picture_tbl SET title=?,source=?,description=? WHERE id=?";
		Object[] args = { p.getTitle(),p.getImagebytes(),p.getDesc(),p.getId() };
		jdbcTemplate.update(sql, args);
		
	}

	@Override
	public void deletePicture(int id) {
		String sql = "DELETE  FROM picture_tbl WHERE id = ?";
		Object[] args = { id };
		jdbcTemplate.update(sql, args);

	}

	@Override
	public ReadingText getReadingTxt(int id) {
		String sql = "SELECT * FROM readingtext_tbl WHERE id = ?";
		Object[] args = {id};
		ReadingText readingText = jdbcTemplate.queryForObject(sql,args, new ReadingRowMapper());
	
		return readingText;
	}

	@Override
	public void updateReadingText(ReadingText readingTxt) {
		String sql = "UPDATE readingtext_tbl SET title=?,text=?,description=? WHERE id=?";
		Object[] args = { readingTxt.getTitle(),readingTxt.getText(),readingTxt.getDescription(),readingTxt.getId() };
		jdbcTemplate.update(sql, args);
		
	}

	@Override
	public void deleteReadingText(int id) {
		String sql = "DELETE  FROM readingtext_tbl WHERE id = ?";
		Object[] args = { id };
		jdbcTemplate.update(sql, args);
		
	}

	@Override
	public Vedio getVedio(int id) {
		String sql = "SELECT * FROM vedio_tbl WHERE id = ?";
		Object[] args = {id};
		Vedio vedio = jdbcTemplate.queryForObject(sql,args, new VedioRowMapper());
		System.out.println("---------------->"+vedio.getTitle());
		return vedio;
		
	}

	@Override
	public void updateVedio(Vedio vedio) {
		String sql = "UPDATE vedio_tbl SET title=?,source=?,description=? WHERE id=?";
		Object[] args = { vedio.getTitle(),vedio.getSource(),vedio.getDescription(),vedio.getId() };
		jdbcTemplate.update(sql, args);
		
	}

	@Override
	public void deleteVedio(int id) {
		String sql = "DELETE  FROM vedio_tbl WHERE id = ?";
		Object[] args = { id };
		jdbcTemplate.update(sql, args);
		
	}

	@Override
	public byte[] getImageAsBytes(int id) {
		String sql = "SELECT * FROM picture_tbl WHERE id = ?";
		Object[] args = {id};
		Picture picture = jdbcTemplate.queryForObject(sql,args, new PictureRowMapper());
		if(picture.getImagebytes() == null) 
			System.out.println("no byte found");
		return picture.getImagebytes();
	}
	

}
