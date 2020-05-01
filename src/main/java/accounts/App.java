package accounts;

import java.io.IOException;
import java.sql.SQLException;

public class App {


    /**
     * @author Jahidul Islam
     * Use methods from the SalaryCalculator class to calculate salary of an employee
     *
     * */

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {

        // Creating Employees

        Employee emp1 = new Employee(201, "Mark", "United States", "Accounts", 80000 );

        Employee emp2 = new Employee(202, "John", "Denmark", "IT", 90000 );

        Employee emp3 = new Employee(203, "Samir", "Bangladesh", "Sales", 60000);

        Employee emp4 = new Employee(204, "Khan", "Pakistan", "IT", 90000);

        Employee emp5 = new Employee(205, "Mohammad", "India", "Marketing", 75000);

        // Inserting Employees Information into DataBase

/*
        emp1.insertIntoDB();
        emp2.insertIntoDB();
        emp3.insertIntoDB();
        emp4.insertIntoDB();
        emp5.insertIntoDB();
*/


        SalaryCalculator calculator = new SalaryCalculator();
        calculator.calculateSalary(emp1.getEmpid());
        calculator.calculateSalary(emp2.getEmpid());
        calculator.calculateSalary(emp3.getEmpid());
        calculator.calculateSalary(emp4.getEmpid());
        calculator.calculateSalary(emp5.getEmpid());



    }

}
