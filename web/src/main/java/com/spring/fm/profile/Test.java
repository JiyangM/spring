package com.spring.fm.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Author: jiyang
 * @Date: 2018-07-18 12:53
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext ();
//        ctx.getEnvironment ().setActiveProfiles ("dev");
//        ctx.getEnvironment ().setActiveProfiles ("www");
        ctx.scan ("com.spring.fm.profile");
        ctx.register (DemoConfig.class);
        ctx.refresh ();

        DemoBean demoBean = ctx.getBean (DemoBean.class);
        System.out.println (demoBean.toString ());
    }
}
