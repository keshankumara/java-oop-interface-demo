package com.ruhuna.basic;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("I am eating bones");
    }
}
