package com.company;

import java.util.Arrays;


public class String2 {
    public static void main(String[] args) {

        String phrase = "Climb mountains not so the world can see you, but so you can see the world";

        if (phrase == null || phrase.isEmpty()) {
            System.out.println();
        }
        howManyTimes(phrase);
        consistLetter(phrase);
        duplicateWords(phrase);
        replaceWord(phrase);

    }

    public static void howManyTimes(String phrase) {
        String[] words = phrase.split("\\s+");
        System.out.println(words.length); //16

        String word = "the";
        String sentence[] = phrase.split(" ");
        int count = 0;
        for (int i = 0; i < sentence.length; i++) {
            if (word.equals(sentence[i]))
                count++;
        }
        System.out.println("The word " + word + " occurs " + count + " times");
    }

    public static void consistLetter(String phrase) {

        int c = phrase.split("s").length - 1;
        System.out.println(c + " words consists of letter s");
    }

    public static void duplicateWords(String phrase) {
        String repeat[] = phrase.split(" ");
        System.out.println("Duplicate words in a given string : ");

        int count = 0;
        for (int i = 0; i < repeat.length; i++) {
            count = 1;
            for (int j = i + 1; j < repeat.length; j++) {
                if (repeat[i].equals(repeat[j])) {
                    count++;
                    repeat[j] = "0";
                }
            }
            if (count > 1 && repeat[i] != "0")
                System.out.println(repeat[i]);
        }
    }

    public static void replaceWord(String phrase) {
        String replaceString = phrase.replace("you", "YOU");
        System.out.println(replaceString);
    }

}



