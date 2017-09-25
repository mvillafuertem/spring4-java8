package com.mvillafuertem.myscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

/**
 * Created by mvillafuertem on 9/13/17.
 */
@Configuration
public class MyScopePrototypeConfig {

    @Bean
    @Description("La declaración de @Scope el tipo es Singleton, es decir una única instancia")
    public MyScopePrototype prototype() {
        return new MyScopePrototype();
    }
}
