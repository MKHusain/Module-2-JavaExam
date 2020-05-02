package Input_OutPut;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class BufferReaderDemo {

    /**
     *
     *  Use BufferReader to read from buffer while reading Key-To-Success.txt from main/java/resources
     *
     * */

    public static void main(String[] args) {

        try {
            File file = new File("/Users/kawsar/Desktop/Model Test/Module_Exam_2/src/main/resources/Key-To-Success");

            FileReader fileReader = new FileReader(file);

            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;

            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }

        } catch (Exception e){
            e.getStackTrace();
        }



    }
}