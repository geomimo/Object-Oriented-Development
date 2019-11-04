package com.slides;

public class Main {

    public static void main(String[] args) {


        //char c1 = "D"; Compiler error. No double quotes for chars.
        char c2 = 'D';
        //char c3 = "Dog"; Compiler error. No double quotes for chars and no more than 1 character.
        //char c4 = 'Dog'; Compiler error. No more than 1 character.

        String s1 = "D";
        //String s2 = 'D'; Compiler error. No single quotes for Strings.
        String s3 = "Dog";
        //String s4 = 'Dog'; Compiler error. No single quotes for Strings.

        //System.out.println(c1);
        System.out.println(c2);
        //System.out.println(c3);
        //System.out.println(c4);
        System.out.println(s1);
        //System.out.println(s2);
        System.out.println(s3);
        //System.out.println(s4);
    }
}
