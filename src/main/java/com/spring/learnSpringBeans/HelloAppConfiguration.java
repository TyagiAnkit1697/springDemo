package com.spring.learnSpringBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};
record Address(String firstLine, String state){};
@Configuration
public class HelloAppConfiguration {

    @Bean                       //to create oyr custom bean you van use @Bean(name = "your custom name")
    public String name() {
        return "Ankit";
    }
    @Bean                       //to create oyr custom bean you van use @Bean(name = "your custom name")
    public Integer age() {
        return 26;
    }
    @Bean(name = "person1")
    public Person person(){
        return new Person("Ankit", 26, new Address("Bhagwanpur", "uttarakhand"));
    }

    @Bean(name = "person1withMethodCall")
    public Person person1(){
        return new Person(name(), age(), address());
    }
    @Bean(name = "person2withParameters")
    public Person person2(String name, Integer age, Address address2){
        return new Person(name, age, address2);
    }
    @Bean
    public Address address(){
        return new Address("village: Chudiyala", "Uttarakand");
    }
    @Bean(name = "address2")
    @Primary          // to avoid following exception (available: expected single matching bean but found 2: address,address2), We can use @qualifier("name") as well
    public Address address2(){
        return new Address("village: Roorkee", "Uttarakand");
    }

}
