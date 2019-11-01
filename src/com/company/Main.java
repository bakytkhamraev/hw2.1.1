package com.company;

public class Main {

    public static void main(String[] args) {
  Dog dog= new Dog("arslan",18,Color.BLACK);
        System.out.println(dog.getName()+" "+dog.getAge()+" "+dog.getColor());
        dog.makeVoice();


        Haski haski= new Haski("Bekulan",20, Color.BLUE);
        System.out.println(haski.getName()+" "+haski.getAge()+" "+haski.getColor());
        dog.makeVoice("bakunin");

        Haski haski1= new Haski("Nurbol",28, Color.GREEN);
        System.out.println(haski1.getName()+" "+haski1.getAge()+" "+haski1.getColor());
        dog.makeVoice("mirbek");
    }
}