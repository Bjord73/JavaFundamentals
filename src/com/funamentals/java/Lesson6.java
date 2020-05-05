package com.funamentals.java;

/*
* The contents of this class are for the Lesson 6 Slide Deck
*  Strings & More
* */
public class Lesson6 {

    String myString = "LaMars";

    public void  exampleChaAt() {
        char myChar = myString.charAt(3);
        System.out.println((myChar));
    } // end method exampleCharAT

    // Method shows concatenation of two strings
    public void  exampleConcat(String value) {
        String happy = myString.concat(value);
       System.out.println(happy);
    }

    // Method compares two strings to see if they are equal
    public void  exampleEquals(String donut) {
        boolean myBoolean = myString.equals(donut);
        System.out.println(myBoolean);
    } // end method exampleEquals

    // Method takes a string and coverts it to lowercase
    public String exampleLowercase() {
        return myString.toLowerCase();
    } // end method exampleLowercase

    // Method takes a string and converts it to uppercase
    public String exampleUppercase() {
        return myString.toUpperCase();
    } // end method exampleUppercase

    // Method determines the length of a string
    public void exampleLength() {
        int length = myString.length();
        System.out.println(length);
    }    // end method exampleLength

    // Example of how to use the StringBuilder class
    public void example(String food, int value) {
        StringBuilder build = new StringBuilder();
        build.append("My favorite food is ");
        build.append(food).append(" plates of it.");
        String fav = build.toString();
        System.out.println(fav);
    } // end method exampleBuilder

    //Method for showing char data type
    public  void  examplesChar() {
        char c1 = 't';
        char c2 = '\u00A7';
        System.out.println(c2);
    }// end method exampleChar

    // Method demonstrates escape sequence
    public void exampleEscape() {
        System.out.println("That\'s a cool toy.\tcan I\n play with it.");
    } // end method exampleEscape

} // end class Lesson6
