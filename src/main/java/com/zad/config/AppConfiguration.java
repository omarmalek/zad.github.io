package com.zad.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.zad")
public class AppConfiguration implements WebMvcConfigurer {
	
	@Bean
	InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	@Bean
	PasswordEncoder getPasswordEncoder() {
//		return new BCryptPasswordEncoder();
		return NoOpPasswordEncoder.getInstance();
	}
	@Bean
	 DataSource datasource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/zadfinaldb?useTimezone=true&serverTimezone=UTC");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("password");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return driverManagerDataSource;
	}
	@Bean
	public JdbcTemplate dbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource()); 
		return jdbcTemplate;
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		 registry
		 .addResourceHandler("/resources/**")
	        .addResourceLocations("/resources/");
//		registry.addResourceHandler("/css/**").addResourceLocations("/resources/css/");
//		registry.addResourceHandler("/images/**").addResourceLocations("/resources/images/");
//		registry.addResourceHandler("/scripts/**").addResourceLocations("/resources/js/");
		// registry.addResourceHandler("/fonts/**").addResourceLocations("/resources/fonts/");
		// registry.addResourceHandler("/pages/**").addResourceLocations("/resources/views/");
//		System.out.println("Resource Handlng is set.");
		// addResourceHandlers(registry);
	}
	
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver multipartResolver() {
	    CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
	    multipartResolver.setMaxUploadSize(-1);
	    return multipartResolver;
	}
	
	

}
