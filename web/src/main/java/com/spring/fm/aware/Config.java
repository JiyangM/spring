package com.spring.fm.aware;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/***
 * @Author: jiyang
 * @Date: 2018-07-31 12:37
 */
@Configuration
@ComponentScan("com.spring.fm.aware")
@PropertySource({"classpath:mysql.properties","classpath:psql.properties"})
public class Config {

}
