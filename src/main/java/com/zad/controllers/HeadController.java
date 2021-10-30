package com.zad.controllers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeadController {
	
	
	@GetMapping (value= {"","/","/index","/home","/default"})
	public ModelAndView showPublic(HttpSession session){
		session.setAttribute("levelId", 4);
		
		return new ModelAndView("public","message","welcome to Spring MVC ");
	}
	int width = 963;
	int height = 640;
	@ResponseBody
	@GetMapping("/proccess")
	public String domain() {
		BufferedImage image = null; 

		image = readfromFile(width,height, image);
		
		writeToFile(image);
		
		return "ok";
	}
	private BufferedImage readfromFile(int width2, int height2, BufferedImage image) {

		File sampleFile = new File("C:\\Users\\Omar\\Desktop\\o1.jpg");
		 image = new BufferedImage(963,200,BufferedImage.TYPE_INT_ARGB);
		 try {
			  image = ImageIO.read(sampleFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}

	private void writeToFile(BufferedImage image) {
		File outPut = new File("F:\\o1.jpg");
		try {
			ImageIO.write(image, "png", outPut);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	//فكرة للسيشن
	
	@SuppressWarnings("unchecked")
	void someMethod(HttpServletRequest request){
		Map<String,Integer> locations = new Hashtable<>();
		Map<Integer,String> titles = new Hashtable<>();
		locations.put("currentSubjectId",4);
		titles.put(4, "اللغة العربية");
		locations.put("currentUnitId",5);
		locations.put("currentUnitId",5);

		request.getSession().setAttribute("locations", locations);
//		------------------------------------
		locations = (Map<String, Integer>) request.getSession().getAttribute("locations");
		int SubjectId = locations.get("currentSubjectId");
	}
}
