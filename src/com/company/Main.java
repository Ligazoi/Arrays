package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrOne = {5, 3, 7, 6, 2, 8};

        for (int i = 0; i < arrOne.length; i++) {
            System.out.println(arrOne[i]);
        }
        printValue(arrOne);
        printValueWhile(arrOne);
        printValueDoWhile(arrOne);
    }

    public static void printValue(int[] arrOne) {

        for (int value : arrOne) {
            System.out.println(value);//this is the best method for this assignment
        }
    }

    public static void printValueWhile(int[] arrOne) {
        int i = 0;
        while (i < arrOne.length) {
            System.out.println(arrOne[i]);
            i++;
        }
    }

    public static void printValueDoWhile(int[] arrOne) {
        int i = 0;
        do {
            System.out.println(arrOne[i]);
            i++;
        } while (i < arrOne.length);
    }
}








