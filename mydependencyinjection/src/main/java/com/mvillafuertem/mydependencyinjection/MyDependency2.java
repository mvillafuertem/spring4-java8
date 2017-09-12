package com.mvillafuertem.mydependencyinjection;

import org.springframework.stereotype.Component;

/**
 * Created by mvillafuertem on 9/12/17.
 */
@Component
public class MyDependency2 {

    private String message;

    public MyDependency2() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
