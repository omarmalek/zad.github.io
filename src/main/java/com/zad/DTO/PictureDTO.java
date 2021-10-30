package com.zad.DTO;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class PictureDTO {
	
		private int id;
		private int sectionId;
		//private String type; no use
		private String title;
		private String name;
		private String contentType;
		private CommonsMultipartFile image;
		private String description;
		
		public CommonsMultipartFile getImage() {
			return image;
		}
		public void setImage(CommonsMultipartFile image) {
			this.image = image;
		}
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getSectionId() {
			return sectionId;
		}
		public void setSectionId(int sectionId) {
			this.sectionId = sectionId;
		}
		
		public String getTitle() {
			return title;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getContentType() {
			return contentType;
		}
		public void setContentType(String contentType) {
			this.contentType = contentType;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		
	
		
		
		
}
