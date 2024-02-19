package com.example.hr;

public class Employee {
    // Fields
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Methods
    public void printName() {
        System.out.println("Employee Name: " + name);
    }

    public void printSalary() {
        System.out.println("Employee Salary: " + salary);
    }
}
