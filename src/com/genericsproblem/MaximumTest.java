package com.genericsproblem;
import java.lang.*;
/*Maximum of three values using generics*/

public class MaximumTest <T extends Comparable<T>>{        //It ensures the object of type T are comparable using interface
    public static <T extends Comparable<T>> void maximumValue(T input1, T input2, T input3){

        T maximum = input1;                               //Assuming input1 is the largest initially
        if (input2.compareTo(maximum) > 0){
            maximum = input2;                             //Now input2 is the largest
        }
        if (input3.compareTo(maximum) > 0) {
            maximum = input3;                             //input3 is the largest
        }
        System.out.println("Maximum of "+ input1 +", "+ input2 +" and "+ input3 +" is " + maximum);
    }
    public static void main(String[] args) {
        maximumValue(34,33,35);                              //calling the method for integers
        maximumValue(6.21,6.19,6.24);                        //calling the method for float values
        maximumValue("Apple","Peach","Banana");              //calling the method for string values
    }
}
