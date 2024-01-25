package com.javaacademy.lessons.homework.homework2.ex1;

import java.util.ArrayDeque;
import java.util.Queue;

public class LuggageCompartment {
    private static final int COUNT_SUITCASE = 20;
    private static final int COUNT_WORKERS = 3;
    private final Worker[] workers = new Worker[COUNT_WORKERS];
    private final Queue<Suitcase> suitcases = new ArrayDeque<>();

    public LuggageCompartment(String... names) {
        for (int i = 0; i < names.length; i++) {
            workers[i] = new Worker(names[i]);
        }
    }

    public void arrivalPlane(String flightNumber) {
        for (int i = 0; i < COUNT_SUITCASE; i++) {
            suitcases.offer(new Suitcase(flightNumber));
        }
    }

    public void unload() {
        int i = 0;
        while (!suitcases.isEmpty()) {
            workers[i % COUNT_WORKERS].throwLuggageWithShout(suitcases);
            i++;
        }
    }

}
