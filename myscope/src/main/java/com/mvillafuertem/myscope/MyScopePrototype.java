package com.mvillafuertem.myscope;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by mvillafuertem on 9/13/17.
 */
@Component
@Scope("prototype")
public class MyScopePrototype {

    private String message;

    public MyScopePrototype() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
