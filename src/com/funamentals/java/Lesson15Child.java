package com.funamentals.java;

/* This class goes over Lesson15 content
*  Abstract*/
public class Lesson15Child extends Lesson15Abstract {

    public Lesson15Child(int vol, int[] nKeys, int sKey, String screen) {
        super(vol, nKeys, sKey, screen);
    } // end constructor

    @Override
    public void receiveCall() {
        System.out.println("Receiving Phone Call");
    } // end method receiveCall

    @Override
    public void sendCall() {
        System.out.println("Sending Phone Call");
    } // end method sendCall

    @Override
    public void endCall() {
        System.out.println("endCall");
    } // end method endCallS


} // end class Lesson15Child
