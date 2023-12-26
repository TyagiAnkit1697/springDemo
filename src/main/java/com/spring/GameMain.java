package com.spring;

import com.spring.games.GameRunner;
import com.spring.games.GammingConsole;
import com.spring.games.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.games")
public class GameMain {
    public static void main(String[] args) {

       try( var context = new AnnotationConfigApplicationContext(GameMain.class)){
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
