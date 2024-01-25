package com.javaacademy.lessons.homework.homework2.ex1;

import java.util.ArrayDeque;
import java.util.Queue;

public class LuggageCompartment {
    private final Worker[] workers = new Worker[3];
    private final Queue<Suitcase> suitcases = new ArrayDeque<>();

    public LuggageCompartment(String name1, String name2, String name3) {
        workers[0] = new Worker(name1);
        workers[1] = new Worker(name2);
        workers[2] = new Worker(name3);
    }

    public void arrivalPlane(String flightNumber) {
        for (int i = 0; i < 20; i++) {
            suitcases.offer(new Suitcase(flightNumber));
        }
    }

    public void unload() {
        int i = 0;
        while (!suitcases.isEmpty()) {
            workers[i % 3].throwLuggageWithShout(suitcases);
            i++;
        }
    }

}
