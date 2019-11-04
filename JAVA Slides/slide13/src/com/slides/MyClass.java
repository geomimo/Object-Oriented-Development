package com.slides;

public class MyClass {


    static int myClassVar = 1; //Class variable
    int myInstVar = 2; //Instance variable

    //num is method parameter
    void printNum(int num){
        System.out.println("Method Parameter " + num);
    }

    //a, b, c are local variables
    void getSum(){
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println("Local Variable " + c);
    }
}
