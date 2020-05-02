package Input_OutPut;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DataReader {

    /**
     * Use API to read the below textFile and print to console.
     * /src/main/resources/Key-To-Success
     * Use FileReader class, no need to store in buffer
     * Use try....catch block to handle Exception.
     * Use ForEach loop/while loop/Iterator to retrieve data.
     */

    public static void main(String[] args) {

        try {
            File file = new File("/Users/kawsar/Desktop/Model Test/Module_Exam_2/src/main/resources/Key-To-Success");

            FileReader fileReader = new FileReader(file);

            int line;

            while ((line = fileReader.read())!= -1) {
                System.out.print((char)line);
            }

        } catch (Exception e){
            e.getStackTrace();
        }



    }
}
