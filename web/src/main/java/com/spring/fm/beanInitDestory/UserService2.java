package com.spring.fm.beanInitDestory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/***
 * @Author: jiyang
 * @Date: 2018-07-18 11:34
 */
public class UserService2 {

    public UserService2() {
        System.out.println ("user2 构造函数！");
    }

    @PostConstruct
    public void init(){
        System.out.println ("user2 init!");
    }

    @PreDestroy
    public void destory(){
        System.out.println ("user2 destory!");
    }
}
