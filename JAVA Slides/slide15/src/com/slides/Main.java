package com.slides;

public class Main {

    public static void main(String[] args) {

        varagsMethod1("Giorgos",1,2,3,4,5,6,7);
        //varagsMethod2(someNums, l);
    }

    static void varagsMethod1(String str, int... nums) {
        System.out.println(str);
        for(int i=0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    /*Varags must be last in the list
    static void varagsMethod2(int... nums, int len){
        for(int i=0; i < len; i++){
            System.out.println(nums[i]);
        }
    }*/
}
