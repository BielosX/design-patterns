package com.example.designpatterns.visitor;

public class Dog extends Animal {

    public Dog(int age) {
        super(age);
    }

    public String bark() {
        return "Dog (" + this.getAge() + "): Woof";
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
