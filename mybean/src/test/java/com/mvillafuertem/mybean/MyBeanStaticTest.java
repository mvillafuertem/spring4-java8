package com.mvillafuertem.mybean;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by mvillafuertem on 9/12/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/myApplicationContextTest.xml")
public class MyBeanStaticTest {

    @Autowired
    private MyBeanStatic myBeanStatic;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void main() {
        assertThat(this.myBeanStatic).isNotNull();
    }

}