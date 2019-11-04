package com.slides;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Dog");
        System.out.println("Initial sb1: " + sb1);

        Random r = new Random();
        for(int i = 0; i < 10; i++){
            sb1.append((char)(r.nextInt(26) + 'a'));
        }
        System.out.println("Append random chars sb1: " + sb1);

        sb1.deleteCharAt(4);
        System.out.println("Delete index 4 sb1: " + sb1);
        sb1.deleteCharAt(2);
        System.out.println("Delete index 2 sb1: " + sb1);
        sb1.deleteCharAt(5);
        System.out.println("Delete index 5sb1: " + sb1);

        for(int i = 0; i < 50; i++){
            sb1.insert(r.nextInt(sb1.length()), (char)((char)(r.nextInt(26) + 'a')));
        }
        System.out.println("Insert random char in random index sb1: " + sb1);


    }
}
