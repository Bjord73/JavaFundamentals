package com.funamentals.java;

public class House {
    String foundation;
    String rootType;
    String doorColor;
    int windowsize;

    public void doorOpenClose() {
        System.out.println("The door opens");
        windowOpenClose();
    } // end method doorOpenClose

    /* The below method are demonstrating lesson 10 Access modifiers*/
    // private means only accessible from the class
    private void  windowOpenClose() {
        System.out.println("The window is open or close");
    } // end method windowOpenClose

    // mo modifier is default, which only accessible in the package name
    void openGarage() {
        System.out.println("Open the garage");
    } // end method openGarage

    // protected only accessible in the same package, or subclass of another package
    protected void closedGarage() {
        System.out.println("Close the garage");
    } // end method closeGarage

} // end class House
