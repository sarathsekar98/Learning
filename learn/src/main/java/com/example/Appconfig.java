package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.example.controller")
@PropertySources({
	@PropertySource(value={"classpath:default.properties"},ignoreResourceNotFound=true),
	@PropertySource(value={"classpath:db.properties"},ignoreResourceNotFound=true)
})
public class Appconfig {
	
	@Value("${prefix}")
	public String prefix;
	@Value("${suffix}")
	public String suffix;
	
	@Value("${db.url}")
	public String url;
	@Value("${db.classname}")
	public String classname;
	@Value("${db.username}")
	public String username;
	@Value("${db.password}")
	public String password;
	
	
	
	@Bean
	public InternalResourceViewResolver viewresolver()
	{
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();  
	    resolver.setPrefix(prefix);
	    resolver.setSuffix(suffix);
		return resolver;
	}
	
    @Bean
    public DriverManagerDataSource datasourcebean()
    {
    	DriverManagerDataSource db = new DriverManagerDataSource();
    	db.setUrl(url);
    	db.setUsername(username);
    	db.setPassword(password);
    	db.setDriverClassName(classname);
		return db;	
    }
    
    @Bean
    public JdbcTemplate JdbcTemplate()
    {
    	JdbcTemplate jdbc= new JdbcTemplate();
    	jdbc.setDataSource(datasourcebean());
    	return jdbc;	
    }

}
