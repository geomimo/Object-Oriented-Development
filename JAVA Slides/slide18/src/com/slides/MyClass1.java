package com.slides;

public class MyClass1 {


    //Different access level, number and type of parameters.
    public void print(int a){
        System.out.println("Printing from public void print(int a) " + a);
    }

    protected void print(String str){
        System.out.println("Printing from protected void print(String str) " + str);
    }

    protected int print(int a, String str){
        System.out.println("Printing from protected int print(int a, String str) " + a + " " + str);
        return a;
    }

    //Parameters' sequence matters.
    protected int print(String str, int a){
        System.out.println("Printing from protected int print(String str, int a) " + a + " " + str);
        return a;
    }

    public static void print(){
        System.out.println("Printing from public static void print()");
    }

    /*Can't define. Static doesn't change anything.
    public static void print(int a){

    }*/

    /* Can't define. Only different return type.
    public int print(int a){

    }*/

    /* Can't define. Only different access level.
    private void print(int a){

    }*/

}
