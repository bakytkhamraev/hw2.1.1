package com.company;

abstract public class Animal {
    private String name;
    private int age;
    private Color color;
    private Owner owner;



    public Owner getOwner() {
        return owner;
    }



    public Animal(String name, int age, Color color, Owner owner) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }
}
