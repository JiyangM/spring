package com.spring.boot;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.spring.boot.config.AuthorSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/***
 * @Author: jiyang
 * @Date: 2018-08-09 12:43
 */
@RestController
@SpringBootApplication
public class Application {

    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private AuthorSetting authorSetting;

    @RequestMapping("/")
    public String index() {
        System.out.println("name:" + bookName + " author" + bookAuthor);
        return "hello spring boot";
    }


    @RequestMapping("/setting")
    public String authSetting() {
        return authorSetting.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
