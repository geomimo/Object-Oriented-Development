package com.slides;

//Subclass of MyClass1
public class MyClass2 extends MyClass1 {

    int a = 6;
    int b = 11;

    //Set a and b of this instance equal to MyClass1's vars a and b.
    public MyClass2(){
        this.a = super.a;
        this.b = super.b;
    }

    @Override
    public void print() {
        super.print();
    }
}
