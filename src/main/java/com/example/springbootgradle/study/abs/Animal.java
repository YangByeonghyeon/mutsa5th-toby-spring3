package com.example.springbootgradle.study.abs;

public abstract class Animal {
    public abstract void makeSound();
    public void eat() {
        System.out.println("이것은 일반메서드입니다.");

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
    }
}
