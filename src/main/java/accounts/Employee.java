package accounts;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import db.DataBaseConnection;

public class Employee extends DataBaseConnection {

    private int empid;
    private String name;
    private String country;
    private String dept;
    private int salary;

    public Employee(int empid, String name, String country, String dept, int salary){

        this.empid = empid;
        this.name = name;
        this.country = country;
        this.dept = dept;
        this.salary = salary;

    }

    public void printEmployee(){

        System.out.println(this.empid);

    }

    public void insertIntoDB() throws SQLException, IOException, ClassNotFoundException {


        String query = "INSERT into employees(id, name, country, dept, salary) " +
                        "Values(" + this.empid + ",'" + this.name +"','" + this.country + "' , '" +
                           this.dept + "', " + this.salary +")";

        connectMySql();
        statement = connect.createStatement();
        statement.executeUpdate(query);


    }

    public int getEmpid(){

        return this.empid;
    }



}
