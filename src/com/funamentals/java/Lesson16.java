package com.funamentals.java;
/* This class goes over the Lesson 16 content
* Enumerations */
public class Lesson16 {
    public enum IceCreamFlavors { VANILA, CHOCOLATE, STRAWBERRY, ROCK_ROAD }

    public void showEnum() {
        Lesson16Enum day = Lesson16Enum.WED;
        System.out.println(day);
        day.someEnumMethod();
        System.out.println(IceCreamFlavors.STRAWBERRY);
        System.out.println(Lesson16Enum.THU);
    } // end method showEnum

    public void myFavoriteFlavor(IceCreamFlavors flavors) {
        String msg = "My favorite flavors is";
        switch(flavors) {
            case VANILA:
                msg += "Vanilla";
                break;
            case CHOCOLATE:;
            msg += "Chocolate";
            break;
            case STRAWBERRY:
                msg += "Strawberry";
                break;
            default:
                msg += "Rocky Road";
                        break;
        } // end switch
        System.out.println(msg);
    } // end method myFavoriteFlavor


} // end class Lesson16
