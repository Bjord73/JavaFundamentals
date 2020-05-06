package com.funamentals.java;

/*
* The contents of this class will go over lesson8 content
* Control Flow statements
* */
public class Lesson8 {
    // This method goes over basic if
    public void  basicIfStatement(int value1, int value2) {
        System.out.println("Before if Statement");
        if(value1 == value2) {
            System.out.println("Value are equal");
        } // end if
        System.out.println("After if Statement");
    } // end method basicIfStatement

    // This method goes over if else
    public void basicIfElseExample(int alpha, int beta) {
        System.out.println("Before if statement");
        if(alpha != beta) {
            System.out.println("The values are not equal");
        } else {
            System.out.println("The values are equal");
        } // end if else
        System.out.println("End of it statement");
    } // end method basicIfElseExample

    // This method goes over if else chin
    public void basicIfElseChainExample(int charlie) {
        System.out.println("Before if statement");
        if (charlie < 30) {
            System.out.println("The value is less than 30");
        } else if (charlie < 40) {
            System.out.println("The value is greater than 30, but less than 40");
        } else {
            System.out.println("The value is greater than 40");
        } // end of chain
        System.out.println("After if statement");
    } // end method basicIfElseChainExample

    // This method goes over And and Or conditions
    public void basicIfAndExample(int delta) {
        System.out.println("Before if statement");
        if(delta > 100 || delta < 50) {
            System.out.println("The value is not between 100 and 50");
        } // end if

        // if delta modulus 2 is 0 and greater than 30
        if(delta % 2 == 0 && delta > 30) {
            System.out.println("The value is greater than 30 and its an even number");
        } // end if
    } // end method basicIfAndOrExample

    // This method demonstrates a switch statement with case
    public void basicSwitchExample(int day) {
        switch(day) {
            case 1:
                System.out.println("Day = 1");
                break;
            case 2:
                System.out.println("Day = 2");
                break;
            case 3:
            case 4:
                System.out.println("day = 3 or 4");
                break;
            default:
                System.out.println("day is greater than 4");
                break;
        } // end switch
    } // end method basicSwitchExample

    // This method goes over the while loop
    public void basicWhileExample() {
            int val = 0; // initialized value
    while(val < 10) { //condition
        System.out.println(val);
        val++; //increment
    } // end while
    } // end method basicWhileExample

    // This method goes over the do while loop
    public void basicDoWhileExample() {
        int able = 0; //initialized value
        do{
            System.out.println(able);
            able++; //increment
        } while(able < 10); // condition
    } // end method basicDoWhileExample

    // This method goes over the for loop
    public void basicForLoopExample() {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        } // end for
    } // end method basicForLoopExample

    // This method goes over branching statements
    public String basicBranchingExample(int charlie) {
        String may = "Happy";
        for(int i = 0; i < charlie; i++) {
            if(i == 2) { continue; } // end if
            if(i == 3) { may += "Wednesday"; } // end if
            if(i == 4) {
                may += " Coding";
                break;
            } // end if
            may += "Day";
        } // end for loop
        return may;
    } // end method basicBranchingExample

} // end class Lesson8
