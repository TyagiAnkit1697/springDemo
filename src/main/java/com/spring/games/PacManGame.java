package com.spring.games;

import org.springframework.stereotype.Component;

@Component(value = "pacman")
public class PacManGame implements GammingConsole {
    @Override
    public void up() {
        System.out.println("go up");
    }

    @Override
    public void down() {
        System.out.println("go down");

    }

    @Override
    public void right() {
        System.out.println("go forward");

    }

    @Override
    public void left() {
        System.out.println("go backward");

    }
}
