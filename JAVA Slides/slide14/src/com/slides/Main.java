package com.slides;

public class Main {

    public static void main(String[] args) {
	    voidMethod1();
	    voidMethod2();
	    voidMethod3();

	    System.out.println("Returing value: " +returnMethod1());

	    int i = 0;
	    while(checkValue(i)){
	        System.out.println(i);
	        i++;
        }

        System.out.println("While loop ended. Value i: " + i);

    }

    static void voidMethod1(){
        System.out.println("This method doesn't return value");
    }

    static void voidMethod2(){
        String s = "blah blah";
        //return s; Compiler error. Cannot return value.
    }

    static void voidMethod3(){
        for(int i = 0; i < 5; i++){
            System.out.println(i);
            if(i==3){
                System.out.println("Exiting void method with return keyword.");
                return ; //Using return keyword in void methods only for interrupting methods' execution.
            }
        }
    }

    static int returnMethod1(){
        int a = 10;
        return a;
    }

    /*Compile error. This method must returns int.
    static int returnMethod2(){
        int a = 10;
    }*/

    /*Compile error. This method returns int not string.
    static int returnMethod3(){
        String str = "This is a string.";
        return str;
    }*/

    static boolean checkValue(int i){
        if(i==3){
            return false;
        }
        return true;
    }

}
