package com.zad.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configFiles = {AppConfiguration.class};
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mapping = {"/"};
		return mapping;
	}

}
