package basicPrograms;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        // Check if the number is prime
        boolean isPrime = true;
         int m = number/2;

        if (number <= 1) {
            isPrime = false;
        } 
        else {
            for (int i = 2; i <=m; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
