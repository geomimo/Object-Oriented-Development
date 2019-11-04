package com.slides;

public class Main {

    public static void main(String[] args) {
	    final int i = 10;
	    System.out.println("Final i: " + i);
	    //i = 5; Compiler Error.

        MyFinalClass mfc = new MyFinalClass();
        mfc.print();

        AnotherClass1 ac1 = new AnotherClass1();
        ac1.myFinalMethod();


    }
}
