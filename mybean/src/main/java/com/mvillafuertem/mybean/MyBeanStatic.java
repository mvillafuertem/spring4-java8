package com.mvillafuertem.mybean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mvillafuertem on 9/12/17.
 */
public class MyBeanStatic {

    private static MyBeanStatic myBeanStatic = new MyBeanStatic();
    private static final Logger log = LoggerFactory.getLogger(LifeCycleMyBean.class);

    private static MyBeanStatic createStaticFactoryMethod() {
        log.debug("Retorno myBeanStaticFactoryMethod");
        return myBeanStatic;
    }

    private MyBeanStatic createStaticFactoryBean() {
        log.debug("Retorno myBeanStaticFactoryBean");
        return myBeanStatic;
    }
}
