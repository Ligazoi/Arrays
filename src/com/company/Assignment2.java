package com.company;

import java.util.Arrays;

public class Assignment2 {

    public static void main(String[] args) {

        int[] myArray = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};

        for (int value : myArray) {
            if (value < 0) {
                System.out.print("\n Negative Numbers are: " + value);
            }
        }
        oddElemets(myArray);
        howManyOdd(myArray);
        sameValue(myArray);
        eachSecond(myArray);
        averageValue(myArray);
    }

    public static void oddElemets(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 1) {
                System.out.println("\n Odd elements are: " + myArray[i]);
            }
        }
    }

    public static void howManyOdd(int[] myArray) {
        long uneven = Arrays.stream(myArray).filter(i -> i % 2 - 1 == 0).count();
        System.out.println("How many elements are odd:" + uneven);

    }

    public static void sameValue(int[] myArray) {
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int k = i + 1; k < myArray.length; k++) {
                if (myArray[i] == myArray[k]) {
                    count++;
                }
            }
            if (count == 1)
                System.out.println("Elements with the same value:" + myArray[i]);
            count = 0;
        }
    }

    public static void eachSecond(int[] myArray) {

        for (int i = 0; i < myArray.length; i = i + 2) {
            System.out.println(" Each second element is " + myArray[i]);
        }
    }

    public static void averageValue(int[] myArray) {
        int i = 0;
        double averageValue = 0;
        if (myArray.length > 0) {
            double sum = 0;
            for (i = 0; i < myArray.length; i++) {
                sum += myArray[i];
            }
            averageValue = sum / myArray.length;
            System.out.println("The average value of elements is " + averageValue);
        }

        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] < averageValue) {
                System.out.println("Elements smaller than average value are: " + myArray[i]);

            }
        }
    }
}





