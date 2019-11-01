package com.company;

public class Dog extends Animal {


    public Dog(String name, int age, Color color, Owner owner) {
        super(name, age, color, owner);
    }

    public void makeVoice () {
        System.out.println("Gav dog");
    }
   final public void makeVoice (String name) {
        System.out.println("name");
    }




    }

