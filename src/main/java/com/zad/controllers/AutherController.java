package com.zad.controllers;

import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.zad.DTO.LessonDTO;
import com.zad.DTO.PictureDTO;
import com.zad.DTO.ReadingDTO;
import com.zad.DTO.SectionDTO;
import com.zad.DTO.SubjectDTO;
import com.zad.DTO.UnitDTO;
import com.zad.DTO.VedioDTO;
import com.zad.Service.AutherService;
import com.zad.model.Lesson;
import com.zad.model.Section;
import com.zad.model.Subject;
import com.zad.model.Unit;

@Controller
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
		maxFileSize = 1024 * 1024 * 10, // 10 MB
		maxRequestSize = 1024 * 1024 * 100 // 100 MB
)
public class AutherController {

	@Autowired
	private AutherService autherService;

	@Autowired
	private ServletContext servletContext;

	@GetMapping("/viewsubjects")
	public String viewSubjects(Model model, HttpServletRequest request) {
		int levelid = (int) request.getSession().getAttribute("levelId");
		// should receive subject code
		// fetch subjects form db
		List<Subject> subjectsList = autherService.getSubjectsList(levelid);
		// send the sections list to view
		model.addAttribute("subjectsList", subjectsList);

		return "auther/view-subjects";
	}

	@GetMapping("/addsubject")
	public String ShowAddSubject(@ModelAttribute("subjectDTO") SubjectDTO subject) {

		return "auther/add-subject";
	}

	@PostMapping("/process-addsubject")
	public String addNewSubject(SubjectDTO subjectDTO, @RequestParam("abbrivation") String abbrivation,
			@RequestParam("semester") String semester, @RequestParam("description") String description,
			HttpServletRequest request) {
		int levelid = (int) request.getSession().getAttribute("levelId");
		// save new subject to db
		autherService.saveSubject(levelid, subjectDTO.getTitle(), Integer.parseInt(semester), abbrivation, description);

		return "redirect:/viewsubjects";
	}

	@GetMapping("/updatesubject")
	public String updateSubject(@RequestParam("subjectid") String subjectId, HttpServletRequest request,
			@ModelAttribute("subjectDTO") SubjectDTO subjectDTO, Model model) {

		subjectDTO = autherService.getSubject(Integer.parseInt(subjectId));
		System.out.println("-------------------AutherController>>>updatesubject-------------");
		System.out.println(subjectDTO.getId());
		System.out.println(subjectDTO.getLevel());
		System.out.println(subjectDTO.getSemester());
		System.out.println(subjectDTO.getTitle());
		System.out.println("-------------------updatesubject-------------");
		model.addAttribute("subjectDTO", subjectDTO);
		return "auther/update-subject";
	}

	@PostMapping("/porcess-updatesubject")
	public String processUpdateSubject(SubjectDTO subjectDTO) {

		autherService.updateSubject(subjectDTO);

		System.out.println("-------------------porcess-updatesubject-------------");
		System.out.println(subjectDTO.getTitle());

		return "redirect:/viewsubjects";
	}

	@GetMapping("/deletesubject")
	public String deleteSubject(@RequestParam("subjectid") String subjectId) {
		autherService.deleteSubject(subjectId);

		return "redirect:/viewsubjects";
	}

	@GetMapping("/viewunits")
	public String viewUnits(@RequestParam(value = "subjectid", required = false) Integer subjectId, Model model,
			@ModelAttribute("unitDTO") Unit unit, HttpServletRequest request) {
		// should receive subject code
		if (subjectId == null) {
			subjectId = (int) request.getSession().getAttribute("subjectId");
		}
//		
		// fetch units form db
		List<Unit> unitsList = autherService.getUnitsList(subjectId);

		String message = "";
		if (unitsList.size() == 0) {
			message = "No Units to Display";
		}

		// find last unit code
		// get new unit code

		// send the sections list to view
		model.addAttribute("unitsList", unitsList);
		model.addAttribute("message", message);
		request.getSession().setAttribute("subjectId", subjectId); // seeding
		String subjectTitle = autherService.getSubject(subjectId).getTitle();
		request.getSession().setAttribute("subjectTitle", subjectTitle); // seeding
		return "auther/view-units";
	}

	@GetMapping("/addunit")
	public String addUnit(@ModelAttribute("unitDTO") UnitDTO unitDTO) {

		return "auther/add-unit";
	}

