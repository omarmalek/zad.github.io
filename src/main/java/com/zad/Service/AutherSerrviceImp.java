package com.zad.Service;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.cj.jdbc.Blob;
import com.zad.DAO.AutherDAO;
import com.zad.DTO.LessonDTO;
import com.zad.DTO.PictureDTO;
import com.zad.DTO.ReadingDTO;
import com.zad.DTO.SectionDTO;
import com.zad.DTO.SubjectDTO;
import com.zad.DTO.UnitDTO;
import com.zad.DTO.VedioDTO;
import com.zad.model.Lesson;
import com.zad.model.Picture;
import com.zad.model.ReadingText;
import com.zad.model.Section;
import com.zad.model.Subject;
import com.zad.model.Unit;
import com.zad.model.Vedio;


@Service
public class AutherSerrviceImp implements AutherService {
	
	@Autowired
	AutherDAO autherDAO;
	
	@Autowired
	ReadingText readingText;
	
	@Override
	public List<Section> getSectionsList(int listenId) {
		List<Section> sectionsList = autherDAO.getSectionsList(listenId); 
		return sectionsList;
	}

	@Override
	public List<Lesson> getLessonsList(int unitId) {
		 List<Lesson> lessonList = autherDAO.getLessonsList(unitId);
		return lessonList;
	}

	@Override
	public List<Subject> getSubjectsList(int level) {
		List<Subject> subjectsList = autherDAO.getSubjectsList(level);
		return subjectsList;
	}

	@Override
	public List<Unit> getUnitsList(int subjectId) {
		List<Unit> unitsList = autherDAO.getUnitsList(subjectId);
		return unitsList;
	}

	@Override
	public void saveSubject(int level,String title, int semester,  String abrevation, String description) {
		Subject subject = new Subject();
		subject.setLevel(level);
		subject.setTitle(title);
		subject.setSemester(semester);
		subject.setDescription(description);
		
//		DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
//		String towDegitsyear = df.format(Calendar.getInstance().getTime());
//		subject.setCode(towDegitsyear + "-" + abrevation + "-" + semester);
		
		autherDAO.saveSubject( subject);
		
	}

	@Override
	public void saveUnit(UnitDTO unitDTO) {
		Unit unit = new Unit();
		unit.setSubjectId(unitDTO.getSubjectId());
		unit.setName(unitDTO.getName());
		unit.setTitle(unitDTO.getTitle());
		
		autherDAO.saveUnit(unit);
		
	}

	@Override
	public SubjectDTO getSubject(int id) {
		Subject subject = autherDAO.getSubject(id);
		SubjectDTO subjectDTO = new SubjectDTO();
		subjectDTO.setId(subject.getId());
		subjectDTO.setLevel(subject.getLevel());
		subjectDTO.setSemester(subject.getSemester());
		subjectDTO.setTitle(subject.getTitle());
		
		return subjectDTO;
	}

	@Override
	public void deleteSubject(String subjectId) {
		autherDAO.deleteSubject(subjectId);
		
	}

	@Override
	public void updateSubject(SubjectDTO subjectDTO) {
		Subject subject = new Subject();
		subject.setTitle(subjectDTO.getTitle());
		subject.setSemester(subjectDTO.getSemester());
		subject.setLevel(subjectDTO.getLevel());
		subject.setDescription(subjectDTO.getDescription());

		autherDAO.updateSubject(subject);
		
	}

	@Override
	public UnitDTO getUnit(int unitId) {
		Unit unit = autherDAO.getUnit(unitId);
		UnitDTO unitDTO = new UnitDTO();
		unitDTO.setId(unit.getId()); 
		unitDTO.setName(unit.getName());
		unitDTO.setTitle(unit.getTitle());
		return unitDTO;
	}

	@Override
	public void updateUnit(UnitDTO unitDTO) {
		Unit unit = new Unit();
		unit.setId(unitDTO.getId());
		unit.setName(unitDTO.getName());
		unit.setTitle(unitDTO.getTitle());
		
		autherDAO.updateUnit(unit);
		
	}

	@Override
	public void deleteUnit(int unitId) {
		autherDAO.deleteUnit(unitId);
		
	}

	@Override
	public LessonDTO getLesson(int lessonId) {
		LessonDTO lessonDTO = new LessonDTO();
		Lesson lesson = autherDAO.getLesson(lessonId);
		lessonDTO.setId(lesson.getId());
		lessonDTO.setUnitId(lesson.getUnitId()); //this is not needed ??
		lessonDTO.setName(lesson.getName());
		lessonDTO.setTitle(lesson.getTitle());
		return lessonDTO;
	}

	@Override
	public void updateLesson(LessonDTO lessonDTO) {
		Lesson lesson = new Lesson();
		lesson.setId(lessonDTO.getId());
		lesson.setName(lessonDTO.getName());
		lesson.setTitle(lessonDTO.getTitle());
		
		autherDAO.updateLesson(lesson);
		
	}

	@Override
	public void deleteLesson(int lessonId) {
		autherDAO.deleteLesson(lessonId);
		
	}

	@Override
	public void addLesson(LessonDTO lessonDTO) {
		Lesson lesson = new Lesson();
		lesson.setId(lessonDTO.getId());
		lesson.setUnitId(lessonDTO.getUnitId());
		lesson.setName(lessonDTO.getName());
		lesson.setTitle(lessonDTO.getTitle());
		
		autherDAO.addLesson(lesson);	
	}
	@Override
	public void deleteSection(int sectionId) {
		autherDAO.deleteSection(sectionId);
		
	}

