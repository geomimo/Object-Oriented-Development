package com.slides;

public class MyClass1 {

    //var a is local here.
    {
        int a = 1;
        System.out.println("This will be printed every time an instance is created independently of constructor. a = " + a);
    }

    int a = 2;

    public MyClass1(){
        System.out.println("From public constructor. a = " + a);
    }

    public MyClass1(int a){
        this.a = a;
        System.out.println("From public constructor with parameter. a = " + this.a);

    }
}
