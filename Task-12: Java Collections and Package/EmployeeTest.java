package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		// Creating an instance of Employee
		Employee employee = new Employee("John Doe",101,50000.0);
		
		// Calling methods to print name and salary
		employee.printName();
		employee.printSalary();
	}

}
