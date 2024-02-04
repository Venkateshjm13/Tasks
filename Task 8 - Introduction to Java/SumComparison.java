package basicPrograms;

import java.util.Scanner;

public class SumComparison {
   public static void main(String[] args) {
       // Create Scanner object to read input
       Scanner scanner = new Scanner(System.in);
        
       System.out.print("Enter the value for 'a': ");
       int a = scanner.nextInt();

       System.out.print("Enter the value for 'b': ");
       int b = scanner.nextInt();

       System.out.print("Enter the value for 'c': ");
       int c = scanner.nextInt();

       System.out.print("Enter the value for 'd': ");
       int d = scanner.nextInt();

       scanner.close();

       // Check if the sum of a and b is greater than the sum of c and d
       if ((a + b) > (c + d)) {
           System.out.println("The sum of a and b is greater than the sum of c and d.");
       } else {
           System.out.println("The sum of a and b is not greater than the sum of c and d.");
       }
   }
}
