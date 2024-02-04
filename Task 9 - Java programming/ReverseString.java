package task9_programs;

	import java.util.Scanner;

	public class ReverseString {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        String reversedString = reverseString(userInput);

	        System.out.println("Reversed String: " + reversedString);
	    }

	    public static String reverseString(String input) {
	        // Convert the string to a character array for manipulation
	        char[] charArray = input.toCharArray();

	        // Use a loop to reverse the order of characters
	        for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
	            // Swap characters at positions i and j
	            char temp = charArray[i];
	            charArray[i] = charArray[j];
	            charArray[j] = temp;
	        }

	        // Convert the character array back to a string
	        return new String(charArray);
	    }
	}


