package com.mvillafuertem.mydependencyinjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by mvillafuertem on 9/12/17.
 */
@Component
@Qualifier("Uno")
public class MyInterfaceImpl implements MyInterface {
    @Override
    public void method() {

    }
}
