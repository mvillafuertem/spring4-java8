package com.mvillafuertem.mymvc;

import java.io.Serializable;

/**
 * Created by mvillafuertem on 9/25/17.
 */
public class MyModel implements Serializable {

    // Mandatory
    private final Long id;
    private final String name;

    // Optional
    private final Integer phone;

    private MyModel(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.phone = builder.phone;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPhone() {
        return phone;
    }

    /*
        Implemento el patron de diseño 'Builder',
        que consiste en dar la responsabilidad de
        construcción de un Objeto semanticamente valido
        con los atributos obligatorios y añadiendo opcionales al Builder.
     */
    public static class Builder {

        // Mandatory
        private final Long id;
        private final String name;

        // Optional with default value
        private Integer phone = 0;

        public Builder(final Long id, final String name) {
            this.id = id;
            this.name = name;
        }

        public Builder phone(final Integer phone) {
            this.phone = phone;
            return this;
        }

        public MyModel build() {
            return new MyModel(this);
        }
    }
}
