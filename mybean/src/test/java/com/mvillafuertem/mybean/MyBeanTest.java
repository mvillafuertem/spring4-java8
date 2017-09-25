package com.mvillafuertem.mybean;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by mvillafuertem on 9/11/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/myApplicationContextTest.xml")
public class MyBeanTest {

    @Autowired
    private MyBean myBean;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getMessage() throws Exception {
    }

    @Test
    public void setMessage() throws Exception {
    }

    @Test
    public void main() {

        assertThat(this.myBean).isNotNull();
        assertThat(this.myBean.getMessage()).isNotEmpty();
        assertThat(this.myBean.getMessage()).isEqualTo("Mensaje desde myApplicationContext");
    }

}