package task11_programs;

import java.util.Scanner;

public class LoginSystem {
    private static final String CORRECT_PASSWORD = "password123";  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your password: ");
            String enteredPassword = scanner.nextLine();

            if (!enteredPassword.equals(CORRECT_PASSWORD)) {
                // If incorrect password, throw an exception
                throw new IncorrectPasswordException("Incorrect password entered");
            }
            // If correct password, display success message
            System.out.println("Login successful!");
        } catch (IncorrectPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

 
 

