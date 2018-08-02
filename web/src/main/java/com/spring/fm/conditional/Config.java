package com.spring.fm.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/***
 * @Author: jiyang
 * @Date: 2018-07-31 15:51
 */
@Configuration
@ComponentScan("com.spring.fm.conditional")
public class Config {

    @Bean
    @Conditional(WindowsCondition.class)
    ListService windowsService() {
        return new WindowsService();
    }

    @Bean
    @Conditional(LinuxConditional.class)
    ListService linuxService() {
        return new LinuxService();
    }

}
