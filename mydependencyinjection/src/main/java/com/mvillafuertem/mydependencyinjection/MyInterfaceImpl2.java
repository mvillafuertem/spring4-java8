package com.mvillafuertem.mydependencyinjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by mvillafuertem on 9/12/17.
 */
@Component
@Qualifier("Dos")
public class MyInterfaceImpl2 implements MyInterface {
    @Override
    public void method() {

    }
}
