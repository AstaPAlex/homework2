package com.javaacademy.lessons.homework.homework2.ex3;

public class Detail {
    private final String name;

    public Detail(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Detail{"
                + "name='" + name + '\''
                + '}';
    }
}
