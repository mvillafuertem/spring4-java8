package com.mvillafuertem.mybean;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

/**
 * Created by mvillafuertem on 9/11/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/myApplicationContextTest.xml")
public class LifeCycleMyBeanTest {

    @Autowired
    private LifeCycleMyBean lifeCycleMyBean;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void afterPropertiesSet() throws Exception {
    }

    @Test
    public void main() {

        assertThat(this.lifeCycleMyBean).isNotNull();
    }

}