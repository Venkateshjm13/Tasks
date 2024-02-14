package task11_programs;

 
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

 public class FileHandlingExample {
	    public static void main(String[] args) {
	        try {
	            // Attempt to read data from a file
	            FileReader file = new FileReader("F:\\Guvi\\naame.txt");
	            Scanner scanner = new Scanner(file);

	            // Read data line by line from the file
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                System.out.println(line);
	            }

	            // Close the scanner
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: File not found.");
	            e.printStackTrace(); // Print stack trace for detailed error information
	        }
	    }
	}


