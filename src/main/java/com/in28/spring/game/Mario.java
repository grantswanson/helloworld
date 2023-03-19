package com.in28.spring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements GamingConsole {
    @Override
    public void up() {
        System.out.println("up mario");
    }

    @Override
    public void down() {
        System.out.println("down mario");
    }
}
