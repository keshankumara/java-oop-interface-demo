package com.ruhuna.basic;

public class Main {
    public static void main(String[] args){
        //classess are template
        //real world things are objects

        Cat garfield = new Cat();
        garfield.eat();
        garfield.makeSound();

        Dog scooby = new Dog();
        scooby.eat();
        scooby.makeSound();

        // cat1 is a type of Animal (super interface)
        Animal cat1 = new Cat();
        cat1.eat();
        cat1.makeSound();

        //dog1 is a dog
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.makeSound();
    }
}
