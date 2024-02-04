package task9_programs;

import java.util.Scanner;

public class PalindromeChecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        if (isPalindrome(userInput)) {
	            System.out.println("The given string is a palindrome.");
	        } else {
	            System.out.println("The given string is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String s) {
	        // Remove spaces and convert to lowercase for case-insensitive comparison
	        s = s.replaceAll(" ", "").toLowerCase();

	        // Initialize variables for indexing
	        int startIndex = 0;
	        int endIndex = s.length() - 1;

	        // Check palindrome using a for loop
	        for (int i = 0; i < s.length() / 2; i++) {
	            if (s.charAt(startIndex) != s.charAt(endIndex)) {
	                return false;
	            }
	            startIndex++;
	            endIndex--;
	        }

	        return true;
	    }
	}


