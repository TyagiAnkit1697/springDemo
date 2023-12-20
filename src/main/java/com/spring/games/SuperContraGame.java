package com.spring.games;

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
