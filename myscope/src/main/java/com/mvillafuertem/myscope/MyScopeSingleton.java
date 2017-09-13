package com.mvillafuertem.myscope;

import org.springframework.stereotype.Component;

/**
 * Created by mvillafuertem on 9/12/17.
 */
@Component
public class MyScopeSingleton {

    private String message;

    public MyScopeSingleton() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
