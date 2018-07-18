package com.spring.fm.beanInitDestory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/***
 * @Author: jiyang
 * @Date: 2018-07-18 11:37
 */
@Configuration
@ComponentScan("com.spring.fm.beanInitDestory")
public class Config {

    @Bean(initMethod = "init", destroyMethod = "destory")
    public UserService1 getUserService1() {
        return new UserService1 ();
    }

    @Bean
    public UserService2 getUserService2() {
        return new UserService2 ();
    }
}
