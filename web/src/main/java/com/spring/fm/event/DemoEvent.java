package com.spring.fm.event;

import org.springframework.context.ApplicationEvent;

/***
 * @Author: jiyang
 * @Date: 2018-07-18 17:11
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source, String msg) {
        super (source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
