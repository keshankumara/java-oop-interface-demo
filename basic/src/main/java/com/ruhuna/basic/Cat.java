package com.ruhuna.basic;

//when a subclass can get behaviours and fields from its super class

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow");

    }

    @Override
    public void eat() {
        System.out.println("I am eating fish");

    }
}
