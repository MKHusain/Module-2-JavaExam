package problems;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        Anagram obj = new Anagram();
        obj.findAnagram("night", "thing");
    }
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    public void findAnagram(String string1, String string2) {

        // find whether this word is anagram or not

        if (string1.length() != string2.length()) {
            System.out.println("Word not of same length");
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1, a2)) {
            System.out.println("Is Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
}
