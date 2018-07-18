package com.spring.fm.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Author: jiyang
 * @Date: 2018-07-18 17:19
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext (DemoConfig.class);

        DemoPublisher demoPublisher = ctx.getBean (DemoPublisher.class);
        demoPublisher.puslishEvent ("你好呀");
    }
}
