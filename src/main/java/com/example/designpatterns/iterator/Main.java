package com.example.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int x = 0; x < 10; x++) {
            list.add(random.nextInt(200));
        }
        System.out.println(list);
        ListIterator<Integer> iterator = new ListIterator<>(list);
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next > 50) {
                iterator.remove();
            }
            System.out.println(next);
        }
        iterator.add(1000);
        System.out.println(list);
    }
}
