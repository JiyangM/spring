package com.spring.fm.conditional;

import org.springframework.stereotype.Service;

/***
 * @Author: jiyang
 * @Date: 2018-07-31 15:50
 */
@Service
public class WindowsService implements ListService{

    @Override
    public String getCmd() {
        return "dir";
    }
}
