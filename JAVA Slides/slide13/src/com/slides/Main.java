package com.slides;

public class Main {

    public static void main(String[] args) {

        System.out.println("MyClass' class variable " + MyClass.myClassVar);
        MyClass mc = new MyClass();
        System.out.println("MyClass instance variable " + mc.myInstVar);
        mc.printNum(50);
        mc.getSum();

    }
}
