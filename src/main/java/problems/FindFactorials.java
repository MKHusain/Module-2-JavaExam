package problems;

public class FindFactorials {

    /**
     * factorials of n n! = 1 * 2 * 3 * ......* n
     * */


    public static void main(String args[]){
        int i , fact = 1;
        int number = 7; //It is the number to calculate factorial

        for(i=1;i<=number;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
