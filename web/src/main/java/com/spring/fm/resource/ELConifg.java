package com.spring.fm.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/***
 * @Author: jiyang
 * @Date: 2018-07-12 11:27
 */
@Configuration
@PropertySource ({"classpath:mysql.properties","classpath:psql.properties"})
@ComponentScan("com.spring.fm.resource")
public class ELConifg {


    @Autowired
    private Environment environment;

    @Value ("${psql_url}")
    private String jdbcUrl;

    @Value ("${psql_username}")
    private String jdbcName;

    @Value ("${psql_password}")
    private String jdbcPassword;

    @Bean("myDataSource1")
    public MyDataSource getMyDateSource1() {
        MyDataSource dataSource = new MyDataSource ();
        dataSource.setUrl (environment.getProperty ("url"));
        dataSource.setPassword (environment.getProperty ("username"));
        dataSource.setUsername (environment.getProperty ("password"));
        return dataSource;
    }


    @Bean("myDataSource2")
    public MyDataSource getMyDateSource2() {
        MyDataSource dataSource = new MyDataSource ();
        dataSource.setUrl (jdbcUrl);
        dataSource.setPassword (jdbcPassword);
        dataSource.setUsername (jdbcName);
        return dataSource;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
