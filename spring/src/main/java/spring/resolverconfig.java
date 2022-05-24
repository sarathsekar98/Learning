package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="spring.controller")
@PropertySource(value="classpath:default.properties",ignoreResourceNotFound=true)
public class resolverconfig {

	@Autowired
	Environment env;

	@Bean
	public InternalResourceViewResolver resolver()
	{
		InternalResourceViewResolver s = new InternalResourceViewResolver();
		s.setPrefix(env.getProperty("prefix"));
		s.setSuffix(env.getProperty("suffix"));
		return s;
	}
}
