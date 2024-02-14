package task11_programs;

import java.util.Scanner;

public class AgeValidator {
    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            
            throw new InvalidAgeException("Age must be 18 or higher");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        try {
        	System.out.println("Enter the age : ");
        	int enteredAge = scanner.nextInt();
        	//Call the validate age method by passing enteredAge value 
            validateAge(enteredAge);
        } catch(InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
        	scanner.close();
        }
    }
}


