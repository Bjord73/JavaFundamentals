package com.funamentals.java;

public class Main {

    public static void main(String[] args) {
        lesson5Examples();
        // single line comment
        //System.out.println("Hello Java");
        //System.out.println(This is my first sentence);
        //System.out.println(I am new to Java);
        // System.out.println(This Java course is cool);
        //System.out.println(I am learning new stuff every day);



        //myHouseExample();
    }// end method main

    public static void  lesson5Examples() {
        Lesson5 myFive = new Lesson5();
        myFive.showLocalExample();
        int example = myFive.showLocalWithReturn(5,7); // return to a variable
        System.out.println(example); // print variable from line above
        System.out.println(myFive.showLocalWithReturn(2,9)); // direct return of int
        myFive.showInstanceVariable();
        myFive.showConversion();
    } // end method lesson5Examples

    /* This is a
    multi-line comment */
     public static void myHouseExample() {
        House myHouse = new House();
        myHouse.doorOpenClose();
     }// end method myHouseExample

} // End class Main



