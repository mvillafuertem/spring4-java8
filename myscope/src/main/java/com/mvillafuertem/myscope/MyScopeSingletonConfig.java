package com.mvillafuertem.myscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;

/**
 * Created by mvillafuertem on 9/12/17.
 */
@Configuration
public class MyScopeSingletonConfig {

    /*
        Declaración de Beans por anotaciones
    */
    @Bean(name = "myBeanSingleton")
    @Description("La declaración de @Scope el tipo por defecto es Singleton, es decir una única instancia")
    @Scope
    public MyScopeSingleton singleton() {
        return new MyScopeSingleton();
    }
}
