package com.spring.fm.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/***
 * @Author: jiyang
 * @Date: 2018-07-31 15:09
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTash(int i){
        System.out.println(i);
    }

    @Async
    public void executeAsyncTashPlus(int i){
        System.out.println(i);
    }
}
