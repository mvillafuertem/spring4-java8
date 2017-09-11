package com.mvillafuertem.mybean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by mvillafuertem on 9/11/17.
 */
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main (String[] args) {
        /*
            Leo el ApplicationContext
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myApplicationContext.xml");

        /*
            Recupero myBean que ha creado Spring
         */
        MyBean myBean = applicationContext.getBean("myBean", MyBean.class);
        log.debug(myBean.getMessage());
        /*
            Antes de tener disponible myLifeCycleBean, puedo realizar operaciones
         */
        LifeCycleMyBean myLifeCycleBean = applicationContext.getBean("myLifeCycleBean", LifeCycleMyBean.class);
    }
}
