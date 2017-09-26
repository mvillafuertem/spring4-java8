package com.mvillafuertem.mymvc;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by mvillafuertem on 9/25/17.
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(final ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(MyConfiguration.class);

        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher",
                new DispatcherServlet(webApplicationContext));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}
