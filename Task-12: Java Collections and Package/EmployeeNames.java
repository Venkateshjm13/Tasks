package task12_programs;

import java.util.*;

public class EmployeeNames {
    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add employee IDs and names to the TreeMap
        employeeMap.put(104, "Madhan");
        employeeMap.put(102, "Bharath");
        employeeMap.put(103, "Jeeva");
        employeeMap.put(101, "Ajay");

        // Print the names of all employees in alphabetical order
        System.out.println("Names of all employees in alphabetical order:");

        //treemap do the natural sorting based on the key 
            for (String name : employeeMap.values()) {
                System.out.println(name);
        }
}
	 
}
