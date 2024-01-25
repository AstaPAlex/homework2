package com.javaacademy.lessons.homework.homework2.ex1;

public class Runner {
    public static void main(String[] args) {
        LuggageCompartment lC = new LuggageCompartment("Alex", "Adam", "Jon");
        lC.arrivalPlane("SU-077");
        lC.arrivalPlane("AO-222");
        lC.unload();
    }
}
