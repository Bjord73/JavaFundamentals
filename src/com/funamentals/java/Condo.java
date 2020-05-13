package com.funamentals.java;

/* This class is a child of House nd will be used in
*  different lessons to show how they work */
public class Condo extends House {
    // fields
    private String balcony;

    // constructor
    public Condo() {
        super("Yellow");
    } // end constructor

    public Condo(String doorColor){
        this("rail", "fiberglass", "shingle",
                doorColor,40);
    }

    public Condo(String balcony,String foundation, String roofType,
                 String doorColor, int windowSize) {
        super(foundation, roofType, doorColor, windowSize);
            this.balcony = balcony;
        } // end constructor

    //setter / getter properties
    public String getBalcony() {
        return balcony;
    } // end property method getBalcony
    public void setBalcony(String balcony) {
        this.balcony = balcony;
    } // end property method setBalcony
    // all other method

    public void maintenance() {
        System. out.println("Will fix condo issues");
    } // end method maintenance

    // The method overrides the parent
    @Override
    public void doorOpenClose() {
        System.out.println("My door is closed");

    }
} // end class