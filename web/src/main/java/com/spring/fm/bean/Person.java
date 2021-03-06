package com.spring.fm.bean;

/***
 * @Author: jiyang
 * @Date: 2018-07-10 10:16
 */
public class Person {

    private String name;

    private int age;

    public Person() {
        System.out.println ("Person 构造函数");
    }


    public Person(Other other) {
        this.name = other.getName ();
        this.age = other.getAge ();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println ("Person name set");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println ("person age set");
        this.age = age;
    }

    public void init() {
        System.out.println ("===Person init");
    }

    public void destory() {
        System.out.println ("===Person destory");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
