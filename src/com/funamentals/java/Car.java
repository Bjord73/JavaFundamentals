package com.funamentals.java;

public class Car {
    private int doors;
    private int windows;
    private int wheels;
    private String body;

    public Car() {
    } // end constructor

    public Car(int door, int window, int wheels, String body) {
        this.doors = door;
        this.windows = window;
        this.wheels = wheels;
        this.body = body;
    } // end constructor

    /* Properties for car */
    protected void setDoors(String doors) {
        //door = value;
        doors = doors;
    } // end property method setDoor

    protected int getDoor() {
        return doors;
    } // end property method getDoor

    protected void setWindow(int windows) {
        //window = value;
        this.windows = windows;
    } // end property method setWindow

    protected int getWindow() {
        return windows;
    } // end property method setWindow

    protected void setWheels(int wheels) {
        this.wheels = wheels;
    } // end property method setWheels

    protected int getWheels(int wheels) {
        return wheels;
    } // end property method setWheels

    protected void setBody(String value) {
        this.body = body;
    } // end property method setBody

    protected String getBody() {
        return body;
    } // end property method setBody
} // end class Car
