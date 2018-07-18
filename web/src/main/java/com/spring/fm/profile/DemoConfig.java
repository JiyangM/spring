package com.spring.fm.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/***
 * @Author: jiyang
 * @Date: 2018-07-18 12:50
 */
@Configuration
public class DemoConfig {

    @Bean
    @Profile("dev")
    public DemoBean demoBeanDev() {
        return new DemoBean ("from dev");
    }

    @Bean
    @Profile("www")
    public DemoBean demoBeanWWW() {
        return new DemoBean ("from www");
    }
}
