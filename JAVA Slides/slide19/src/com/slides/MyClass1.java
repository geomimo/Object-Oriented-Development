package com.slides;

public class MyClass1 {

    public MyClass1(){
        System.out.println("From public constructor.");
    }

    public MyClass1(String str){
        System.out.println("From public constructor with parameter. " + str);
    }

    private MyClass1(int a){
        System.out.println("From private constructor with parameter. " + a);
    }

    public void create(){
        MyClass1 mc1 = new MyClass1(5);
    }
}
