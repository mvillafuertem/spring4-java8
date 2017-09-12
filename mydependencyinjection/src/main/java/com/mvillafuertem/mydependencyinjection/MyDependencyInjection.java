package com.mvillafuertem.mydependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * Created by mvillafuertem on 9/12/17.
 */
/*
    Inyección por constructor o por método setter,
    cuando una dependencia es obligatoria la inyeccón
    se realiza por 'constructor' y utilizamos la inyección
    por métodos setter o por configuración cuando son dependecias
    opcionales.
 */
@Component
public class MyDependencyInjection {

    /*
        MyDependencyInjection tiene una dependencia de MyDependency
     */
    private MyDependency myDependency;

    /*
        Inyectando una interfaz ambigua,
        indicando que implementación debe elegir
        con @Qualifier
     */
    @Autowired
    @Qualifier("Dos")
    private MyInterface myInterface;

    /*
        Podemos hacer la inyección por constructor,
        utilizará el constructor cuando instancia el
        MyDependencyInjection.
    */
    public MyDependencyInjection(final MyDependency myDependency) {
        this.myDependency = myDependency;
    }

    /*
        También podemos hacer la inyección por método setter
     */
    public void setMyDependency(final MyDependency myDependency) {
        this.myDependency = myDependency;
    }


    public MyDependency getMyDependency() {
        return myDependency;
    }

    public void setMyInterface(final MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    public MyInterface getMyInterface() {
        return myInterface;
    }
}
