package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class A{}
@Component
@Lazy       //to avoid eager initialize, @Lazy(we call it lazy initialize)
class B{
    private A a;

    public B(A a){
        System.out.println("B is initialize");            // it will initialize doesnot metter we call it or not(eagr initialize)
        this.a = a;
    }

    public void doSomething(){
        System.out.println("doing something");
    }
}
@Configuration
@ComponentScan
public class LazyInitializerLearning {
    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext(LazyInitializerLearning.class);
        System.out.println("initialize completed");

        context.getBean(B.class).doSomething();

    }
}
