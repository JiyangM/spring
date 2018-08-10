package com.spring.boot.validator;

import com.spring.boot.bean.Person;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/***
 * @Author: jiyang
 * @Date: 2018-08-09 16:08
 */
@Component
public class PersonValidatior implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        Person p = (Person) o;
        if (p.getAge() < 0) {
            errors.rejectValue("age", "negativevalue");
        } else if (p.getAge() > 110) {
            errors.rejectValue("age", "too.darn.old");
        }
    }
}
