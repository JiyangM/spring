package com.spring.fm.componentVSConfiguration;

import com.spring.fm.bean.Other;
import com.spring.fm.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Author: jiyang
 * @Date: 2018-07-18 12:18
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext (MyBeanConfig.class);

        ctx.getBean (Other.class);
        ctx.getBean (Person.class);

        String[] beanNames = ctx.getBeanDefinitionNames ();
        for (String name : beanNames) {
            System.out.println ("bean name : " + name);
        }

    }
}
