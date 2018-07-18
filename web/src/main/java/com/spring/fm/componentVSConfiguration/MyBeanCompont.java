package com.spring.fm.componentVSConfiguration;

import com.spring.fm.bean.Other;
import com.spring.fm.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/***
 * @Author: jiyang
 * @Date: 2018-07-18 12:40
 */
@Component
public class MyBeanCompont {

    @Bean
    public Other other(){
        return new Other ();
    }


    @Bean
    public Person person(){
        return new Person (other());
    }


    // 此时使用other() 将会返回不同的实例
    // 解决办法使用

//    @Autowired
//    private Other other;

}
