package com.spring.fm.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/***
 * @Author: jiyang
 * @Date: 2018-07-18 17:15
 */
@Component
public class DemoPublisher implements ApplicationEventPublisherAware{

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void appPushEvent(String msg) {
        applicationEventPublisher.publishEvent("msg");
    }

    public void puslishEvent(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

    }
}
