package com.slides;

public class Main {

    public static void main(String[] args) {
        MyClass1 mc1 = new MyClass1();

        mc1.print(1);
        mc1.print("Hey");
        mc1.print(1, "Hey");
        mc1.print("Hey", 1);
        MyClass1.print();
    }
}
