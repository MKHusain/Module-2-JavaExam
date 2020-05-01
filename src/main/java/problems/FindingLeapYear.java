package problems;

import java.util.Scanner;

public class FindingLeapYear {

    /**
     * All leap years are divisible by 4 except century years are divisible by 4 and 400
     * If century years are divisible by 4 but not divisible by 400 that will not be leap year
     *
     * */
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        System.out.print("Enter the Year: ");
         int year = data.nextInt();

            boolean leap;

            if(year % 4 == 0)
            {
                {
                    if ( year % 400 != 0)
                        leap = true;
                    else
                        leap = false;
                }
            }
            else
                leap = false;

            if(leap)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");
        }
    }

