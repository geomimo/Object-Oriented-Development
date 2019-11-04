package com.slides;

public class Main {

    public static void main(String[] args) {
        //getNum(); Compile Error. Non Static method.

        System.out.println("Get Num From Static Method: " + getNumS());

        //System.out.print("MyStaticClass's nonstaticname: " + MyStaticClass.nonstaticname); Compiler Error.

        System.out.println("MyStaticClass's staticname: " + MyStaticClass.staticname);

        MyStaticClass msc = new MyStaticClass();
        System.out.println("MyStaticClass's nonstaticname by object: " + msc.nonstaticname);

        //MyClass m = new MyClass(); Compiler Error. Cannot be referenced from static context.


    }

    interface Printable{
        void print();
    }

    static class MyStaticClass{
        String nonstaticname = "Kostas";
        static String staticname = "Maria";
    }

    class MyClass{
        int i = 5;
    }

    private int getNum(){
        int i = 5;
        return i;
    }

    private static int getNumS(){
        int i = 10;
        return i;
    }
}
