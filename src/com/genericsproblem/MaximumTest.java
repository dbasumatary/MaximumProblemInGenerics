package com.genericsproblem;
import java.lang.*;
/*Maximum of multiple values using generics*/

public class MaximumTest <T extends Comparable<T>>{        //It ensures the object of type T are comparable using interface
    @SafeVarargs                           //this annotation is used to suppress unsafe operation warnings at compile time
    public static <T extends Comparable<T>> void maximumValue(T ... elements){            //multiple values as arguments

        T maximum = elements[0];                               //Assuming element in index 0 is the largest initially
        for (T element : elements){                            //using for loop for every element
            if (element.compareTo(maximum) > 0){
                maximum = element;
            }
        }
        System.out.println("The maximum value among these elements is " + maximum);
    }
    public static void main(String[] args) {
        maximumValue(56, 21, 8, 73, 57, 78, 40);                          //calling the method for integers
        maximumValue(5.9, 34.6, 24.4, 41.6, 19.25, 41.6001);                 //calling the method for float values
        maximumValue( "Mango", "Apple", "Guava", "Orange", "Date");        //calling the method for string values
    }
}
