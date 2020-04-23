package com.funamentals.java;

/* This class is part of Lesson 4
* My Application Overview */
public class Main {

    public static void main(String[] args) {
	//write your code here
        System.out.println("Hello Java");
        System.out.println("This is my first sentence");
        System.out.println("I am new to java");
        System.out.println("This Java course is cool");
        System.out.println("I am learning stuff everyday");

        myHouseExample();
    } //End main method

    public static void myHouseExample() {
        House myHouse = new House();
        myHouse.doorOpenClose();
    } // End myHouseExample
} // end class Main
