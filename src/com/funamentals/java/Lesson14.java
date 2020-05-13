package com.funamentals.java;

import java.math.BigDecimal;

/* This class goe over the Lesson 14 content
*  Static */
public class Lesson14 {
    public static final int MY_FIRST_FINAL = 2020;

    public static int myFirstStatic =35;

    public static void myStaticMethod(int num) {
        myFirstStatic = 40;
        int total = MY_FIRST_FINAL * num;
        System.out.println(total);
        System.out.println(myFirstStatic);
    } // end method myStaticMethod


} // end class Lesson14
