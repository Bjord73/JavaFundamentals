package com.funamentals.java;

public class House {
    private String foundation;
    private String rootType;
    private String doorColor;
    private int windowSize;

    public House() {
        this("Blue");
    } // end constructor

    public House(String doorColor) {
        System.out.println("The door color is"+ doorColor);
    } // end constructor

    public House(String foundation, String rootType, String doorColor, int windowSize) {
        this.foundation = foundation;
        this.rootType = rootType;
        this.doorColor = doorColor;
        this.windowSize = windowSize;
    } // end constructor

    /* Properties for foundation */
    protected void setFoundation(String foundation) {
        //foundation = value;
        this.foundation = foundation;
    } // end property method setFoundation

    protected String getFoundation() {
        return foundation;
    } // end property method getFoundation

    /* Properties for Roof Type */
    protected void setRootType(String value) {
        rootType = value;
    } // end property method getRoofType

    protected String getRootType() {
        return rootType;
    } // end property method getRoofType

    /* Properties of Door Color */
    protected void setDoorColor(String value) {
        doorColor = value;
    } // end property method setDoorColor

    protected String getDoorColor() {
        return doorColor;
    } // end property method getDoorColor

    /* Properties of Window Size */
    protected void setWindowSize(int value) {
        windowSize = value;
    } // end property method setWindowSize

    protected int getWindowSize() {
        return windowSize;
    } // end property method getWindowSize


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
