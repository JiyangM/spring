package com.spring.fm.event.annotation;

import com.spring.fm.event.DemoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/***
 * @Author: jiyang
 * @Date: 2018-08-03 10:18
 */
@Service
public class Publisher {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void pushEvent(){
        DemoEvent demoEvent = new DemoEvent(this,"foo");
        eventPublisher.publishEvent(demoEvent);
    }
}
