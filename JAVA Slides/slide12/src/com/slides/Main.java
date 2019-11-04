package com.slides;

public class Main {

    int nonstaticvar = 5;
    static int staticvar = 10;

    public static void main(String[] args) {
	    //nonstaticvar = 6; non-static members cannot be referenced in this static method
        staticvar = 11;
        System.out.println("Staticvar in static method main(): " + staticvar);
        //nonStaticMethod(); non-static methods cannot be referenced in this static method
        staticMethod();
    }


    void nonStaticMethod(){
        System.out.println("Hi from nonStaticMethod()");
        nonstaticvar = 6;
        System.out.println("Nonstaticvar in nonStaticMethod(): " + nonstaticvar);
        staticvar = 12;
        System.out.println("Staticvar in nonStaticMethod(): " + staticvar);
    }

    static void staticMethod(){
        System.out.println("Hi from staticMethod()");
        //nonstaticvar = 6; non-static members cannot be referenced in this static method
        staticvar = 12;
        System.out.println("Staticvar in nonStaticMethod(): " + staticvar);
    }
}
