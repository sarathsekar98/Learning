package spring;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Appintalizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
		root.register(Appconfig.class);
		root.register(resolverconfig.class);
		ServletRegistration.Dynamic context =  servletContext.addServlet("myDispatcherServlet",new DispatcherServlet(root));
	    context.addMapping("/");
	    context.setLoadOnStartup(1);
	}

}
