package com.spring.beanScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class Normal{}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
        //@Scope will tell the scope of the bean this is prototype scope
        // i.e every time we need the bean of this class we will get different bean
        // run this prog. for more info and see the hashcode of the bean.
    @Component
class PrototypeBean{

}
  @Configuration
  @ComponentScan
public class BeanScope {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(BeanScope.class);
        System.out.println("Normal Class "+ context.getBean(Normal.class));
        System.out.println("Normal Class "+ context.getBean(Normal.class));
        System.out.println("Normal Class "+ context.getBean(Normal.class));
        System.out.println("");
        System.out.println("Prototype Class "+ context.getBean(PrototypeBean.class));
        System.out.println("Prototype Class "+ context.getBean(PrototypeBean.class));
        System.out.println("Prototype Class "+ context.getBean(PrototypeBean.class));
    }
}

/*
Spring beans are defined to be used in a specific scope
=> Singleton: one object instance per IOC container
=> Prototype: possibly many object instance as per Spring IOC Container

Scope applicable only for web-aware Spring ApplicationContext
=>request: one object instance as per single HTTP instance
=>Session: one object instance as per user HTTP session
=>Application
=>Websocket

Java Singelton vs Sring Singleton
=>Spring Singleton: one object instance per Spring IOC container
=>Java Singelto,: one object instance as per JVM.
*/

