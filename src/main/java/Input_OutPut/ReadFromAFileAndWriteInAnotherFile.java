package Input_OutPut;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadFromAFileAndWriteInAnotherFile {

/***
 * Read form a file XXXXXX write in a file YYYYYY
 * */

public static void main(String[] args) {

    try {
        File file = new File("/Users/kawsar/Desktop/Model Test/Module_Exam_2/src/main/resources/Key-To-Success");

        FileWriter fileWriter = new FileWriter("/Users/kawsar/Desktop/Test/filelist.txt");

        FileReader fileReader = new FileReader(file);

        BufferedReader reader = new BufferedReader(fileReader);

        String line = null;

        while ((line = reader.readLine())!= null) {
            fileWriter.write(line);
        }
        fileWriter.close();

    } catch (Exception e){
        e.getStackTrace();
    }



}
}