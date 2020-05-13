package com.funamentals.java;

// Lesson 6 Prep to see what I know

public class Lesson6Exercise {

     String toString = "Prime Time";
    public String myLowerCase() {
        return toString().toLowerCase();
    }

    //Method for showing char data type
    public  void  examplesChar() {
        char c1 = '⁋';
        char c2 = '\u00B6';
        System.out.println(c2);
    } // end method


    public void exampleString() {
        StringBuilder build = new StringBuilder();
        build.append("Jack and Jill\n" +
                "Went up the hill\n" +
                "To fetch a pail of water.\n" +
                "Jack fell down and broke his crown\n" +
                "And Jill came tumbling after. ");

        System.out.println(build);
    } // end method exampleBuilder



}
