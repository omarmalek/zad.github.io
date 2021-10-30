package com.zad.Service;

import java.awt.Image;
import java.util.List;
import java.util.Map;

import com.zad.DTO.LessonDTO;
import com.zad.DTO.PictureDTO;
import com.zad.DTO.ReadingDTO;
import com.zad.DTO.SectionDTO;
import com.zad.DTO.SubjectDTO;
import com.zad.DTO.UnitDTO;
import com.zad.DTO.VedioDTO;
import com.zad.model.Lesson;
import com.zad.model.Section;
import com.zad.model.Subject;
import com.zad.model.Unit;

public interface AutherService {
	

	
	List<Object> getSectionContent(int sectionId);
	
	
	List<Section> getSectionsList(int listenId);
	List<Lesson> getLessonsList(int unitId);
	List <Subject> getSubjectsList(int level);
	List<Unit> getUnitsList(int subjectId);
	
	
	void addLesson(LessonDTO lessonDTO);
	void saveSubject(int level,String title,int Semester,String abrevation,String description);
	void saveUnit(UnitDTO unit);
	void addSection(SectionDTO sectionDTO);
	void addVedio(VedioDTO vedioDTO);
	boolean addReadingText(ReadingDTO readingDTO);
	void addPicture(PictureDTO pictureDTO);
	
	
	void updateSubject(SubjectDTO subjectDTO);
	void updateUnit (UnitDTO unitDTO);
	void updateLesson(LessonDTO lessonDTO);
	void updateSection(SectionDTO sectionDTO);
	
	
	SubjectDTO getSubject(int id);
	UnitDTO getUnit(int unitId);
	LessonDTO getLesson(int  lessonId);
	SectionDTO getSection(int sectionId);
	
	
	void deleteSubject (String subjectCode);
	void deleteUnit(int unitId);
	void deleteLesson(int lessonId);
	void deleteSection(int sectionId);


	PictureDTO getPicture(int id);


	void updatePicture(PictureDTO pictureDTO);


	void deletePicture(int id);


	ReadingDTO getReadingText(int id);


	void updateReading(ReadingDTO readingDTO);


	void deleteReadingText(int id);


	VedioDTO getVedio(int id);


	void updateVedio(VedioDTO vedioDTO);


	void deleteVedio(int id);


	byte[] getImageAsBytes(int id);
	
	
	
	
	
	
}
