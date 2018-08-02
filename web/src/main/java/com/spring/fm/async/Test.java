package com.spring.fm.async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.IntStream;

/***
 * @Author: jiyang
 * @Date: 2018-07-31 15:14
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CustomAsync.class);
        ctx.refresh();

        AsyncTaskService service = ctx.getBean(AsyncTaskService.class);

        IntStream.range(1,20).forEach(e -> {
            service.executeAsyncTash(e);
            service.executeAsyncTashPlus(e);
        });

    }

}
