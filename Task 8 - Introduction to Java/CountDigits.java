package basicPrograms;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        scanner.close();

        // Count the number of digits in the integer
        int digitCount = countDigits(number);

        // Display the result
        System.out.println("Number of digits in " + number + ": " + digitCount);
    }

    // Function to count the number of digits in an integer
    private static int countDigits(int num) {
        int count = 0;
        num = Math.abs(num);

        while (num != 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}

