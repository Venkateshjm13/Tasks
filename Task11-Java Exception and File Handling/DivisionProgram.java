package task11_programs;

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            double result = divideNumbers(num1, num2);

            System.out.println("Result of division: " + result);
        }
        catch (ArithmeticException e){
            // Handle division by zero exception
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (Exception e) {
            // Handle other exceptions
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            scanner.close();
        }
    }

    // Method to perform division
    public static double divideNumbers(int num1, int num2) {
        if (num2 == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        else{
        return (double) num1 / num2;
        }
    }
}
