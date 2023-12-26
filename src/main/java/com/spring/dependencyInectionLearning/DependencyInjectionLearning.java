package com.spring.dependencyInectionLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component     // framework will treat this class as spring bean
class Car{
 //   @Autowired
    Dependency1 dependency1;      // field type dependency Injection
//    @Autowired
    Dependency2 dependency2;     // field type dependency Injection

    @Autowired        // constructor type dependency Injection { in constructor based DI we didn't need to put the @Autowired spring container will inject the dependency without it}
    public Car(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    /*  @Autowired                 // setter based DependencyInjection
        public void setDependency1(Dependency1 dependency1) {
            System.out.println("Dependency1");
            this.dependency1 = dependency1;
        }
        @Autowired                // setter based DependencyInjection
        public void setDependency2(Dependency2 dependency2) {
            System.out.println("Dependency2");
            this.dependency2 = dependency2;
        }*/
     @Override
    public String toString() {
        return "Car{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}
@Component
class Dependency1{}
@Component
class Dependency2{}

@Configuration
@ComponentScan       // no need to give the package path because all the class are in same package
public class DependencyInjectionLearning {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(DependencyInjectionLearning.class);

       System.out.println(context.getBean(Car.class));
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
