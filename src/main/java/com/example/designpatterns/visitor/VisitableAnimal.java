package com.example.designpatterns.visitor;

public interface VisitableAnimal {
    void accept(AnimalVisitor visitor);
}
