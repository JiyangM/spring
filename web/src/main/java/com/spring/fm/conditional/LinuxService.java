package com.spring.fm.conditional;

import org.springframework.stereotype.Service;

/***
 * @Author: jiyang
 * @Date: 2018-07-31 15:51
 */
@Service
public class LinuxService implements ListService {

    @Override
    public String getCmd() {
        return "ls";
    }
}
