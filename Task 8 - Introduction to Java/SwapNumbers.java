package basicPrograms;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
 
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
 
        scanner.close();

        // Display the original values
        System.out.println("Original values:");
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        // Swap the values using an additional variable
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        // Display the swapped values
        System.out.println("\nSwapped values:");
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
    }
}

