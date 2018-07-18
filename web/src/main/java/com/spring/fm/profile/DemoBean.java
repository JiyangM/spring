package com.spring.fm.profile;

/***
 * @Author: jiyang
 * @Date: 2018-07-18 12:50
 */
public class DemoBean {

    private String content;

    public DemoBean(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "DemoBean{" +
                "content='" + content + '\'' +
                '}';
    }
}
