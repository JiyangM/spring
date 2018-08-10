package com.spring.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/***
 * 属性文件和类映射
 * @Author: jiyang
 * @Date: 2018-08-09 15:24
 */
@Component
@ConfigurationProperties(prefix = "author")
public class AuthorSetting {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AuthorSetting{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
