package com.slides;

public class Main {

    public static void main(String[] args) {
	    MyClass1 mc1 = new MyClass1();
	    MyClass2 mc2 = new MyClass2();
	    System.out.println();

	    mc1.print();
	    mc2.print();

	    //Change mc11's a and b but MyClass1's a and b are the same. So mc22's a and b are set 5 and 10.
	    MyClass1 mc11 = new MyClass1(10,30);
	    MyClass2 mc22 = new MyClass2();
		System.out.println();

		mc11.print();
	    mc22.print();
	    System.out.println("Sum is " + mc11.sum(20,40));

    }
}
