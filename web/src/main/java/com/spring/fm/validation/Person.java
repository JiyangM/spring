package com.spring.fm.validation;

import org.springframework.stereotype.Component;

/***
 * @Author: jiyang
 * @Date: 2018-08-09 12:55
 */
@Component
public class Person {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
