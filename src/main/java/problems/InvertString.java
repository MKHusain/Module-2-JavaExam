package problems;

import java.util.Scanner;

public class InvertString {

    /**
     * Invert a String without using String default reverse() method
     *
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Word: ");
        String word = sc.nextLine();

        int l = word.length();
        String reverse = "";
        for (int i = l - 1; i >= 0; i--)
            reverse = reverse + word.charAt(i);
        System.out.println(reverse);


    }
}
