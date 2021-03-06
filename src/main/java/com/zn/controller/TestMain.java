package com.zn.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        //1.创建spring的ioc容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        //2.从ioc容器中获取bean实例
        GameOver helloWorld = ( GameOver ) ctx.getBean("iDgameOver");
        helloWorld.hello();
    }
}
