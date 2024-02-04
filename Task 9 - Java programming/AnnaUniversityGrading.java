package task9_programs;

import java.util.Scanner;

public class AnnaUniversityGrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Check and print the grade
        printGrade(marks);
    }

    // Function to print the grade based on marks
    private static void printGrade(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Input");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("S");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("A");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("B");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("C");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}

