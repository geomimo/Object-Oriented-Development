package com.slides;


import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>(2);
        System.out.println("Empty ArrayLisy: " + al.toString());
        al.add(5);
        System.out.println("Adding an element: " + al.toString());

        Random r = new Random();
        for(int i = 0; i < 10; i++){
            al.add(r.nextInt(100));
        }
        System.out.println("Adding 10 more random elements: " + al.toString());

        al.remove(4);
        System.out.println("Removing element at index 4: " + al.toString());

        al.set(1,55);
        System.out.println("Changing element at index 1 to 55: " + al.toString());

        System.out.println("Accessing all elements, adding 1 and printing.");
        for(int i = 0; i < al.size(); i++){
            al.set(i, al.get(i) + 1);
            System.out.println(al.get(i));

        }
    }
}
