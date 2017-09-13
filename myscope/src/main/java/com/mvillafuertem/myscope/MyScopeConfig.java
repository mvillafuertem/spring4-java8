package com.mvillafuertem.myscope;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by mvillafuertem on 9/13/17.
 */
/*
    Configuración del Application Context
    por anotaciones
 */
@Configuration // = XML
@ComponentScan(basePackages = "com.mvillafuertem")
@Import({MyScopePrototypeConfig.class, MyScopeSingletonConfig.class})
public class MyScopeConfig {

}
