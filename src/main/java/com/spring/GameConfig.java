package com.spring;

import com.spring.games.GameRunner;
import com.spring.games.GammingConsole;
import com.spring.games.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    @Bean
    public GammingConsole game(){
        return new PacManGame();
    }
    @Bean
    public GameRunner gameRunner(GammingConsole game){
        return new GameRunner(game);
    }
}
