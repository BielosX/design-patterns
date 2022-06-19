package com.example.designpatterns.visitor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Animal implements VisitableAnimal {
    @Getter
    private final int age;
}
