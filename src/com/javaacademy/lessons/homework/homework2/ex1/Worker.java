package com.javaacademy.lessons.homework.homework2.ex1;

import java.util.Queue;

public class Worker {
    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    public void throwLuggageWithShout(Queue<Suitcase> suitcases) {
        System.out.printf("%s: Мужики, кидаю чемодан %s\n", name, suitcases.remove().getFlightNumber());
    }
}