	@Override
	public SectionDTO getSection(int sectionId) {
		Section section = autherDAO.getSection(sectionId);
		SectionDTO sec = new SectionDTO();
		sec.setId(section.getId());
		sec.setTitle(section.getTitle());
		
		return sec;
	}
	@Override
	public void updateSection(SectionDTO sectionDTO) {
		Section section = new Section();
		section.setId(sectionDTO.getId());
		section.setTitle(sectionDTO.getTitle());
		
		autherDAO.updateSection(section);	
	}
	@Override
	public void addSection(SectionDTO sectionDTO) {
		Section section = new Section();
		section.setLessonId(sectionDTO.getLessonId());
		section.setTitle(sectionDTO.getTitle());
		
		autherDAO.addSection(section);
		
	}
	@Override
	public boolean addReadingText(ReadingDTO readingDTO) {
		
		ReadingText readingText = new ReadingText(); 
		readingText.setSectionId(readingDTO.getSectionId());
		readingText.setTitle(readingDTO.getTitle());
		readingText.setText(readingDTO.getText()); 
		readingText.setDescription(readingDTO.getDescription());
		
		autherDAO.addReadingText(readingText);
		return true;
	}

	@Override
	public void addVedio(VedioDTO vedioDTO) {
		Vedio vedio = new Vedio();
		vedio.setSectionId(vedioDTO.getSectionId());
		vedio.setType(vedioDTO.getType());
		vedio.setTitle(vedioDTO.getTitle());
		vedio.setSource(vedioDTO.getSource());
		
		autherDAO.addVedio(vedio);
	}

	@Override
	public void addPicture(PictureDTO pictureDTO) {
		Picture picture = new Picture();
		picture.setSectionId(pictureDTO.getSectionId());
		picture.setTitle(pictureDTO.getTitle());
		picture.setName(pictureDTO.getName());
		picture.setContentType(pictureDTO.getContentType());
		picture.setImagebytes(pictureDTO.getImage().getBytes());
		picture.setDesc(pictureDTO.getDescription());

		autherDAO.addPicture(picture);
	}

	@Override
	public List<Object> getSectionContent(int sectionId) {

	
		List<Object> objectList = new ArrayList<Object>();
		
		List<Picture> picturesList =  autherDAO.getPicturesList(sectionId);
		objectList.addAll(picturesList);
		
		List<ReadingText> readingList = autherDAO.getReadingsList(sectionId);
		objectList.addAll(readingList);
		
		
		
		List<Vedio> vedoisList =  autherDAO.getVediosList(sectionId);
		objectList.addAll(vedoisList);
		
	
		return objectList;
	}

	@Override
	public PictureDTO getPicture(int id) {
		Picture pic = autherDAO.getPicture(id);
		PictureDTO picDTO = new PictureDTO();
		picDTO.setId(pic.getId());
		picDTO.setTitle(pic.getTitle());
		picDTO.setName(pic.getName());

		
		return picDTO;
	}

	@Override
	public void updatePicture(PictureDTO DTO) {
		Picture p = new Picture();
		p.setId(DTO.getId());
		p.setTitle(DTO.getTitle());
//		p.setImage(DTO.getImage());
		p.setDesc(DTO.getDescription());
		
		autherDAO.updatepicture(p);
		
		
	}

	@Override
	public void deletePicture(int id) {
		autherDAO.deletePicture(id);
		
	}

	@Override
	public ReadingDTO getReadingText(int id) {
		ReadingText readingText = autherDAO.getReadingTxt(id);
		ReadingDTO DTO = new ReadingDTO();
		DTO.setId(readingText.getId());
		DTO.setTitle(readingText.getTitle());
		DTO.setText(readingText.getText());
		DTO.setDescription(readingText.getDescription());
		return DTO;
	}

	@Override
	public void updateReading(ReadingDTO readingDTO) {
		ReadingText readingTxt = new ReadingText();
		readingTxt.setId(readingDTO.getId());
		readingTxt.setTitle(readingDTO.getTitle());
		readingTxt.setText(readingDTO.getText());
		readingTxt.setDescription(readingDTO.getDescription());
		
		autherDAO.updateReadingText(readingTxt);	
	}

	@Override
	public void deleteReadingText(int id) {
		autherDAO.deleteReadingText(id);
		
	}

	@Override
	public VedioDTO getVedio(int id) {
		Vedio vedio = autherDAO.getVedio(id);
		VedioDTO vedioDTO = new VedioDTO();
		vedioDTO.setId(vedio.getId());
		vedioDTO.setTitle(vedio.getTitle());
		vedioDTO.setSource(vedio.getSource());
		
		return vedioDTO;
	}

	@Override
	public void updateVedio(VedioDTO vedioDTO) {
		Vedio vedio = new Vedio();
		vedio.setId(vedioDTO.getId());
		vedio.setTitle(vedioDTO.getTitle());
		vedio.setSource(vedioDTO.getSource());
		
		autherDAO.updateVedio(vedio);

	}

	@Override
	public void deleteVedio(int id) {
		autherDAO.deleteVedio(id);
		
	}
	@Override
	public byte[] getImageAsBytes(int id) {
		byte[] imagebytes = autherDAO.getImageAsBytes(id);
		
		return imagebytes;
	}



}
