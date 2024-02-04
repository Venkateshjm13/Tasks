package basicPrograms;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        // Calculate the factorial
        long factorial = calculateFactorial(number);

        // Display the result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Function to calculate the factorial of a number
    private static long calculateFactorial(int num) {
        if (num < 0) {
            return -1; // Factorial is undefined for negative numbers
        }
        else if (num == 0 || num == 1) {
            return 1; // Factorial of 0 and 1 is 1
        } 
         else {
            int fact = 1;
            for (int i = 2; i <= num; i++) {
                fact *= i; // Multiply result by each number from 2 to num
            }
            return fact;
        }
    }
}
