package com.spring.fm.InstantiationAwareBeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.beans.PropertyDescriptor;

/***
 * @Des: 场景式存证_Demo
 * @Author: jiyang
 * @Date: 2018-07-12 10:44
 */
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    // postProcessBeforeInstantiation方法的作用在目标对象被实例化之前调用的方法，可以返回目标实例的一个代理用来代替目标实例
    // beanClass参数表示目标对象的类型，beanName是目标实例在Spring容器中的name
    // 返回值类型是Object，如果返回的是非null对象，接下来除了postProcessAfterInitialization方法会被执行以外，其它bean构造的那些方法都不再执行。
    // 否则那些过程以及postProcessAfterInitialization方法都会执行
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println ("InstantiationAwareBeanPostProcessor postProcessBeforeInstantiation");
        return null;
    }


    // postProcessAfterInstantiation方法的作用在目标对象被实例化之后并且在属性值被populate之前调用
    // bean参数是目标实例(这个时候目标对象已经被实例化但是该实例的属性还没有被设置)，beanName是目标实例在Spring容器中的name
    // 返回值是boolean类型，如果返回true，目标实例内部的返回值会被populate，否则populate这个过程会被忽视
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println ("InstantiationAwareBeanPostProcessor postProcessAfterInstantiation");
        return false;
    }


    // postProcessPropertyValues方法的作用在属性中被设置到目标实例之前调用，可以修改属性的设置
    // pvs参数表示参数属性值(从BeanDefinition中获取)，pds代表参数的描述信息(比如参数名，类型等描述信息)，bean参数是目标实例，beanName是目标实例在Spring容器中的name
    // 返回值是PropertyValues，可以使用一个全新的PropertyValues代替原先的PropertyValues用来覆盖属性设置或者直接在参数pvs上修改。如果返回值是null，那么会忽略属性设置这个过程(所有属性不论使用什么注解，最后都是null)
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println ("InstantiationAwareBeanPostProcessor postProcessPropertyValues");
        return null;
    }
}
