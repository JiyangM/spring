package com.spring.fm.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/***
 * @Author: jiyang
 * @Date: 2018-07-18 17:13
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent event) {
        System.out.println ("listener 监听到消息：" + event.getMsg ());
    }
}
