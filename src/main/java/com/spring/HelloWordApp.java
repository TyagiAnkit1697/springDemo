package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWordApp {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HelloAppConfiguration.class);
        var name = context.getBean("name");
        System.out.println(name);
        System.out.println(context.getBean("person1"));
        System.out.println(context.getBean("person1withMethodCall"));
        System.out.println(context.getBean("person2withParameters"));
        System.out.println(context.getBean("address"));
    }
}
