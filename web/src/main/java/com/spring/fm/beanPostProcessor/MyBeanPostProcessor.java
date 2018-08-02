package com.spring.fm.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/***
 * @Author: jiyang
 * @Date: 2018-07-10 16:31
 */
//@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    //在实例化及依赖注入完成后、在任何初始化代码（比如配置文件中的init-method）调用之前调用
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println ("== bean post process before");
        return bean;
    }

    //后者在初始化代码调用之后调用。
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println ("== bean post process after");
        return bean;
    }

}
