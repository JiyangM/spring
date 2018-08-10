package com.spring.fm.validation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Author: jiyang
 * @Date: 2018-08-09 14:35
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Person person = ctx.getBean(Person.class);

        person.setAge(0);
        person.setName("");

    }

}
