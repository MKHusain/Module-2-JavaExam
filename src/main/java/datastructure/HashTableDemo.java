package datastructure;

import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> t1 = new Hashtable<Integer, String>();

        t1.put(88, "Bangladesh");
        t1.put(91, "India");
        t1.put(65, "Kuwait");

        System.out.println(t1);

        }

    }
