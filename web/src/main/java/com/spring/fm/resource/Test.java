package com.spring.fm.resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Author: jiyang
 * @Date: 2018-07-12 17:54
 */
public class Test {

    // 参考：https://www.boraji.com/spring-4-propertysource-annotation-example

    public static void main(String[] args) {
        // 在此处设置scan
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext ();
//        ctx.scan ("com.spring.fm.resource");
//        ctx.refresh ();
//
//        MyDataSource dataSource = ctx.getBean (MyDataSource.class);
//        System.out.println (dataSource.toString ());

        // 在ELConifg中指定 scan
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (ELConifg.class);
//        MyDataSource myDataSource = context.getBean (MyDataSource.class);
//        System.out.println (myDataSource.toString ());


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (ELConifg.class);
        MyDataSource myDataSource1 = (MyDataSource)context.getBean ("myDataSource1");
        System.out.println (myDataSource1.toString ());
        MyDataSource myDataSource2 = (MyDataSource)context.getBean ("myDataSource2");
        System.out.println (myDataSource2.toString ());
    }
}
