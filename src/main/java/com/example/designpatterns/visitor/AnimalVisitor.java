package com.example.designpatterns.visitor;

public class AnimalVisitor {
    private final StringBuilder builder;

    public AnimalVisitor() {
        this.builder = new StringBuilder();
    }

    public void visit(Cat cat) {
        builder.append(cat.meow());
        builder.append('\n');
    }

    public void visit(Dog dog) {
        builder.append(dog.bark());
        builder.append('\n');
    }

    public String summary() {
        return this.builder.toString();
    }
}
