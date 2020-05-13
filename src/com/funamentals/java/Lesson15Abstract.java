package com.funamentals.java;

/* This class goes over the Lesson 15 content
*  Abstract*/
public abstract class Lesson15Abstract {
    private int volume;
    private int[] numberKeys;
    private int sendKey;
    private String screen;

    public Lesson15Abstract(int vol, int[] nKeys, int sKey, String screen) {
        this.volume = vol;
        this.numberKeys = nKeys;
        this.sendKey = sKey;
        this.screen = screen;
}// end constructor

    public abstract void receiveCall(); // abstract method no body

    public abstract void sendCall(); // abstract method no body

    public  abstract void endCall();

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int[] getNumberKeys() {
        return numberKeys;
    }

    public void setNumberKeys(int[] numberKeys) {
        this.numberKeys = numberKeys;
    }

    public int getSendKey() {
        return sendKey;
    }

    public void setSendKey(int sendKey) {
        this.sendKey = sendKey;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }
} // end class Lesson15Abstract

