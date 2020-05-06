package com.funamentals.java;

public class Main {

    public static void main(String[] args) {
        lesson9Examples();
        // beerSong();
        //lesson8Example();
        // lesson7Examples();
        // lesson6Examples();
        // lesson5Examples();
    // write your code here
        // single line comment
        //System.out.println("Hello Java");
        //System.out.println(This is my first sentence);
        //System.out.println(I am new to Java);
        // System.out.println(This Java course is cool);
        //System.out.println(I am learning new stuff every day);

        //myHouseExample();
    }// end method main

    public static void lesson9Examples() {
        Lesson9 myNine = new Lesson9();
        myNine.basicIntArray();
        myNine.basicStringArray();
        myNine.basicTwoDimensionalArray();
        myNine.basicJaggedArray();
    } // end method lesson9Examples

    public static void beerSong() {
        BottlesOfBeerSong song = new BottlesOfBeerSong();
        song.timeToSing();
    }




    public static void lesson8Example() {
           Lesson8 myEight = new Lesson8();
           myEight.basicIfElseExample(2,2);
           myEight.basicIfStatement(4,4);
           myEight.basicIfElseChainExample(33);
           myEight.basicIfAndExample(108);
           myEight.basicSwitchExample(2);
           myEight.basicWhileExample();
           myEight.basicDoWhileExample();
           myEight.basicForLoopExample();
           System.out.println(myEight.basicBranchingExample(7));
    } // end method lesson8Examples

    public static void lesson7Examples() {
        Lesson7 mySeven = new Lesson7();
        mySeven.basicMath();
        mySeven.exampleModulus();
        //mySeven.addTwoNumbers();
        mySeven.exampleAssignment();
        mySeven.exampleLeftShift();
        mySeven.exampleRightShift();
        mySeven.exampleAnd();
        mySeven.exampleXOR();
        mySeven.exampleRelational();
        mySeven.exampleIncrement();
        mySeven.exampleDecrement();
    } // end method lesson7Examples

    public static void lesson6Examples() {
        Lesson6 mySix = new Lesson6();
        mySix.exampleChaAt();
        mySix.exampleConcat("has awesome donuts");
        mySix.exampleEquals("LaMars");
        System.out.println(mySix.exampleLowercase());
        System.out.println(mySix.exampleUppercase());
        mySix.exampleLength();
        mySix.example("pizza",2);
        mySix.examplesChar();
        mySix.exampleEscape();

    } // end method lesson6Examples

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



