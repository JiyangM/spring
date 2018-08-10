package com.spring.boot.controller;

import com.spring.boot.bean.Person;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/***
 * @Author: jiyang
 * @Date: 2018-08-09 16:05
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/v1", method = RequestMethod.POST)
    public String index(@Valid @RequestBody Person person) {
        return person.toString();
    }

}
