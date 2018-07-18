package com.spring.fm.beanInitDestory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Des: 场景式存证_Demo
 * @Author: jiyang
 * @Date: 2018-07-18 11:41
 */
public class Test {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext acpc = new AnnotationConfigApplicationContext (Config.class);
        AnnotationConfigApplicationContext acpc = new AnnotationConfigApplicationContext ();
        acpc.register (Config.class);
        acpc.refresh ();
        UserService1 userService1 = acpc.getBean (UserService1.class);

        UserService2 userService2 = acpc.getBean (UserService2.class);
    }
}
