package com.spring.learnSpringBeans;

import com.spring.learnSpringBeans.Address;
import com.spring.learnSpringBeans.HelloAppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloWordApp {
    public static void main(String[] args) {
        try(var context =
                    new AnnotationConfigApplicationContext(HelloAppConfiguration.class))// try with resource=> we dont need to close context ourself
        {

            var name = context.getBean("name");
            System.out.println(name);
            System.out.println(context.getBean("person1"));
            System.out.println(context.getBean("person1withMethodCall"));
            System.out.println(context.getBean("person2withParameters"));
            System.out.println(context.getBean("address"));
            System.out.println(context.getBean(Address.class));

            // to get all the beans managed by spring container or Application context or IOC container
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}
