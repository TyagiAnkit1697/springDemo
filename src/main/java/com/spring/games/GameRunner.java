package com.spring.games;

import com.spring.games.GammingConsole;

public class GameRunner {
    private GammingConsole gammingConsole;

    public GameRunner(GammingConsole gammingConsole){
        this.gammingConsole = gammingConsole;
    }
    public void run(){
        gammingConsole.up();
        gammingConsole.down();
        gammingConsole.right();
        gammingConsole.left();
    }
}
