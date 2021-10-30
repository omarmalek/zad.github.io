package com.zad.controllers;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsefulCode {
	

	@GetMapping ("/gotest")
	public String showPublic(){
		
		
		return "test";
	}
	
	
	@PostMapping("/testupload")
	public String uploadFile(@RequestParam("discription") String description,@RequestParam("file") MultipartFile file,HttpServletRequest request,Model model) {
		
		//file handling to upload it in the server path
		if(!file.isEmpty())
		{
			try {
				String relativeWebPath="/resources";
				String absolutFilePath = request.getServletContext().getRealPath(relativeWebPath);
				System.out.println("Location: " + absolutFilePath);
				byte[] bytes = file.getBytes();
				File dir = new File(absolutFilePath);
				if(!dir.exists()) {
					dir.mkdir();
				}
				File uploadFile = new File(dir.getAbsolutePath() + File.separator + file.getOriginalFilename());
				BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
				outputStream.write(bytes);
				outputStream.close();
				model.addAttribute("uploadMessge","File Uplaoded Successfully, File Name: " + file.getOriginalFilename() 
				+ ", Description: " + description  );
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return "success";
	}
	@GetMapping ("/test-css")
	public String testCss(){
		
		
		return "test-css";
	}

}