	@PostMapping("/process-addunit")
	public String proccesAddUnit(UnitDTO unit, Model model, HttpServletRequest request) {
		int subjectId = (int) request.getSession().getAttribute("subjectId");
		unit.setSubjectId(subjectId);
		// save new unit to database
		autherService.saveUnit(unit);

		return "redirect:/viewunits";
	}

	@GetMapping("/updateunit")
	public String updatUnit(@RequestParam("unitid") int unitId, @ModelAttribute("unitdto") UnitDTO unitDTO,
			Model model) {
		// fetch unit form db
		unitDTO = autherService.getUnit(unitId);

		model.addAttribute("unitdto", unitDTO);
		return "auther/update-unit";
	}

	@PostMapping("/process-updateunit")
	public String processUpdateUnit(UnitDTO unitDTO) {
		autherService.updateUnit(unitDTO);

		return "redirect:/viewunits";
	}

	@GetMapping("/deleteunit")
	public String deleteUnit(@RequestParam("unitid") int unitId) {
		autherService.deleteUnit(unitId);
		return "redirect:/viewunits";
	}

	@GetMapping("/viewlessons")
	public String viewLessons(@RequestParam(value = "unitid", required = false) Integer unitId, Model model,
			HttpServletRequest request) {
		// should receive unit code
		if (unitId == null) {
			unitId = (Integer) request.getSession().getAttribute("unitId");
		}
		// fetch lessons form db
		System.out.println("unitId is: " + unitId);
		List<Lesson> lessonsList = autherService.getLessonsList(unitId);
//		List<Lesson> lessonsLisst = autherService.getLessons(subjectCode); this me be an other solution

		// send the lessons list to view
		model.addAttribute("lessonList", lessonsList);
		request.getSession().setAttribute("unitId", unitId); // seeding
		String unitTitle = autherService.getUnit(unitId).getTitle();
		String unitName = autherService.getUnit(unitId).getName();
		request.getSession().setAttribute("unitTitle", unitTitle); // seeding
		request.getSession().setAttribute("unitName", unitName); // seeding

		return "auther/view-lessons";
	}

	@GetMapping("/updatelesson")
	public String updateLesson(@RequestParam("lessonid") int lessonId, Model model,
			@ModelAttribute("lessondto") LessonDTO lessonDTO) {
		lessonDTO = autherService.getLesson(lessonId);
		model.addAttribute("lessondto", lessonDTO);
		return "auther/update-lesson";
	}

	@PostMapping("/process-updatelesson")
	public String processUpdateLesson(LessonDTO lessonDTO) {
		autherService.updateLesson(lessonDTO);
		return "redirect:/viewlessons";
	}

	@GetMapping("/deletelesson")
	public String deleteLesson(@RequestParam("lessonid") int lessonId) {
		autherService.deleteLesson(lessonId);
		return "redirect:/viewlessons";
	}

	@GetMapping("/addlesson")
	public String showAddLesson(@ModelAttribute("lessondto") LessonDTO lessonDTO) {
		return "auther/add-lesson";
	}

	@PostMapping("/process-addlesson")
	public String processAddLesson(@ModelAttribute("lessondto") LessonDTO lessonDTO, HttpServletRequest request) {
		lessonDTO.setUnitId((int) request.getSession().getAttribute("unitId"));
		autherService.addLesson(lessonDTO);
		return "redirect:/viewlessons";
	}

	@GetMapping("/viewsections")
	public String viewSections(@RequestParam(value = "lessonid", required = false) Integer lessonId, Model model,
			HttpServletRequest request) {
		if (lessonId == null) {
			lessonId = (int) request.getSession().getAttribute("lessonId");
		}

		// fetch sections corresponding to subject from database
		List<Section> sectionsList = autherService.getSectionsList(lessonId);

		// send the sections list to view
		model.addAttribute("sectionsList", sectionsList);

		request.getSession().setAttribute("lessonId", lessonId);// seeding
		String lessonTitle = autherService.getLesson(lessonId).getTitle();
		String lessonName = autherService.getLesson(lessonId).getName();
		request.getSession().setAttribute("lessonName", lessonName); // seeding
		request.getSession().setAttribute("lessonTitle", lessonTitle); // seeding
		return "auther/view-sections";
	}

	@GetMapping("/deletesection")
	public String deleteSectin(@RequestParam("sectionid") int sectionId) {
		autherService.deleteSection(sectionId);
		return "redirect:/viewsections";
	}

