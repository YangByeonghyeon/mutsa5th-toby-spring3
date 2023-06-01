package com.example.springbootgradle.study.imp;

public class Bird implements Ani {
    @Override
    public void makeSound() {
        System.out.println("짹짹");
    }

    public static void main(String[] args) {
        Ani bird = new Bird();
        bird.makeSound();
    }
}
