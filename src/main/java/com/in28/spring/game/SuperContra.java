package com.in28.spring.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContra implements GamingConsole {
    @Override
    public void up() {
        System.out.println("up super");
    }

    @Override
    public void down() {
        System.out.println("down super");
    }
}
