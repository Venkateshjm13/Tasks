package task9_programs;

	
	import java.util.Scanner;

	public class NumberPattern {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int n = scanner.nextInt();

	        scanner.close();

	        // Print the pattern
	        printNumberPattern(n);
	    }

	    // Function to print the number pattern
	    private static void printNumberPattern(int rows) {
	        int count = 1;

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(count + " ");
	                count++;
	            }
	            System.out.println();
	        }
	    }
}
