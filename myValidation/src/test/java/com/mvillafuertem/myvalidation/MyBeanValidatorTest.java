package com.mvillafuertem.myvalidation;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.annotation.Validated;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by mvillafuertem on 9/14/17.
 */
public class MyBeanValidatorTest {

    private MyBeanValidator validator;

    @Before
    public void setUp() throws Exception {
        this.validator = new MyBeanValidator();
    }

    @Test
    public void supports() throws Exception {
        assertThat(validator.supports(MyBean.class)).isTrue();
        assertThat(validator.supports(Object.class)).isFalse();
    }

    @Test
    public void validate() throws Exception {

    }

}