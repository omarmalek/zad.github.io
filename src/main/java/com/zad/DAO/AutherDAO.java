package com.zad.DAO;

import java.util.List;
import com.zad.model.Lesson;
import com.zad.model.Picture;
import com.zad.model.ReadingText;
import com.zad.model.Section;
import com.zad.model.Subject;
import com.zad.model.Unit;
import com.zad.model.Vedio;


public interface AutherDAO {
	boolean addReadingText(ReadingText readingText);
	void saveSection(Section section);
	List<Section> getSectionsList(int lessonId);
	List<Lesson> getLessonsList(int unitId);
	List<Subject> getSubjectsList(int level);
	List<Unit> getUnitsList(int subjectId);
	void saveSubject(Subject subject);
	void saveUnit(Unit unit);
	Subject getSubject(int id);
	void deleteSubject (String subjectCode);
	void updateSubject(Subject subject);
	Unit  getUnit(int unitId);
	void updateUnit(Unit unit);
	void deleteUnit(int unitId);
	Lesson getLesson(int lessonId);
	void updateLesson(Lesson lesson);
	void deleteLesson(int lessonId);
	void addLesson(Lesson lesson);
	void deleteSection(int sectionId);
	Section getSection(int sectionId);
	void updateSection(Section section);
	void addSection(Section section);
	void addVedio(Vedio vedio);
	void addPicture(Picture picture);
	Picture getPicture(int id);
	
	
	List<Picture> getPicturesList(int sectionId);
	List<Vedio> getVediosList(int sectionId);
	List<ReadingText> getReadingsList(int sectionId);
	void updatepicture(Picture p);
	void deletePicture(int id);
	ReadingText getReadingTxt(int id);
	void updateReadingText(ReadingText readingTxt);
	void deleteReadingText(int id);
	Vedio getVedio(int id);
	void updateVedio(Vedio vedio);
	void deleteVedio(int id);
	byte[] getImageAsBytes(int id);
}
