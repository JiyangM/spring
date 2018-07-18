package com.spring.fm.beanInitDestory;


/***
 * @Author: jiyang
 * @Date: 2018-07-18 11:32
 */
public class UserService1 {

    public UserService1() {
        System.out.println ("user1 构造函数！");
    }

    public void init(){
        System.out.println ("user1 init 初始化！");
    }

    public void destory(){
        System.out.println ("user1 desctory 销毁！");
    }
}
