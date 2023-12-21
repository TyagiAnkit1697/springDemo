package com.spring;

import com.spring.games.GameRunner;
import com.spring.games.GammingConsole;
import com.spring.games.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameMain {
    public static void main(String[] args) {

       try( var context = new AnnotationConfigApplicationContext(GameConfig.class)){
           context.getBean(GameRunner.class).run();
       }
        /*var game = new SuperContraGame();
        var game = new MarioGame();
        var game = new PacManGame();
        var gamerun = new GameRunner(game);
        System.out.println(game);
        gamerun.run();*/

    }
}
