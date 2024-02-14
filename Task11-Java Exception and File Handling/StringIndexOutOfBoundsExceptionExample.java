package task11_programs;

public class StringIndexOutOfBoundsExceptionExample {

	  public static void main(String[] args) {
	        String str = "Hello";

	        try {
	            // Attempting to access a character at an index that is outside the bounds of the string
	            char ch = str.charAt(10);
	            System.out.println("Character at index 10: " + ch);
	        } 
	        catch (StringIndexOutOfBoundsException e) {
	            // Catching the StringIndexOutOfBoundsException and printing the error message
	            System.out.println("Error: " + e.getMessage());
	           // e.printStackTrace() ;//for detailed error information
	        }
	    }

}
