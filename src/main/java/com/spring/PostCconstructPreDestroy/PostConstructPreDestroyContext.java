package com.spring.PostCconstructPreDestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency){
        this.someDependency = someDependency;
        System.out.println("All dependency is ready to use");
    }
}

@Component
class SomeDependency{

    @PostConstruct
    public void postConstruct(){
        System.out.println("PostConsruct");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("preDestroy");
    }
}
@Configuration
@ComponentScan
public class PostConstructPreDestroyContext {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(PostConstructPreDestroyContext.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
