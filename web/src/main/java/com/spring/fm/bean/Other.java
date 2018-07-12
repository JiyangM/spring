package com.spring.fm.bean;

/***
 * @Des: 场景式存证_Demo
 * @Author: jiyang
 * @Date: 2018-07-10 10:20
 */
public class Other {

    private String name;
    private int age;

    public Other() {
        System.out.println ("Other 构造函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println ("Other name set");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println ("Other age set");
        this.age = age;
    }

    public void  init(){
        System.out.println ("== Other init");
    }

    public void destory(){
        System.out.println ("== Other destory");
    }

    @Override
    public String toString() {
        return "Other{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
