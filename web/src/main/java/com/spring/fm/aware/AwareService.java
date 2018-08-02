package com.spring.fm.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/***
 * spring aware 让bean获取容器的服务
 * @Author: jiyang
 * @Date: 2018-07-31 12:24
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware, EnvironmentAware,ApplicationContextAware {

    private String beanName;

    private ResourceLoader resourceLoader;

    private String environmentStr;

    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environmentStr = environment.getProperty("jdbc.password");
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void outPut() throws Exception {
        System.out.println("bean name is :" + beanName);
        Resource resource = resourceLoader.getResource("classpath:resource.txt");
        System.out.println(IOUtils.toString(resource.getInputStream()));
        System.out.println(environmentStr);

//        applicationContext.getEnvironment();
//        applicationContext.getResource();
//        applicationContext.getBean()
    }
}
