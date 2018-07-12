package com.spring.fm.InstantiationAwareBeanPostProcessor;

import com.spring.fm.bean.Other;
import com.spring.fm.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @Des: 场景式存证_Demo
 * @Author: jiyang
 * @Date: 2018-07-12 10:48
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext ("Other.xml","ApplicationContext.xml");

        Other other = ctx.getBean (Other.class);
        other.setAge (11);
        other.setName ("other");

        Person person = ctx.getBean (Person.class);
        person.setAge (22);
        person.setName ("person");

        System.out.println (other.toString ());
        System.out.println (person.toString ());
    }
}
