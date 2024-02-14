package task11_programs;

public class ArrayIndexOutOfBoundsExceptionExample {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing an index that is within the bounds of the array
        System.out.println("Value at index 2: " + numbers[2]);

        try {
            // Attempting to access an index that is outside the bounds of the array
            System.out.println("Value at index 10: " + numbers[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // Catching the ArrayIndexOutOfBoundsException and printing the error message
            System.out.println("Error: " + e.getMessage());
        }
    }

}
