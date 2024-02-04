package basicPrograms;

import java.util.Scanner;

public class SeniorCitizenCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.close();

        // Check if the person is a senior citizen
        if (age >= 60) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are not a senior citizen.");
        }
    }
}

