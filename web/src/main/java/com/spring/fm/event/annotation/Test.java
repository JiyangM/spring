package com.spring.fm.event.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Author: jiyang
 * @Date: 2018-08-03 10:31
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Publisher publisher = ctx.getBean(Publisher.class);
        publisher.pushEvent();
    }

}
