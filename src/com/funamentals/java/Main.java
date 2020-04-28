package com.funamentals.java;

public class Main {

    public static void main(String[] args) {
        // single line comment
        System.out.println("Hello Java");
        myHouseExample();
    }// end method main

    /* This is a
    multi-line comment */
     public static void myHouseExample() {
        House myHouse = new House();
        myHouse.doorOpenClose();
     }// end method myHouseExample

} // end class Main



