package com.in28.spring.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    //@Qualifier(value = "mario")
    private final GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void runGame() {
        game.up();
        game.down();
    }
}
