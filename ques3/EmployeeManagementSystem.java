package ques3;

import java.util.ArrayList;
import java.util.List;


class Employee {
    private int id;
    private String name;
    private double salary;


    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

   
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary:" + salary);
        System.out.println("-------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
      
        Employee emp1 = new Employee(101, "Anjana", 60000);
        Employee emp2 = new Employee(102, "Rahul", 55000);
        Employee emp3 = new Employee(103, "Priya", 70000);

       
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Employee Details:\n");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
