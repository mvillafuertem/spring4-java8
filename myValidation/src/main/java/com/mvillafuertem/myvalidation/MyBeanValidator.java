package com.mvillafuertem.myvalidation;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by mvillafuertem on 9/14/17.
 */
public class MyBeanValidator implements Validator {

    /*
        Valida la instancia del objeto
     */
    @Override
    public boolean supports(final Class<?> clazz) {
        return MyBean.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(final Object target, final Errors errors) {
        if (StringUtils.isEmpty(target)) {
            errors.rejectValue("message", "message.empty");
        }
    }
}
