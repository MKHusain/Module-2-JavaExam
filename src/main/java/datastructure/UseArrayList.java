package datastructure;

import java.util.*;

public class UseArrayList {

    /**
     * @author Jahidul Islam
     * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
     * Use For Each loop and while loop with Iterator to retrieve data.
     * Store all the sorted data into one of the databases.
     *
     */

    public static void main(String[] args) {

        UseArrayList obj = new UseArrayList();

        obj.storeStudentNamesInArrayList();


    }



    public void storeStudentNamesInArrayList(){

        // Creating a method for Student Names in ArrayList

        List<String> studentNames = new ArrayList<String>();

        studentNames.add("Mathew");
        studentNames.add("Johnson");
        studentNames.add("Jack");
        studentNames.add("Chad");

        // Some of the Wayy to call ArrayList

        System.out.println("Names of Student: " + studentNames); // Printing Names in a Set

        // Print the Length of Arraylist

        System.out.println(studentNames.size());

        for (String str : studentNames) {

            System.out.println(str);
        }
        for (int i = 0; i<studentNames.size(); i++ ){

            System.out.println(studentNames.get(i));
        }


    }
}
