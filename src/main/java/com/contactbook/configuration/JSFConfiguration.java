package com.contactbook.configuration;

import com.sun.faces.config.FacesInitializer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.HashSet;
import java.util.Set;

@Configuration
public class JSFConfiguration {

	@Bean
	public ServletRegistrationBean facesServletRegistration() {
		return new JsfServletRegistrationBean();
	}

	public class JsfServletRegistrationBean extends ServletRegistrationBean {
		public JsfServletRegistrationBean() {
			super();
		}

		@Override
		public void onStartup(ServletContext servletContext) throws ServletException {
			FacesInitializer facesInitializer = new FacesInitializer();

			Set<Class<?>> classes = new HashSet<Class<?>>();
			classes.add(JSFConfiguration.class);
			facesInitializer.onStartup(classes, servletContext);
		}
	}
}