package com.zad.controllers;


import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.zad.models.User;

@Controller
public class MainController {

	
	
	@GetMapping("/upload")
	public String showUploadPage(@ModelAttribute("userdto") User userDTO) {
		
		return "upload-page";
	}
	@PostMapping("/uploadimage")
	public String proccessUpladImage(@ModelAttribute("userdto") User userDTO,Model model) {
		String name = userDTO.getUserName();
		CommonsMultipartFile file = userDTO.getImage();
		
		System.out.println(name);
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		
		model.addAttribute("userDTO",userDTO);
		model.addAttribute("size",file.getSize());
		model.addAttribute("originalFilename",file.getOriginalFilename());
		return "success";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping({"/","afterpayment"})
//	public String start() {
//		return "index";
//	}
//
//	@PostMapping("/processBuy")
//	
//	public String processBuy(@RequestParam("formtotal") String formtotal,Model model) {
//		
//		
//		model.addAttribute("cost",formtotal);
//		return "payment";
//	}
//	@GetMapping("/upload")
//	public String showUploadPage(@ModelAttribute("userdto") User userDTO) {
//		
//		return "upload-page";
//	}
//	@PostMapping("/uploadimage")
//	public String proccessUpladImage(@ModelAttribute("userdto") User userDTO,Model model) {
//		String name = userDTO.getUserName();
//		CommonsMultipartFile file = userDTO.getImage();
//		
//		System.out.println(name);
//		System.out.println(file.getSize());
//		System.out.println(file.getName());
//		System.out.println(file.getOriginalFilename());
//		
//		model.addAttribute("userDTO",userDTO);
//		model.addAttribute("size",file.getSize());
//		model.addAttribute("originalFilename",file.getOriginalFilename());
//		return "success";
//	}
	
	
	
//	
//	@PostMapping("/uploadfile")
//	public String proccessUploadPage(@RequestParam("imagefile") CommonsMultipartFile file,@RequestParam("name") String name) {
//		
//		System.out.println(name);
//		System.out.println(file.getSize());
//		System.out.println(file.getName());
//		System.out.println(file.getOriginalFilename());
//		String path = "e:\\new image\\" + file.getOriginalFilename();
//		try {
//			file.transferTo(new File(path));
//		} catch (IllegalStateException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return "success";
//		
//	}
}