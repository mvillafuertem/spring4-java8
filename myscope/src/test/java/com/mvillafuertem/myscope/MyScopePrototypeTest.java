package com.mvillafuertem.myscope;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by mvillafuertem on 9/13/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyScopeConfig.class)
//@ContextConfiguration(locations = "test-app-ctx.xml")
public class MyScopePrototypeTest implements ApplicationContextAware {

    @Autowired
    private MyScopePrototype  prototype;
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void main() {
        /*
            Comprobamos que en el application context
            se crea dos instancias distintas MyScopePrototype
         */

        assertThat(this.prototype).isNotNull();

        MyScopePrototype bean1 = applicationContext.getBean("myScopePrototype", MyScopePrototype.class);
        assertThat(bean1).isNotNull();

        MyScopePrototype bean2 = applicationContext.getBean("myScopePrototype", MyScopePrototype.class);
        assertThat(bean2).isNotNull();
        assertThat(bean1).isNotEqualTo(bean2);
    }

    @Override
    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}