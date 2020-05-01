package datastructure;

import java.sql.*;

public class DBConnection {

    //Creating 3 Private constants for Connecting using  the Url, UserName and Password to Psql.

    static String url = "jdbc:postgresql://localhost:5432/test";
    static String user = "test_user"; //Enter your User Name
    static String password = "test_password"; // Enter your Password.

    // Making a Connect Method.



    // Passing the Connection and making Querys.
    public void makeSelectQuery(String query) throws SQLException {
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){

            System.out.println(rs.getString(1) + " " + rs.getString(2));

        }
        rs.close();
        st.close();

    }


    public void makeUpdateQuery(String query) throws SQLException {

        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();

        // Using the executeUpdate Method to create a new table.
        int count = st.executeUpdate(query);

        if(count>0){
            System.out.println("Query Executed");
        }else {
            System.out.println("Query Failed");
        }

    }


}