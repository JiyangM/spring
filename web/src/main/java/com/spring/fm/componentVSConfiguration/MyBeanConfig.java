package com.spring.fm.componentVSConfiguration;

import com.spring.fm.bean.Other;
import com.spring.fm.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * @Author: jiyang
 * @Date: 2018-07-18 12:14
 */
@Configuration
public class MyBeanConfig {

    @Bean
    public Other other(){
        return new Other ();
    }


    @Bean
    public Person person(){
        return new Person (other());
    }

//    相信大多数人第一次看到上面 userInfo() 中调用 country() 时，会认为这里的 Country 和上面 @Bean 方法返回的 Country 可能不是同一个对象，因此可能会通过下面的方式来替代这种方式：
//
//    @Autowired
//    private Country country;
//
//    实际上不需要这么做（后面会给出需要这样做的场景），直接调用 country() 方法返回的是同一个实例。
//
//    下面看调用 country() 和 userInfo() 方法时的逻辑。

}
