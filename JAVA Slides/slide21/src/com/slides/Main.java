package com.slides;

public class Main {

    public static void main(String[] args) {

        String str1 = "Dog";
        String str2 = new String("Dog");
        StringBuilder sb1 = new StringBuilder("Dog");
        String str3 = new String(sb1);
        String str4 = str1;

        String str5 = "Cat";
        String str6 = new String("Cat");
        StringBuilder sb2 = new StringBuilder("Cat");
        String str7 = new String(sb1);
        String str8 = str5;

        System.out.println("str1 == str2: " + str1 == str2); //false, different memory address
        System.out.println("str1.equals(str2): " + str1.equals(str2)); //true, checks the value of the strings
        System.out.println("str1.equals(str3): " + str1.equals(str3)); //true, checks the value of the strings
        System.out.println("str1 == str4: " + str1 == str4); //false, different memory address
        System.out.println("str1.equals(str4): " + str1.equals(str4)); //true, checks the value of the strings

        System.out.println("str1 == str5: " + str1 == str5); //false, different memory address
        System.out.println("str1.equals(str5): " + str1.equals(str5)); //false, checks the value of the strings
        System.out.println("str5.equals(str6): " + str5.equals(str6)); //true, checks the value of the strings
        System.out.println("str5 == str7: " + str5 == str7); //false, different memory address
        System.out.println("str5.equals(str8): " + str5.equals(str8)); //true, checks the value of the strings


    }
}