	@GetMapping("/updatesection")
	public String updateSection(@RequestParam("sectionid") int sectionId,
			@ModelAttribute("sectiondto") SectionDTO sectionDTO, Model model) {
		sectionDTO = autherService.getSection(sectionId);
		model.addAttribute("sectiondto", sectionDTO);
		return "auther/update-section";
	}

	@PostMapping("/process-updatesection")
	public String processUpdateSection(SectionDTO sectionDTO) {
		autherService.updateSection(sectionDTO);

		return "redirect:/viewsections";
	}

	@GetMapping("/addsection")
	public String addSection(@ModelAttribute("sectiondto") SectionDTO sectionDTO) {

		return "auther/add-section";
	}

	@PostMapping("/process-addsection")
	public String proccesAddSection(SectionDTO sectionDTO, HttpServletRequest request) {

		sectionDTO.setLessonId((int) request.getSession().getAttribute("lessonId"));

		autherService.addSection(sectionDTO);
		return "redirect:/viewsections";
	}

	@GetMapping("/viewsectioncontents")
	public String viewHTMLContents(@RequestParam(value = "sectionid", required = false) Integer sectionId, Model model,
			HttpServletRequest request) {

		// should receive section code in request or from session..(done)
		if (sectionId == null) {
			sectionId = (int) request.getSession().getAttribute("sectionId");
		}
		// fetch items list corresponds to the section
		List<Object> objectList = autherService.getSectionContent(sectionId);
		// sort objectList based on Order
		model.addAttribute("objectList", objectList);

		request.getSession().setAttribute("sectionId", sectionId);// seeding
		String sectionTitle = autherService.getSection(sectionId).getTitle();
		request.getSession().setAttribute("sectionTitle", sectionTitle); // seeding
		return "auther/view-sectioncontents";
	}

	@GetMapping("/addnewitem")
	public String addNewItem(@RequestParam("sectionid") Integer sectionId, @RequestParam("type") String itemType,
			HttpServletRequest request, Model model) {

		request.getSession().setAttribute("sectionId", sectionId);

		// make redirection with the new item_id
		switch (itemType) {
		case "readingtext":
			return "redirect:/addreading";
		case "picture":
			return "redirect:/addpicture";
		case "vedio":
			return "redirect:/addvedio";
		}

		return "addNewItem"; // when dose that happen ?

	}

	@GetMapping("/addreading")
	public String addReading(@ModelAttribute("readingdto") ReadingDTO readingDTO) {

		return "auther/add-reading";
	}

	@PostMapping("/process-addreading")
	public String processAddReading(ReadingDTO readingDTO, HttpServletRequest request, Model model) {
		readingDTO.setSectionId((int) request.getSession().getAttribute("sectionId"));

		String message = null;
		// save to database
		boolean result = autherService.addReadingText(readingDTO);
		if (result) {
			message = "Reading Text has been added successfuly to database";
		} else {
			message = "Error, failed to add Reading Text";
		}

		model.addAttribute("message", message);

		return "redirect:/viewsectioncontents";
	}

	@GetMapping("/addvedio")
	public String processAddVedio(@ModelAttribute("vediodto") VedioDTO vedioDTO) {

		return "auther/add-vedio";

	}

	@PostMapping("/process-Addvedio")
	public String processAddVedio(VedioDTO vedioDTO, HttpServletRequest request) {
		vedioDTO.setSectionId((int) request.getSession().getAttribute("sectionId"));
		// save to database
		autherService.addVedio(vedioDTO);
		// return to view the subsection
		return "redirect:/viewsectioncontents";
	}

	@GetMapping("/addpicture")
	public String processPicture(@ModelAttribute("pictureDTO") PictureDTO pictureDTO) {

		return "auther/add-picture";
	}

	@PostMapping("/process-addpicture")
	public String processAddPicture(@ModelAttribute("pictureDTO") PictureDTO pictureDTO, HttpSession session) {
		pictureDTO.setSectionId((int) session.getAttribute("sectionId"));

		CommonsMultipartFile multipartFile = pictureDTO.getImage();
		pictureDTO.setName(multipartFile.getOriginalFilename());
		pictureDTO.setContentType(multipartFile.getContentType());
		
		System.out.println("--------------------------process-addpicture---------------------------");
		System.out.println("Title: " + pictureDTO.getTitle());
		System.out.println("Desc is: " + pictureDTO.getDescription());
		
		if (multipartFile != null || !multipartFile.isEmpty()) {
			System.out.println("Size: " + multipartFile.getSize());
			System.out.println("ContentType: " + multipartFile.getContentType());
			System.out.println("Name: " + multipartFile.getName());
			System.out.println("OriginalFilename: " + multipartFile.getOriginalFilename());
			System.out.println("desc: " + multipartFile.getStorageDescription());
		}
		// save to database
		autherService.addPicture(pictureDTO);
		// return to view the subsection
		return "redirect:/viewsectioncontents";

	}

