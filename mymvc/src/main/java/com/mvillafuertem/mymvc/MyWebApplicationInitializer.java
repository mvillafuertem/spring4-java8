package com.mvillafuertem.mymvc;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * Created by mvillafuertem on 9/25/17.
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(final ServletContext servletContext) {
        ServletRegistration.Dynamic registration = servletContext.addServlet("example", new DispatcherServlet());
        registration.setLoadOnStartup(1);
        registration.addMapping("/mymvc/*");
    }
}
