package com.spring.fm.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/***
 * @Author: jiyang
 * @Date: 2018-08-09 12:56
 */
public class PersonValidator implements Validator {

    /**
     * 只校验Person对象
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        Person p = (Person) target;
        if (p.getAge() < 0) {
            errors.rejectValue("age", "negativevalue");
        } else if (p.getAge() > 110) {
            errors.rejectValue("age", "too.darn.old");
        }
    }
}
