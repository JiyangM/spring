package com.spring.fm.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Author: jiyang
 * @Date: 2018-07-31 12:37
 */
public class Test {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.registerBean(Config.class);
        ctx.refresh();
        AwareService awareService = ctx.getBean(AwareService.class);
        awareService.outPut();
    }

}
