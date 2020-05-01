package accounts;

import db.DataBaseConnection;

import java.io.IOException;
import java.sql.SQLException;


public class SalaryCalculator extends DataBaseConnection {


    /**
     * @author Jahidul Islam
     * This class should have all the method necessary to calculate salary of 10 employees
     * Create employees table in MySQL Database and store employees information in that table
     * Use db package to get helper methods to connect to db and read employees information
     * Create methods to calculate monthly and yearly salary after tax where 35% tax has to be deducted from actual salary
     * This class consists only helper methods, you should not declare any main method here.
     * Main method is being declared in App class
     * */

    public void calculateSalary(int empid) throws SQLException, IOException, ClassNotFoundException {

        String query = "select * from employees where id = " + empid ;

        connectMySql();

        try {
            String  empName;
            int  empSalary;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                empName = resultSet.getString(2);
                empSalary = resultSet.getInt(5);

                // Staring Calculation

                double taxRate = 0.35;
                int  deducatedTaxAmount= (int) (empSalary * taxRate);

                int finalSalary = empSalary - deducatedTaxAmount ;


                System.out.println("\n\n"+empName + "\n" + "Acutal Salary: \t\t\t" + empSalary +
                        "\nTax Deducated (35%): \t" + deducatedTaxAmount +
                        "\n\nMonthly Salary: \t\t" + (finalSalary/12) +
                        "\nYearly Salary: \t\t\t" + finalSalary +
                        "\n-----------------------------");



                // Ending Calculation
            }

        } catch (Exception e){
            e.getMessage();
        }


    }

}
