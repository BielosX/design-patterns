package com.example.designpatterns.visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimalVisitor visitor = new AnimalVisitor();
        List<Animal> animals = List.of(new Dog(3), new Cat(2), new Dog(5), new Cat(7), new Dog(9));
        animals.forEach(animal -> animal.accept(visitor));
        System.out.print(visitor.summary());
    }
}
