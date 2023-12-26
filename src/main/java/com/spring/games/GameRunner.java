package com.spring.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private final GammingConsole gammingConsole;

    // if you remove the Qualifier it will run the class which have @Primary annotation on it in case of multiple beans
    public GameRunner(@Qualifier("SuperContraGameQualifier") GammingConsole gammingConsole){
        this.gammingConsole = gammingConsole;
    }
    public void run(){
        System.out.println(gammingConsole);
        gammingConsole.up();
        gammingConsole.down();
        gammingConsole.right();
        gammingConsole.left();
    }
}
