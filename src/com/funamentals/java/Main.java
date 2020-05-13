package com.funamentals.java;

import com.fundamentals.lesson10.Lesson10;

/* This class was created when the project
* was created*/
public class Main {
    public  static int num = 0;

    static {
        System.out.println("Static Block 1");
        num = 42;
    } // static block

    static {
        System.out.println("Static block 2");
        num = 63;
    } // end static block

    public static void main(String[] args) {
        lesson16Examples();
        //lesson15Examples();
        //lesson6Exercise6();
        //lesson14Examples();
        //SmartCarExercise();
        //lesson12Examples();
        //CarExamples();
        //lesson11Examples();
        //lesson10Example();
        //lesson9Examples();
        // beerSongExamples();
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

    public static void lesson16Examples() {
        Lesson16 my16 = new Lesson16();
        my16.showEnum();

        my16.myFavoriteFlavor(Lesson16.IceCreamFlavors.CHOCOLATE);

        Lesson16Enum d1[] = Lesson16Enum.values();
        for(Lesson16Enum day : d1) {
            System.out.println(day.name() + " at index " + day.ordinal() +
                    " day number = " + day.getDayNum());
        } // end for loop



    } // end method lesson16Examples

    public static void lesson15Examples() {
        int[] myKeys = {0,1,2,3,4,5,6,7,8,9};
        Lesson15Child abs = new Lesson15Child(20, myKeys,0, "Color");
        abs.receiveCall(); // defined in child
        abs.sendCall(); // defined in child
        abs.endCall(); // defined in parent from interface

    }

    public static void lesson14Examples() {
        // Can not change value of a final variable
        //Lesson14.MY_FIRST_FINAL = 10;
        int sum = Lesson14.MY_FIRST_FINAL * 2;
        System.out.println(sum);

        Lesson14.myStaticMethod(10);
        System.out.println("Block number is " + num);
    } // end method lesson14Examples

    public static void SmartCarExercise() {
        SmartCar mySmartCar = new SmartCar();
        mySmartCar.getPower(); // from Car parent class
        mySmartCar.setBody("engine"); // from Condo class
        System.out.println(" The foundation is body"+ mySmartCar.getPower());
    } // end method lesson12Examples

    public static void lesson12Examples() {
        Condo myCondo = new Condo();
        myCondo.doorOpenClose(); // from House parent class
        myCondo.setBalcony("railing"); // from Condo class

        House myHouse = new House();
        myHouse.doorOpenClose("Close");
    } // end method lesson12Examples

    public static void CarExamples() {
        Car car = new Car();
        car.setDoors("String door");
        car.setDoors("plastic");
        System.out.println("The foundation is made of a frame");
        System.out.println("with rims");
        System.out.println("green paint job");
        //carExample();
    } // end method main

    public static void lesson11Examples() {
        House house = new House("Blue");
        //house.foundation = "concrete";
        house.setFoundation("concrete");
        //house.rootType = "shingle";
        house.setRootType("shingle");
        System.out.println("The foundation is made of"+house.getFoundation());
    } // end lesson11Examples

    public static void lesson10Example() {
        House yourHouse = new House();
        yourHouse.doorOpenClose();
        //yourHouse.windowOpenClosed(); // cannot access
        yourHouse.openGarage();
        yourHouse.closedGarage();
        Lesson10 myTen = new Lesson10();
        //meTen.showProtected(); // cannot access
        //myTen.showProtected(); // cannot access
    } // end method lesson10Examples

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


    public static void lesson6Exercise6() {
        Lesson6Exercise myExercise6 = new Lesson6Exercise();
        myExercise6.toString();
        myExercise6.examplesChar();
        myExercise6.exampleString();


        }


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



