package problems;

import com.sun.xml.internal.bind.v2.runtime.output.FastInfosetStreamWriterOutput;

public class GenerateMultiplicationTable {

        public static void main(String[] args) {

            System.out.println("These are the multiples of 4: ");

            for(int x =1; x<=40; x++) {
                if(x % 4 == 0) {
                    System.out.println(x);
                }

            }

        }
    }

