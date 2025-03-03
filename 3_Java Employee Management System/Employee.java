import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;
    
    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    // Getters and setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("-----------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create employee objects
        Employee emp1 = new Employee(101, "John Smith", 55000.0);
        Employee emp2 = new Employee(102, "Sarah Johnson", 62000.0);
        Employee emp3 = new Employee(103, "Michael Brown", 48000.0);
        
        // Store employees in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        
        // Display details of all employees
        System.out.println("EMPLOYEE DETAILS:");
        System.out.println("=================");
        
        for (Employee employee : employeeList) {
            employee.displayDetails();
        }
    }
}
