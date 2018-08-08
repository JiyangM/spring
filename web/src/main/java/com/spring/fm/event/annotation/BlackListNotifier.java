package com.spring.fm.event.annotation;

import com.spring.fm.event.DemoEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/***
 * 注解式 事务监听
 * @Author: jiyang
 * @Date: 2018-08-03 10:13
 */
@Component
public class BlackListNotifier {

    /**
     * 根据请求参数 监听事件
     */
//    @EventListener
//    public void listerEvent(DemoEvent demoEvent) {
//        System.out.println("@EventListener 注解 listener DemoEvent");
//    }
//
//    /**
//     * 监听多个事件
//     */
//    @EventListener({ContextStartedEvent.class, ContextRefreshedEvent.class})
//    public void listenerManyEvent() {
//
//    }

    /**
     * 根据spel 根据条件监听
     * 当DemoEvent 的属性msg是foo时监听
     */
    @EventListener(condition = "event.msg=='foo'")
    public void listenerCondition(DemoEvent event) {
        System.out.println("@EventListener 注解 listener condition DemoEvent: " + event.getMsg());
    }
}
