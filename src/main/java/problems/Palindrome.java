package problems;

import java.util.*;

public class Palindrome {

    /**
     *If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
     * Palindrome. So write java code to check if a given String is Palindrome or not.
     *
     **/

    public static void main(String[] args) {
        String start, reverse = "";

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter your Word: ");

        start = s1.nextLine();

        int length = start.length();

        for (int i = length-1; i >= 0;  i--) {
            reverse = reverse + start.charAt(i);
        }

        if (start.equals(reverse)){
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }
    }
}
