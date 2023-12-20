package com.spring;

import com.spring.games.GameRunner;
import com.spring.games.PacManGame;

public class GameMain {
    public static void main(String[] args) {
//        var game = new SuperContraGame();
//        var game = new MarioGame();
        var game = new PacManGame();
        var gamerun = new GameRunner(game);
        System.out.println(game);
        gamerun.run();

    }
}
