package com.spring.games;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GammingConsole {
    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("go into pipe");
    }
    public void right(){
        System.out.println("run forward");
    }
    public void left(){
        System.out.println("run backword");
    }
}