	@GetMapping("/updatepicture")
	public String updatePicture(@RequestParam("id") int id, @ModelAttribute("picturedto") PictureDTO pictureDTO,
			Model model) {
		pictureDTO = autherService.getPicture(id);
		model.addAttribute("picturedto", pictureDTO);
		return "auther/update-picture";
	}

	@PostMapping("/process-updatepicture")
	public String updatePicture(PictureDTO pictureDTO) {

		autherService.updatePicture(pictureDTO);
		return "redirect:/viewsectioncontents";
	}

//	public String fixCode(String code) {
//
//		SectionTextDTO sec = new SectionTextDTO();
//
//		String subjectText = code.substring(0, 14);
//		String sectionText = code.substring(14);
//
//		System.out.println(code);
//		System.out.println(subjectText);
//		System.out.println(sectionText);
//		int sectionNum = Integer.parseInt(sectionText);
//		sectionNum++;
//		if (sectionNum < 10) {
//			sectionText = ("0" + String.valueOf(sectionNum));
//
//		} else if (sectionNum < 100) {
//			sectionText = (String.valueOf(sectionNum));
//		} else if (sectionNum > 100)
//			sectionText = (String.valueOf("00"));
//		code = subjectText + sectionText;
//		System.out.println(code);
//		return code;
//	}
	@GetMapping("/deletepicture")
	public String deletePicture(@RequestParam("id") int Id) {
		autherService.deletePicture(Id);
		return "redirect:/viewsectioncontents";
	}

	@GetMapping("/updatereadingtext")
	public String updateReadingText(@RequestParam("id") int id, @ModelAttribute("readingtxtdto") ReadingDTO readingDTO,
			Model model) {
		readingDTO = autherService.getReadingText(id);
		model.addAttribute("readingtxtdto", readingDTO);
		return "auther/update-readingtxt";
	}

	@PostMapping("/process-updatereadingtext")
	public String updateReadingText(ReadingDTO readingDTO) {
		autherService.updateReading(readingDTO);
		return "redirect:/viewsectioncontents";
	}

	@GetMapping("/deletereadingtext")
	public String deleteReadingText(@RequestParam("id") int Id) {
		autherService.deleteReadingText(Id);
		return "redirect:/viewsectioncontents";
	}

	@GetMapping("/updatevedio")
	public String updateVedio(@RequestParam("id") int id, @ModelAttribute("vediodto") VedioDTO vedioDTO, Model model) {
		vedioDTO = autherService.getVedio(id);
		model.addAttribute("vediodto", vedioDTO);
		return "auther/update-vedio";
	}

//	
	@PostMapping("/process-updatevedio")
	public String updateVedio(VedioDTO vedioDTO) {
		autherService.updateVedio(vedioDTO);
		return "redirect:/viewsectioncontents";
	}

	@GetMapping("/deletevedio")
	public String deleteVedio(@RequestParam("id") int Id) {
		autherService.deleteVedio(Id);
		return "redirect:/viewsectioncontents";
	}

	@ResponseBody
	@GetMapping("/downloadimage")
	public void downloadimage(@RequestParam("id") int id, HttpServletRequest request,@RequestParam("name") String picName, HttpServletResponse response) {
		byte[] imageBytes = autherService.getImageAsBytes(id);

		// String imageName = request.getPathInfo().substring(1); // Returns "foo.png".
		try {
			response.getOutputStream().write(imageBytes);
			if (imageBytes != null) {

				response.setContentType(servletContext.getMimeType(picName));
//				response.setContentType("image/jpeg");
				response.setContentLength(imageBytes.length);
				response.getOutputStream().write(imageBytes);
				
			} else {
				response.sendError(HttpServletResponse.SC_NOT_FOUND); // 404.
			}

		} catch (Exception e) {
			// throw new ServletException("Something failed at SQL/DB level.", e);
		}

	}

}
