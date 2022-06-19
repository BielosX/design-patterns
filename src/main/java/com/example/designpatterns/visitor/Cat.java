package com.example.designpatterns.visitor;

public class Cat extends Animal {
    public Cat(int age) {
        super(age);
    }

    public String meow() {
        return "Cat (" + this.getAge() + "): Meow";
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
