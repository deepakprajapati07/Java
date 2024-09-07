/*
    Define a class Employee with usual member for an employee like empCode(String), empName(String), dateOfBirth(Date), dateOfJoin(Date), designationCode(int), salary(float).
    
    Create a list to store data about 10 employees using Vector. Manipulate the list using the methods in class Vector

*/ 

import java.util.Vector;
import java.time.LocalDate;

class Employee {
    String empCode;
    String empName;
    LocalDate dob;
    LocalDate doj;
    int designationCode;
    float salary;

    // Constructor
    public Employee(String empCode, String empName, LocalDate dob, LocalDate doj, int designationCode, float salary) {
        this.empCode = empCode;
        this.empName = empName;
        this.dob = dob;
        this.doj = doj;
        this.designationCode = designationCode;
        this.salary = salary;
    }

    // toString method to display Employee information
    @Override
    public String toString() {
        return "Employee{" +
                "empCode='" + empCode + '\'' +
                ", empName='" + empName + '\'' +
                ", dob='" + dob + '\'' +
                ", doj='" + doj + '\'' +
                ", designationCode='" + designationCode + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}

public class p03 {

    // Helper Function to display the Employee List
    private static void displayEmployeeList(Vector<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    // Main Function
    public static void main(String args[]) {
        // Creating a vector to store Employee objects
        Vector<Employee> employeeList = new Vector<>();

        int totalEmployee = 10;
        // Adding 10 employees to vector
        for (int i=0; i<totalEmployee; i++) {
            LocalDate dob = LocalDate.of(2000 + i, 1, 1);
            LocalDate doj = LocalDate.of(2010 + i, 1, 1);

            Employee employee = new Employee("E00" + i, "Employee" + i, dob, doj, i, 50000 + (i * 1000));
            employeeList.add(employee);
        }

        // Displaying the original list
        System.out.println("\nOriginal Employee List : ");
        displayEmployeeList(employeeList);

        // Manipulating the list using Vector methods
        employeeList.remove(3);     // Remove the employee at index 3

        // Add a new employee at a specific index
        Employee newEmployee = new Employee("E0011", "New Employee", LocalDate.of(1999, 2, 2), LocalDate.of(2024, 2, 2), 11, 60000);
        employeeList.add(5, newEmployee);

        // Display the modified list
        System.out.println("\nModified Employee List : ");
        displayEmployeeList(employeeList);

    }
    
}
