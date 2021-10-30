package com.zad.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zad.Service.AutherService;
import com.zad.model.Lesson;
import com.zad.model.Section;
import com.zad.model.Subject;
import com.zad.model.Unit;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private AutherService studentService;
	
	@GetMapping("/viewsubjects")
	public String viewSubjects( Model model,HttpServletRequest request) {
		int levelId =  (int) request.getSession().getAttribute("levelId");
		Object autherService;
		// should receive subject code
		// fetch subjects form db
		List<Subject> subjectsList = studentService.getSubjectsList(levelId);
		// send the sections list to view
		model.addAttribute("subjectsList", subjectsList);

	
		
		return "student/view-subjects";
	}
	
	@GetMapping("/viewunits")
	public String viewUnits(@RequestParam(value="subjectid",required = false) Integer subjectId , Model model,
	HttpServletRequest request) {
		// should receive subject code
		if(subjectId == null) {
			 subjectId =  (int) request.getSession().getAttribute("subjectId");
		}
//		
		// fetch units form db
		List<Unit> unitsList = studentService.getUnitsList(subjectId);

		String message = "";
		if (unitsList.size() == 0) {
			message = "No Units to Display";
		}

		// find last unit code
		// get new unit code

		// send the sections list to view
		model.addAttribute("unitsList", unitsList);
		model.addAttribute("message", message);
		request.getSession().setAttribute("subjectId", subjectId); //seeding
		String subjectTitle = studentService.getSubject(subjectId).getTitle();
		request.getSession().setAttribute("subjectTitle", subjectTitle); //seeding
		return "student/view-units";
	}
	@GetMapping("/viewlessons")
	public String viewLessons(@RequestParam(value="unitid",required=false) Integer unitId, Model model,HttpServletRequest request) {
		// should receive unit code
		if(unitId == null) {
			unitId = (Integer) request.getSession().getAttribute("unitId");
		}
		// fetch lessons form db
		
		List<Lesson> lessonsList = studentService.getLessonsList(unitId);
//		List<Lesson> lessonsLisst = autherService.getLessons(subjectCode); this me be an other solution

		// send the lessons list to view
		model.addAttribute("lessonList", lessonsList);
		//seeding
		request.getSession().setAttribute("unitId", unitId); //seeding
		String unitTitle = studentService.getUnit(unitId).getTitle();
		String unitName =  studentService.getUnit(unitId).getName();
		request.getSession().setAttribute("unitTitle", unitTitle); //seeding
		request.getSession().setAttribute("unitName", unitName); //seeding

		return "student/view-lessons";
	}
	@GetMapping("/viewsections")
	public String viewSections(@RequestParam(value="lessonid", required=false) Integer lessonId, Model model,HttpServletRequest request) {
		if(lessonId == null) {
			lessonId = (int) request.getSession().getAttribute("lessonId");
		}
		// should receive lesson code


		// fetch sections corresponding to subject from database
		List<Section> sectionsList = studentService.getSectionsList(lessonId);

		// send the sections list to view
		model.addAttribute("sectionsList", sectionsList);
	
		request.getSession().setAttribute("lessonId", lessonId);//seeding
		String lessonTitle = studentService.getLesson(lessonId).getTitle();
		String lessonName = studentService.getLesson(lessonId).getName();
		request.getSession().setAttribute("lessonName", lessonName); //seeding
		
		return "student/view-sections";
	}
	@GetMapping("/viewsectioncontents")
	public String viewHTMLContents(@RequestParam(value="sectionid",required = false) Integer sectionId, Model model,HttpServletRequest request) {

		// should receive section code in request ..(done)
		if(sectionId == null) {
			sectionId = (int) request.getSession().getAttribute("sectionId");
		}
		// fetch items list corresponds to the section
		List<Object> objectList = studentService.getSectionContent(sectionId);
		//sort objectList based on Order
		model.addAttribute("objectList", objectList);
		
		request.getSession().setAttribute("sectionId", sectionId);//seeding
		String sectionTitle = studentService.getSection(sectionId).getTitle();
		request.getSession().setAttribute("sectionTitle", sectionTitle); //seeding
		return "student/view-sectioncontents";
	}

}
