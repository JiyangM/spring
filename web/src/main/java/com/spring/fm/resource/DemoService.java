package com.spring.fm.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/***
 * @Author: jiyang
 * @Date: 2018-07-12 11:29
 */
@Service
public class DemoService {

    @Value ("注入字符串")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
