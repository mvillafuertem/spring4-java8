package com.mvillafuertem.mydependencyinjection;

import org.springframework.stereotype.Component;

/**
 * Created by mvillafuertem on 9/12/17.
 */
@Component
public class MyDependency {

    private String message;
    private MyDependency2 myDependency2;

    public MyDependency(final MyDependency2 myDependency2) {
        this.myDependency2 = myDependency2;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public MyDependency2 getMyDependency2() {
        return myDependency2;
    }
}
