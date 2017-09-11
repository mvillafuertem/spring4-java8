package com.mvillafuertem.mybean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by mvillafuertem on 9/11/17.
 */
public class LifeCycleMyBean implements InitializingBean {

    private static final Logger log = LoggerFactory.getLogger(LifeCycleMyBean.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        log.debug("Puedes utilizar este método antes de retornar la instancia");
    }
}
