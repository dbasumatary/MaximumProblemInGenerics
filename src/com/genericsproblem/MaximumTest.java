package com.genericsproblem;
import java.lang.*;
/*Maximum of three integer using generics*/

public class MaximumTest <T extends Comparable<T>>{           //It ensures the object of type T are comparable
    public static <T extends Comparable<T>> void maximumValue(T integer1, T integer2, T integer3){

        T maximum = integer1;                               //Assuming integer1 is the largest initially
        if (integer2.compareTo(maximum) > 0){
            maximum = integer2;                             //Now integer2 is the largest
        }
        if (integer3.compareTo(maximum) > 0) {
            maximum = integer3;                             //integer3 is the largest
        }
        System.out.println("Maximum of "+ integer1 +", "+ integer2 +" and "+ integer3 +" is " + maximum);
    }
    public static void main(String[] args) {
        maximumValue(34,33,35);                              //calling the method
    }
}
