package com.slides;



public class Main {

    public static void main(String[] args) {

        //This is an Object, an instance of class Animal.
        Animal myAnimal1 = new Animal(2, "Max");
        //This is another Object.
        Animal myAnimal2 = new Animal(5, "Joe");


        System.out.println("Object myAnimal1.\nAge: " + myAnimal1.age +"\nName: " + myAnimal1.name);
        System.out.println("Object myAnimal2.\nAge: " + myAnimal2.age +"\nName: " + myAnimal2.name);

    }
}



