package com.spring.fm.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/***
 * @Author: jiyang
 * @Date: 2018-07-18 17:15
 */
@Component
public class DemoPublisher {

    @Autowired
    private ApplicationContext applicationContext;

    public void puslishEvent(String msg){
        applicationContext.publishEvent (new DemoEvent (this,msg));
    }

}
