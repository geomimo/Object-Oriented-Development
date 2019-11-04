package com.slides;

public class Main {

    public static void main(String[] args) {
	    MyClass1 mc1 = new MyClass1();
	    MyClass2 mc2 = new MyClass2();

	    System.out.println("mc1 instanceof MyClass1: " + (mc1 instanceof MyClass1));
	    System.out.println("mc1 instanceof MyClass2: " + (mc1 instanceof MyClass2));
	    System.out.println("mc1 instanceof Printable: " + (mc1 instanceof Printable));

	    System.out.println("mc2 instanceof MyClass1: " + (mc2 instanceof  MyClass1));
	    System.out.println("mc2 instanceof MyClass2: " + (mc2 instanceof  MyClass2));
	    System.out.println("mc2 instanceof Printable: " + (mc2 instanceof  Printable));

    }
}
