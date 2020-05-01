package datastructure;

import java.sql.SQLException;
import java.util.*;

public class HashSetDemo {

    /**
     * @author Jahidul Islam
     * Create HashSet and store data
     * Get the data from HashSet and print
     * Get the data from HashSet and insert it in db table
     *
     * */

    public static void main(String[] args) throws SQLException {

        HashSet<Integer> studentID = studentId();
        HashSet<String> studentName = studentNames();

        Object[] idArr = studentID.toArray();
        Object[] nameArr = studentName.toArray();

        DBConnection  dbConnect = new DBConnection();

        for (int i = 0; i < idArr.length ; i++) {

           // dbConnect.makeUpdateQuery("INSERT INTO Students (studid, studname) values("+ idArr[i] +", '"+ nameArr[i]+"');");

        }
            dbConnect.makeSelectQuery("SELECT * FROM Students;");

    }


    public static HashSet<Integer> studentId() {

        HashSet<Integer> idNumber = new HashSet<Integer>();

        idNumber.add(20011);
        idNumber.add(20012);
        idNumber.add(20013);
        idNumber.add(20014);
        idNumber.add(20015);
        idNumber.add(20016);

        /*for (Integer id : idNumber) {
            System.out.println("Student ID: " + id);

        }*/

    return idNumber;
    }

    public static HashSet<String> studentNames () {

        HashSet<String> names = new HashSet<String>();

        names.add("Eashan");
        names.add("Ferhan");
        names.add("Kawsar");
        names.add("Kamrun");
        names.add("Michael");
        names.add("Shawn");

       /* for (String n : names) {

            System.out.println("Student Names: " + n);

        }*/
        return names;
    }

}
