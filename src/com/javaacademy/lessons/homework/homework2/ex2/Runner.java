package com.javaacademy.lessons.homework.homework2.ex2;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map<Item, Integer> map = new HashMap<>();
        Item item1 = new Item("Яблоко");
        Item item2 = new Item("Банан");
        Item item3 = new Item("Аппельсин");
        map.put(item1, 1);
        map.put(item2, 2);
        map.put(item3, 3);
        System.out.println(map.get(item3));
    }

}
