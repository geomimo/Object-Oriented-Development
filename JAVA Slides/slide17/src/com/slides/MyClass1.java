package com.slides;

public class MyClass1 {

    int a = 5;
    int b = 10;

    public MyClass1(){}

    public MyClass1(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int sum(int a, int b){
        return this.a + this.b + a + b;
    }

    public void print(){
        System.out.println(this.getClass()+ "'s instance got a = " + this.a + " b = " + b);
    }


}
