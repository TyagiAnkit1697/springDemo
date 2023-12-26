package com.spring.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GammingConsole {

    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("crouch");
    }
    public void right(){
        System.out.println("move forward");
    }
    public void left(){
        System.out.println("move backword");
    }
}
