package com.funamentals.java;

// This class demonstrates Control Flow using a song
public class BottlesOfBeerSong {
    void timeToSing() {
    int bottleOfBeer = 99;
    String word = "bootles", result = "";
    while (bottleOfBeer > 0) {
        if(bottleOfBeer == 1) {
            word = "bottle";
        } // end if
        System.out.println(bottleOfBeer + "" + word + " of Beer on the Wall");
        System.out.println(bottleOfBeer + "" + word + " of Beer");
        System.out.println("Take one down");
        System.out.println("Pass it around");
        bottleOfBeer--;

        if(bottleOfBeer > 0) {
            System.out.println(bottleOfBeer + "" + word + " of Beer on the Wall \n");
        } else {
            System.out.println("No more bottles of Beer on the Wall");
        } // end if else
    } // end while
    } // end method timeToSing
} // end class BottlesOfBeerSong