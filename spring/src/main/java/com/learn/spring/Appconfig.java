package com.learn.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.learn.spring")
public class Appconfig {
   
	
	
   @Bean
   public InternalResourceViewResolver resolver()
   {
	   InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	   resolver.setPrefix("/WEB-INF/Views/");
	   resolver.setSuffix(".jsp");
	return resolver; 
   }
   
  @Bean
  public DriverManagerDataSource datasource()
  {
	  DriverManagerDataSource db = new DriverManagerDataSource();
	  db.setDriverClassName("com.mysql.cj.jdbc.Driver");
	  db.setUrl("jdbc:mysql://localhost:3308/doodle");
	  db.setUsername("root");
	  db.setPassword("root");
	  return db;  
  }
  
  @Bean
  public JdbcTemplate template()
  {
	  JdbcTemplate jdbc = new JdbcTemplate();
	  jdbc.setDataSource(datasource());
	  return jdbc;
  }
}
