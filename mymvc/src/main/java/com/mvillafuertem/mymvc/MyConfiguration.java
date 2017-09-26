package com.mvillafuertem.mymvc;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by mvillafuertem on 9/26/17.
 */
@Configuration
@EnableWebMvc
@ComponentScan( basePackageClasses = {MyController.class})
public class MyConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

        final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        // Formatea la vista del json
        converter.setPrettyPrint(true);
        // Quita nulos del json
        converter.getObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
        converters.add(converter);
    }
}
